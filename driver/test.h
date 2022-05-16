//
// Created by steve on 5/16/2022.
//

#ifndef LDD3_TEST_H
#define LDD3_TEST_H

#endif //LDD3_TEST_H

struct mc_read_data {
    char *data;
    int len;
};

void writeData(char *data, int len);
struct mc_read_data* recvData(void);
