package com.cscot.basicnetherores.data;


import com.cscot.basicnetherores.BasicNetherOres;
import com.cscot.basicnetherores.data.models.BlockStateGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DataGeneratorEntrypoint implements net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
{
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator)
    {
        generator.addProvider(BlockStateGenerator::new);

    }
}
