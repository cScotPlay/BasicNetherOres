package com.cscot.basicnetherores.data.worldgen;

import com.cscot.basicnetherores.BasicNetherOres;
import com.cscot.basicnetherores.config.OreGenerationConfig;
import com.cscot.basicnetherores.world.level.block.ModBlocks;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;


public class ModOreFeatures
{
    public static String modID = BasicNetherOres.modid;

    public static ConfiguredFeature<?, ?> ORE_EMERALD_NETHER = Feature.ORE
            .configured(new OreConfiguration(
                    OreConfiguration.Predicates.NETHERRACK, ModBlocks.NETHER_EMERALD_ORE.get().defaultBlockState(),
                    OreGenerationConfig.emeraldVeinSize.get()))
            .rangeUniform(VerticalAnchor.absolute(OreGenerationConfig.emeraldMinHeight.get()),VerticalAnchor.absolute(OreGenerationConfig.emeraldMaxHeight.get()))
            .squared()
            .count(OreGenerationConfig.emeraldPerChunk.get());

    public static ConfiguredFeature<?, ?> ORE_DIAMOND_NETHER = Feature.ORE
            .configured(new OreConfiguration(
                    OreConfiguration.Predicates.NETHERRACK, ModBlocks.NETHER_DIAMOND_ORE.get().defaultBlockState(),
                    OreGenerationConfig.diamondVeinSize.get()))
            .rangeUniform(VerticalAnchor.absolute(OreGenerationConfig.diamondMinHeight.get()),VerticalAnchor.absolute(OreGenerationConfig.diamondMaxHeight.get()))
            .squared()
            .count(OreGenerationConfig.diamondPerChunk.get());


    public static ConfiguredFeature<?, ?> ORE_REDSTONE_NETHER = Feature.ORE
            .configured(new OreConfiguration(
                    OreConfiguration.Predicates.NETHERRACK, ModBlocks.NETHER_REDSTONE_ORE.get().defaultBlockState(),
                    OreGenerationConfig.redstoneVeinSize.get()))
            .rangeUniform(VerticalAnchor.absolute(OreGenerationConfig.redstoneMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.redstoneMaxHeight.get()))
            .squared()
            .count(OreGenerationConfig.redstonePerChunk.get());

    public static ConfiguredFeature<?, ?> ORE_LAPIS_NETHER = Feature.ORE
            .configured(new OreConfiguration(
                    OreConfiguration.Predicates.NETHERRACK, ModBlocks.NETHER_LAPIS_ORE.get().defaultBlockState(),
                    OreGenerationConfig.lapisVeinSize.get()))
            .rangeUniform(VerticalAnchor.absolute(OreGenerationConfig.lapisMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.lapisMaxHeight.get()))
            .squared()
            .count(OreGenerationConfig.lapisPerChunk.get());

    public static ConfiguredFeature<?, ?> ORE_COAL_NETHER = Feature.ORE
            .configured(new OreConfiguration(
                    OreConfiguration.Predicates.NETHERRACK, ModBlocks.NETHER_COAL_ORE.get().defaultBlockState(),
                    OreGenerationConfig.coalVeinSize.get()))
            .rangeUniform(VerticalAnchor.absolute(OreGenerationConfig.coalMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.coalMaxHeight.get()))
            .squared()
            .count(OreGenerationConfig.coalPerChunk.get());

    public static ConfiguredFeature<?, ?> ORE_SILVER_NETHER = Feature.ORE
            .configured(new OreConfiguration(
                    OreConfiguration.Predicates.NETHERRACK, ModBlocks.NETHER_SILVER_ORE.get().defaultBlockState(),
                    OreGenerationConfig.silverVeinSize.get()))
            .rangeUniform(VerticalAnchor.absolute(OreGenerationConfig.silverMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.silverMaxHeight.get()))
            .squared()
            .count(OreGenerationConfig.silverPerChunk.get());

    public static ConfiguredFeature<?, ?> ORE_IRON_NETHER = Feature.ORE
            .configured(new OreConfiguration(
                    OreConfiguration.Predicates.NETHERRACK, ModBlocks.NETHER_IRON_ORE.get().defaultBlockState(),
                    OreGenerationConfig.ironVeinSize.get()))
            .rangeUniform(VerticalAnchor.absolute(OreGenerationConfig.ironMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.ironMaxHeight.get()))
            .squared().count(OreGenerationConfig.ironPerChunk.get());

    public static ConfiguredFeature<?, ?> ORE_LEAD_NETHER = Feature.ORE
            .configured(new OreConfiguration(
                    OreConfiguration.Predicates.NETHERRACK, ModBlocks.NETHER_LEAD_ORE.get().defaultBlockState(),
                    OreGenerationConfig.leadVeinSize.get()))
            .rangeUniform(VerticalAnchor.absolute(OreGenerationConfig.leadMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.leadMaxHeight.get()))
            .squared()
            .count(OreGenerationConfig.leadPerChunk.get());

    public static ConfiguredFeature<?, ?> ORE_NICKEL_NETHER = Feature.ORE
            .configured(new OreConfiguration(
                    OreConfiguration.Predicates.NETHERRACK, ModBlocks.NETHER_NICKEL_ORE.get().defaultBlockState(),
                    OreGenerationConfig.nickelVeinSize.get()))
            .rangeUniform(VerticalAnchor.absolute(OreGenerationConfig.nickelMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.nickelMaxHeight.get()))
            .squared()
            .count(OreGenerationConfig.nickelPerChunk.get());
    
    public static ConfiguredFeature<?, ?> ORE_COPPER_NETHER = Feature.ORE
            .configured(new OreConfiguration(
                    OreConfiguration.Predicates.NETHERRACK, ModBlocks.NETHER_COAL_ORE.get().defaultBlockState(),
                    OreGenerationConfig.copperVeinSize.get()))
            .rangeUniform(VerticalAnchor.absolute(OreGenerationConfig.copperMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.copperMaxHeight.get()))
            .squared()
            .count(OreGenerationConfig.copperPerChunk.get());

    public static ConfiguredFeature<?, ?> ORE_ALUMINUM_NETHER = Feature.ORE
            .configured(new OreConfiguration(
                    OreConfiguration.Predicates.NETHERRACK, ModBlocks.NETHER_ALUMINUM_ORE.get().defaultBlockState(),
                    OreGenerationConfig.aluminumVeinSize.get()))
            .rangeUniform(VerticalAnchor.absolute(OreGenerationConfig.aluminumMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.aluminumMaxHeight.get()))
            .squared()
            .count(OreGenerationConfig.aluminumPerChunk.get());

    public static ConfiguredFeature<?, ?> ORE_TIN_NETHER = Feature.ORE
            .configured(new OreConfiguration(
                    OreConfiguration.Predicates.NETHERRACK, ModBlocks.NETHER_TIN_ORE.get().defaultBlockState(),
                    OreGenerationConfig.tinVeinSize.get()))
            .rangeUniform(VerticalAnchor.absolute(OreGenerationConfig.tinMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.tinMaxHeight.get()))
            .squared()
            .count(OreGenerationConfig.tinPerChunk.get());

    public static ConfiguredFeature<?, ?> ORE_OSMIUM_NETHER = Feature.ORE
            .configured(new OreConfiguration(
                    OreConfiguration.Predicates.NETHERRACK, ModBlocks.NETHER_OSMIUM_ORE.get().defaultBlockState(),
                    OreGenerationConfig.osmiumVeinSize.get()))
            .rangeUniform(VerticalAnchor.absolute(OreGenerationConfig.osmiumMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.osmiumMaxHeight.get()))
            .squared()
            .count(OreGenerationConfig.osmiumPerChunk.get());

    public static ConfiguredFeature<?, ?> ORE_URANIUM_NETHER = Feature.ORE
            .configured(new OreConfiguration(
                    OreConfiguration.Predicates.NETHERRACK, ModBlocks.NETHER_URANIUM_ORE.get().defaultBlockState(),
                    OreGenerationConfig.uraniumVeinSize.get()))
            .rangeUniform(VerticalAnchor.absolute(OreGenerationConfig.uraniumMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.uraniumMaxHeight.get()))
            .squared()
            .count(OreGenerationConfig.uraniumPerChunk.get());


    public static void initModFeatures ()
    {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_emerald_nether"), ORE_EMERALD_NETHER);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_diamond_nether"), ORE_DIAMOND_NETHER);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_redstone_nether"), ORE_REDSTONE_NETHER);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_lapis_nether"), ORE_LAPIS_NETHER);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_coal_nether"), ORE_COAL_NETHER);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_silver_nether"), ORE_SILVER_NETHER);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_iron_nether"), ORE_IRON_NETHER);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_lead_nether"), ORE_LEAD_NETHER);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_nickel_nether"), ORE_NICKEL_NETHER);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_copper_nether"), ORE_COPPER_NETHER);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_aluminum_nether"), ORE_ALUMINUM_NETHER);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_tin_nether"), ORE_TIN_NETHER);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_osmium_nether"), ORE_OSMIUM_NETHER);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_uranium_nether"), ORE_URANIUM_NETHER);
    }
}
