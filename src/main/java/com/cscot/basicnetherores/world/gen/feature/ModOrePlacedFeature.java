package com.cscot.basicnetherores.world.gen.feature;

import com.cscot.basicnetherores.BasicNetherOres;
import com.cscot.basicnetherores.config.ModConfig;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.*;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

public class ModOrePlacedFeature
{
    public static String MODID = BasicNetherOres.MOD_ID;

    public static final PlacedFeature ORE_EMERALD_NETHER = ModOreConfiguredFeatures.ORE_EMERALD_NETHER.withPlacement(modifiersWithCount(ModConfig.emeraldPerChunk, HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.emeraldMinHeight),YOffset.fixed(ModConfig.emeraldMaxHeight))));
    public static final PlacedFeature ORE_DIAMOND_NETHER = ModOreConfiguredFeatures.ORE_DIAMOND_NETHER.withPlacement(modifiersWithCount(ModConfig.diamondPerChunk, HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.diamondMinHeight),YOffset.fixed(ModConfig.diamondMaxHeight))));
    public static final PlacedFeature ORE_REDSTONE_NETHER = ModOreConfiguredFeatures.ORE_REDSTONE_NETHER.withPlacement(modifiersWithCount(ModConfig.redstonePerChunk, HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.redstoneMinHeight),YOffset.fixed(ModConfig.redstoneMaxHeight))));
    public static final PlacedFeature ORE_LAPIS_NETHER = ModOreConfiguredFeatures.ORE_LAPIS_NETHER.withPlacement(modifiersWithCount(ModConfig.lapisPerChunk, HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.lapisMinHeight),YOffset.fixed(ModConfig.lapisMaxHeight))));
    public static final PlacedFeature ORE_COAL_NETHER = ModOreConfiguredFeatures.ORE_COAL_NETHER.withPlacement(modifiersWithCount(ModConfig.coalPerChunk, HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.coalMinHeight),YOffset.fixed(ModConfig.coalMaxHeight))));
    public static final PlacedFeature ORE_SILVER_NETHER = ModOreConfiguredFeatures.ORE_SILVER_NETHER.withPlacement(modifiersWithCount(ModConfig.silverPerChunk, HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.silverMinHeight),YOffset.fixed(ModConfig.silverMaxHeight))));
    public static final PlacedFeature ORE_IRON_NETHER = ModOreConfiguredFeatures.ORE_IRON_NETHER.withPlacement(modifiersWithCount(ModConfig.ironPerChunk, HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.ironMinHeight),YOffset.fixed(ModConfig.ironMaxHeight))));
    public static final PlacedFeature ORE_LEAD_NETHER = ModOreConfiguredFeatures.ORE_LEAD_NETHER.withPlacement(modifiersWithCount(ModConfig.leadPerChunk, HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.leadMinHeight),YOffset.fixed(ModConfig.leadMaxHeight))));
    public static final PlacedFeature ORE_NICKEL_NETHER = ModOreConfiguredFeatures.ORE_NICKEL_NETHER.withPlacement(modifiersWithCount(ModConfig.nickelPerChunk, HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.nickelMinHeight),YOffset.fixed(ModConfig.nickelMaxHeight))));
    public static final PlacedFeature ORE_COPPER_NETHER = ModOreConfiguredFeatures.ORE_COPPER_NETHER.withPlacement(modifiersWithCount(ModConfig.copperPerChunk, HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.copperMinHeight),YOffset.fixed(ModConfig.copperMaxHeight))));
    public static final PlacedFeature ORE_ALUMINUM_NETHER = ModOreConfiguredFeatures.ORE_ALUMINUM_NETHER.withPlacement(modifiersWithCount(ModConfig.aluminumPerChunk, HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.aluminumMinHeight),YOffset.fixed(ModConfig.aluminumMaxHeight))));
    public static final PlacedFeature ORE_TIN_NETHER = ModOreConfiguredFeatures.ORE_TIN_NETHER.withPlacement(modifiersWithCount(ModConfig.tinPerChunk, HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.tinMinHeight),YOffset.fixed(ModConfig.tinMaxHeight))));
    public static final PlacedFeature ORE_OSMIUM_NETHER = ModOreConfiguredFeatures.ORE_OSMIUM_NETHER.withPlacement(modifiersWithCount(ModConfig.osmiumPerChunk, HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.osmiumMinHeight),YOffset.fixed(ModConfig.osmiumMaxHeight))));
    public static final PlacedFeature ORE_URANIUM_NETHER = ModOreConfiguredFeatures.ORE_URANIUM_NETHER.withPlacement(modifiersWithCount(ModConfig.uraniumPerChunk, HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.uraniumMinHeight),YOffset.fixed(ModConfig.uraniumMaxHeight))));
    
    public static void initOrePlacedFeatures()
    {
        RegistryKey<PlacedFeature> oreEmeraldNether = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MODID, "ore_emerald_nether"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreEmeraldNether.getValue(), ORE_EMERALD_NETHER);

        RegistryKey<PlacedFeature> oreDiamondNether = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MODID, "ore_diamond_nether"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreDiamondNether.getValue(), ORE_DIAMOND_NETHER);

        RegistryKey<PlacedFeature> oreRedstoneNether = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MODID, "ore_redstone_nether"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreRedstoneNether.getValue(), ORE_REDSTONE_NETHER);

        RegistryKey<PlacedFeature> oreLapisNether = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MODID, "ore_lapis_nether"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreLapisNether.getValue(), ORE_LAPIS_NETHER);

        RegistryKey<PlacedFeature> oreCoalNether = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MODID, "ore_coal_nether"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreCoalNether.getValue(), ORE_COAL_NETHER);

        RegistryKey<PlacedFeature> oreSilverNether = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MODID, "ore_silver_nether"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreSilverNether.getValue(), ORE_SILVER_NETHER);

        RegistryKey<PlacedFeature> oreIronNether = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MODID, "ore_iron_nether"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreIronNether.getValue(), ORE_IRON_NETHER);

        RegistryKey<PlacedFeature> oreLeadNether = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MODID, "ore_lead_nether"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreLeadNether.getValue(), ORE_LEAD_NETHER);

        RegistryKey<PlacedFeature> oreNickelNether = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MODID, "ore_nickel_nether"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreNickelNether.getValue(), ORE_NICKEL_NETHER);

        RegistryKey<PlacedFeature> oreCopperNether = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MODID, "ore_copper_nether"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreCopperNether.getValue(), ORE_COPPER_NETHER);

        RegistryKey<PlacedFeature> oreAluminumNether = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MODID, "ore_aluminum_nether"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreAluminumNether.getValue(), ORE_ALUMINUM_NETHER);

        RegistryKey<PlacedFeature> oreTinNether = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MODID, "ore_tin_nether"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreTinNether.getValue(), ORE_TIN_NETHER);

        RegistryKey<PlacedFeature> oreOsmiumNether = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MODID, "ore_osmium_nether"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreOsmiumNether.getValue(), ORE_OSMIUM_NETHER);

        RegistryKey<PlacedFeature> oreUraniumNether = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MODID, "ore_uranium_nether"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreUraniumNether.getValue(), ORE_URANIUM_NETHER);

        if(ModConfig.emeraldGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreEmeraldNether);
        }

        if(ModConfig.diamondGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreDiamondNether);
        }

        if(ModConfig.redstoneGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreRedstoneNether);
        }

        if(ModConfig.lapisGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreLapisNether);
        }

        if(ModConfig.coalGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreCoalNether);
        }

        if(ModConfig.silverGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreSilverNether);
        }

        if(ModConfig.ironGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreIronNether);
        }

        if(ModConfig.leadGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreLeadNether);
        }

        if(ModConfig.nickelGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreNickelNether);
        }

        if(ModConfig.copperGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreCopperNether);
        }

        if(ModConfig.aluminumGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreAluminumNether);
        }

        if(ModConfig.tinGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreTinNether);
        }

        if(ModConfig.osmiumGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreOsmiumNether);
        }

        if(ModConfig.uraniumGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreUraniumNether);
        }
    }

    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }

    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModfier) {
        return modifiers(CountPlacementModifier.of(count), heightModfier);
    }
}
