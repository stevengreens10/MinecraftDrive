package me.nodedigital.minecraftdrive;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;

public class DataHandler {
    public static byte[] read(DriverCommand command) {

        ClientPlayerEntity player = MinecraftClient.getInstance().player;
        Block[] blocks = new Block[command.len];

        int offset = command.offset;

        for(int i = 0; i < command.len; i++) {
            blocks[i] = readBlock(player, offset);
            offset++;
        }

        return Block256.toBytes(blocks);
    }

    public static void write(DriverCommand command) {
        ClientPlayerEntity player = MinecraftClient.getInstance().player;
        Block[] blocks = Block256.toBlocks(command.data);
        int offset = command.offset;
        for(Block block : blocks) {
            placeBlock(player, block, offset);
            offset++;
        }
    }

    private static Block readBlock(ClientPlayerEntity player, int offset) {
        // TODO: Navigate player to coord according to offset and get block
        DriveInitializer.LOGGER.info("Reading block at offset {}", offset);
        return Blocks.AIR;
    }

    private static void placeBlock(ClientPlayerEntity player, Block block, int offset) {
        // TODO: Navigate player to coord according to offset and place block
        DriveInitializer.LOGGER.info("Placing {} block at offset {}", block.getName().getString(), offset);
    }
}
