package com.cscot.basicnetherores.util.helpers;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;


public class WorldHelper
{
    //Boolean check for biomes types against a list of biome types
    public static boolean biomeHasType(Biome biome, BiomeDictionary.Type... types)
    {
        for (BiomeDictionary.Type type : types)
            if (BiomeDictionary.hasType(biome, type))
                return true;

        return false;
    }
}
