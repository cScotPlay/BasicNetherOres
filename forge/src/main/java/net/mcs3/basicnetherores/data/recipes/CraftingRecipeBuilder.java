package net.mcs3.basicnetherores.data.recipes;

import com.google.gson.JsonObject;
import net.mcs3.basicnetherores.Constants;
import net.mcs3.basicnetherores.init.BNOBlocks;
import net.mcs3.basicnetherores.init.BNOItems;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.data.recipes.packs.VanillaRecipeProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class CraftingRecipeBuilder extends VanillaRecipeProvider
{
    public CraftingRecipeBuilder(PackOutput packOutput)
    {
        super(packOutput);
    }

    @Nullable
    @Override
    protected CompletableFuture<?> saveAdvancement(CachedOutput output, FinishedRecipe finishedRecipe, JsonObject advancementJson)
    {
        // NOOP - We don't replace any of the advancement things yet...
        return null;
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer)
    {
        shapedMetalBlocks(consumer, BNOBlocks.ALUMINUM_BLOCK, BNOItems.ALUMINUM_INGOT);
        shapedMetalBlocks(consumer, BNOBlocks.LEAD_BLOCK, BNOItems.LEAD_INGOT);
        shapedMetalBlocks(consumer, BNOBlocks.NICKEL_BLOCK, BNOItems.NICKEL_INGOT);
        shapedMetalBlocks(consumer, BNOBlocks.SILVER_BLOCK, BNOItems.SILVER_INGOT);
        shapedMetalBlocks(consumer, BNOBlocks.TIN_BLOCK, BNOItems.TIN_INGOT);
        shapedMetalBlocks(consumer, BNOBlocks.OSMIUM_BLOCK, BNOItems.OSMIUM_INGOT);
        shapedMetalBlocks(consumer, BNOBlocks.URANIUM_BLOCK, BNOItems.URANIUM_INGOT);
        shapedMetalBlocks(consumer, BNOBlocks.ZINC_BLOCK, BNOItems.ZINC_INGOT);

        shapedIngot(consumer, BNOItems.ALUMINUM_INGOT, BNOItems.ALUMINUM_NUGGET);
        shapedIngot(consumer, Items.COPPER_INGOT, BNOItems.COPPER_NUGGET);
        shapedIngot(consumer, BNOItems.LEAD_INGOT, BNOItems.LEAD_NUGGET);
        shapedIngot(consumer, BNOItems.NICKEL_INGOT, BNOItems.NICKEL_NUGGET);
        shapedIngot(consumer, BNOItems.SILVER_INGOT, BNOItems.SILVER_NUGGET);
        shapedIngot(consumer, BNOItems.TIN_INGOT, BNOItems.TIN_NUGGET);
        shapedIngot(consumer, BNOItems.OSMIUM_INGOT, BNOItems.OSMIUM_NUGGET);
        shapedIngot(consumer, BNOItems.ZINC_INGOT, BNOItems.ZINC_NUGGET);

        shapelessIngots(consumer, BNOItems.ALUMINUM_INGOT, BNOBlocks.ALUMINUM_BLOCK);
        shapelessIngots(consumer, BNOItems.LEAD_INGOT, BNOBlocks.LEAD_BLOCK);
        shapelessIngots(consumer, BNOItems.NICKEL_INGOT, BNOBlocks.NICKEL_BLOCK);
        shapelessIngots(consumer, BNOItems.SILVER_INGOT, BNOBlocks.SILVER_BLOCK);
        shapelessIngots(consumer, BNOItems.TIN_INGOT, BNOBlocks.TIN_BLOCK);
        shapelessIngots(consumer, BNOItems.OSMIUM_INGOT, BNOBlocks.OSMIUM_BLOCK);
        shapelessIngots(consumer, BNOItems.URANIUM_INGOT, BNOBlocks.URANIUM_BLOCK);
        shapelessIngots(consumer, BNOItems.ZINC_INGOT, BNOBlocks.ZINC_BLOCK);

        shapelessNuggetsIngots(consumer, BNOItems.ALUMINUM_NUGGET, BNOItems.ALUMINUM_INGOT);
        shapelessNuggetsIngots(consumer, BNOItems.COPPER_NUGGET, Items.COPPER_INGOT);
        shapelessNuggetsIngots(consumer, BNOItems.LEAD_NUGGET, BNOItems.LEAD_INGOT);
        shapelessNuggetsIngots(consumer, BNOItems.NICKEL_NUGGET, BNOItems.NICKEL_INGOT);
        shapelessNuggetsIngots(consumer, BNOItems.SILVER_NUGGET, BNOItems.SILVER_INGOT);
        shapelessNuggetsIngots(consumer, BNOItems.TIN_NUGGET, BNOItems.TIN_INGOT);
        shapelessNuggetsIngots(consumer, BNOItems.OSMIUM_NUGGET, BNOItems.OSMIUM_INGOT);
        shapelessNuggetsIngots(consumer, BNOItems.ZINC_NUGGET, BNOItems.ZINC_INGOT);

        smeltingOres(consumer, Items.EMERALD, BNOBlocks.NETHER_EMERALD_ORE.asItem());
        smeltingOres(consumer, Items.DIAMOND, BNOBlocks.NETHER_DIAMOND_ORE.asItem());
        smeltingOres(consumer, Items.REDSTONE, BNOBlocks.NETHER_REDSTONE_ORE.asItem());
        smeltingOres(consumer, Items.LAPIS_LAZULI, BNOBlocks.NETHER_LAPIS_ORE.asItem());
        smeltingOres(consumer, Items.COAL, BNOBlocks.NETHER_COAL_ORE.asItem());
        smeltingOres(consumer, BNOItems.SILVER_INGOT, BNOBlocks.NETHER_SILVER_ORE.asItem());
        smeltingOres(consumer, Items.IRON_INGOT, BNOBlocks.NETHER_IRON_ORE.asItem());
        smeltingOres(consumer, BNOItems.LEAD_INGOT, BNOBlocks.NETHER_LEAD_ORE.asItem());
        smeltingOres(consumer, BNOItems.NICKEL_INGOT, BNOBlocks.NETHER_NICKEL_ORE.asItem());
        smeltingOres(consumer, Items.COPPER_INGOT, BNOBlocks.NETHER_COPPER_ORE.asItem());
        smeltingOres(consumer, BNOItems.ALUMINUM_INGOT, BNOBlocks.NETHER_ALUMINUM_ORE.asItem());
        smeltingOres(consumer, BNOItems.TIN_INGOT, BNOBlocks.NETHER_TIN_ORE.asItem());
        smeltingOres(consumer, BNOItems.OSMIUM_INGOT, BNOBlocks.NETHER_OSMIUM_ORE.asItem());
        smeltingOres(consumer, BNOItems.URANIUM_INGOT, BNOBlocks.NETHER_URANIUM_ORE.asItem());
        smeltingOres(consumer, BNOItems.ZINC_INGOT, BNOBlocks.NETHER_ZINC_ORE.asItem());

        shapedMetalBlocks(consumer, BNOBlocks.RAW_ALUMINUM_BLOCK, BNOItems.RAW_ALUMINUM);
        shapedMetalBlocks(consumer, BNOBlocks.RAW_LEAD_BLOCK, BNOItems.RAW_LEAD);
        shapedMetalBlocks(consumer, BNOBlocks.RAW_NICKEL_BLOCK, BNOItems.RAW_NICKEL);
        shapedMetalBlocks(consumer, BNOBlocks.RAW_SILVER_BLOCK, BNOItems.RAW_SILVER);
        shapedMetalBlocks(consumer, BNOBlocks.RAW_TIN_BLOCK, BNOItems.RAW_TIN);
        shapedMetalBlocks(consumer, BNOBlocks.RAW_OSMIUM_BLOCK, BNOItems.RAW_OSMIUM);
        shapedMetalBlocks(consumer, BNOBlocks.RAW_URANIUM_BLOCK, BNOItems.RAW_URANIUM);
        shapedMetalBlocks(consumer, BNOBlocks.RAW_ZINC_BLOCK, BNOItems.RAW_ZINC);

        shapelessIngots(consumer, BNOItems.RAW_ALUMINUM, BNOBlocks.RAW_ALUMINUM_BLOCK);
        shapelessIngots(consumer, BNOItems.RAW_LEAD, BNOBlocks.RAW_LEAD_BLOCK);
        shapelessIngots(consumer, BNOItems.RAW_NICKEL, BNOBlocks.RAW_NICKEL_BLOCK);
        shapelessIngots(consumer, BNOItems.RAW_SILVER, BNOBlocks.RAW_SILVER_BLOCK);
        shapelessIngots(consumer, BNOItems.RAW_TIN, BNOBlocks.RAW_TIN_BLOCK);
        shapelessIngots(consumer, BNOItems.RAW_OSMIUM, BNOBlocks.RAW_OSMIUM_BLOCK);
        shapelessIngots(consumer, BNOItems.RAW_URANIUM, BNOBlocks.RAW_URANIUM_BLOCK);
        shapelessIngots(consumer, BNOItems.RAW_ZINC, BNOBlocks.RAW_ZINC_BLOCK);

        smeltingRawOre(consumer, BNOItems.SILVER_INGOT, BNOItems.RAW_SILVER);
        smeltingRawOre(consumer, BNOItems.LEAD_INGOT, BNOItems.RAW_LEAD);
        smeltingRawOre(consumer, BNOItems.NICKEL_INGOT, BNOItems.RAW_NICKEL);
        smeltingRawOre(consumer, BNOItems.ALUMINUM_INGOT, BNOItems.RAW_ALUMINUM);
        smeltingRawOre(consumer, BNOItems.TIN_INGOT, BNOItems.RAW_TIN);
        smeltingRawOre(consumer, BNOItems.OSMIUM_INGOT, BNOItems.RAW_OSMIUM);
        smeltingRawOre(consumer, BNOItems.URANIUM_INGOT, BNOItems.RAW_URANIUM);
        smeltingRawOre(consumer, BNOItems.ZINC_INGOT, BNOItems.RAW_ZINC);
    }

    private static void shapedIngot(Consumer<FinishedRecipe> consumer, Item craftedItem, Item inputItem)
    {
        String ingotName = craftedItem.asItem().toString();

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, craftedItem)
                .define('#',inputItem)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .group(ingotName)
                .unlockedBy("has_" + ingotName, has(inputItem))
                .save(consumer, new ResourceLocation(Constants.MOD_ID, ingotName + "_from_" + inputItem.asItem().toString()));
    }

    private static void shapedMetalBlocks(Consumer<FinishedRecipe> consumer, Block craftedItem, Item inputItem)
    {
        String blockName = craftedItem.asItem().toString();

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, craftedItem)
                .define('#',inputItem)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .group(blockName)
                .unlockedBy("has_" + blockName, has(inputItem))
                .save(consumer, new ResourceLocation(Constants.MOD_ID, blockName + "_from_" + inputItem.asItem().toString()));
    }

    private static void shapelessNuggetsIngots(Consumer<FinishedRecipe> consumer, Item craftedItem, Item inputItem)
    {
        String nuggetName = craftedItem.asItem().toString();
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, craftedItem, 9)
                .requires(inputItem)
                .unlockedBy(nuggetName + "_from_ingot", has(inputItem))
                .save(consumer);
    }

    private static void shapelessIngots(Consumer<FinishedRecipe> consumer, Item craftedItem, Block inputBlock)
    {
        String ingotName = craftedItem.asItem().toString();
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, craftedItem, 9)
                .requires(inputBlock)
                .unlockedBy(ingotName + "_from_block", has(inputBlock))
                .save(consumer);
    }

    private static void smeltingOres(Consumer<FinishedRecipe> consumer, Item smeltedItem, Item inputOre)
    {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(inputOre), RecipeCategory.MISC, smeltedItem, 0.7F, 200)
                .unlockedBy("has_" + inputOre.asItem().toString(), has(inputOre.asItem()))
                .save(consumer, new ResourceLocation(Constants.MOD_ID, smeltedItem.asItem().toString() + "_from_smelting"));

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(inputOre), RecipeCategory.MISC, smeltedItem, 0.7F, 100)
                .unlockedBy("has_" + inputOre.asItem().toString(), has(inputOre.asItem()))
                .save(consumer, new ResourceLocation(Constants.MOD_ID, smeltedItem.asItem().toString() + "_from_blasting"));
    }

    private static void smeltingRawOre(Consumer<FinishedRecipe> consumer, Item smeltedItem, Item inputOre)
    {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(inputOre), RecipeCategory.MISC, smeltedItem, 0.7F, 200)
                .unlockedBy("has_" + inputOre.asItem().toString(), has(inputOre.asItem()))
                .save(consumer, new ResourceLocation(Constants.MOD_ID, smeltedItem.asItem().toString() + "_from_smelting_raw"));

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(inputOre), RecipeCategory.MISC, smeltedItem, 0.7F, 100)
                .unlockedBy("has_" + inputOre.asItem().toString(), has(inputOre.asItem()))
                .save(consumer, new ResourceLocation(Constants.MOD_ID, smeltedItem.asItem().toString() + "_from_blasting_raw"));
    }
}
