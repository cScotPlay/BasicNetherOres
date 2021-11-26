package com.cscot.basicnetherores.data.recipes;

import com.cscot.basicnetherores.BasicNetherOres;
import com.cscot.basicnetherores.world.item.ModBlockItems;
import com.cscot.basicnetherores.world.item.ModItems;
import com.cscot.basicnetherores.world.level.block.ModBlocks;
import com.google.gson.JsonObject;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.HashCache;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

import java.nio.file.Path;
import java.util.function.Consumer;

public class CraftingRecipeBuilder extends RecipeProvider
{
    public CraftingRecipeBuilder(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void saveAdvancement(HashCache cache, JsonObject jsonObject, Path advancementJson) {
        //Overrides the writing of advancement for the recipes.
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer)
    {
        shapedMetalBlocks(consumer, ModBlocks.ALUMINUM_BLOCK.get(), ModItems.ALUMINUM_INGOT.get());
        shapedMetalBlocks(consumer, ModBlocks.LEAD_BLOCK.get(), ModItems.LEAD_INGOT.get());
        shapedMetalBlocks(consumer, ModBlocks.NICKEL_BLOCK.get(), ModItems.NICKEL_INGOT.get());
        shapedMetalBlocks(consumer, ModBlocks.SILVER_BLOCK.get(), ModItems.SILVER_INGOT.get());
        shapedMetalBlocks(consumer, ModBlocks.TIN_BLOCK.get(), ModItems.TIN_INGOT.get());
        shapedMetalBlocks(consumer, ModBlocks.OSMIUM_BLOCK.get(), ModItems.OSMIUM_INGOT.get());
        shapedMetalBlocks(consumer, ModBlocks.URANIUM_BLOCK.get(), ModItems.URANIUM_INGOT.get());

        shapedIngot(consumer, ModItems.ALUMINUM_INGOT.get(), ModItems.ALUMINUM_NUGGET.get());
        shapedIngot(consumer, Items.COPPER_INGOT, ModItems.COPPER_NUGGET.get());
        shapedIngot(consumer, ModItems.LEAD_INGOT.get(), ModItems.LEAD_NUGGET.get());
        shapedIngot(consumer, ModItems.NICKEL_INGOT.get(), ModItems.NICKEL_NUGGET.get());
        shapedIngot(consumer, ModItems.SILVER_INGOT.get(), ModItems.SILVER_NUGGET.get());
        shapedIngot(consumer, ModItems.TIN_INGOT.get(), ModItems.TIN_NUGGET.get());
        shapedIngot(consumer, ModItems.OSMIUM_INGOT.get(), ModItems.OSMIUM_NUGGET.get());

        shapelessIngots(consumer, ModItems.ALUMINUM_INGOT.get(), ModBlocks.ALUMINUM_BLOCK.get());
        shapelessIngots(consumer, ModItems.LEAD_INGOT.get(), ModBlocks.LEAD_BLOCK.get());
        shapelessIngots(consumer, ModItems.NICKEL_INGOT.get(), ModBlocks.NICKEL_BLOCK.get());
        shapelessIngots(consumer, ModItems.SILVER_INGOT.get(), ModBlocks.SILVER_BLOCK.get());
        shapelessIngots(consumer, ModItems.TIN_INGOT.get(), ModBlocks.TIN_BLOCK.get());
        shapelessIngots(consumer, ModItems.OSMIUM_INGOT.get(), ModBlocks.OSMIUM_BLOCK.get());
        shapelessIngots(consumer, ModItems.URANIUM_INGOT.get(), ModBlocks.URANIUM_BLOCK.get());

        shapelessNuggetsIngots(consumer, ModItems.ALUMINUM_NUGGET.get(), ModItems.ALUMINUM_INGOT.get());
        shapelessNuggetsIngots(consumer, ModItems.COPPER_NUGGET.get(), Items.COPPER_INGOT);
        shapelessNuggetsIngots(consumer, ModItems.LEAD_NUGGET.get(), ModItems.LEAD_INGOT.get());
        shapelessNuggetsIngots(consumer, ModItems.NICKEL_NUGGET.get(), ModItems.NICKEL_INGOT.get());
        shapelessNuggetsIngots(consumer, ModItems.SILVER_NUGGET.get(), ModItems.SILVER_INGOT.get());
        shapelessNuggetsIngots(consumer, ModItems.TIN_NUGGET.get(), ModItems.TIN_INGOT.get());
        shapelessNuggetsIngots(consumer, ModItems.OSMIUM_NUGGET.get(), ModItems.OSMIUM_INGOT.get());

        smeltingOres(consumer, Items.EMERALD, ModBlockItems.NETHER_EMERALD_ORE.get());
        smeltingOres(consumer, Items.DIAMOND, ModBlockItems.NETHER_DIAMOND_ORE.get());
        smeltingOres(consumer, Items.REDSTONE, ModBlockItems.NETHER_REDSTONE_ORE.get());
        smeltingOres(consumer, Items.LAPIS_LAZULI, ModBlockItems.NETHER_LAPIS_ORE.get());
        smeltingOres(consumer, Items.COAL, ModBlockItems.NETHER_COAL_ORE.get());
        smeltingOres(consumer, ModItems.SILVER_INGOT.get(), ModBlockItems.NETHER_SILVER_ORE.get());
        smeltingOres(consumer, Items.IRON_INGOT, ModBlockItems.NETHER_IRON_ORE.get());
        smeltingOres(consumer, ModItems.LEAD_INGOT.get(), ModBlockItems.NETHER_LEAD_ORE.get());
        smeltingOres(consumer, ModItems.NICKEL_INGOT.get(), ModBlockItems.NETHER_NICKEL_ORE.get());
        smeltingOres(consumer, Items.COPPER_INGOT, ModBlockItems.NETHER_COPPER_ORE.get());
        smeltingOres(consumer, ModItems.ALUMINUM_INGOT.get(), ModBlockItems.NETHER_ALUMINUM_ORE.get());
        smeltingOres(consumer, ModItems.TIN_INGOT.get(), ModBlockItems.NETHER_TIN_ORE.get());
        smeltingOres(consumer, ModItems.OSMIUM_INGOT.get(), ModBlockItems.NETHER_OSMIUM_ORE.get());
        smeltingOres(consumer, ModItems.URANIUM_INGOT.get(), ModBlockItems.NETHER_URANIUM_ORE.get());

        smeltingRawOre(consumer, ModItems.SILVER_INGOT.get(), ModItems.RAW_ALUMINUM.get());
        smeltingRawOre(consumer, ModItems.LEAD_INGOT.get(), ModItems.RAW_LEAD.get());
        smeltingRawOre(consumer, ModItems.NICKEL_INGOT.get(), ModItems.RAW_NICKEL.get());
        smeltingRawOre(consumer, ModItems.ALUMINUM_INGOT.get(), ModItems.RAW_ALUMINUM.get());
        smeltingRawOre(consumer, ModItems.TIN_INGOT.get(), ModItems.RAW_TIN.get());
        smeltingRawOre(consumer, ModItems.OSMIUM_INGOT.get(), ModItems.RAW_OSMIUM.get());
        smeltingRawOre(consumer, ModItems.URANIUM_INGOT.get(), ModItems.RAW_URANIUM.get());
    }

    private static void shapedIngot(Consumer<FinishedRecipe> consumer, Item craftedItem, Item inputItem)
    {
        String ingotName = craftedItem.getRegistryName().getPath();

        ShapedRecipeBuilder.shaped(craftedItem)
                .define('#',inputItem)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .group(ingotName)
                .unlockedBy("has_" + ingotName, has(inputItem))
                .save(consumer, new ResourceLocation(BasicNetherOres.modid, ingotName + "_from_" + inputItem.getRegistryName().getPath()));
    }

    private static void shapedMetalBlocks(Consumer<FinishedRecipe> consumer, Block craftedItem, Item inputItem)
    {
        String blockName = craftedItem.getRegistryName().getPath();

        ShapedRecipeBuilder.shaped(craftedItem)
                .define('#',inputItem)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .group(blockName)
                .unlockedBy("has_" + blockName, has(inputItem))
                .save(consumer, new ResourceLocation(BasicNetherOres.modid, blockName + "_from_" + inputItem.getRegistryName().getPath()));
    }

    private static void shapelessNuggetsIngots(Consumer<FinishedRecipe> consumer, Item craftedItem, Item inputItem)
    {
        String nuggetName = craftedItem.getRegistryName().getPath();
        ShapelessRecipeBuilder.shapeless(craftedItem, 9)
                .requires(inputItem)
                .unlockedBy(nuggetName + "_from_ingot", has(inputItem))
                .save(consumer);
    }

    private static void shapelessIngots(Consumer<FinishedRecipe> consumer, Item craftedItem, Block inputBlock)
    {
        String ingotName = craftedItem.getRegistryName().getPath();
        ShapelessRecipeBuilder.shapeless(craftedItem, 9)
                .requires(inputBlock)
                .unlockedBy(ingotName + "_from_block", has(inputBlock))
                .save(consumer);
    }

    private static void smeltingOres(Consumer<FinishedRecipe> consumer, Item smeltedItem, Item inputOre)
    {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(inputOre), smeltedItem, 0.7F, 200)
                .unlockedBy("has_" + inputOre.getRegistryName().getPath(), has(inputOre.asItem()))
                .save(consumer, new ResourceLocation(BasicNetherOres.modid, smeltedItem.getRegistryName().getPath() + "_from_smelting"));

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(inputOre), smeltedItem, 0.7F, 100)
                .unlockedBy("has_" + inputOre.getRegistryName().getPath(), has(inputOre.asItem()))
                .save(consumer, new ResourceLocation(BasicNetherOres.modid, smeltedItem.getRegistryName().getPath() + "_from_blasting"));
    }

    private static void smeltingRawOre(Consumer<FinishedRecipe> consumer, Item smeltedItem, Item inputOre)
    {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(inputOre), smeltedItem, 0.7F, 200)
                .unlockedBy("has_" + inputOre.getRegistryName().getPath(), has(inputOre.asItem()))
                .save(consumer, new ResourceLocation(BasicNetherOres.modid, smeltedItem.getRegistryName().getPath() + "_from_smelting_raw"));

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(inputOre), smeltedItem, 0.7F, 100)
                .unlockedBy("has_" + inputOre.getRegistryName().getPath(), has(inputOre.asItem()))
                .save(consumer, new ResourceLocation(BasicNetherOres.modid, smeltedItem.getRegistryName().getPath() + "_from_blasting_raw"));
    }
}
