package me.nodedigital.minecraftdrive;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.UnixDomainSocketAddress;
import java.nio.file.Files;
import java.nio.file.Path;

public class DriveInitializer implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("mcdrive");
    public static UnixDomainSocketAddress SOCKET_ADDRESS;

    @Override
    public void onInitialize() {
        LOGGER.info("Hello Fabric world!");

        Path socketPath = Path
                .of(System.getProperty("user.home"))
                .resolve("mc.socket");

        try {
            Files.deleteIfExists(socketPath);

            SOCKET_ADDRESS = UnixDomainSocketAddress.of(socketPath);

            Thread socketThread = new Thread(new SocketListener());
            socketThread.start();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
