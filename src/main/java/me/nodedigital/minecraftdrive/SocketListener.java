package me.nodedigital.minecraftdrive;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.StandardProtocolFamily;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Arrays;
import java.util.Scanner;

public class SocketListener implements Runnable {
    @Override
    public void run() {
        try {
            try (ServerSocketChannel serverChannel = ServerSocketChannel
                    .open(StandardProtocolFamily.UNIX)) {

                serverChannel.bind(DriveInitializer.SOCKET_ADDRESS);
                DriveInitializer.LOGGER.info("Successfully bound to socket!");

                while (serverChannel.isOpen()) {
                    SocketChannel channel = serverChannel.accept();
                    DriveInitializer.LOGGER.info("Successfully accepted connection!");

                    while(channel.isOpen()) {
                        DriverCommand command = getCommand(channel);
                        DriveInitializer.LOGGER.info("Received {} command at offset {} with len {}", command.type.name(), command.offset, command.len);

                        switch(command.type) {
                            case READ -> {
                                byte[] readData = DataHandler.read(command);
                                sendSocketMessage(channel, readData);
                            }
                            case WRITE -> DataHandler.write(command);
                        }
                    }

                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private DriverCommand getCommand(SocketChannel channel) throws IOException {
        byte[] bytes = readSocketMessage(channel);
        DriverCommand command = new DriverCommand();

        DriveInitializer.LOGGER.debug("Bytes recieved: {}", Arrays.toString(bytes));
        Scanner scanner = new Scanner(new ByteArrayInputStream(bytes));

        String cmdLine = scanner.nextLine();
        int spaceIdx = cmdLine.indexOf(' ');
        String cmdType = cmdLine.substring(0, spaceIdx);
        if(cmdType.equals("READ")) {
            command.type = DriverCommand.CommandType.READ;
        } else if(cmdType.equals("WRITE")) {
            command.type = DriverCommand.CommandType.WRITE;
        } else {
            throw new RuntimeException("Could not recognize driver command: " + cmdType);
        }

        String[] tokens = cmdLine.substring(spaceIdx+1).split(":");
        if(tokens.length != 2) {
            throw new RuntimeException("Improper command format, expected 2 tokens delimited by ':', got " + tokens.length);
        }

        command.offset = Integer.parseInt(tokens[0]);
        command.len = Integer.parseInt(tokens[1]);

        if(command.type == DriverCommand.CommandType.WRITE) {
            byte[] data = new byte[command.len];
            for(int i = 0; i < data.length; i++) {
                data[i] = scanner.nextByte();
            }
            command.data = data;
        }

        return command;
    }

    private byte[] readSocketMessage(SocketChannel channel) throws IOException {
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        int bytesRead = channel.read(buffer);
        if (bytesRead < 0)
            return new byte[0];

        byte[] bytes = new byte[bytesRead];
        buffer.flip();
        buffer.get(bytes);
        return bytes;
    }

    private void sendSocketMessage(SocketChannel channel, byte[] message) throws IOException {
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        buffer.clear();
        buffer.put(message);
        buffer.flip();

        while (buffer.hasRemaining()) {
            channel.write(buffer);
        }
    }


}
