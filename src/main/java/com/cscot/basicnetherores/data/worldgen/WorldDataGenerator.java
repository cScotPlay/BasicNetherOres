package com.cscot.basicnetherores.data.worldgen;

import com.cscot.basicnetherores.data.worldgen.biomemodifier.BiomeModifierGenerator;
import com.cscot.basicnetherores.data.worldgen.configuredfeatures.ConfiguredFeatureGenerator;
import com.cscot.basicnetherores.data.worldgen.placedfeatures.PlacedFeatureGenerator;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

public class WorldDataGenerator
{
    public static void generateWorldData(GatherDataEvent event)
    {
        ConfiguredFeatureGenerator.onGatherData(event);
        PlacedFeatureGenerator.onGatherData(event);
        BiomeModifierGenerator.onGatherData(event);
    }
}
