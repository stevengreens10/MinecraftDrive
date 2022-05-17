package me.nodedigital.minecraftdrive;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import java.util.HashMap;
import java.util.Map;

public class Block256 {

    // TODO: Define 192-255
    private static final Block[] block256Encoding = {
        /* 0-63 */
        Blocks.AIR, Blocks.GRASS_BLOCK, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, /* 0 - 7 */
        Blocks.REDSTONE_LAMP, Blocks.ANDESITE, Blocks.STONE, Blocks.COBBLESTONE, Blocks.COBBLED_DEEPSLATE, Blocks.BRICKS, Blocks.CHISELED_NETHER_BRICKS, Blocks.CRACKED_STONE_BRICKS, /* 8 - 15 */
        Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, Blocks.DEEPSLATE_BRICKS, Blocks.END_STONE_BRICKS, Blocks.MOSSY_STONE_BRICKS, Blocks.NETHER_BRICKS, Blocks.POLISHED_BLACKSTONE_BRICKS, Blocks.PRISMARINE_BRICKS, Blocks.QUARTZ_BRICKS, /* 16 - 23 */
        Blocks.QUARTZ_BRICKS, Blocks.RED_NETHER_BRICKS, Blocks.ACACIA_LOG, Blocks.BIRCH_LOG, Blocks.STRIPPED_ACACIA_LOG, Blocks.STRIPPED_BIRCH_LOG, Blocks.STRIPPED_JUNGLE_LOG, Blocks.DARK_OAK_LOG, /* 24 - 31 */
        Blocks.JUNGLE_LOG, Blocks.OAK_LOG, Blocks.SPRUCE_LOG, Blocks.STRIPPED_DARK_OAK_LOG, Blocks.STRIPPED_OAK_LOG, Blocks.STRIPPED_SPRUCE_LOG, Blocks.BOOKSHELF, Blocks.BONE_BLOCK, /* 32 - 39 */
        Blocks.ENCHANTING_TABLE, Blocks.EMERALD_BLOCK, Blocks.DIAMOND_BLOCK, Blocks.IRON_BLOCK, Blocks.COPPER_BLOCK, Blocks.NETHERITE_BLOCK, Blocks.EMERALD_ORE, Blocks.DEEPSLATE_EMERALD_ORE, /* 40 - 47 */
        Blocks.DIAMOND_ORE, Blocks.DEEPSLATE_DIAMOND_ORE, Blocks.IRON_ORE, Blocks.DEEPSLATE_IRON_ORE, Blocks.RAW_IRON_BLOCK, Blocks.COPPER_ORE, Blocks.DEEPSLATE_COPPER_ORE, Blocks.RAW_COPPER_BLOCK, /* 48 - 55 */
        Blocks.ANCIENT_DEBRIS, Blocks.POLISHED_ANDESITE, Blocks.POLISHED_BLACKSTONE, Blocks.POLISHED_BASALT, Blocks.POLISHED_DEEPSLATE, Blocks.POLISHED_DIORITE, Blocks.POLISHED_GRANITE, Blocks.BARREL, /* 56 - 63 */

        /* 64 - 127 */
        Blocks.BEACON, Blocks.BASALT, Blocks.BEDROCK, Blocks.BLACK_CONCRETE, Blocks.CYAN_CONCRETE, Blocks.BLUE_CONCRETE, Blocks.BROWN_CONCRETE, Blocks.GRAY_CONCRETE, /* 64 - 71 */
        Blocks.GREEN_CONCRETE, Blocks.LIGHT_BLUE_CONCRETE, Blocks.LIGHT_GRAY_CONCRETE, Blocks.LIME_CONCRETE, Blocks.MAGENTA_CONCRETE, Blocks.ORANGE_CONCRETE, Blocks.PINK_CONCRETE, Blocks.PURPLE_CONCRETE, /* 72 - 79 */
        Blocks.RED_CONCRETE, Blocks.WHITE_CONCRETE, Blocks.YELLOW_CONCRETE, Blocks.BLACK_CONCRETE_POWDER, Blocks.CYAN_CONCRETE_POWDER, Blocks.BLUE_CONCRETE_POWDER, Blocks.BROWN_CONCRETE_POWDER, Blocks.GRAY_CONCRETE_POWDER, /* 80 - 87 */
        Blocks.GRAY_CONCRETE_POWDER, Blocks.GREEN_CONCRETE_POWDER, Blocks.LIGHT_BLUE_CONCRETE_POWDER, Blocks.LIGHT_GRAY_CONCRETE_POWDER, Blocks.LIME_CONCRETE_POWDER, Blocks.MAGENTA_CONCRETE_POWDER, Blocks.ORANGE_CONCRETE_POWDER, Blocks.PINK_CONCRETE_POWDER, /* 88 - 95 */
        Blocks.PURPLE_CONCRETE_POWDER, Blocks.RED_CONCRETE_POWDER, Blocks.WHITE_CONCRETE_POWDER, Blocks.YELLOW_CONCRETE_POWDER, Blocks.TERRACOTTA, Blocks.BLACK_TERRACOTTA, Blocks.BLACK_GLAZED_TERRACOTTA, Blocks.BLUE_TERRACOTTA, /* 96 - 103 */
        Blocks.GREEN_WOOL, Blocks.BLUE_GLAZED_TERRACOTTA, Blocks.BROWN_TERRACOTTA, Blocks.BROWN_GLAZED_TERRACOTTA, Blocks.CYAN_TERRACOTTA, Blocks.CYAN_GLAZED_TERRACOTTA, Blocks.GRAY_TERRACOTTA, Blocks.GRAY_GLAZED_TERRACOTTA , /* 104 - 111 */
        Blocks.GREEN_TERRACOTTA, Blocks.GREEN_GLAZED_TERRACOTTA, Blocks.LIGHT_BLUE_TERRACOTTA, Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA, Blocks.LIGHT_GRAY_TERRACOTTA, Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA, Blocks.MAGENTA_TERRACOTTA, Blocks.MAGENTA_GLAZED_TERRACOTTA, /* 112 - 119 */
        Blocks.ORANGE_TERRACOTTA, Blocks.ORANGE_GLAZED_TERRACOTTA, Blocks.PINK_TERRACOTTA, Blocks.PINK_GLAZED_TERRACOTTA, Blocks.PURPLE_TERRACOTTA, Blocks.PURPLE_GLAZED_TERRACOTTA, Blocks.WHITE_TERRACOTTA, Blocks.WHITE_GLAZED_TERRACOTTA, /* 120 - 127 */

        /* 128 - 191 */
        Blocks.RED_TERRACOTTA, Blocks.RED_GLAZED_TERRACOTTA, Blocks.REDSTONE_ORE, Blocks.DEEPSLATE_REDSTONE_ORE, Blocks.BLACK_WOOL, Blocks.BROWN_WOOL, Blocks.CYAN_WOOL, Blocks.GRAY_WOOL, /* 128 - 135 */
        Blocks.LIGHT_BLUE_WOOL, Blocks.LIGHT_GRAY_WOOL, Blocks.LIME_WOOL, Blocks.MAGENTA_WOOL, Blocks.ORANGE_WOOL, Blocks.PINK_WOOL, Blocks.GLASS, Blocks.GRAY_STAINED_GLASS, /* 136 - 143 */
        Blocks.GREEN_STAINED_GLASS, Blocks.BLACK_STAINED_GLASS, Blocks.BLUE_STAINED_GLASS, Blocks.BROWN_STAINED_GLASS, Blocks.CYAN_STAINED_GLASS, Blocks.LIGHT_BLUE_STAINED_GLASS, Blocks.LIGHT_GRAY_STAINED_GLASS, Blocks.RED_STAINED_GLASS, /* 144 - 151 */
        Blocks.MAGENTA_STAINED_GLASS, Blocks.ORANGE_STAINED_GLASS, Blocks.PINK_STAINED_GLASS, Blocks.DIRT, Blocks.GRANITE, Blocks.DIORITE, Blocks.COAL_BLOCK, Blocks.COAL_ORE, /* 152 - 159 */
        Blocks.DEEPSLATE_COAL_ORE, Blocks.OBSIDIAN, Blocks.CRYING_OBSIDIAN, Blocks.NETHERRACK, Blocks.GOLD_BLOCK, Blocks.GOLD_ORE, Blocks.DEEPSLATE_GOLD_ORE, Blocks.RAW_GOLD_BLOCK, /* 160 - 167 */
        Blocks.NETHER_GOLD_ORE, Blocks.WARPED_NYLIUM, Blocks.CRIMSON_NYLIUM, Blocks.WARPED_WART_BLOCK, Blocks.SPONGE, Blocks.TINTED_GLASS, Blocks.CRAFTING_TABLE, Blocks.LAPIS_BLOCK, /* 168 - 175 */
        Blocks.LAPIS_ORE, Blocks.DEEPSLATE_LAPIS_ORE, Blocks.SANDSTONE, Blocks.SMOOTH_SANDSTONE, Blocks.SMOOTH_RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.CUT_SANDSTONE, Blocks.CUT_RED_SANDSTONE, /* 176 - 183 */
        Blocks.CHISELED_SANDSTONE, Blocks.CHISELED_RED_SANDSTONE, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_PILLAR, Blocks.CHISELED_QUARTZ_BLOCK, Blocks.SMOOTH_QUARTZ, Blocks.NETHER_QUARTZ_ORE, Blocks.MOSS_BLOCK, /* 184 - 191 */

        /* 192 - 255 */
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
