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