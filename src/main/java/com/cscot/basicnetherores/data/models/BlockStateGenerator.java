package com.cscot.basicnetherores.data.models;

import com.cscot.basicnetherores.BasicNetherOres;
import com.cscot.basicnetherores.world.level.block.*;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fmllegacy.RegistryObject;

public class BlockStateGenerator extends BlockStateProvider
{
    public BlockStateGenerator(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, BasicNetherOres.modid, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        for (RegistryObject<Block> registryObject : ModBlocks.BLOCKS.getEntries()) {
            Block block = registryObject.get();

            if (block instanceof ModOreBlock)
                simpleBlock(block);

            if (block instanceof ModRedstoneOreBlock)
                simpleBlock(block);

            if (block instanceof ModMetalBlock)
                simpleBlock(block);

            if (block instanceof ModRawOreBlock)
                simpleBlock(block);
        }
    }
}