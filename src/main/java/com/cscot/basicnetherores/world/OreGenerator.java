package com.cscot.basicnetherores.world;


import com.cscot.basicnetherores.config.OreGenerationConfig;
import com.cscot.basicnetherores.world.gen.feature.ModOreFeatures;
import com.google.common.collect.Lists;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;


public class OreGenerator
{
    public static void setupOreGenerator()
    {
        for (Map.Entry<RegistryKey<Biome>, Biome> biome : WorldGenRegistries.BIOME.getEntries()) {

            if (biome.getValue().getCategory().equals(Biome.Category.NETHER))
            {
                if(OreGenerationConfig.emeraldGeneration.get()){
                addNetherOres(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES, ModOreFeatures.ORE_EMERALD_NETHER);
                }

                if(OreGenerationConfig.diamondGeneration.get()){
                    addNetherOres(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES, ModOreFeatures.ORE_DIAMOND_NETHER);
                }

                if(OreGenerationConfig.redstoneGeneration.get()){
                    addNetherOres(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES, ModOreFeatures.ORE_REDSTONE_NETHER);
                }

                if(OreGenerationConfig.lapisGeneration.get()){
                    addNetherOres(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES, ModOreFeatures.ORE_LAPIS_NETHER);
                }

                if(OreGenerationConfig.coalGeneration.get()){
                    addNetherOres(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES, ModOreFeatures.ORE_COAL_NETHER);
                }

                if(OreGenerationConfig.silverGeneration.get()){
                    addNetherOres(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES, ModOreFeatures.ORE_SILVER_NETHER);
                }

                if(OreGenerationConfig.ironGeneration.get()){
                    addNetherOres(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES, ModOreFeatures.ORE_IRON_NETHER);
                }

                if(OreGenerationConfig.leadGeneration.get()){
                    addNetherOres(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES, ModOreFeatures.ORE_LEAD_NETHER);
                }

                if(OreGenerationConfig.nickelGeneration.get()){
                    addNetherOres(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES, ModOreFeatures.ORE_NICKEL_NETHER);
                }

                if(OreGenerationConfig.copperGeneration.get()){
                    addNetherOres(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES, ModOreFeatures.ORE_COPPER_NETHER);
                }

                if(OreGenerationConfig.aluminumGeneration.get()){
                    addNetherOres(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES, ModOreFeatures.ORE_ALUMINUM_NETHER);
                }

                if(OreGenerationConfig.tinGeneration.get()){
                    addNetherOres(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES, ModOreFeatures.ORE_TIN_NETHER);
                }

                if(OreGenerationConfig.osmiumGeneration.get()){
                    addNetherOres(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES, ModOreFeatures.ORE_OSMIUM_NETHER);
                }

                if(OreGenerationConfig.uraniumGeneration.get()){
                    addNetherOres(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES, ModOreFeatures.ORE_URANIUM_NETHER);
                }
            }
        }
    }

    //Add Nether Ores Method adapted from DrunkBlood's Lucky Ore mod https://github.com/DrunkBlood/Lucky-Ore
    public static void addNetherOres(Biome biome, GenerationStage.Decoration decoration, ConfiguredFeature<?, ?> configuredFeature)
    {
        List<List<Supplier<ConfiguredFeature<?, ?>>>> biomeFeatures = new ArrayList<>(biome.getGenerationSettings().getFeatures());

        while (biomeFeatures.size() <= decoration.ordinal())
        {
            biomeFeatures.add(Lists.newArrayList());
        }
        List<Supplier<ConfiguredFeature<?, ?>>> features = new ArrayList<>(biomeFeatures.get(decoration.ordinal()));

        features.add(() -> configuredFeature);

        biomeFeatures.set(decoration.ordinal(), features);

        ObfuscationReflectionHelper.setPrivateValue(BiomeGenerationSettings.class, biome.getGenerationSettings(), biomeFeatures,
                "field_242484_f");
    }
}
