package net.mcs3.basicnetherores.data.tags;

import net.mcs3.basicnetherores.Constants;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ItemTagGenerator extends ItemTagsProvider {

    public static final TagKey<Item> ORES_ALUMINUM = tagForge("ores/aluminum");
    public static final TagKey<Item> ORES_SILVER = tagForge("ores/silver");
    public static final TagKey<Item> ORES_LEAD = tagForge("ores/lead");
    public static final TagKey<Item> ORES_NICKEL = tagForge("ores/nickel");
    public static final TagKey<Item> ORES_COPPER = tagForge("ores/copper");
    public static final TagKey<Item> ORES_TIN = tagForge("ores/tin");
    public static final TagKey<Item> ORES_OSMIUM = tagForge("ores/osmium");
    public static final TagKey<Item> ORES_URANIUM = tagForge("ores/uranium");
    public static final TagKey<Item> ORES_ZINC = tagForge("ores/zinc");

    public static final TagKey<Item> ALUMINUM_BLOCK = tagForge("storage_blocks/aluminum");
    public static final TagKey<Item> SILVER_BLOCK = tagForge("storage_blocks/silver");
    public static final TagKey<Item> LEAD_BLOCK = tagForge("storage_blocks/lead");
    public static final TagKey<Item> NICKEL_BLOCK = tagForge("storage_blocks/nickel");
    public static final TagKey<Item> TIN_BLOCK = tagForge("storage_blocks/tin");
    public static final TagKey<Item> OSMIUM_BLOCK = tagForge("storage_blocks/osmium");
    public static final TagKey<Item> URANIUM_BLOCK = tagForge("storage_blocks/uranium");
    public static final TagKey<Item> ZINC_BLOCK = tagForge("storage_blocks/zinc");

    public static final TagKey<Item> RAW_ALUMINUM_BLOCK = tagForge("storage_blocks/raw_aluminum");
    public static final TagKey<Item> RAW_SILVER_BLOCK = tagForge("storage_blocks/raw_silver");
    public static final TagKey<Item> RAW_LEAD_BLOCK = tagForge("storage_blocks/raw_lead");
    public static final TagKey<Item> RAW_NICKEL_BLOCK = tagForge("storage_blocks/raw_nickel");
    public static final TagKey<Item> RAW_TIN_BLOCK = tagForge("storage_blocks/raw_tin");
    public static final TagKey<Item> RAW_OSMIUM_BLOCK = tagForge("storage_blocks/raw_osmium");
    public static final TagKey<Item> RAW_URANIUM_BLOCK = tagForge("storage_blocks/raw_uranium");
    public static final TagKey<Item> RAW_ZINC_BLOCK = tagForge("storage_blocks/raw_zinc");

    public static final TagKey<Item> INGOT_ALUMINUM = tagForge("ingots/aluminum");
    public static final TagKey<Item> INGOT_SILVER = tagForge("ingots/silver");
    public static final TagKey<Item> INGOT_LEAD = tagForge("ingots/lead");
    public static final TagKey<Item> INGOT_NICKEL = tagForge("ingots/nickel");
    public static final TagKey<Item> INGOT_TIN = tagForge("ingots/tin");
    public static final TagKey<Item> INGOT_OSMIUM = tagForge("ingots/osmium");
    public static final TagKey<Item> INGOT_URANIUM = tagForge("ingots/uranium");
    public static final TagKey<Item> INGOT_ZINC = tagForge("ingots/zinc");

    public static final TagKey<Item> NUGGET_ALUMINUM = tagForge("nuggets/aluminum");
    public static final TagKey<Item> NUGGET_SILVER = tagForge("nuggets/silver");
    public static final TagKey<Item> NUGGET_LEAD = tagForge("nuggets/lead");
    public static final TagKey<Item> NUGGET_NICKEL = tagForge("nuggets/nickel");
    public static final TagKey<Item> NUGGET_COPPER = tagForge("nuggets/copper");
    public static final TagKey<Item> NUGGET_TIN = tagForge("nuggets/tin");
    public static final TagKey<Item> NUGGET_OSMIUM = tagForge("nuggets/osmium");
    public static final TagKey<Item> NUGGET_ZINC = tagForge("nuggets/zinc");

    public static final TagKey<Item> RAW_ALUMINUM = tagForge("raw_materials/aluminum");
    public static final TagKey<Item> RAW_SILVER = tagForge("raw_materials/silver");
    public static final TagKey<Item> RAW_LEAD = tagForge("raw_materials/lead");
    public static final TagKey<Item> RAW_NICKEL = tagForge("raw_materials/nickel");
    public static final TagKey<Item> RAW_TIN = tagForge("raw_materials/tin");
    public static final TagKey<Item> RAW_OSMIUM = tagForge("raw_materials/osmium");
    public static final TagKey<Item> RAW_URANIUM = tagForge("raw_materials/uranium");
    public static final TagKey<Item> RAW_ZINC = tagForge("raw_materials/zinc");

    public static final TagKey<Item> RAW_ALUMINUM_ORE = tagForge("raw_ores/aluminum");
    public static final TagKey<Item> RAW_SILVER_ORE = tagForge("raw_ores/silver");
    public static final TagKey<Item> RAW_LEAD_ORE = tagForge("raw_ores/lead");
    public static final TagKey<Item> RAW_NICKEL_ORE = tagForge("raw_ores/nickel");
    public static final TagKey<Item> RAW_TIN_ORE = tagForge("raw_ores/tin");
    public static final TagKey<Item> RAW_OSMIUM_ORE = tagForge("raw_ores/osmium");
    public static final TagKey<Item> RAW_URANIUM_ORE = tagForge("raw_ores/uranium");
    public static final TagKey<Item> RAW_ZINC_ORE = tagForge("raw_ores/zinc");

    public ItemTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                            CompletableFuture<TagsProvider.TagLookup<Block>> blockTagProvider, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTagProvider, Constants.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        copy(Tags.Blocks.ORES, Tags.Items.ORES);

        copy(Tags.Blocks.ORES_EMERALD, Tags.Items.ORES_EMERALD);

    }
/*
    @Override
    protected void addTags()
    {
        copy(Tags.Blocks.ORES, Tags.Items.ORES);
        copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);

        copy(Tags.Blocks.ORES_COAL, Tags.Items.ORES_COAL);
        copy(Tags.Blocks.ORES_DIAMOND, Tags.Items.ORES_DIAMOND);
        copy(Tags.Blocks.ORES_EMERALD, Tags.Items.ORES_EMERALD);
        copy(Tags.Blocks.ORES_IRON, Tags.Items.ORES_IRON);
        copy(Tags.Blocks.ORES_LAPIS, Tags.Items.ORES_LAPIS);
        copy(Tags.Blocks.ORES_REDSTONE, Tags.Items.ORES_REDSTONE);

        copy(BlockTagGenerator.ORES_ALUMINUM, ORES_ALUMINUM);
        copy(BlockTagGenerator.ORES_SILVER, ORES_SILVER);
        copy(BlockTagGenerator.ORES_LEAD, ORES_LEAD);
        copy(BlockTagGenerator.ORES_NICKEL, ORES_NICKEL);
        copy(BlockTagGenerator.ORES_COPPER, ORES_COPPER);
        copy(BlockTagGenerator.ORES_TIN, ORES_TIN);
        copy(BlockTagGenerator.ORES_OSMIUM, ORES_OSMIUM);
        copy(BlockTagGenerator.ORES_URANIUM, ORES_URANIUM);
        copy(BlockTagGenerator.ORES_ZINC, ORES_ZINC);

        copy(BlockTagGenerator.ALUMINUM_BLOCK, ALUMINUM_BLOCK);
        copy(BlockTagGenerator.SILVER_BLOCK, SILVER_BLOCK);
        copy(BlockTagGenerator.LEAD_BLOCK, LEAD_BLOCK);
        copy(BlockTagGenerator.NICKEL_BLOCK, NICKEL_BLOCK);
        copy(BlockTagGenerator.TIN_BLOCK, TIN_BLOCK);
        copy(BlockTagGenerator.OSMIUM_BLOCK, OSMIUM_BLOCK);
        copy(BlockTagGenerator.URANIUM_BLOCK, URANIUM_BLOCK);
        copy(BlockTagGenerator.ZINC_BLOCK, ZINC_BLOCK);

        copy(BlockTagGenerator.RAW_ALUMINUM_BLOCK, RAW_ALUMINUM_BLOCK);
        copy(BlockTagGenerator.RAW_SILVER_BLOCK, RAW_SILVER_BLOCK);
        copy(BlockTagGenerator.RAW_LEAD_BLOCK, RAW_LEAD_BLOCK);
        copy(BlockTagGenerator.RAW_NICKEL_BLOCK, RAW_NICKEL_BLOCK);
        copy(BlockTagGenerator.RAW_TIN_BLOCK, RAW_TIN_BLOCK);
        copy(BlockTagGenerator.RAW_OSMIUM_BLOCK, RAW_OSMIUM_BLOCK);
        copy(BlockTagGenerator.RAW_URANIUM_BLOCK, RAW_URANIUM_BLOCK);
        copy(BlockTagGenerator.RAW_ZINC_BLOCK, RAW_ZINC_BLOCK);

        tag(Tags.Items.INGOTS).addTags(INGOT_ALUMINUM, INGOT_SILVER, INGOT_LEAD, INGOT_NICKEL, INGOT_TIN, INGOT_OSMIUM, INGOT_URANIUM, INGOT_ZINC);
        tag(INGOT_ALUMINUM).add(ModItems.ALUMINUM_INGOT.get());
        tag(INGOT_SILVER).add(ModItems.SILVER_INGOT.get());
        tag(INGOT_LEAD).add(ModItems.LEAD_INGOT.get());
        tag(INGOT_NICKEL).add(ModItems.NICKEL_INGOT.get());
        tag(INGOT_TIN).add(ModItems.TIN_INGOT.get());
        tag(INGOT_OSMIUM).add(ModItems.OSMIUM_INGOT.get());
        tag(INGOT_URANIUM).add(ModItems.URANIUM_INGOT.get());
        tag(INGOT_ZINC).add(ModItems.ZINC_INGOT.get());

        tag(Tags.Items.NUGGETS).addTags(NUGGET_ALUMINUM, NUGGET_SILVER, NUGGET_LEAD, NUGGET_NICKEL, NUGGET_COPPER, NUGGET_TIN, NUGGET_OSMIUM, NUGGET_ZINC);
        tag(NUGGET_ALUMINUM).add(ModItems.ALUMINUM_NUGGET.get());
        tag(NUGGET_SILVER).add(ModItems.SILVER_NUGGET.get());
        tag(NUGGET_LEAD).add(ModItems.LEAD_NUGGET.get());
        tag(NUGGET_NICKEL).add(ModItems.NICKEL_NUGGET.get());
        tag(NUGGET_COPPER).add(ModItems.COPPER_NUGGET.get());
        tag(NUGGET_TIN).add(ModItems.TIN_NUGGET.get());
        tag(NUGGET_OSMIUM).add(ModItems.OSMIUM_NUGGET.get());
        tag(NUGGET_ZINC).add(ModItems.ZINC_NUGGET.get());

        tag(Tags.Items.RAW_MATERIALS).addTags(RAW_ALUMINUM, RAW_SILVER, RAW_LEAD, RAW_NICKEL, RAW_TIN, RAW_OSMIUM, RAW_ZINC);
        tag(RAW_ALUMINUM).add(ModItems.RAW_ALUMINUM.get());
        tag(RAW_SILVER).add(ModItems.RAW_SILVER.get());
        tag(RAW_LEAD).add(ModItems.RAW_LEAD.get());
        tag(RAW_NICKEL).add(ModItems.RAW_NICKEL.get());
        tag(RAW_TIN).add(ModItems.RAW_TIN.get());
        tag(RAW_OSMIUM).add(ModItems.RAW_OSMIUM.get());
        tag(RAW_URANIUM).add(ModItems.RAW_URANIUM.get());
        tag(RAW_ZINC).add(ModItems.RAW_ZINC.get());

        tag(RAW_ALUMINUM_ORE).add(ModItems.RAW_ALUMINUM.get());
        tag(RAW_SILVER_ORE).add(ModItems.RAW_SILVER.get());
        tag(RAW_LEAD_ORE).add(ModItems.RAW_LEAD.get());
        tag(RAW_NICKEL_ORE).add(ModItems.RAW_NICKEL.get());
        tag(RAW_TIN_ORE).add(ModItems.RAW_TIN.get());
        tag(RAW_OSMIUM_ORE).add(ModItems.RAW_OSMIUM.get());
        tag(RAW_URANIUM_ORE).add(ModItems.RAW_URANIUM.get());
        tag(RAW_ZINC_ORE).add(ModItems.RAW_ZINC.get());
    }
*/
    private static TagKey<Item> tagForge(String name)
    {
        return ItemTags.create(new ResourceLocation("forge", name));
    }


}
