package com.cscot.basicnetherores.api;

import com.cscot.basicnetherores.BasicNetherOres;
import com.cscot.basicnetherores.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BlockLists
{
    public static final Map<Identifier, Block> BLOCKS = new HashMap<>();

    public static final Block ALUMINUM_BLOCK = add("aluminum_block", new ModBlocks("aluminum_block"));
    public static final Block COPPER_BLOCK = add("copper_block", new ModBlocks("copper_block"));
    public static final Block LEAD_BLOCK = add("lead_block", new ModBlocks("lead_block"));
    public static final Block NICKEL_BLOCK = add("nickel_block", new ModBlocks("nickel_block"));
    public static final Block SILVER_BLOCK = add("silver_block", new ModBlocks("silver_block"));
    public static final Block TIN_BLOCK = add("tin_block", new ModBlocks("tin_block"));
    public static final Block OSMIUM_BLOCK = add("osmium_block", new ModBlocks("osmium_block"));
    public static final Block URANIUM_BLOCK = add("uranium_block", new ModBlocks("uranium_block"));

    private static <block extends Block> block add(String name, block block) {
        BLOCKS.put(new Identifier(BasicNetherOres.MOD_ID, name), block);
        return block;
    }
}
