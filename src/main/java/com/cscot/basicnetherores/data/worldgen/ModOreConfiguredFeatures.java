package com.cscot.basicnetherores.data.worldgen;

import com.cscot.basicnetherores.config.OreGenerationConfig;
import com.cscot.basicnetherores.world.level.block.ModBlocks;
import net.minecraft.data.worldgen.features.OreFeatures;

import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;


public class ModOreConfiguredFeatures
{
    public static OreConfiguration ORE_EMERALD_CONFIGURED_FEATURE = new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_EMERALD_ORE.get().defaultBlockState(),
                    OreGenerationConfig.emeraldVeinSize.get());

    public static OreConfiguration ORE_DIAMOND_CONFIGURED_FEATURE = new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_DIAMOND_ORE.get().defaultBlockState(),
                    OreGenerationConfig.diamondVeinSize.get());

    public static OreConfiguration ORE_REDSTONE_CONFIGURED_FEATURE = new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_REDSTONE_ORE.get().defaultBlockState(),
                    OreGenerationConfig.redstoneVeinSize.get());

    public static OreConfiguration ORE_LAPIS_CONFIGURED_FEATURE = new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_LAPIS_ORE.get().defaultBlockState(),
                    OreGenerationConfig.lapisVeinSize.get());

    public static OreConfiguration ORE_COAL_CONFIGURED_FEATURE = new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_COAL_ORE.get().defaultBlockState(),
                    OreGenerationConfig.coalVeinSize.get());

    public static OreConfiguration ORE_SILVER_CONFIGURED_FEATURE = new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_SILVER_ORE.get().defaultBlockState(),
                    OreGenerationConfig.silverVeinSize.get());

    public static OreConfiguration ORE_IRON_CONFIGURED_FEATURE = new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_IRON_ORE.get().defaultBlockState(),
                    OreGenerationConfig.ironVeinSize.get());

    public static OreConfiguration ORE_LEAD_CONFIGURED_FEATURE = new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_LEAD_ORE.get().defaultBlockState(),
                    OreGenerationConfig.leadVeinSize.get());

    public static OreConfiguration ORE_NICKEL_CONFIGURED_FEATURE = new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_NICKEL_ORE.get().defaultBlockState(),
                    OreGenerationConfig.nickelVeinSize.get());

    public static OreConfiguration ORE_COPPER_CONFIGURED_FEATURE = new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_COPPER_ORE.get().defaultBlockState(),
                    OreGenerationConfig.copperVeinSize.get());

    public static OreConfiguration ORE_ALUMINUM_CONFIGURED_FEATURE = new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_ALUMINUM_ORE.get().defaultBlockState(),
                    OreGenerationConfig.aluminumVeinSize.get());

    public static OreConfiguration ORE_TIN_CONFIGURED_FEATURE = new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_TIN_ORE.get().defaultBlockState(),
                    OreGenerationConfig.tinVeinSize.get());

    public static OreConfiguration ORE_OSMIUM_CONFIGURED_FEATURE = new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_OSMIUM_ORE.get().defaultBlockState(),
                    OreGenerationConfig.osmiumVeinSize.get());

    public static OreConfiguration ORE_URANIUM_CONFIGURED_FEATURE = new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_URANIUM_ORE.get().defaultBlockState(),
                    OreGenerationConfig.uraniumVeinSize.get());

    public static OreConfiguration ORE_ZINC_CONFIGURED_FEATURE = new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_ZINC_ORE.get().defaultBlockState(),
                    OreGenerationConfig.zincVeinSize.get());
}
