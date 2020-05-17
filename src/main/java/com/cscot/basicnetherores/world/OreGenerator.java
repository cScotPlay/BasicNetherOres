package com.cscot.basicnetherores.world;

import com.cscot.basicnetherores.config.OreGenerationConfig;
import com.cscot.basicnetherores.lists.BlockOreList;
import com.google.common.base.Predicate;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.registries.ForgeRegistries;


import static net.minecraft.world.gen.feature.OreFeatureConfig.FillerBlockType.NETHERRACK;
import static net.minecraft.world.gen.placement.Placement.COUNT_RANGE;

public class OreGenerator
{
    private static final Predicate<BlockState> IS_NETHERRACK = state -> state.getBlock() == Blocks.NETHERRACK;

    public static void setupOreGenerator()
    {
        for(Biome biome : ForgeRegistries.BIOMES) {

            if (biome == Biomes.NETHER) {

                if (OreGenerationConfig.emeraldGeneration.get()) {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                            new OreFeatureConfig(NETHERRACK, BlockOreList.netheremerald_ore.getDefaultState(), OreGenerationConfig.emeraldVeinSize.get())).withPlacement(Placement.COUNT_RANGE.configure(
                            new CountRangeConfig(OreGenerationConfig.emeraldPerChunk.get(), OreGenerationConfig.emeraldMinHeight.get(), 0, OreGenerationConfig.emeraldMaxHeight.get()))));
                }

                if (OreGenerationConfig.diamondGeneration.get()) {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                            new OreFeatureConfig(NETHERRACK, BlockOreList.netherdiamond_ore.getDefaultState(), OreGenerationConfig.diamondVeinSize.get())).withPlacement(Placement.COUNT_RANGE.configure(
                            new CountRangeConfig(OreGenerationConfig.diamondPerChunk.get(), OreGenerationConfig.diamondMinHeight.get(), 0, OreGenerationConfig.diamondMaxHeight.get()))));
                }

                if (OreGenerationConfig.redstoneGeneration.get()) {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                            new OreFeatureConfig(NETHERRACK, BlockOreList.netherredstone_ore.getDefaultState(), OreGenerationConfig.redstoneVeinSize.get())).withPlacement(Placement.COUNT_RANGE.configure(
                            new CountRangeConfig(OreGenerationConfig.redstonePerChunk.get(), OreGenerationConfig.redstoneMinHeight.get(), 0, OreGenerationConfig.redstoneMaxHeight.get()))));
                }

                if (OreGenerationConfig.lapisGeneration.get()) {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                            new OreFeatureConfig(NETHERRACK, BlockOreList.netherlapis_ore.getDefaultState(), OreGenerationConfig.lapisVeinSize.get())).withPlacement(Placement.COUNT_RANGE.configure(
                            new CountRangeConfig(OreGenerationConfig.lapisPerChunk.get(), OreGenerationConfig.lapisMinHeight.get(), 0, OreGenerationConfig.lapisMaxHeight.get()))));
                }

                if (OreGenerationConfig.coalGeneration.get()) {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                            new OreFeatureConfig(NETHERRACK, BlockOreList.nethercoal_ore.getDefaultState(), OreGenerationConfig.coalVeinSize.get())).withPlacement(Placement.COUNT_RANGE.configure(
                            new CountRangeConfig(OreGenerationConfig.coalPerChunk.get(), OreGenerationConfig.coalMinHeight.get(), 0, OreGenerationConfig.coalMaxHeight.get()))));
                }

                if (OreGenerationConfig.goldGeneration.get()) {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                            new OreFeatureConfig(NETHERRACK, BlockOreList.nethergold_ore.getDefaultState(), OreGenerationConfig.goldVeinSize.get())).withPlacement(Placement.COUNT_RANGE.configure(
                            new CountRangeConfig(OreGenerationConfig.goldPerChunk.get(), OreGenerationConfig.goldMinHeight.get(), 0, OreGenerationConfig.goldMaxHeight.get()))));
                }

                if (OreGenerationConfig.silverGeneration.get()) {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                            new OreFeatureConfig(NETHERRACK, BlockOreList.nethersilver_ore.getDefaultState(), OreGenerationConfig.silverVeinSize.get())).withPlacement(Placement.COUNT_RANGE.configure(
                            new CountRangeConfig(OreGenerationConfig.silverPerChunk.get(), OreGenerationConfig.silverMinHeight.get(), 0, OreGenerationConfig.silverMaxHeight.get()))));
                }

                if (OreGenerationConfig.ironGeneration.get()) {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                            new OreFeatureConfig(NETHERRACK, BlockOreList.netheriron_ore.getDefaultState(), OreGenerationConfig.ironVeinSize.get())).withPlacement(Placement.COUNT_RANGE.configure(
                            new CountRangeConfig(OreGenerationConfig.ironPerChunk.get(), OreGenerationConfig.ironMinHeight.get(), 0, OreGenerationConfig.ironMaxHeight.get()))));
                }

                if (OreGenerationConfig.leadGeneration.get()) {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                            new OreFeatureConfig(NETHERRACK, BlockOreList.netherlead_ore.getDefaultState(), OreGenerationConfig.leadVeinSize.get())).withPlacement(Placement.COUNT_RANGE.configure(
                            new CountRangeConfig(OreGenerationConfig.leadPerChunk.get(), OreGenerationConfig.leadMinHeight.get(), 0, OreGenerationConfig.leadMaxHeight.get()))));
                }

                if (OreGenerationConfig.nickelGeneration.get()) {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                            new OreFeatureConfig(NETHERRACK, BlockOreList.nethernickel_ore.getDefaultState(), OreGenerationConfig.nickelVeinSize.get())).withPlacement(Placement.COUNT_RANGE.configure(
                            new CountRangeConfig(OreGenerationConfig.nickelPerChunk.get(), OreGenerationConfig.nickelMinHeight.get(), 0, OreGenerationConfig.nickelMaxHeight.get()))));
                }

                if (OreGenerationConfig.copperGeneration.get()) {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                            new OreFeatureConfig(NETHERRACK, BlockOreList.nethercopper_ore.getDefaultState(), OreGenerationConfig.copperVeinSize.get())).withPlacement(Placement.COUNT_RANGE.configure(
                            new CountRangeConfig(OreGenerationConfig.copperPerChunk.get(), OreGenerationConfig.copperMinHeight.get(), 0, OreGenerationConfig.copperMaxHeight.get()))));
                }

                if (OreGenerationConfig.aluminumGeneration.get()) {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                            new OreFeatureConfig(NETHERRACK, BlockOreList.netheraluminum_ore.getDefaultState(), OreGenerationConfig.aluminumVeinSize.get())).withPlacement(Placement.COUNT_RANGE.configure(
                            new CountRangeConfig(OreGenerationConfig.aluminumPerChunk.get(), OreGenerationConfig.aluminumMinHeight.get(), 0, OreGenerationConfig.aluminumMaxHeight.get()))));
                }

                if (OreGenerationConfig.tinGeneration.get()) {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                            new OreFeatureConfig(NETHERRACK, BlockOreList.nethertin_ore.getDefaultState(), OreGenerationConfig.tinVeinSize.get())).withPlacement(Placement.COUNT_RANGE.configure(
                            new CountRangeConfig(OreGenerationConfig.tinPerChunk.get(), OreGenerationConfig.tinMinHeight.get(), 0, OreGenerationConfig.tinMaxHeight.get()))));
                }

                if (OreGenerationConfig.uraniumGeneration.get()) {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                            new OreFeatureConfig(NETHERRACK, BlockOreList.netheruranium_ore.getDefaultState(), OreGenerationConfig.uraniumVeinSize.get())).withPlacement(Placement.COUNT_RANGE.configure(
                            new CountRangeConfig(OreGenerationConfig.uraniumPerChunk.get(), OreGenerationConfig.uraniumMinHeight.get(), 0, OreGenerationConfig.uraniumMaxHeight.get()))));
                }
            }
        }
    }
}
