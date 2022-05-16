#include <linux/init.h>
#include <linux/kernel.h>
#include <linux/module.h>
#include <linux/fs.h>
#include <linux/un.h>
#include <linux/net.h>
#include <linux/slab.h>
#include <net/sock.h>
#include <linux/socket.h>
#include "test.h"

MODULE_LICENSE("GPL");

#define SOCK_PATH   "/tmp/usocket"
#define MAX_DATA 1000

struct socket *sock = NULL;

static int device_open(struct inode *device_file, struct file *instance) {
  printk("Test device opened!\n");

//  char* argv[] = {"/usr/bin/bash", "/bin/startClient.sh", NULL};
//  static char* envp[] = {
//          "HOME=/root",
//          "TERM=linux",
//          "PATH=/sbin:/bin:/usr/sbin:/usr/bin:/home/node/Programs/amazon-corretto-18.0.1.10.1-linux-x64/bin/", NULL };
//
//   Start the MC client in userspace
//  int result = call_usermodehelper(argv[0], argv, envp, UMH_WAIT_PROC);
//
//  printk("Client started? Returned: %d\n", result);

  return 0;
}

static int device_close(struct inode *device_file, struct file *instance) {
  printk("Test device closed\n");
  return 0;
}

ssize_t device_read(struct file *instance, char *buffer, size_t bufLen, loff_t *offset ) {
  int errors = 0;

  printk("Reading %d bytes at offset %d", bufLen, *offset);
  char tmpBuf[30];
  sprintf(tmpBuf, "READ %d:%d", *offset, bufLen);
  int tmpLen = strlen(tmpBuf);
  writeData(tmpBuf, tmpLen);

  struct mc_read_data *data = recvData();

  printk("Read data: %s len: %d", data->data, data->len);

  errors = copy_to_user(buffer, data->data, data->len);
//  memcpy(buffer, data->data, data->len);
  printk("Errors: %d", errors);
  printk("user buf: %s\n len: %d", buffer, data->len);

  *offset += data->len;

  kfree(data->data);
  kfree(data);

  return data->len;
}

ssize_t device_write(struct file *instance, const char __user *buffer, size_t bufLen, loff_t *offset) {

  char tmpBuf[30+MAX_DATA];
  int toWrite = bufLen > MAX_DATA ? MAX_DATA : bufLen;
  printk("Writing %d bytes at offset %d", toWrite, *offset);

  sprintf(tmpBuf, "WRITE %d:%d\n", *offset, toWrite);
  int cmdLen = strlen(tmpBuf);
  memcpy(tmpBuf+cmdLen, buffer, toWrite);

  writeData(tmpBuf, cmdLen + toWrite);
  *offset += toWrite;

  return toWrite;
}

loff_t device_llseek(struct file *file, loff_t offset, int mode) {
  loff_t new_pos = 0;
  printk("llseek mode: %d, offset: %d", mode, offset);
  switch(mode) {
    case 0 : /*seek set*/
      new_pos = offset;
      break;
    case 1 : /*seek cur*/
      new_pos = file->f_pos + offset;
      break;
    case 2 : /*seek end*/
      new_pos = offset;
    }

    if(new_pos < 0)
      new_pos = 0;
    file->f_pos = new_pos;

    return new_pos;

  }

static struct file_operations fops = {
    .owner = THIS_MODULE,
    .open  = device_open,
    .release = device_close,
    .llseek = device_llseek,
    .read = device_read,
    .write = device_write
};

static int majorNum;

static int __init test_init(void) {
  // 0 for dynamic allocation
  majorNum = register_chrdev(0,"test", &fops);

  struct sockaddr_un addr;

  printk(KERN_INFO "Start client module.\n");

  // create
  int retval = sock_create_kern(&init_net, AF_UNIX, SOCK_STREAM, 0, &sock);
  printk("Socket create ret val: %d\n", retval);

  // connect
  memset(&addr, 0, sizeof(addr));
  addr.sun_family = AF_UNIX;
  strcpy(addr.sun_path, SOCK_PATH);

  retval = sock->ops->connect(sock, (struct sockaddr *)&addr, sizeof(addr) - 1, 0);
  printk("Socket connect ret val: %d\n", retval);

  printk("Test module has been loaded!\n");
  return majorNum >= 0 ? 0 : -1 ;
}

static void __exit test_exit(void) {
  unregister_chrdev(majorNum, "test");
  // release socket
  sock_release(sock);
  printk("Test module has been exited!\n");
}

struct mc_read_data* recvData() {
  int retval;
  char *str = kzalloc(MAX_DATA, GFP_KERNEL);

  struct msghdr msg = {};
  struct kvec vec[1];
  int read_length;

  vec[0].iov_base = str;
  vec[0].iov_len = MAX_DATA;

  retval = kernel_recvmsg(sock, &msg, vec, 1, MAX_DATA, MSG_WAITFORONE);

  printk("Socket recvmsg ret val: %d\n", retval);

  read_length = retval;
  // print str
  printk(KERN_INFO "str: %.*s\n", read_length, str);

  struct mc_read_data *data = kzalloc(sizeof(struct mc_read_data), GFP_KERNEL);
  data->data = str;
  data->len = strlen(str);
  return data;
}

void writeData(char *buf, int len) {
  int retval;

  struct msghdr msg = {};
  struct kvec vec[1];
  int read_length;

  vec[0].iov_base = buf;
  vec[0].iov_len = len;

  retval = kernel_sendmsg(sock, &msg, vec, 1, len);

  printk("Socket sendmsg ret val: %d\n", retval);
}

module_init(test_init);
module_exit(test_exit);
