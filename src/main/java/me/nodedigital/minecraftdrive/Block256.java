package me.nodedigital.minecraftdrive;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import java.util.HashMap;
import java.util.Map;

public class Block256 {

    // TODO: Define 9-256
    private static final Block[] block256Encoding = {
        Blocks.AIR, Blocks.GRASS, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 0 - 8 */
        Blocks.AIR, Blocks.GRASS, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 9 - 16 */
        Blocks.AIR, Blocks.GRASS, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 17 - 24 */
        Blocks.AIR, Blocks.GRASS, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 25 - 32 */
        Blocks.AIR, Blocks.GRASS, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 33 - 40 */
        Blocks.AIR, Blocks.GRASS, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 41 - 48 */
        Blocks.AIR, Blocks.GRASS, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 49 - 56 */
        Blocks.AIR, Blocks.GRASS, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 57 - 64 */

        Blocks.AIR, Blocks.GRASS, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 65 - 72 */
        Blocks.AIR, Blocks.GRASS, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 73 - 80 */
        Blocks.AIR, Blocks.GRASS, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 81 - 88 */
        Blocks.AIR, Blocks.GRASS, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 89 - 96 */
        Blocks.AIR, Blocks.GRASS, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 97 - 104 */
        Blocks.AIR, Blocks.GRASS, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 105 - 112 */
        Blocks.AIR, Blocks.GRASS, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 113 - 120 */
        Blocks.AIR, Blocks.GRASS, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 121 - 128 */

        Blocks.AIR, Blocks.GRASS, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 129 - 136 */
        Blocks.AIR, Blocks.GRASS, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 137 - 144 */
        Blocks.AIR, Blocks.GRASS, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 145 - 152 */
        Blocks.AIR, Blocks.GRASS, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 153 - 160 */
        Blocks.AIR, Blocks.GRASS, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 161 - 168 */
        Blocks.AIR, Blocks.GRASS, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 169 - 176 */
        Blocks.AIR, Blocks.GRASS, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 177 - 184 */
        Blocks.AIR, Blocks.GRASS, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 185 - 192 */

        Blocks.AIR, Blocks.GRASS, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 193 - 200 */
        Blocks.AIR, Blocks.GRASS, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 201 - 208 */
        Blocks.AIR, Blocks.GRASS, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 209 - 216 */
        Blocks.AIR, Blocks.GRASS, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 217 - 224 */
        Blocks.AIR, Blocks.GRASS, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 225 - 232 */
        Blocks.AIR, Blocks.GRASS, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 233 - 240 */
        Blocks.AIR, Blocks.GRASS, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 241 - 248 */
        Blocks.AIR, Blocks.GRASS, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 249 - 256 */
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
