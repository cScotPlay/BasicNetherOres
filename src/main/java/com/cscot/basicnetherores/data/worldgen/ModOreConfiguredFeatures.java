package com.cscot.basicnetherores.data.worldgen;

import com.cscot.basicnetherores.BasicNetherOres;
import com.cscot.basicnetherores.api.OreFeatureLists;
import com.cscot.basicnetherores.config.OreGenerationConfig;
import com.cscot.basicnetherores.world.level.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;


public class ModOreConfiguredFeatures
{
    public static Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_EMERALD_CONFIGURED_FEATURE = FeatureUtils.register(OreFeatureLists.EMERALD_ORE_FEATURE_ID, Feature.ORE,
            new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_EMERALD_ORE.get().defaultBlockState(),
                    OreGenerationConfig.emeraldVeinSize.get()));

    public static Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_DIAMOND_CONFIGURED_FEATURE = FeatureUtils.register(OreFeatureLists.DIAMOND_ORE_FEATURE_ID, Feature.ORE,
            new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_DIAMOND_ORE.get().defaultBlockState(),
                    OreGenerationConfig.diamondVeinSize.get()));

    public static Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_REDSTONE_CONFIGURED_FEATURE = FeatureUtils.register(OreFeatureLists.REDSTONE_ORE_FEATURE_ID, Feature.ORE,
            new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_REDSTONE_ORE.get().defaultBlockState(),
                    OreGenerationConfig.redstoneVeinSize.get()));

    public static Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_LAPIS_CONFIGURED_FEATURE = FeatureUtils.register(OreFeatureLists.LAPIS_ORE_FEATURE_ID, Feature.ORE,
            new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_LAPIS_ORE.get().defaultBlockState(),
                    OreGenerationConfig.lapisVeinSize.get()));

    public static Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_COAL_CONFIGURED_FEATURE = FeatureUtils.register(OreFeatureLists.COAL_ORE_FEATURE_ID, Feature.ORE,
            new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_COAL_ORE.get().defaultBlockState(),
                    OreGenerationConfig.coalVeinSize.get()));

    public static Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_SILVER_CONFIGURED_FEATURE = FeatureUtils.register(OreFeatureLists.SILVER_ORE_FEATURE_ID, Feature.ORE,
            new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_SILVER_ORE.get().defaultBlockState(),
                    OreGenerationConfig.silverVeinSize.get()));

    public static Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_IRON_CONFIGURED_FEATURE = FeatureUtils.register(OreFeatureLists.IRON_ORE_FEATURE_ID, Feature.ORE,
            new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_IRON_ORE.get().defaultBlockState(),
                    OreGenerationConfig.ironVeinSize.get()));

    public static Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_LEAD_CONFIGURED_FEATURE = FeatureUtils.register(OreFeatureLists.LEAD_ORE_FEATURE_ID, Feature.ORE,
            new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_LEAD_ORE.get().defaultBlockState(),
                    OreGenerationConfig.leadVeinSize.get()));

    public static Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_NICKEL_CONFIGURED_FEATURE = FeatureUtils.register(OreFeatureLists.NICKEL_ORE_FEATURE_ID, Feature.ORE,
            new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_NICKEL_ORE.get().defaultBlockState(),
                    OreGenerationConfig.nickelVeinSize.get()));

    public static Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_COPPER_CONFIGURED_FEATURE = FeatureUtils.register(OreFeatureLists.COPPER_ORE_FEATURE_ID, Feature.ORE,
            new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_COPPER_ORE.get().defaultBlockState(),
                    OreGenerationConfig.copperVeinSize.get()));

    public static Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_ALUMINUM_CONFIGURED_FEATURE = FeatureUtils.register(OreFeatureLists.ALUMINUM_ORE_FEATURE_ID, Feature.ORE,
            new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_ALUMINUM_ORE.get().defaultBlockState(),
                    OreGenerationConfig.aluminumVeinSize.get()));

    public static Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_TIN_CONFIGURED_FEATURE = FeatureUtils.register(OreFeatureLists.TIN_ORE_FEATURE_ID, Feature.ORE,
            new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_TIN_ORE.get().defaultBlockState(),
                    OreGenerationConfig.tinVeinSize.get()));

    public static Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_OSMIUM_CONFIGURED_FEATURE = FeatureUtils.register(OreFeatureLists.OSMIUM_ORE_FEATURE_ID, Feature.ORE,
            new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_OSMIUM_ORE.get().defaultBlockState(),
                    OreGenerationConfig.osmiumVeinSize.get()));

    public static Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_URANIUM_CONFIGURED_FEATURE = FeatureUtils.register(OreFeatureLists.URANIUM_ORE_FEATURE_ID, Feature.ORE,
            new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_URANIUM_ORE.get().defaultBlockState(),
                    OreGenerationConfig.uraniumVeinSize.get()));

    public static Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_ZINC_CONFIGURED_FEATURE = FeatureUtils.register(OreFeatureLists.ZINC_ORE_FEATURE_ID, Feature.ORE,
            new OreConfiguration(
                    OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_ZINC_ORE.get().defaultBlockState(),
                    OreGenerationConfig.zincVeinSize.get()));


//    public static void initModFeatures ()
//    {
//        FeatureUtils.register(new ResourceLocation(modID, "ore_emerald_nether").toString(), ORE_EMERALD_NETHER);
//        FeatureUtils.register(new ResourceLocation(modID, "ore_diamond_nether").toString(), ORE_DIAMOND_NETHER);
//        FeatureUtils.register(new ResourceLocation(modID, "ore_redstone_nether").toString(), ORE_REDSTONE_NETHER);
//        FeatureUtils.register(new ResourceLocation(modID, "ore_lapis_nether").toString(), ORE_LAPIS_NETHER);
//        FeatureUtils.register(new ResourceLocation(modID, "ore_coal_nether").toString(), ORE_COAL_NETHER);
//        FeatureUtils.register(new ResourceLocation(modID, "ore_silver_nether").toString(), ORE_SILVER_NETHER);
//        FeatureUtils.register(new ResourceLocation(modID, "ore_iron_nether").toString(), ORE_IRON_NETHER);
//        FeatureUtils.register(new ResourceLocation(modID, "ore_lead_nether").toString(), ORE_LEAD_NETHER);
//        FeatureUtils.register(new ResourceLocation(modID, "ore_nickel_nether").toString(), ORE_NICKEL_NETHER);
//        FeatureUtils.register(new ResourceLocation(modID, "ore_copper_nether").toString(), ORE_COPPER_NETHER);
//        FeatureUtils.register(new ResourceLocation(modID, "ore_aluminum_nether").toString(), ORE_ALUMINUM_NETHER);
//        FeatureUtils.register(new ResourceLocation(modID, "ore_tin_nether").toString(), ORE_TIN_NETHER);
//        FeatureUtils.register(new ResourceLocation(modID, "ore_osmium_nether").toString(), ORE_OSMIUM_NETHER);
//        FeatureUtils.register(new ResourceLocation(modID, "ore_uranium_nether").toString(), ORE_URANIUM_NETHER);
//        FeatureUtils.register(new ResourceLocation(modID, "ore_zinc_nether").toString(), ORE_ZINC_NETHER);
//    }
}
