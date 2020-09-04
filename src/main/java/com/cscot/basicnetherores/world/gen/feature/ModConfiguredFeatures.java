package com.cscot.basicnetherores.world.gen.feature;

import com.cscot.basicnetherores.BasicNetherOres;
import com.cscot.basicnetherores.api.OreBlockLists;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class ModConfiguredFeatures
{
    public static String modID = BasicNetherOres.MOD_ID;

    public static ConfiguredFeature<?, ?> ORE_EMERALD_NETHER = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_NETHER, OreBlockLists.NETHEREMERALD_ORE.getDefaultState(), 24)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0,0,125))).spreadHorizontally().repeat(20);


    public static void initModFeatures ()
    {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(modID, "ore_emerald_nether"), ORE_EMERALD_NETHER);
    }
}
