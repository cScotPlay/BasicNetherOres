package com.cscot.basicnetherores.api;

import com.cscot.basicnetherores.BasicNetherOres;
import com.cscot.basicnetherores.blocks.ModOreBlock;
import com.cscot.basicnetherores.blocks.ModRedstoneOreBlock;
import net.minecraft.block.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

import java.util.HashMap;
import java.util.Map;

public class OreBlockLists
{
    //Ore Blocks are added to this list for registration
    public static final Map<Identifier, Block> OREBLOCKS = new HashMap<>();

    //This is all of the Ore Blocks that will be defined
    public static Block NETHEREMERALD_ORE = add("netheremerald_ore", new ModOreBlock("netheremerald_ore", UniformIntProvider.create(3, 7), 2));
    public static Block NETHERDIAMOND_ORE = add("netherdiamond_ore", new ModOreBlock("netherdiamond_ore", UniformIntProvider.create(3, 7), 2));
    public static Block NETHERREDSTONE_ORE = add("netherredstone_ore", new ModRedstoneOreBlock("netherredstone_ore"));
    public static Block NETHERLAPIS_ORE = add("netherlapis_ore", new ModOreBlock("netherlapis_ore", UniformIntProvider.create(2, 5), 1));
    public static Block NETHERCOAL_ORE = add("nethercoal_ore", new ModOreBlock("nethercoal_ore", UniformIntProvider.create(0, 2), 1));
    public static Block NETHERSILVER_ORE = add("nethersilver_ore", new ModOreBlock("nethersilver_ore", 2));
    public static Block NETHERIRON_ORE = add("netheriron_ore", new ModOreBlock("netheriron_ore", 1));
    public static Block NETHERLEAD_ORE = add("netherlead_ore", new ModOreBlock("netherlead_ore", 2));
    public static Block NETHERNICKEL_ORE = add("nethernickel_ore", new ModOreBlock("nethernickel_ore", 2));
    public static Block NETHERCOPPER_ORE = add("nethercopper_ore", new ModOreBlock("nethercopper_ore", 1));
    public static Block NETHERALUMINUM_ORE = add("netheraluminum_ore", new ModOreBlock("netheraluminum_ore", 1));
    public static Block NETHERTIN_ORE = add("nethertin_ore", new ModOreBlock("nethertin_ore", 2));
    public static Block NETHEROSMIUM_ORE = add("netherosmium_ore", new ModOreBlock("netherosmium_ore", 1));
    public static Block NETHERURANIUM_ORE = add("netheruranium_ore", new ModOreBlock("netheruranium_ore", 2));

    private static <oreBlock extends Block> oreBlock add(String name, oreBlock block) {
        OREBLOCKS.put(new Identifier(BasicNetherOres.MOD_ID, name), block);
        return block;
    }

}
