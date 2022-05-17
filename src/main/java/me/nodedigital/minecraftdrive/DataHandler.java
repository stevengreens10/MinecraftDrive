package me.nodedigital.minecraftdrive;

import net.minecraft.block.Block;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.network.ServerPlayerInteractionManager;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.GameMode;
import net.minecraft.world.World;

public class DataHandler {
    public static byte[] read(DriverCommand command) {

        PlayerEntity player = MinecraftClient.getInstance().getServer().getPlayerManager().getPlayerList().get(0);

        Block[] blocks = new Block[command.len];

        int offset = command.offset;

        for (int i = 0; i < command.len; i++) {
            blocks[i] = readBlock(player, offset);
            offset++;
        }

        return Block256.toBytes(blocks);
    }

    public static void write(DriverCommand command) {
        PlayerEntity player = MinecraftClient.getInstance().getServer().getPlayerManager().getPlayerList().get(0);
        Block[] blocks = Block256.toBlocks(command.data);
        int offset = command.offset;
        for (Block block : blocks) {
            placeBlock(player, block, offset);
            offset++;
        }
    }

    private static Block readBlock(PlayerEntity player, int offset) {
        DriveInitializer.LOGGER.debug("Reading block at offset {}", offset);
        World world = player.getWorld();
        navigatePlayerToPos(player, offset);

        return world.getBlockState(getTargetBlockPos(player, offset)).getBlock();

    }

    private static void placeBlock(PlayerEntity player, Block block, int offset) {
        DriveInitializer.LOGGER.debug("Placing {} block at offset {}", block.getName().getString(), offset);
        World world = player.getWorld();
        navigatePlayerToPos(player, offset);
        player.equipStack(EquipmentSlot.MAINHAND, new ItemStack(Item.fromBlock(block)));
        BlockHitResult hitResult = (BlockHitResult) MinecraftClient.getInstance().crosshairTarget;

        // Check if there is a block at the target position already.
        ServerPlayerInteractionManager playerInteractionManager = player.getServer().getPlayerInteractionManager((ServerPlayerEntity) player);

        BlockPos targetBlockPos = getTargetBlockPos(player, offset);
        if(!world.getBlockState(targetBlockPos).isAir()) {
            // Break it
            playerInteractionManager.changeGameMode(GameMode.CREATIVE);
            playerInteractionManager.tryBreakBlock(targetBlockPos);

            // Get hit result again afterwards
            hitResult = (BlockHitResult) MinecraftClient.getInstance().crosshairTarget;

        }
        playerInteractionManager.interactBlock((ServerPlayerEntity) player, world, player.getMainHandStack(), Hand.MAIN_HAND, hitResult);

    }


    private static void navigatePlayerToPos(PlayerEntity player, int offset) {
        Vec3d pos = new Vec3d(offset, player.getY(), 2.5);
        DriveInitializer.LOGGER.debug("Navigating player to ({} {} {})", pos.x,
                pos.y, pos.z);


        ClientPlayerEntity cpe = MinecraftClient.getInstance().player;
        IPlayerEntityMixin playerMixin = (IPlayerEntityMixin) cpe;

        playerMixin.setDestination(pos);
        playerMixin.setLookAt(pos);

        // Wait for player to be at block
        while (player.getPos().distanceTo(pos) > 0.1f) {
//            player.sendMessage(new LiteralText("" + player.getPos().distanceTo(pos)), false);
            try {
                Thread.sleep(50);
            } catch(Exception e){}
        }

        playerMixin.setLookAt(new Vec3d(pos.x + 0.5, pos.y, 0.5));
        playerMixin.setDestination(null);

        // Wait for player to be looking at block
        try {
            Thread.sleep(100);
        } catch(Exception e){}

        playerMixin.setLookAt(null);

    }

    private static BlockPos getTargetBlockPos(PlayerEntity player, int offset) {
        return new BlockPos(getTargetVec3d(player, offset));
    }

    private static Vec3d getTargetVec3d(PlayerEntity player, int offset) {
        return new Vec3d(offset, player.getY(), 0);
    }
}
