package me.nodedigital.minecraftdrive;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import java.util.HashMap;
import java.util.Map;

public class Block256 {

    // TODO: Define 9-256
    private static final Block[] block256Encoding = {
        Blocks.REDSTONE_LAMP, Blocks.GRASS_BLOCK, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 0 - 7 */
        Blocks.REDSTONE_LAMP, Blocks.GRASS_BLOCK, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 8 - 15 */
        Blocks.REDSTONE_LAMP, Blocks.GRASS_BLOCK, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 16 - 23 */
        Blocks.REDSTONE_LAMP, Blocks.GRASS_BLOCK, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 24 - 31 */
        Blocks.DANDELION, Blocks.GRASS_BLOCK, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 32 - 39 */
        Blocks.REDSTONE_LAMP, Blocks.GRASS_BLOCK, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 40 - 47 */
        Blocks.REDSTONE_LAMP, Blocks.GRASS_BLOCK, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 48 - 55 */
        Blocks.REDSTONE_LAMP, Blocks.GRASS_BLOCK, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 56 - 63 */

        Blocks.REDSTONE_LAMP, Blocks.GRASS_BLOCK, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 64 - 71 */
        Blocks.REDSTONE_LAMP, Blocks.GRASS_BLOCK, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 72 - 79 */
        Blocks.REDSTONE_LAMP, Blocks.GRASS_BLOCK, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 80 - 87 */
        Blocks.REDSTONE_LAMP, Blocks.GRASS_BLOCK, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 88 - 95 */
        Blocks.REDSTONE_LAMP, Blocks.GRASS_BLOCK, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.PINK_WOOL, Blocks.YELLOW_WOOL, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 96 - 103 */
        Blocks.GREEN_WOOL, Blocks.GRASS_BLOCK, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.BLUE_WOOL, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.PURPLE_WOOL, /* 104 - 111 */
        Blocks.REDSTONE_LAMP, Blocks.GRASS_BLOCK, Blocks.RED_WOOL, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.WHITE_WOOL, /* 112 - 119 */
        Blocks.REDSTONE_LAMP, Blocks.GRASS_BLOCK, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 120 - 127 */

        Blocks.REDSTONE_LAMP, Blocks.GRASS_BLOCK, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 128 - 135 */
        Blocks.REDSTONE_LAMP, Blocks.GRASS_BLOCK, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 136 - 143 */
        Blocks.REDSTONE_LAMP, Blocks.GRASS_BLOCK, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 144 - 151 */
        Blocks.REDSTONE_LAMP, Blocks.GRASS_BLOCK, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 152 - 159 */
        Blocks.REDSTONE_LAMP, Blocks.GRASS_BLOCK, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 160 - 167 */
        Blocks.REDSTONE_LAMP, Blocks.GRASS_BLOCK, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 168 - 175 */
        Blocks.REDSTONE_LAMP, Blocks.GRASS_BLOCK, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 176 - 183 */
        Blocks.REDSTONE_LAMP, Blocks.GRASS_BLOCK, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 184 - 191 */

        Blocks.REDSTONE_LAMP, Blocks.GRASS_BLOCK, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 192 - 199 */
        Blocks.REDSTONE_LAMP, Blocks.GRASS_BLOCK, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 200 - 207 */
        Blocks.REDSTONE_LAMP, Blocks.GRASS_BLOCK, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 208 - 215 */
        Blocks.REDSTONE_LAMP, Blocks.GRASS_BLOCK, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 216 - 223 */
        Blocks.REDSTONE_LAMP, Blocks.GRASS_BLOCK, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 224 - 231 */
        Blocks.REDSTONE_LAMP, Blocks.GRASS_BLOCK, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 232 - 249 */
        Blocks.REDSTONE_LAMP, Blocks.GRASS_BLOCK, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 240 - 247 */
        Blocks.REDSTONE_LAMP, Blocks.GRASS_BLOCK, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 248 - 255 */
    };

    private static final Map<Block, Byte> blockToByteMap = new HashMap<>();

    public static Block[] toBlocks(byte[] data) {

        Block[] blocks = new Block[data.length];

        for(int i = 0; i < data.length; i++) {
            byte b = data[i];
            blocks[i] = block256Encoding[b];
        }

        return blocks;
    }

    public static byte[] toBytes(Block[] blocks) {
        byte[] data = new byte[blocks.length];

        for(int i = 0; i < blocks.length; i++) {
            Block b = blocks[i];
            data[i] = blockToByteMap.get(b);
        }

        return data;
    }

    static {
        for(int i = 0; i < block256Encoding.length; i++) {
            blockToByteMap.put(block256Encoding[i], (byte) i);
        }
    }
}
