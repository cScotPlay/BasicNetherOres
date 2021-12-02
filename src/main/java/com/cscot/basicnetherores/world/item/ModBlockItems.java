package com.cscot.basicnetherores.world.item;

import com.cscot.basicnetherores.BasicNetherOres;
import com.cscot.basicnetherores.world.level.block.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BasicNetherOres.modid);

    public static final RegistryObject<Item> NETHER_EMERALD_ORE = ITEMS.register("nether_emerald_ore", () -> new BlockItem(ModBlocks.NETHER_EMERALD_ORE.get(), new Item.Properties().tab(BasicNetherOres.bnoItemGroup)));
    public static final RegistryObject<Item> NETHER_DIAMOND_ORE = ITEMS.register("nether_diamond_ore", () -> new BlockItem(ModBlocks.NETHER_DIAMOND_ORE.get(), new Item.Properties().tab(BasicNetherOres.bnoItemGroup)));
    public static final RegistryObject<Item> NETHER_REDSTONE_ORE = ITEMS.register("nether_redstone_ore", () -> new BlockItem(ModBlocks.NETHER_REDSTONE_ORE.get(), new Item.Properties().tab(BasicNetherOres.bnoItemGroup)));
    public static final RegistryObject<Item> NETHER_LAPIS_ORE = ITEMS.register("nether_lapis_ore", () -> new BlockItem(ModBlocks.NETHER_LAPIS_ORE.get(), new Item.Properties().tab(BasicNetherOres.bnoItemGroup)));
    public static final RegistryObject<Item> NETHER_COAL_ORE = ITEMS.register("nether_coal_ore", () -> new BlockItem(ModBlocks.NETHER_COAL_ORE.get(), new Item.Properties().tab(BasicNetherOres.bnoItemGroup)));
    public static final RegistryObject<Item> NETHER_SILVER_ORE = ITEMS.register("nether_silver_ore", () -> new BlockItem(ModBlocks.NETHER_SILVER_ORE.get(), new Item.Properties().tab(BasicNetherOres.bnoItemGroup)));
    public static final RegistryObject<Item> NETHER_IRON_ORE = ITEMS.register("nether_iron_ore", () -> new BlockItem(ModBlocks.NETHER_IRON_ORE.get(), new Item.Properties().tab(BasicNetherOres.bnoItemGroup)));
    public static final RegistryObject<Item> NETHER_LEAD_ORE = ITEMS.register("nether_lead_ore", () -> new BlockItem(ModBlocks.NETHER_LEAD_ORE.get(), new Item.Properties().tab(BasicNetherOres.bnoItemGroup)));
    public static final RegistryObject<Item> NETHER_NICKEL_ORE = ITEMS.register("nether_nickel_ore", () -> new BlockItem(ModBlocks.NETHER_NICKEL_ORE.get(), new Item.Properties().tab(BasicNetherOres.bnoItemGroup)));
    public static final RegistryObject<Item> NETHER_COPPER_ORE = ITEMS.register("nether_copper_ore", () -> new BlockItem(ModBlocks.NETHER_COPPER_ORE.get(), new Item.Properties().tab(BasicNetherOres.bnoItemGroup)));
    public static final RegistryObject<Item> NETHER_ALUMINUM_ORE = ITEMS.register("nether_aluminum_ore", () -> new BlockItem(ModBlocks.NETHER_ALUMINUM_ORE.get(), new Item.Properties().tab(BasicNetherOres.bnoItemGroup)));
    public static final RegistryObject<Item> NETHER_TIN_ORE = ITEMS.register("nether_tin_ore", () -> new BlockItem(ModBlocks.NETHER_TIN_ORE.get(), new Item.Properties().tab(BasicNetherOres.bnoItemGroup)));
    public static final RegistryObject<Item> NETHER_OSMIUM_ORE = ITEMS.register("nether_osmium_ore", () -> new BlockItem(ModBlocks.NETHER_OSMIUM_ORE.get(), new Item.Properties().tab(BasicNetherOres.bnoItemGroup)));
    public static final RegistryObject<Item> NETHER_URANIUM_ORE = ITEMS.register("nether_uranium_ore", () -> new BlockItem(ModBlocks.NETHER_URANIUM_ORE.get(), new Item.Properties().tab(BasicNetherOres.bnoItemGroup)));

    public static final RegistryObject<Item> SILVER_BLOCK = ITEMS.register("silver_block", () -> new BlockItem(ModBlocks.SILVER_BLOCK.get(), new Item.Properties().tab(BasicNetherOres.bnoItemGroup)));
    public static final RegistryObject<Item> LEAD_BLOCK = ITEMS.register("lead_block", () -> new BlockItem(ModBlocks.LEAD_BLOCK.get(), new Item.Properties().tab(BasicNetherOres.bnoItemGroup)));
    public static final RegistryObject<Item> NICKEL_BLOCK = ITEMS.register("nickel_block", () -> new BlockItem(ModBlocks.NICKEL_BLOCK.get(), new Item.Properties().tab(BasicNetherOres.bnoItemGroup)));
    public static final RegistryObject<Item> ALUMINUM_BLOCK = ITEMS.register("aluminum_block", () -> new BlockItem(ModBlocks.ALUMINUM_BLOCK.get(), new Item.Properties().tab(BasicNetherOres.bnoItemGroup)));
    public static final RegistryObject<Item> TIN_BLOCK = ITEMS.register("tin_block", () -> new BlockItem(ModBlocks.TIN_BLOCK.get(), new Item.Properties().tab(BasicNetherOres.bnoItemGroup)));
    public static final RegistryObject<Item> OSMIUM_BLOCK = ITEMS.register("osmium_block", () -> new BlockItem(ModBlocks.OSMIUM_BLOCK.get(), new Item.Properties().tab(BasicNetherOres.bnoItemGroup)));
    public static final RegistryObject<Item> URANIUM_BLOCK = ITEMS.register("uranium_block", () -> new BlockItem(ModBlocks.URANIUM_BLOCK.get(), new Item.Properties().tab(BasicNetherOres.bnoItemGroup)));

    public static final RegistryObject<Item> RAW_SILVER_BLOCK = ITEMS.register("raw_silver_block", () -> new BlockItem(ModBlocks.RAW_SILVER_BLOCK.get(), new Item.Properties().tab(BasicNetherOres.bnoItemGroup)));
    public static final RegistryObject<Item> RAW_LEAD_BLOCK = ITEMS.register("raw_lead_block", () -> new BlockItem(ModBlocks.RAW_LEAD_BLOCK.get(), new Item.Properties().tab(BasicNetherOres.bnoItemGroup)));
    public static final RegistryObject<Item> RAW_NICKEL_BLOCK = ITEMS.register("raw_nickel_block", () -> new BlockItem(ModBlocks.RAW_NICKEL_BLOCK.get(), new Item.Properties().tab(BasicNetherOres.bnoItemGroup)));
    public static final RegistryObject<Item> RAW_ALUMINUM_BLOCK = ITEMS.register("raw_aluminum_block", () -> new BlockItem(ModBlocks.RAW_ALUMINUM_BLOCK.get(), new Item.Properties().tab(BasicNetherOres.bnoItemGroup)));
    public static final RegistryObject<Item> RAW_TIN_BLOCK = ITEMS.register("raw_tin_block", () -> new BlockItem(ModBlocks.RAW_TIN_BLOCK.get(), new Item.Properties().tab(BasicNetherOres.bnoItemGroup)));
    public static final RegistryObject<Item> RAW_OSMIUM_BLOCK = ITEMS.register("raw_osmium_block", () -> new BlockItem(ModBlocks.RAW_OSMIUM_BLOCK.get(), new Item.Properties().tab(BasicNetherOres.bnoItemGroup)));
    public static final RegistryObject<Item> RAW_URANIUM_BLOCK = ITEMS.register("raw_uranium_block", () -> new BlockItem(ModBlocks.RAW_URANIUM_BLOCK.get(), new Item.Properties().tab(BasicNetherOres.bnoItemGroup)));


}
