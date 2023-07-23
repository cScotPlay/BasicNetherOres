package net.mcs3.basicnetherores.data.models;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.mcs3.basicnetherores.Constants;
import net.mcs3.basicnetherores.init.BNOBlocks;
import net.mcs3.basicnetherores.init.BNOItems;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelTemplate;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.Optional;


public class BlockStateGenerator extends FabricModelProvider {

    private static String MOD_ID = Constants.MOD_ID;

    public static final TextureSlot overlayTexture = TextureSlot.create("overlay");

    public static final ModelTemplate ORE_TEMPLATE = createModdedModel("cube_overlay_all", TextureSlot.ALL, overlayTexture);


    public BlockStateGenerator(FabricDataOutput dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {

        createSimpleOreBlocks(blockStateModelGenerator, BNOBlocks.NETHER_EMERALD_ORE);
        createSimpleOreBlocks(blockStateModelGenerator, BNOBlocks.NETHER_DIAMOND_ORE);
        createSimpleOreBlocks(blockStateModelGenerator, BNOBlocks.NETHER_REDSTONE_ORE);
        createSimpleOreBlocks(blockStateModelGenerator, BNOBlocks.NETHER_LAPIS_ORE);
        createSimpleOreBlocks(blockStateModelGenerator, BNOBlocks.NETHER_COAL_ORE);
        createSimpleOreBlocks(blockStateModelGenerator, BNOBlocks.NETHER_SILVER_ORE);
        createSimpleOreBlocks(blockStateModelGenerator, BNOBlocks.NETHER_IRON_ORE);
        createSimpleOreBlocks(blockStateModelGenerator, BNOBlocks.NETHER_LEAD_ORE);
        createSimpleOreBlocks(blockStateModelGenerator, BNOBlocks.NETHER_NICKEL_ORE);
        createSimpleOreBlocks(blockStateModelGenerator, BNOBlocks.NETHER_COPPER_ORE);
        createSimpleOreBlocks(blockStateModelGenerator, BNOBlocks.NETHER_ALUMINUM_ORE);
        createSimpleOreBlocks(blockStateModelGenerator, BNOBlocks.NETHER_TIN_ORE);
        createSimpleOreBlocks(blockStateModelGenerator, BNOBlocks.NETHER_OSMIUM_ORE);
        createSimpleOreBlocks(blockStateModelGenerator, BNOBlocks.NETHER_URANIUM_ORE);
        createSimpleOreBlocks(blockStateModelGenerator, BNOBlocks.NETHER_ZINC_ORE);

        blockStateModelGenerator.createTrivialCube(BNOBlocks.ALUMINUM_BLOCK);
        blockStateModelGenerator.createTrivialCube(BNOBlocks.LEAD_BLOCK);
        blockStateModelGenerator.createTrivialCube(BNOBlocks.NICKEL_BLOCK);
        blockStateModelGenerator.createTrivialCube(BNOBlocks.SILVER_BLOCK);
        blockStateModelGenerator.createTrivialCube(BNOBlocks.TIN_BLOCK);
        blockStateModelGenerator.createTrivialCube(BNOBlocks.OSMIUM_BLOCK);
        blockStateModelGenerator.createTrivialCube(BNOBlocks.URANIUM_BLOCK);
        blockStateModelGenerator.createTrivialCube(BNOBlocks.ZINC_BLOCK);

        blockStateModelGenerator.createTrivialCube(BNOBlocks.RAW_ALUMINUM_BLOCK);
        blockStateModelGenerator.createTrivialCube(BNOBlocks.RAW_LEAD_BLOCK);
        blockStateModelGenerator.createTrivialCube(BNOBlocks.RAW_NICKEL_BLOCK);
        blockStateModelGenerator.createTrivialCube(BNOBlocks.RAW_SILVER_BLOCK);
        blockStateModelGenerator.createTrivialCube(BNOBlocks.RAW_TIN_BLOCK);
        blockStateModelGenerator.createTrivialCube(BNOBlocks.RAW_OSMIUM_BLOCK);
        blockStateModelGenerator.createTrivialCube(BNOBlocks.RAW_URANIUM_BLOCK);
        blockStateModelGenerator.createTrivialCube(BNOBlocks.RAW_ZINC_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {

        itemModelGenerator.generateFlatItem(BNOItems.ALUMINUM_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BNOItems.LEAD_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BNOItems.NICKEL_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BNOItems.SILVER_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BNOItems.TIN_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BNOItems.OSMIUM_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BNOItems.URANIUM_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BNOItems.ZINC_INGOT, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(BNOItems.ALUMINUM_NUGGET, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BNOItems.COPPER_NUGGET, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BNOItems.LEAD_NUGGET, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BNOItems.NICKEL_NUGGET, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BNOItems.SILVER_NUGGET, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BNOItems.TIN_NUGGET, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BNOItems.OSMIUM_NUGGET, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BNOItems.ZINC_NUGGET, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(BNOItems.RAW_ALUMINUM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BNOItems.RAW_LEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BNOItems.RAW_NICKEL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BNOItems.RAW_SILVER, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BNOItems.RAW_TIN, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BNOItems.RAW_OSMIUM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BNOItems.RAW_URANIUM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BNOItems.RAW_ZINC, ModelTemplates.FLAT_ITEM);
    }

    public static void createSimpleOreBlocks(BlockModelGenerators modelGenerators, Block block) {
        TextureMapping textureMapping = (new TextureMapping()).put(TextureSlot.ALL, TextureMapping.getBlockTexture(Blocks.NETHERRACK)).put(overlayTexture, TextureMapping.getBlockTexture(block));

        ResourceLocation resourceLocation = ORE_TEMPLATE.create(block, textureMapping, modelGenerators.modelOutput);

        modelGenerators.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block, resourceLocation));
        modelGenerators.delegateItemModel(block, resourceLocation);
    }

    private static ModelTemplate createModdedModel(String parent, TextureSlot... requiredTextures) {
        return new ModelTemplate(Optional.of(new ResourceLocation(Constants.MOD_ID, "block/" + parent)), Optional.empty(), requiredTextures);
    }
}
