package com.cscot.basicnetherores.lists;

import com.cscot.basicnetherores.objects.BlockBase;
import net.minecraft.block.Block;

import java.util.ArrayList;
import java.util.List;

public class BlockList
{
    public static final List<Block> blocks = new ArrayList<Block>();

    public static final Block aluminum_block = new BlockBase("aluminum_block");
    public static final Block copper_block = new BlockBase("copper_block");
    public static final Block lead_block = new BlockBase("lead_block");
    public static final Block nickel_block = new BlockBase("nickel_block");
    public static final Block silver_block = new BlockBase("silver_block");
    public static final Block tin_block = new BlockBase("tin_block");
    public static final Block osmium_block = new BlockBase("osmium_block");
    public static final Block uranium_block = new BlockBase("uranium_block");
}
