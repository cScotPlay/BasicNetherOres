package com.cscot.basicnetherores.data;

import com.cscot.basicnetherores.data.tags.BlockTagGenerator;
import com.cscot.basicnetherores.data.tags.ItemTagGenerator;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.data.DataGenerator;

public class DataGenerators implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator dataGenerator) {
        dataGenerator.addProvider(BlockTagGenerator::new);
        dataGenerator.addProvider(ItemTagGenerator::new);
    }
}
