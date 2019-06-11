package com.cscot.basicnetherores.world;

import com.cscot.basicnetherores.config.OreGenerationConfig;
import com.cscot.basicnetherores.lists.BlockOreList;
import com.google.common.base.Predicate;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraftforge.registries.ForgeRegistries;


import static net.minecraft.world.gen.feature.OreFeatureConfig.FillerBlockType.NETHERRACK;
import static net.minecraft.world.gen.placement.Placement.COUNT_RANGE;

public class OreGenerator
{
    private static final Predicate<BlockState> IS_NETHERRACK = state -> state.getBlock() == Blocks.NETHERRACK;

    public static void setupOreGenerator()
    {
        for(Biome biome : ForgeRegistries.BIOMES)
        {
            //This may need to use the new OreFeature to pull the feature instead of the DimensionalGenerator???

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE,
                    new OreFeatureConfig(NETHERRACK, BlockOreList.netheremerald_ore.getDefaultState(), OreGenerationConfig.emeraldVeinSize.get()),
                    COUNT_RANGE, new CountRangeConfig(OreGenerationConfig.emeraldPerChunk.get(), OreGenerationConfig.emeraldMinHeight.get(), OreGenerationConfig.emeraldMinHeight.get(), OreGenerationConfig.emeraldMaxHeight.get())));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE,
                    new OreFeatureConfig(NETHERRACK, BlockOreList.netherdiamond_ore.getDefaultState(), OreGenerationConfig.diamondVeinSize.get()),
                    COUNT_RANGE, new CountRangeConfig(OreGenerationConfig.diamondPerChunk.get(), OreGenerationConfig.diamondMinHeight.get(), OreGenerationConfig.diamondMinHeight.get(), OreGenerationConfig.diamondMaxHeight.get())));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE,
                    new OreFeatureConfig(NETHERRACK, BlockOreList.netherredstone_ore.getDefaultState(), OreGenerationConfig.redstoneVeinSize.get()),
                    COUNT_RANGE, new CountRangeConfig(OreGenerationConfig.redstonePerChunk.get(), OreGenerationConfig.redstoneMinHeight.get(), OreGenerationConfig.redstoneMinHeight.get(), OreGenerationConfig.redstoneMaxHeight.get())));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE,
                    new OreFeatureConfig(NETHERRACK, BlockOreList.netherlapis_ore.getDefaultState(), OreGenerationConfig.lapisVeinSize.get()),
                    COUNT_RANGE, new CountRangeConfig(OreGenerationConfig.lapisPerChunk.get(), OreGenerationConfig.lapisMinHeight.get(), OreGenerationConfig.lapisMinHeight.get(), OreGenerationConfig.lapisMaxHeight.get())));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE,
                    new OreFeatureConfig(NETHERRACK, BlockOreList.nethercoal_ore.getDefaultState(), OreGenerationConfig.coalVeinSize.get()),
                    COUNT_RANGE, new CountRangeConfig(OreGenerationConfig.coalPerChunk.get(), OreGenerationConfig.coalMinHeight.get(), OreGenerationConfig.coalMinHeight.get(), OreGenerationConfig.coalMaxHeight.get())));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE,
                    new OreFeatureConfig(NETHERRACK, BlockOreList.nethergold_ore.getDefaultState(), OreGenerationConfig.goldVeinSize.get()),
                    COUNT_RANGE, new CountRangeConfig(OreGenerationConfig.goldPerChunk.get(), OreGenerationConfig.goldMinHeight.get(), OreGenerationConfig.goldMinHeight.get(), OreGenerationConfig.goldMaxHeight.get())));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE,
                    new OreFeatureConfig(NETHERRACK, BlockOreList.nethersilver_ore.getDefaultState(), OreGenerationConfig.silverVeinSize.get()),
                    COUNT_RANGE, new CountRangeConfig(OreGenerationConfig.silverPerChunk.get(), OreGenerationConfig.silverMinHeight.get(), OreGenerationConfig.silverMinHeight.get(), OreGenerationConfig.silverMaxHeight.get())));
            
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE,
                    new OreFeatureConfig(NETHERRACK, BlockOreList.netheriron_ore.getDefaultState(), OreGenerationConfig.ironVeinSize.get()),
                    COUNT_RANGE, new CountRangeConfig(OreGenerationConfig.ironPerChunk.get(), OreGenerationConfig.ironMinHeight.get(), OreGenerationConfig.ironMinHeight.get(), OreGenerationConfig.ironMaxHeight.get())));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE,
                new OreFeatureConfig(NETHERRACK, BlockOreList.netherlead_ore.getDefaultState(), OreGenerationConfig.leadVeinSize.get()),
                COUNT_RANGE, new CountRangeConfig(OreGenerationConfig.leadPerChunk.get(), OreGenerationConfig.leadMinHeight.get(), OreGenerationConfig.leadMinHeight.get(), OreGenerationConfig.leadMaxHeight.get())));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE,
                    new OreFeatureConfig(NETHERRACK, BlockOreList.nethernickel_ore.getDefaultState(), OreGenerationConfig.nickelVeinSize.get()),
                    COUNT_RANGE, new CountRangeConfig(OreGenerationConfig.nickelPerChunk.get(), OreGenerationConfig.nickelMinHeight.get(), OreGenerationConfig.nickelMinHeight.get(), OreGenerationConfig.nickelMaxHeight.get())));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE,
                    new OreFeatureConfig(NETHERRACK, BlockOreList.nethercopper_ore.getDefaultState(), OreGenerationConfig.copperVeinSize.get()),
                    COUNT_RANGE, new CountRangeConfig(OreGenerationConfig.copperPerChunk.get(), OreGenerationConfig.copperMinHeight.get(), OreGenerationConfig.copperMinHeight.get(), OreGenerationConfig.copperMaxHeight.get())));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE,
                    new OreFeatureConfig(NETHERRACK, BlockOreList.netheraluminum_ore.getDefaultState(), OreGenerationConfig.aluminumVeinSize.get()),
                    COUNT_RANGE, new CountRangeConfig(OreGenerationConfig.aluminumPerChunk.get(), OreGenerationConfig.aluminumMinHeight.get(), OreGenerationConfig.aluminumMinHeight.get(), OreGenerationConfig.aluminumMaxHeight.get())));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE,
                    new OreFeatureConfig(NETHERRACK, BlockOreList.nethertin_ore.getDefaultState(), OreGenerationConfig.tinVeinSize.get()),
                    COUNT_RANGE, new CountRangeConfig(OreGenerationConfig.tinPerChunk.get(), OreGenerationConfig.tinMinHeight.get(), OreGenerationConfig.tinMinHeight.get(), OreGenerationConfig.tinMaxHeight.get())));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE,
                    new OreFeatureConfig(NETHERRACK, BlockOreList.netheruranium_ore.getDefaultState(), OreGenerationConfig.uraniumVeinSize.get()),
                    COUNT_RANGE, new CountRangeConfig(OreGenerationConfig.uraniumPerChunk.get(), OreGenerationConfig.uraniumMinHeight.get(), OreGenerationConfig.uraniumMinHeight.get(), OreGenerationConfig.uraniumMaxHeight.get())));

        }
    }
}
