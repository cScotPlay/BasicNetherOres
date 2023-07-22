package net.mcs3.basicnetherores.data.models;

import net.mcs3.basicnetherores.Constants;
import net.mcs3.basicnetherores.init.BNOBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import static net.mcs3.basicnetherores.util.helper.ResourceLocationHelper.prefix;

public class BlockStateGenerator extends BlockStateProvider
{
    String MOD_ID = Constants.MOD_ID;

    public BlockStateGenerator(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen.getPackOutput(), Constants.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        this.simpleOreBlock(BNOBlocks.NETHER_EMERALD_ORE);
        this.simpleOreBlock(BNOBlocks.NETHER_DIAMOND_ORE);
        this.simpleOreBlock(BNOBlocks.NETHER_REDSTONE_ORE);
        this.simpleOreBlock(BNOBlocks.NETHER_LAPIS_ORE);
        this.simpleOreBlock(BNOBlocks.NETHER_COAL_ORE);
        this.simpleOreBlock(BNOBlocks.NETHER_SILVER_ORE);
        this.simpleOreBlock(BNOBlocks.NETHER_IRON_ORE);
        this.simpleOreBlock(BNOBlocks.NETHER_LEAD_ORE);
        this.simpleOreBlock(BNOBlocks.NETHER_NICKEL_ORE);
        this.simpleOreBlock(BNOBlocks.NETHER_COPPER_ORE);
        this.simpleOreBlock(BNOBlocks.NETHER_ALUMINUM_ORE);
        this.simpleOreBlock(BNOBlocks.NETHER_TIN_ORE);
        this.simpleOreBlock(BNOBlocks.NETHER_OSMIUM_ORE);
        this.simpleOreBlock(BNOBlocks.NETHER_URANIUM_ORE);
        this.simpleOreBlock(BNOBlocks.NETHER_ZINC_ORE);

        this.simpleBlock(BNOBlocks.ALUMINUM_BLOCK);
        this.simpleBlock(BNOBlocks.LEAD_BLOCK);
        this.simpleBlock(BNOBlocks.NICKEL_BLOCK);
        this.simpleBlock(BNOBlocks.SILVER_BLOCK);
        this.simpleBlock(BNOBlocks.TIN_BLOCK);
        this.simpleBlock(BNOBlocks.OSMIUM_BLOCK);
        this.simpleBlock(BNOBlocks.URANIUM_BLOCK);
        this.simpleBlock(BNOBlocks.ZINC_BLOCK);

        this.simpleBlock(BNOBlocks.RAW_ALUMINUM_BLOCK);
        this.simpleBlock(BNOBlocks.RAW_LEAD_BLOCK);
        this.simpleBlock(BNOBlocks.RAW_NICKEL_BLOCK);
        this.simpleBlock(BNOBlocks.RAW_SILVER_BLOCK);
        this.simpleBlock(BNOBlocks.RAW_TIN_BLOCK);
        this.simpleBlock(BNOBlocks.RAW_OSMIUM_BLOCK);
        this.simpleBlock(BNOBlocks.RAW_URANIUM_BLOCK);
        this.simpleBlock(BNOBlocks.RAW_ZINC_BLOCK);


//        for (RegistryObject<Block> registryObject : ModBlocks.BLOCKS.getEntries()) {
//            Block block = registryObject.get();
//
//            if (block instanceof ModOreBlock)
//                simpleOreBlock(block);
//
//            if (block instanceof ModRedstoneOreBlock)
//                simpleOreBlock(block);
//
//            if (block instanceof ModMetalBlock)
//                simpleBlock(block);
//
//            if (block instanceof ModRawOreBlock)
//                simpleBlock(block);
//        }
    }

    public void simpleOreBlock(Block block)
    {
        ResourceLocation parentName = prefix("block/cube_overlay_all");
        String oreName = block.asItem().toString();

        simpleBlock(block, models().withExistingParent(oreName, parentName).texture("all", mcLoc("block/netherrack")).texture("overlay", prefix("block/" + oreName)));
    }

    public ResourceLocation modLoc(String name)
    {
        return new ResourceLocation(MOD_ID, name);
    }
}