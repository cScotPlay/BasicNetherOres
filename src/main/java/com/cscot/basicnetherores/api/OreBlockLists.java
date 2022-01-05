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
    public static Block NETHER_EMERALD_ORE = add("nether_emerald_ore", new ModOreBlock("nether_emerald_ore", UniformIntProvider.create(3, 7), 2));
    public static Block NETHER_DIAMOND_ORE = add("nether_diamond_ore", new ModOreBlock("nether_diamond_ore", UniformIntProvider.create(3, 7), 2));
    public static Block NETHER_REDSTONE_ORE = add("nether_redstone_ore", new ModRedstoneOreBlock("nether_redstone_ore"));
    public static Block NETHER_LAPIS_ORE = add("nether_lapis_ore", new ModOreBlock("nether_lapis_ore", UniformIntProvider.create(2, 5), 1));
    public static Block NETHER_COAL_ORE = add("nether_coal_ore", new ModOreBlock("nether_coal_ore", UniformIntProvider.create(0, 2), 0));
    public static Block NETHER_SILVER_ORE = add("nether_silver_ore", new ModOreBlock("nether_silver_ore", 2));
    public static Block NETHER_IRON_ORE = add("nether_iron_ore", new ModOreBlock("nether_iron_ore", 1));
    public static Block NETHER_LEAD_ORE = add("nether_lead_ore", new ModOreBlock("nether_lead_ore", 2));
    public static Block NETHER_NICKEL_ORE = add("nether_nickel_ore", new ModOreBlock("nether_nickel_ore", 2));
    public static Block NETHER_COPPER_ORE = add("nether_copper_ore", new ModOreBlock("nether_copper_ore", 1));
    public static Block NETHER_ALUMINUM_ORE = add("nether_aluminum_ore", new ModOreBlock("nether_aluminum_ore", 1));
    public static Block NETHER_TIN_ORE = add("nether_tin_ore", new ModOreBlock("nether_tin_ore", 2));
    public static Block NETHER_OSMIUM_ORE = add("nether_osmium_ore", new ModOreBlock("nether_osmium_ore", 1));
    public static Block NETHER_URANIUM_ORE = add("nether_uranium_ore", new ModOreBlock("nether_uranium_ore", 2));
    public static Block NETHER_ZINC_ORE = add("nether_zinc_ore", new ModOreBlock("nether_zinc_ore", 2));

    private static <oreBlock extends Block> oreBlock add(String name, oreBlock block) {
        OREBLOCKS.put(new Identifier(BasicNetherOres.MOD_ID, name), block);
        return block;
    }

}
