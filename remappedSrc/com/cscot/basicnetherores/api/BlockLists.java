package com.cscot.basicnetherores.api;

import com.cscot.basicnetherores.BasicNetherOres;
import com.cscot.basicnetherores.blocks.ModMetalBlocks;
import com.cscot.basicnetherores.blocks.ModRawOreBlocks;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BlockLists
{
    public static final Map<Identifier, Block> BLOCKS = new HashMap<>();

    //Metal Blocks//
    public static final Block ALUMINUM_BLOCK = add("aluminum_block", new ModMetalBlocks("aluminum_block"));
    public static final Block LEAD_BLOCK = add("lead_block", new ModMetalBlocks("lead_block"));
    public static final Block NICKEL_BLOCK = add("nickel_block", new ModMetalBlocks("nickel_block"));
    public static final Block SILVER_BLOCK = add("silver_block", new ModMetalBlocks("silver_block"));
    public static final Block TIN_BLOCK = add("tin_block", new ModMetalBlocks("tin_block"));
    public static final Block OSMIUM_BLOCK = add("osmium_block", new ModMetalBlocks("osmium_block"));
    public static final Block URANIUM_BLOCK = add("uranium_block", new ModMetalBlocks("uranium_block"));
    public static final Block ZINC_BLOCK = add("zinc_block", new ModMetalBlocks("zinc_block"));

    //Raw Ore Blocks//
    public static final Block RAW_ALUMINUM_BLOCK = add("raw_aluminum_block", new ModRawOreBlocks("raw_aluminum_block"));
    public static final Block RAW_LEAD_BLOCK = add("raw_lead_block", new ModRawOreBlocks("raw_lead_block"));
    public static final Block RAW_NICKEL_BLOCK = add("raw_nickel_block", new ModRawOreBlocks("raw_nickel_block"));
    public static final Block RAW_SILVER_BLOCK = add("raw_silver_block", new ModRawOreBlocks("raw_silver_block"));
    public static final Block RAW_TIN_BLOCK = add("raw_tin_block", new ModRawOreBlocks("raw_tin_block"));
    public static final Block RAW_OSMIUM_BLOCK = add("raw_osmium_block", new ModRawOreBlocks("raw_osmium_block"));
    public static final Block RAW_URANIUM_BLOCK = add("raw_uranium_block", new ModRawOreBlocks("raw_uranium_block"));
    public static final Block RAW_ZINC_BLOCK = add("raw_zinc_block", new ModRawOreBlocks("raw_zinc_block"));

    private static <block extends Block> block add(String name, block block) {
        BLOCKS.put(new Identifier(BasicNetherOres.MOD_ID, name), block);
        return block;
    }
}
