package com.cscot.basicnetherores.data.tags;

import com.cscot.basicnetherores.api.BlockLists;
import com.cscot.basicnetherores.api.ItemLists;
import com.cscot.basicnetherores.api.OreBlockLists;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.tag.BlockTags;
import net.minecraft.tag.ItemTags;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.concurrent.CompletableFuture;

public class ItemTagGenerator extends FabricTagProvider.ItemTagProvider {

    public ItemTagGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    public static final TagKey<Item> ORES = itemTag(new Identifier("c", "ores"));

    public static final TagKey<Item> ORES_EMERALD = itemTag(new Identifier("c", "emerald_ores"));
    public static final TagKey<Item> ORES_DIAMOND = itemTag(new Identifier("c", "diamond_ores"));
    public static final TagKey<Item> ORES_REDSTONE = itemTag(new Identifier("c", "redstone_ores"));
    public static final TagKey<Item> ORES_LAPIS = itemTag(new Identifier("c", "lapis_ores"));
    public static final TagKey<Item> ORES_COAL = itemTag(new Identifier("c", "coal_ores"));
    public static final TagKey<Item> ORES_IRON = itemTag(new Identifier("c", "iron_ores"));
    public static final TagKey<Item> ORES_ALUMINUM = itemTag(new Identifier("c", "aluminum_ores"));
    public static final TagKey<Item> ORES_SILVER = itemTag(new Identifier("c", "silver_ores"));
    public static final TagKey<Item> ORES_LEAD = itemTag(new Identifier("c", "lead_ores"));
    public static final TagKey<Item> ORES_NICKEL = itemTag(new Identifier("c", "nickel_ores"));
    public static final TagKey<Item> ORES_COPPER = itemTag(new Identifier("c", "copper_ores"));
    public static final TagKey<Item> ORES_TIN = itemTag(new Identifier("c", "tin_ores"));
    public static final TagKey<Item> ORES_OSMIUM = itemTag(new Identifier("c", "osmium_ores"));
    public static final TagKey<Item> ORES_URANIUM = itemTag(new Identifier("c", "uranium_ores"));
    public static final TagKey<Item> ORES_ZINC = itemTag(new Identifier("c", "zinc_ores"));

    public static final TagKey<Item> ALUMINUM_BLOCK = itemTag(new Identifier("c", "aluminum_blocks"));
    public static final TagKey<Item> SILVER_BLOCK = itemTag(new Identifier("c", "silver_blocks"));
    public static final TagKey<Item> LEAD_BLOCK = itemTag(new Identifier("c", "lead_blocks"));
    public static final TagKey<Item> NICKEL_BLOCK = itemTag(new Identifier("c", "nickel_blocks"));
    public static final TagKey<Item> TIN_BLOCK = itemTag(new Identifier("c", "tin_blocks"));
    public static final TagKey<Item> OSMIUM_BLOCK = itemTag(new Identifier("c", "osmium_blocks"));
    public static final TagKey<Item> URANIUM_BLOCK = itemTag(new Identifier("c", "uranium_blocks"));
    public static final TagKey<Item> ZINC_BLOCK = itemTag(new Identifier("c", "zinc_blocks"));

    public static final TagKey<Item> RAW_ALUMINUM_BLOCK = itemTag(new Identifier("c", "raw_aluminum_blocks"));
    public static final TagKey<Item> RAW_SILVER_BLOCK = itemTag(new Identifier("c", "raw_silver_blocks"));
    public static final TagKey<Item> RAW_LEAD_BLOCK = itemTag(new Identifier("c", "raw_lead_blocks"));
    public static final TagKey<Item> RAW_NICKEL_BLOCK = itemTag(new Identifier("c", "raw_nickel_blocks"));
    public static final TagKey<Item> RAW_TIN_BLOCK = itemTag(new Identifier("c", "raw_tin_blocks"));
    public static final TagKey<Item> RAW_OSMIUM_BLOCK = itemTag(new Identifier("c", "raw_osmium_blocks"));
    public static final TagKey<Item> RAW_URANIUM_BLOCK = itemTag(new Identifier("c", "raw_uranium_blocks"));
    public static final TagKey<Item> RAW_ZINC_BLOCK = itemTag(new Identifier("c", "raw_zinc_blocks"));

    public static final TagKey<Item> INGOTS = itemTag(new Identifier("c", "ingots"));

    public static final TagKey<Item> INGOT_ALUMINUM = itemTag(new Identifier("c", "aluminum_ingots"));
    public static final TagKey<Item> INGOT_SILVER = itemTag(new Identifier("c", "silver_ingots"));
    public static final TagKey<Item> INGOT_LEAD = itemTag(new Identifier("c", "lead_ingots"));
    public static final TagKey<Item> INGOT_NICKEL = itemTag(new Identifier("c", "nickel_ingots"));
    public static final TagKey<Item> INGOT_TIN = itemTag(new Identifier("c", "tin_ingots"));
    public static final TagKey<Item> INGOT_OSMIUM = itemTag(new Identifier("c", "osmium_ingots"));
    public static final TagKey<Item> INGOT_URANIUM = itemTag(new Identifier("c", "uranium_ingots"));
    public static final TagKey<Item> INGOT_ZINC = itemTag(new Identifier("c", "zinc_ingots"));

    public static final TagKey<Item> NUGGETS = itemTag(new Identifier("c", "nuggets"));

    public static final TagKey<Item> NUGGET_ALUMINUM = itemTag(new Identifier("c", "aluminum_nuggets"));
    public static final TagKey<Item> NUGGET_SILVER = itemTag(new Identifier("c", "silver_nuggets"));
    public static final TagKey<Item> NUGGET_LEAD = itemTag(new Identifier("c", "lead_nuggets"));
    public static final TagKey<Item> NUGGET_NICKEL = itemTag(new Identifier("c", "nickel_nuggets"));
    public static final TagKey<Item> NUGGET_COPPER = itemTag(new Identifier("c", "copper_nuggets"));
    public static final TagKey<Item> NUGGET_TIN = itemTag(new Identifier("c", "tin_nuggets"));
    public static final TagKey<Item> NUGGET_OSMIUM = itemTag(new Identifier("c", "osmium_nuggets"));
    public static final TagKey<Item> NUGGET_ZINC = itemTag(new Identifier("c", "zinc_nuggets"));

    public static final TagKey<Item> RAW_MATERIALS = itemTag(new Identifier("c", "raw_materials"));

    public static final TagKey<Item> RAW_ALUMINUM = itemTag(new Identifier("c", "raw_aluminum"));
    public static final TagKey<Item> RAW_SILVER = itemTag(new Identifier("c", "raw_silver"));
    public static final TagKey<Item> RAW_LEAD = itemTag(new Identifier("c", "raw_lead"));
    public static final TagKey<Item> RAW_NICKEL = itemTag(new Identifier("c", "raw_nickel"));
    public static final TagKey<Item> RAW_TIN = itemTag(new Identifier("c", "raw_tin"));
    public static final TagKey<Item> RAW_OSMIUM = itemTag(new Identifier("c", "raw_osmium"));
    public static final TagKey<Item> RAW_URANIUM = itemTag(new Identifier("c", "raw_uranium"));
    public static final TagKey<Item> RAW_ZINC = itemTag(new Identifier("c", "raw_zinc"));


    @Override
    protected void generateTags() {

        getOrCreateTagBuilder(ItemTags.EMERALD_ORES).add(OreBlockLists.NETHER_EMERALD_ORE.asItem());
        getOrCreateTagBuilder(ItemTags.DIAMOND_ORES).add(OreBlockLists.NETHER_DIAMOND_ORE.asItem());
        getOrCreateTagBuilder(ItemTags.REDSTONE_ORES).add(OreBlockLists.NETHER_REDSTONE_ORE.asItem());
        getOrCreateTagBuilder(ItemTags.LAPIS_ORES).add(OreBlockLists.NETHER_LAPIS_ORE.asItem());
        getOrCreateTagBuilder(ItemTags.COAL_ORES).add(OreBlockLists.NETHER_COAL_ORE.asItem());
        getOrCreateTagBuilder(ItemTags.IRON_ORES).add(OreBlockLists.NETHER_IRON_ORE.asItem());
        getOrCreateTagBuilder(ItemTags.COPPER_ORES).add(OreBlockLists.NETHER_COPPER_ORE.asItem());

        // ***************************************************************************** //
        //  Fabric Tags (Only Account for Fabric Tags Here)
        // ***************************************************************************** //
        getOrCreateTagBuilder(ORES).add(
                OreBlockLists.NETHER_EMERALD_ORE.asItem(),
                OreBlockLists.NETHER_DIAMOND_ORE.asItem(),
                OreBlockLists.NETHER_REDSTONE_ORE.asItem(),
                OreBlockLists.NETHER_LAPIS_ORE.asItem(),
                OreBlockLists.NETHER_COAL_ORE.asItem(),
                OreBlockLists.NETHER_SILVER_ORE.asItem(),
                OreBlockLists.NETHER_IRON_ORE.asItem(),
                OreBlockLists.NETHER_LEAD_ORE.asItem(),
                OreBlockLists.NETHER_NICKEL_ORE.asItem(),
                OreBlockLists.NETHER_COPPER_ORE.asItem(),
                OreBlockLists.NETHER_ALUMINUM_ORE.asItem(),
                OreBlockLists.NETHER_TIN_ORE.asItem(),
                OreBlockLists.NETHER_OSMIUM_ORE.asItem(),
                OreBlockLists.NETHER_URANIUM_ORE.asItem(),
                OreBlockLists.NETHER_ZINC_ORE.asItem()
        );


        getOrCreateTagBuilder(ORES_EMERALD).add(OreBlockLists.NETHER_EMERALD_ORE.asItem());
        getOrCreateTagBuilder(ORES_DIAMOND).add(OreBlockLists.NETHER_DIAMOND_ORE.asItem());
        getOrCreateTagBuilder(ORES_REDSTONE).add(OreBlockLists.NETHER_REDSTONE_ORE.asItem());
        getOrCreateTagBuilder(ORES_LAPIS).add(OreBlockLists.NETHER_LAPIS_ORE.asItem());
        getOrCreateTagBuilder(ORES_COAL).add(OreBlockLists.NETHER_COAL_ORE.asItem());
        getOrCreateTagBuilder(ORES_IRON).add(OreBlockLists.NETHER_IRON_ORE.asItem());
        getOrCreateTagBuilder(ORES_ALUMINUM).add(OreBlockLists.NETHER_ALUMINUM_ORE.asItem());
        getOrCreateTagBuilder(ORES_SILVER).add(OreBlockLists.NETHER_SILVER_ORE.asItem());
        getOrCreateTagBuilder(ORES_LEAD).add(OreBlockLists.NETHER_LEAD_ORE.asItem());
        getOrCreateTagBuilder(ORES_NICKEL).add(OreBlockLists.NETHER_NICKEL_ORE.asItem());
        getOrCreateTagBuilder(ORES_COPPER).add(OreBlockLists.NETHER_COPPER_ORE.asItem());
        getOrCreateTagBuilder(ORES_TIN).add(OreBlockLists.NETHER_TIN_ORE.asItem());
        getOrCreateTagBuilder(ORES_OSMIUM).add(OreBlockLists.NETHER_OSMIUM_ORE.asItem());
        getOrCreateTagBuilder(ORES_URANIUM).add(OreBlockLists.NETHER_URANIUM_ORE.asItem());
        getOrCreateTagBuilder(ORES_ZINC).add(OreBlockLists.NETHER_ZINC_ORE.asItem());

        getOrCreateTagBuilder(ALUMINUM_BLOCK).add(BlockLists.ALUMINUM_BLOCK.asItem());
        getOrCreateTagBuilder(SILVER_BLOCK).add(BlockLists.SILVER_BLOCK.asItem());
        getOrCreateTagBuilder(LEAD_BLOCK).add(BlockLists.LEAD_BLOCK.asItem());
        getOrCreateTagBuilder(NICKEL_BLOCK).add(BlockLists.NICKEL_BLOCK.asItem());
        getOrCreateTagBuilder(TIN_BLOCK).add(BlockLists.TIN_BLOCK.asItem());
        getOrCreateTagBuilder(OSMIUM_BLOCK).add(BlockLists.OSMIUM_BLOCK.asItem());
        getOrCreateTagBuilder(URANIUM_BLOCK).add(BlockLists.URANIUM_BLOCK.asItem());
        getOrCreateTagBuilder(ZINC_BLOCK).add(BlockLists.ZINC_BLOCK.asItem());

        getOrCreateTagBuilder(RAW_ALUMINUM_BLOCK).add(BlockLists.RAW_ALUMINUM_BLOCK.asItem());
        getOrCreateTagBuilder(RAW_SILVER_BLOCK).add(BlockLists.RAW_SILVER_BLOCK.asItem());
        getOrCreateTagBuilder(RAW_LEAD_BLOCK).add(BlockLists.RAW_LEAD_BLOCK.asItem());
        getOrCreateTagBuilder(RAW_NICKEL_BLOCK).add(BlockLists.RAW_NICKEL_BLOCK.asItem());
        getOrCreateTagBuilder(RAW_TIN_BLOCK).add(BlockLists.RAW_TIN_BLOCK.asItem());
        getOrCreateTagBuilder(RAW_OSMIUM_BLOCK).add(BlockLists.RAW_OSMIUM_BLOCK.asItem());
        getOrCreateTagBuilder(RAW_URANIUM_BLOCK).add(BlockLists.RAW_URANIUM_BLOCK.asItem());
        getOrCreateTagBuilder(RAW_ZINC_BLOCK).add(BlockLists.RAW_ZINC_BLOCK.asItem());

        getOrCreateTagBuilder(INGOTS).add(
                ItemLists.ALUMINUM_INGOT,
                ItemLists.SILVER_INGOT,
                ItemLists.LEAD_INGOT,
                ItemLists.NICKEL_INGOT,
                ItemLists.TIN_INGOT,
                ItemLists.OSMIUM_INGOT,
                ItemLists.URANIUM_INGOT,
                ItemLists.ZINC_INGOT
        );

        getOrCreateTagBuilder(INGOT_ALUMINUM).add(ItemLists.ALUMINUM_INGOT);
        getOrCreateTagBuilder(INGOT_SILVER).add(ItemLists.SILVER_INGOT);
        getOrCreateTagBuilder(INGOT_LEAD).add(ItemLists.LEAD_INGOT);
        getOrCreateTagBuilder(INGOT_NICKEL).add(ItemLists.NICKEL_INGOT);
        getOrCreateTagBuilder(INGOT_TIN).add(ItemLists.TIN_INGOT);
        getOrCreateTagBuilder(INGOT_OSMIUM).add(ItemLists.OSMIUM_INGOT);
        getOrCreateTagBuilder(INGOT_URANIUM).add(ItemLists.URANIUM_INGOT);
        getOrCreateTagBuilder(INGOT_ZINC).add(ItemLists.ZINC_INGOT);

        getOrCreateTagBuilder(NUGGETS).add(
                ItemLists.ALUMINUM_NUGGET,
                ItemLists.SILVER_NUGGET,
                ItemLists.LEAD_NUGGET,
                ItemLists.NICKEL_NUGGET,
                ItemLists.TIN_NUGGET,
                ItemLists.OSMIUM_NUGGET,
                ItemLists.ZINC_NUGGET
        );

        getOrCreateTagBuilder(NUGGET_ALUMINUM).add(ItemLists.ALUMINUM_NUGGET);
        getOrCreateTagBuilder(NUGGET_SILVER).add(ItemLists.SILVER_NUGGET);
        getOrCreateTagBuilder(NUGGET_LEAD).add(ItemLists.LEAD_NUGGET);
        getOrCreateTagBuilder(NUGGET_NICKEL).add(ItemLists.NICKEL_NUGGET);
        getOrCreateTagBuilder(NUGGET_COPPER).add(ItemLists.COPPER_NUGGET);
        getOrCreateTagBuilder(NUGGET_TIN).add(ItemLists.TIN_NUGGET);
        getOrCreateTagBuilder(NUGGET_OSMIUM).add(ItemLists.OSMIUM_NUGGET);
        getOrCreateTagBuilder(NUGGET_ZINC).add(ItemLists.ZINC_NUGGET);

        getOrCreateTagBuilder(RAW_MATERIALS).add(
                ItemLists.RAW_ALUMINUM,
                ItemLists.RAW_SILVER,
                ItemLists.RAW_LEAD,
                ItemLists.RAW_NICKEL,
                ItemLists.RAW_TIN,
                ItemLists.RAW_OSMIUM,
                ItemLists.RAW_URANIUM,
                ItemLists.RAW_ZINC
        );

        getOrCreateTagBuilder(RAW_ALUMINUM).add(ItemLists.RAW_ALUMINUM);
        getOrCreateTagBuilder(RAW_SILVER).add(ItemLists.RAW_SILVER);
        getOrCreateTagBuilder(RAW_LEAD).add(ItemLists.RAW_LEAD);
        getOrCreateTagBuilder(RAW_NICKEL).add(ItemLists.RAW_NICKEL);
        getOrCreateTagBuilder(RAW_TIN).add(ItemLists.RAW_TIN);
        getOrCreateTagBuilder(RAW_OSMIUM).add(ItemLists.RAW_OSMIUM);
        getOrCreateTagBuilder(RAW_URANIUM).add(ItemLists.RAW_URANIUM);
        getOrCreateTagBuilder(RAW_ZINC).add(ItemLists.RAW_ZINC);

    }

    private static TagKey<Item> itemTag(Identifier location) {
        return TagKey.of(Registry.ITEM_KEY, location);
    }
}
