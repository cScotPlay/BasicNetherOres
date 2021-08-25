package com.cscot.basicnetherores.api;

import com.cscot.basicnetherores.world.level.block.ModMetalBlock;
import com.cscot.basicnetherores.world.level.block.ModRawOreBlock;
import net.minecraft.world.level.block.Block;

import java.util.ArrayList;
import java.util.List;

public class BlockList
{
    public static final List<Block> blocks = new ArrayList<Block>();

    //Metal Blocks//
    public static final Block aluminum_block = new ModMetalBlock("aluminum_block");
    public static final Block lead_block = new ModMetalBlock("lead_block");
    public static final Block nickel_block = new ModMetalBlock("nickel_block");
    public static final Block silver_block = new ModMetalBlock("silver_block");
    public static final Block tin_block = new ModMetalBlock("tin_block");
    public static final Block osmium_block = new ModMetalBlock("osmium_block");
    public static final Block uranium_block = new ModMetalBlock("uranium_block");

    //Raw Ore Blocks//
    public static final Block raw_aluminum_block = new ModRawOreBlock("raw_aluminum_block");
    public static final Block raw_lead_block = new ModRawOreBlock("raw_lead_block");
    public static final Block raw_nickel_block = new ModRawOreBlock("raw_nickel_block");
    public static final Block raw_silver_block = new ModRawOreBlock("raw_silver_block");
    public static final Block raw_tin_block = new ModRawOreBlock("raw_tin_block");
    public static final Block raw_osmium_block = new ModRawOreBlock("raw_osmium_block");
    public static final Block raw_uranium_block = new ModRawOreBlock("raw_uranium_block");
}
