package com.cscot.basicnetherores.lists;

import java.util.ArrayList;
import java.util.List;

import com.cscot.basicnetherores.objects.BlockOreBase;
import net.minecraft.block.Block;

public class BlockOreList {

	//Ore Blocks are added to this list for registration
	public static final List<Block> blockores = new ArrayList<Block>();
	
	//This is all of the Ore Blocks that will be defined
	public static final Block netheremerald_ore = new BlockOreBase("netheremerald_ore");
	public static final Block netherdiamond_ore = new BlockOreBase("netherdiamond_ore");
	public static final Block netherredstone_ore = new BlockOreBase("netherredstone_ore");
	public static final Block netherlapis_ore = new BlockOreBase("netherlapis_ore");
	public static final Block nethercoal_ore = new BlockOreBase("nethercoal_ore");
	public static final Block nethergold_ore = new BlockOreBase("nethergold_ore");
	public static final Block nethersilver_ore = new BlockOreBase("nethersilver_ore");
	public static final Block netheriron_ore = new BlockOreBase("netheriron_ore");
	public static final Block netherlead_ore = new BlockOreBase("netherlead_ore");
	public static final Block nethernickel_ore = new BlockOreBase("nethernickel_ore");
	public static final Block nethercopper_ore = new BlockOreBase("nethercopper_ore");
	public static final Block netheraluminum_ore = new BlockOreBase("netheraluminum_ore");
	public static final Block nethertin_ore = new BlockOreBase("nethertin_ore");

}
