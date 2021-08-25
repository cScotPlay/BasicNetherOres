package com.cscot.basicnetherores.api;

import java.util.ArrayList;
import java.util.List;

import com.cscot.basicnetherores.world.level.block.ModOreBlock;
import com.cscot.basicnetherores.world.level.block.ModRedstoneOreBlock;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;


public class BlockOreList {

	//Ore Blocks are added to this list for registration
	public static List<Block> blockores = new ArrayList<Block>();

	//This is all of the Ore Blocks that will be defined
	public static Block netheremerald_ore = new ModOreBlock("netheremerald_ore", UniformInt.of(3,7));
	public static Block netherdiamond_ore = new ModOreBlock("netherdiamond_ore", UniformInt.of(3,7));
	public static Block netherredstone_ore = new ModRedstoneOreBlock("netherredstone_ore");
	public static Block netherlapis_ore = new ModOreBlock("netherlapis_ore", UniformInt.of(2,5));
	public static Block nethercoal_ore = new ModOreBlock("nethercoal_ore", UniformInt.of(0,2));
	public static Block nethersilver_ore = new ModOreBlock("nethersilver_ore");
	public static Block netheriron_ore = new ModOreBlock("netheriron_ore");
	public static Block netherlead_ore = new ModOreBlock("netherlead_ore");
	public static Block nethernickel_ore = new ModOreBlock("nethernickel_ore");
	public static Block nethercopper_ore = new ModOreBlock("nethercopper_ore");
	public static Block netheraluminum_ore = new ModOreBlock("netheraluminum_ore");
	public static Block nethertin_ore = new ModOreBlock("nethertin_ore");
	public static Block netherosmium_ore = new ModOreBlock("netherosmium_ore");
	public static Block netheruranium_ore = new ModOreBlock("netheruranium_ore");
}


