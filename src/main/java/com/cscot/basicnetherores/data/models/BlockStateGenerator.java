package com.cscot.basicnetherores.data.models;

import com.cscot.basicnetherores.BasicNetherOres;
import com.cscot.basicnetherores.world.level.block.*;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class BlockStateGenerator extends BlockStateProvider
{
    String MODID = BasicNetherOres.modid;

    public BlockStateGenerator(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, BasicNetherOres.modid, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        for (RegistryObject<Block> registryObject : ModBlocks.BLOCKS.getEntries()) {
            Block block = registryObject.get();

            if (block instanceof ModOreBlock)
                simpleOreBlock(block);

            if (block instanceof ModRedstoneOreBlock)
                simpleOreBlock(block);

            if (block instanceof ModMetalBlock)
                simpleBlock(block);

            if (block instanceof ModRawOreBlock)
                simpleBlock(block);
        }
    }

    public void simpleOreBlock(Block block)
    {
        ResourceLocation parentName = new ResourceLocation(BasicNetherOres.modid, "block/cube_overlay_all");
        String oreName = block.asItem().toString();  //block.getRegistryName().getPath();

        simpleBlock(block, models().withExistingParent(oreName, parentName).texture("all", mcLoc("block/netherrack")).texture("overlay", modLoc("block/" + oreName)));
    }

    public ResourceLocation modLoc(String name)
    {
        return new ResourceLocation(MODID, name);
    }
}