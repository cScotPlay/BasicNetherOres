package com.cscot.basicnetherores.world.gen.feature;

import com.cscot.basicnetherores.BasicNetherOres;
import com.cscot.basicnetherores.config.OreGenerationConfig;
import com.cscot.basicnetherores.lists.BlockOreList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;

public class ModOreFeatures
{
    public static String modID = BasicNetherOres.modid;

    public static ConfiguredFeature<?, ?> ORE_EMERALD_NETHER = Feature.ORE
            .withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.field_241883_b, BlockOreList.netheremerald_ore.getDefaultState(),
                    OreGenerationConfig.emeraldVeinSize.get()))
            .withPlacement(Placement.field_242907_l.configure(
                    new TopSolidRangeConfig(
                            OreGenerationConfig.emeraldMinHeight.get(),
                            0,
                            OreGenerationConfig.emeraldMaxHeight.get())))
            .func_242728_a().func_242731_b(OreGenerationConfig.emeraldPerChunk.get());


    public static void initModFeatures ()
    {
        Registry.register(WorldGenRegistries.field_243653_e, new ResourceLocation(modID, "ore_emerald_nether"), ORE_EMERALD_NETHER);
    }

}
