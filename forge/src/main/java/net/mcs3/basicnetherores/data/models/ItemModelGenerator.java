package net.mcs3.basicnetherores.data.models;

import net.mcs3.basicnetherores.Constants;
import net.mcs3.basicnetherores.init.BNOBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import static net.mcs3.basicnetherores.util.helper.ResourceLocationHelper.prefix;

public class ItemModelGenerator extends ItemModelProvider {

    public ItemModelGenerator(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator.getPackOutput(), Constants.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        generateExistingParent(BNOBlocks.NETHER_EMERALD_ORE);
        generateExistingParent(BNOBlocks.NETHER_DIAMOND_ORE);
        generateExistingParent(BNOBlocks.NETHER_REDSTONE_ORE);
        generateExistingParent(BNOBlocks.NETHER_LAPIS_ORE);
        generateExistingParent(BNOBlocks.NETHER_COAL_ORE);
        generateExistingParent(BNOBlocks.NETHER_SILVER_ORE);
        generateExistingParent(BNOBlocks.NETHER_IRON_ORE);
        generateExistingParent(BNOBlocks.NETHER_LEAD_ORE);
        generateExistingParent(BNOBlocks.NETHER_NICKEL_ORE);
        generateExistingParent(BNOBlocks.NETHER_COPPER_ORE);
        generateExistingParent(BNOBlocks.NETHER_ALUMINUM_ORE);
        generateExistingParent(BNOBlocks.NETHER_TIN_ORE);
        generateExistingParent(BNOBlocks.NETHER_OSMIUM_ORE);
        generateExistingParent(BNOBlocks.NETHER_URANIUM_ORE);
        generateExistingParent(BNOBlocks.NETHER_ZINC_ORE);

        generateExistingParent(BNOBlocks.ALUMINUM_BLOCK);
        generateExistingParent(BNOBlocks.LEAD_BLOCK);
        generateExistingParent(BNOBlocks.NICKEL_BLOCK);
        generateExistingParent(BNOBlocks.SILVER_BLOCK);
        generateExistingParent(BNOBlocks.TIN_BLOCK);
        generateExistingParent(BNOBlocks.OSMIUM_BLOCK);
        generateExistingParent(BNOBlocks.URANIUM_BLOCK);
        generateExistingParent(BNOBlocks.ZINC_BLOCK);

        generateExistingParent(BNOBlocks.RAW_ALUMINUM_BLOCK);
        generateExistingParent(BNOBlocks.RAW_LEAD_BLOCK);
        generateExistingParent(BNOBlocks.RAW_NICKEL_BLOCK);
        generateExistingParent(BNOBlocks.RAW_SILVER_BLOCK);
        generateExistingParent(BNOBlocks.RAW_TIN_BLOCK);
        generateExistingParent(BNOBlocks.RAW_OSMIUM_BLOCK);
        generateExistingParent(BNOBlocks.RAW_URANIUM_BLOCK);
        generateExistingParent(BNOBlocks.RAW_ZINC_BLOCK);

        generated("aluminum_ingot", new ResourceLocation(modid, "item/aluminum_ingot"));
        generated("lead_ingot", new ResourceLocation(modid, "item/lead_ingot"));
        generated("nickel_ingot", new ResourceLocation(modid, "item/nickel_ingot"));
        generated("silver_ingot", new ResourceLocation(modid, "item/silver_ingot"));
        generated("tin_ingot", new ResourceLocation(modid, "item/tin_ingot"));
        generated("osmium_ingot", new ResourceLocation(modid, "item/osmium_ingot"));
        generated("uranium_ingot", new ResourceLocation(modid, "item/uranium_ingot"));
        generated("zinc_ingot", new ResourceLocation(modid, "item/zinc_ingot"));

        generated("aluminum_nugget", new ResourceLocation(modid, "item/aluminum_nugget"));
        generated("copper_nugget", new ResourceLocation(modid, "item/copper_nugget"));
        generated("lead_nugget", new ResourceLocation(modid, "item/lead_nugget"));
        generated("nickel_nugget", new ResourceLocation(modid, "item/nickel_nugget"));
        generated("silver_nugget", new ResourceLocation(modid, "item/silver_nugget"));
        generated("tin_nugget", new ResourceLocation(modid, "item/tin_nugget"));
        generated("osmium_nugget", new ResourceLocation(modid, "item/osmium_nugget"));
        generated("zinc_nugget", new ResourceLocation(modid, "item/zinc_nugget"));

        generated("raw_aluminum", new ResourceLocation(modid, "item/raw_aluminum"));
        generated("raw_lead", new ResourceLocation(modid, "item/raw_lead"));
        generated("raw_nickel", new ResourceLocation(modid, "item/raw_nickel"));
        generated("raw_silver", new ResourceLocation(modid, "item/raw_silver"));
        generated("raw_tin", new ResourceLocation(modid, "item/raw_tin"));
        generated("raw_osmium", new ResourceLocation(modid, "item/raw_osmium"));
        generated("raw_uranium", new ResourceLocation(modid, "item/raw_uranium"));
        generated("raw_zinc", new ResourceLocation(modid, "item/raw_zinc"));
    }

    private void generateExistingParent(Block block) {
        String blockName = block.asItem().toString();
        withExistingParent(blockName, prefix("block/" + blockName));
    }

    private ItemModelBuilder generated(String name, ResourceLocation... layers) {
        ItemModelBuilder builder = withExistingParent(name, "item/generated");
        for (int i = 0; i < layers.length; i++) {
            builder = builder.texture("layer" + i, layers[i]);
        }
        return builder;
    }
}
