package com.cscot.basicnetherores.world.gen.feature;

import com.cscot.basicnetherores.BasicNetherOres;
import com.cscot.basicnetherores.api.OreFeatureLists;
import com.cscot.basicnetherores.config.ModConfig;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

@SuppressWarnings("unused")
public class ModOrePlacedFeature
{
    public static String MODID = BasicNetherOres.MOD_ID;

    public static final RegistryEntry<PlacedFeature> ORE_EMERALD_PLACED_FEATURE = PlacedFeatures.register(OreFeatureLists.EMERALD_ORE_FEATURE_ID, ModOreConfiguredFeatures.ORE_EMERALD_CONFIGURED_FEATURE,
            modifiersWithCount(ModConfig.emeraldPerChunk,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.emeraldMinHeight),YOffset.fixed(ModConfig.emeraldMaxHeight))));

    public static final RegistryEntry<PlacedFeature> ORE_DIAMOND_PLACED_FEATURE = PlacedFeatures.register(OreFeatureLists.DIAMOND_ORE_FEATURE_ID,
            ModOreConfiguredFeatures.ORE_DIAMOND_CONFIGURED_FEATURE, modifiersWithCount(ModConfig.diamondPerChunk,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.diamondMinHeight),YOffset.fixed(ModConfig.diamondMaxHeight))));

    public static final RegistryEntry<PlacedFeature> ORE_REDSTONE_PLACED_FEATURE = PlacedFeatures.register(OreFeatureLists.REDSTONE_ORE_FEATURE_ID,
            ModOreConfiguredFeatures.ORE_REDSTONE_CONFIGURED_FEATURE, modifiersWithCount(ModConfig.redstonePerChunk,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.redstoneMinHeight),YOffset.fixed(ModConfig.redstoneMaxHeight))));

    public static final RegistryEntry<PlacedFeature> ORE_LAPIS_PLACED_FEATURE = PlacedFeatures.register(OreFeatureLists.LAPIS_ORE_FEATURE_ID,
            ModOreConfiguredFeatures.ORE_LAPIS_CONFIGURED_FEATURE, modifiersWithCount(ModConfig.lapisPerChunk,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.lapisMinHeight),YOffset.fixed(ModConfig.lapisMaxHeight))));

    public static final RegistryEntry<PlacedFeature> ORE_COAL_PLACED_FEATURE = PlacedFeatures.register(OreFeatureLists.COAL_ORE_FEATURE_ID,
            ModOreConfiguredFeatures.ORE_COAL_CONFIGURED_FEATURE, modifiersWithCount(ModConfig.coalPerChunk,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.coalMinHeight),YOffset.fixed(ModConfig.coalMaxHeight))));

    public static final RegistryEntry<PlacedFeature> ORE_SILVER_PLACED_FEATURE = PlacedFeatures.register(OreFeatureLists.SILVER_ORE_FEATURE_ID,
            ModOreConfiguredFeatures.ORE_SILVER_CONFIGURED_FEATURE, modifiersWithCount(ModConfig.silverPerChunk,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.silverMinHeight),YOffset.fixed(ModConfig.silverMaxHeight))));

    public static final RegistryEntry<PlacedFeature> ORE_IRON_PLACED_FEATURE = PlacedFeatures.register(OreFeatureLists.IRON_ORE_FEATURE_ID,
            ModOreConfiguredFeatures.ORE_IRON_CONFIGURED_FEATURE, modifiersWithCount(ModConfig.ironPerChunk,
                HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.ironMinHeight),YOffset.fixed(ModConfig.ironMaxHeight))));

    public static final RegistryEntry<PlacedFeature> ORE_LEAD_PLACED_FEATURE = PlacedFeatures.register(OreFeatureLists.LEAD_ORE_FEATURE_ID,
            ModOreConfiguredFeatures.ORE_LEAD_CONFIGURED_FEATURE, modifiersWithCount(ModConfig.leadPerChunk,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.leadMinHeight),YOffset.fixed(ModConfig.leadMaxHeight))));

    public static final RegistryEntry<PlacedFeature> ORE_NICKEL_PLACED_FEATURE = PlacedFeatures.register(OreFeatureLists.NICKEL_ORE_FEATURE_ID,
            ModOreConfiguredFeatures.ORE_NICKEL_CONFIGURED_FEATURE, modifiersWithCount(ModConfig.nickelPerChunk,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.nickelMinHeight),YOffset.fixed(ModConfig.nickelMaxHeight))));

    public static final RegistryEntry<PlacedFeature> ORE_COPPER_PLACED_FEATURE = PlacedFeatures.register(OreFeatureLists.COPPER_ORE_FEATURE_ID,
            ModOreConfiguredFeatures.ORE_COPPER_CONFIGURED_FEATURE, modifiersWithCount(ModConfig.copperPerChunk,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.copperMinHeight),YOffset.fixed(ModConfig.copperMaxHeight))));

    public static final RegistryEntry<PlacedFeature> ORE_ALUMINUM_PLACED_FEATURE = PlacedFeatures.register(OreFeatureLists.ALUMINUM_ORE_FEATURE_ID,
            ModOreConfiguredFeatures.ORE_ALUMINUM_CONFIGURED_FEATURE, modifiersWithCount(ModConfig.aluminumPerChunk,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.aluminumMinHeight),YOffset.fixed(ModConfig.aluminumMaxHeight))));

    public static final RegistryEntry<PlacedFeature> ORE_TIN_PLACED_FEATURE = PlacedFeatures.register(OreFeatureLists.TIN_ORE_FEATURE_ID,
            ModOreConfiguredFeatures.ORE_TIN_CONFIGURED_FEATURE, modifiersWithCount(ModConfig.tinPerChunk,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.tinMinHeight),YOffset.fixed(ModConfig.tinMaxHeight))));

    public static final RegistryEntry<PlacedFeature> ORE_OSMIUM_PLACED_FEATURE = PlacedFeatures.register(OreFeatureLists.OSMIUM_ORE_FEATURE_ID,
            ModOreConfiguredFeatures.ORE_OSMIUM_CONFIGURED_FEATURE, modifiersWithCount(ModConfig.osmiumPerChunk,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.osmiumMinHeight),YOffset.fixed(ModConfig.osmiumMaxHeight))));

    public static final RegistryEntry<PlacedFeature> ORE_URANIUM_PLACED_FEATURE = PlacedFeatures.register(OreFeatureLists.URANIUM_ORE_FEATURE_ID,
            ModOreConfiguredFeatures.ORE_URANIUM_CONFIGURED_FEATURE, modifiersWithCount(ModConfig.uraniumPerChunk,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.uraniumMinHeight),YOffset.fixed(ModConfig.uraniumMaxHeight))));

    public static final RegistryEntry<PlacedFeature> ORE_ZINC_PLACED_FEATURE = PlacedFeatures.register(OreFeatureLists.ZINC_ORE_FEATURE_ID,
            ModOreConfiguredFeatures.ORE_ZINC_CONFIGURED_FEATURE, modifiersWithCount(ModConfig.zincPerChunk,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.zincMinHeight),YOffset.fixed(ModConfig.zincMaxHeight))));

    public static void initOrePlacedFeatures()
    {
        if(ModConfig.emeraldGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,  RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(OreFeatureLists.EMERALD_ORE_FEATURE_ID)));
        }

        if(ModConfig.diamondGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(OreFeatureLists.DIAMOND_ORE_FEATURE_ID)));
        }

        if(ModConfig.redstoneGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(OreFeatureLists.REDSTONE_ORE_FEATURE_ID)));
        }

        if(ModConfig.lapisGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(OreFeatureLists.LAPIS_ORE_FEATURE_ID)));
        }

        if(ModConfig.coalGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(OreFeatureLists.COAL_ORE_FEATURE_ID)));
        }

        if(ModConfig.silverGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(OreFeatureLists.SILVER_ORE_FEATURE_ID)));
        }

        if(ModConfig.ironGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,  RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(OreFeatureLists.IRON_ORE_FEATURE_ID)));
        }

        if(ModConfig.leadGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(OreFeatureLists.LEAD_ORE_FEATURE_ID)));
        }

        if(ModConfig.nickelGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(OreFeatureLists.NICKEL_ORE_FEATURE_ID)));
        }

        if(ModConfig.copperGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(OreFeatureLists.COPPER_ORE_FEATURE_ID)));
        }

        if(ModConfig.aluminumGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(OreFeatureLists.ALUMINUM_ORE_FEATURE_ID)));
        }

        if(ModConfig.tinGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(OreFeatureLists.TIN_ORE_FEATURE_ID)));
        }

        if(ModConfig.osmiumGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(OreFeatureLists.OSMIUM_ORE_FEATURE_ID)));
        }

        if(ModConfig.uraniumGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(OreFeatureLists.URANIUM_ORE_FEATURE_ID)));
        }

        if(ModConfig.zincGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(OreFeatureLists.ZINC_ORE_FEATURE_ID)));
        }
    }

    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }

    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModfier) {
        return modifiers(CountPlacementModifier.of(count), heightModfier);
    }
}
