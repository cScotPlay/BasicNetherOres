package com.cscot.basicnetherores.data.worldgen;

import com.cscot.basicnetherores.BasicNetherOres;
import com.cscot.basicnetherores.config.OreGenerationConfig;
import com.cscot.basicnetherores.world.level.block.ModBlocks;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;


public class ModOreConfiguredFeatures
{
    public static String modID = BasicNetherOres.modid;

    public static ConfiguredFeature<?, ?> ORE_EMERALD_NETHER = Feature.ORE
            .configured(new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_EMERALD_ORE.get().defaultBlockState(),
                    OreGenerationConfig.emeraldVeinSize.get()));

    public static ConfiguredFeature<?, ?> ORE_DIAMOND_NETHER = Feature.ORE
            .configured(new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_DIAMOND_ORE.get().defaultBlockState(),
                    OreGenerationConfig.diamondVeinSize.get()));

    public static ConfiguredFeature<?, ?> ORE_REDSTONE_NETHER = Feature.ORE
            .configured(new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_REDSTONE_ORE.get().defaultBlockState(),
                    OreGenerationConfig.redstoneVeinSize.get()));

    public static ConfiguredFeature<?, ?> ORE_LAPIS_NETHER = Feature.ORE
            .configured(new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_LAPIS_ORE.get().defaultBlockState(),
                    OreGenerationConfig.lapisVeinSize.get()));

    public static ConfiguredFeature<?, ?> ORE_COAL_NETHER = Feature.ORE
            .configured(new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_COAL_ORE.get().defaultBlockState(),
                    OreGenerationConfig.coalVeinSize.get()));

    public static ConfiguredFeature<?, ?> ORE_SILVER_NETHER = Feature.ORE
            .configured(new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_SILVER_ORE.get().defaultBlockState(),
                    OreGenerationConfig.silverVeinSize.get()));

    public static ConfiguredFeature<?, ?> ORE_IRON_NETHER = Feature.ORE
            .configured(new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_IRON_ORE.get().defaultBlockState(),
                    OreGenerationConfig.ironVeinSize.get()));

    public static ConfiguredFeature<?, ?> ORE_LEAD_NETHER = Feature.ORE
            .configured(new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_LEAD_ORE.get().defaultBlockState(),
                    OreGenerationConfig.leadVeinSize.get()));

    public static ConfiguredFeature<?, ?> ORE_NICKEL_NETHER = Feature.ORE
            .configured(new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_NICKEL_ORE.get().defaultBlockState(),
                    OreGenerationConfig.nickelVeinSize.get()));
    
    public static ConfiguredFeature<?, ?> ORE_COPPER_NETHER = Feature.ORE
            .configured(new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_COAL_ORE.get().defaultBlockState(),
                    OreGenerationConfig.copperVeinSize.get()));

    public static ConfiguredFeature<?, ?> ORE_ALUMINUM_NETHER = Feature.ORE
            .configured(new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_ALUMINUM_ORE.get().defaultBlockState(),
                    OreGenerationConfig.aluminumVeinSize.get()));

    public static ConfiguredFeature<?, ?> ORE_TIN_NETHER = Feature.ORE
            .configured(new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_TIN_ORE.get().defaultBlockState(),
                    OreGenerationConfig.tinVeinSize.get()));

    public static ConfiguredFeature<?, ?> ORE_OSMIUM_NETHER = Feature.ORE
            .configured(new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_OSMIUM_ORE.get().defaultBlockState(),
                    OreGenerationConfig.osmiumVeinSize.get()));

    public static ConfiguredFeature<?, ?> ORE_URANIUM_NETHER = Feature.ORE
            .configured(new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_URANIUM_ORE.get().defaultBlockState(),
                    OreGenerationConfig.uraniumVeinSize.get()));


    public static void initModFeatures ()
    {
        FeatureUtils.register(new ResourceLocation(modID, "ore_emerald_nether").toString(), ORE_EMERALD_NETHER);
        FeatureUtils.register(new ResourceLocation(modID, "ore_diamond_nether").toString(), ORE_DIAMOND_NETHER);
        FeatureUtils.register(new ResourceLocation(modID, "ore_redstone_nether").toString(), ORE_REDSTONE_NETHER);
        FeatureUtils.register(new ResourceLocation(modID, "ore_lapis_nether").toString(), ORE_LAPIS_NETHER);
        FeatureUtils.register(new ResourceLocation(modID, "ore_coal_nether").toString(), ORE_COAL_NETHER);
        FeatureUtils.register(new ResourceLocation(modID, "ore_silver_nether").toString(), ORE_SILVER_NETHER);
        FeatureUtils.register(new ResourceLocation(modID, "ore_iron_nether").toString(), ORE_IRON_NETHER);
        FeatureUtils.register(new ResourceLocation(modID, "ore_lead_nether").toString(), ORE_LEAD_NETHER);
        FeatureUtils.register(new ResourceLocation(modID, "ore_nickel_nether").toString(), ORE_NICKEL_NETHER);
        FeatureUtils.register(new ResourceLocation(modID, "ore_copper_nether").toString(), ORE_COPPER_NETHER);
        FeatureUtils.register(new ResourceLocation(modID, "ore_aluminum_nether").toString(), ORE_ALUMINUM_NETHER);
        FeatureUtils.register(new ResourceLocation(modID, "ore_tin_nether").toString(), ORE_TIN_NETHER);
        FeatureUtils.register(new ResourceLocation(modID, "ore_osmium_nether").toString(), ORE_OSMIUM_NETHER);
        FeatureUtils.register(new ResourceLocation(modID, "ore_uranium_nether").toString(), ORE_URANIUM_NETHER);
    }
}
