package com.cscot.basicnetherores.world;

import com.cscot.basicnetherores.config.OreGenerationConfig;
import com.cscot.basicnetherores.lists.BlockOreList;
import com.google.common.base.Predicate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.MinableConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraftforge.registries.ForgeRegistries;


import static net.minecraft.world.biome.Biome.COUNT_RANGE;

public class OreGenerator
{
    private static final Predicate<IBlockState> IS_NETHERRACK = state -> state.getBlock() == Blocks.NETHERRACK;

    public static void setupOreGenerator()
    {
        for(Biome biome : ForgeRegistries.BIOMES)
        {

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, new DimensionalGenerator<>(Feature.MINABLE,
                    new MinableConfig(IS_NETHERRACK, BlockOreList.netheremerald_ore.getDefaultState(), OreGenerationConfig.emeraldVeinSize.get()),
                    COUNT_RANGE, new CountRangeConfig(OreGenerationConfig.emeraldPerChunk.get(), OreGenerationConfig.emeraldMinHeight.get(), OreGenerationConfig.emeraldMinHeight.get(), OreGenerationConfig.emeraldMaxHeight.get()), DimensionType.NETHER));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, new DimensionalGenerator<>(Feature.MINABLE,
                    new MinableConfig(IS_NETHERRACK, BlockOreList.netherdiamond_ore.getDefaultState(), OreGenerationConfig.diamondVeinSize.get()),
                    COUNT_RANGE, new CountRangeConfig(OreGenerationConfig.diamondPerChunk.get(), OreGenerationConfig.diamondMinHeight.get(), OreGenerationConfig.diamondMinHeight.get(), OreGenerationConfig.diamondMaxHeight.get()), DimensionType.NETHER));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, new DimensionalGenerator<>(Feature.MINABLE,
                    new MinableConfig(IS_NETHERRACK, BlockOreList.netherredstone_ore.getDefaultState(), OreGenerationConfig.redstoneVeinSize.get()),
                    COUNT_RANGE, new CountRangeConfig(OreGenerationConfig.redstonePerChunk.get(), OreGenerationConfig.redstoneMinHeight.get(), OreGenerationConfig.redstoneMinHeight.get(), OreGenerationConfig.redstoneMaxHeight.get()), DimensionType.NETHER));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, new DimensionalGenerator<>(Feature.MINABLE,
                    new MinableConfig(IS_NETHERRACK, BlockOreList.netherlapis_ore.getDefaultState(), OreGenerationConfig.lapisVeinSize.get()),
                    COUNT_RANGE, new CountRangeConfig(OreGenerationConfig.lapisPerChunk.get(), OreGenerationConfig.lapisMinHeight.get(), OreGenerationConfig.lapisMinHeight.get(), OreGenerationConfig.lapisMaxHeight.get()), DimensionType.NETHER));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, new DimensionalGenerator<>(Feature.MINABLE,
                    new MinableConfig(IS_NETHERRACK, BlockOreList.nethercoal_ore.getDefaultState(), OreGenerationConfig.coalVeinSize.get()),
                    COUNT_RANGE, new CountRangeConfig(OreGenerationConfig.coalPerChunk.get(), OreGenerationConfig.coalMinHeight.get(), OreGenerationConfig.coalMinHeight.get(), OreGenerationConfig.coalMaxHeight.get()), DimensionType.NETHER));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, new DimensionalGenerator<>(Feature.MINABLE,
                    new MinableConfig(IS_NETHERRACK, BlockOreList.nethergold_ore.getDefaultState(), OreGenerationConfig.goldVeinSize.get()),
                    COUNT_RANGE, new CountRangeConfig(OreGenerationConfig.goldPerChunk.get(), OreGenerationConfig.goldMinHeight.get(), OreGenerationConfig.goldMinHeight.get(), OreGenerationConfig.goldMaxHeight.get()), DimensionType.NETHER));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, new DimensionalGenerator<>(Feature.MINABLE,
                    new MinableConfig(IS_NETHERRACK, BlockOreList.nethersilver_ore.getDefaultState(), OreGenerationConfig.silverVeinSize.get()),
                    COUNT_RANGE, new CountRangeConfig(OreGenerationConfig.silverPerChunk.get(), OreGenerationConfig.silverMinHeight.get(), OreGenerationConfig.silverMinHeight.get(), OreGenerationConfig.silverMaxHeight.get()), DimensionType.NETHER));
            
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, new DimensionalGenerator<>(Feature.MINABLE,
                    new MinableConfig(IS_NETHERRACK, BlockOreList.netheriron_ore.getDefaultState(), OreGenerationConfig.ironVeinSize.get()),
                    COUNT_RANGE, new CountRangeConfig(OreGenerationConfig.ironPerChunk.get(), OreGenerationConfig.ironMinHeight.get(), OreGenerationConfig.ironMinHeight.get(), OreGenerationConfig.ironMaxHeight.get()), DimensionType.NETHER));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, new DimensionalGenerator<>(Feature.MINABLE,
                new MinableConfig(IS_NETHERRACK, BlockOreList.netherlead_ore.getDefaultState(), OreGenerationConfig.leadVeinSize.get()),
                COUNT_RANGE, new CountRangeConfig(OreGenerationConfig.leadPerChunk.get(), OreGenerationConfig.leadMinHeight.get(), OreGenerationConfig.leadMinHeight.get(), OreGenerationConfig.leadMaxHeight.get()), DimensionType.NETHER));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, new DimensionalGenerator<>(Feature.MINABLE,
                    new MinableConfig(IS_NETHERRACK, BlockOreList.nethernickel_ore.getDefaultState(), OreGenerationConfig.nickelVeinSize.get()),
                    COUNT_RANGE, new CountRangeConfig(OreGenerationConfig.nickelPerChunk.get(), OreGenerationConfig.nickelMinHeight.get(), OreGenerationConfig.nickelMinHeight.get(), OreGenerationConfig.nickelMaxHeight.get()), DimensionType.NETHER));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, new DimensionalGenerator<>(Feature.MINABLE,
                    new MinableConfig(IS_NETHERRACK, BlockOreList.nethercopper_ore.getDefaultState(), OreGenerationConfig.copperVeinSize.get()),
                    COUNT_RANGE, new CountRangeConfig(OreGenerationConfig.copperPerChunk.get(), OreGenerationConfig.copperMinHeight.get(), OreGenerationConfig.copperMinHeight.get(), OreGenerationConfig.copperMaxHeight.get()), DimensionType.NETHER));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, new DimensionalGenerator<>(Feature.MINABLE,
                    new MinableConfig(IS_NETHERRACK, BlockOreList.netheraluminum_ore.getDefaultState(), OreGenerationConfig.aluminumVeinSize.get()),
                    COUNT_RANGE, new CountRangeConfig(OreGenerationConfig.aluminumPerChunk.get(), OreGenerationConfig.aluminumMinHeight.get(), OreGenerationConfig.aluminumMinHeight.get(), OreGenerationConfig.aluminumMaxHeight.get()), DimensionType.NETHER));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, new DimensionalGenerator<>(Feature.MINABLE,
                    new MinableConfig(IS_NETHERRACK, BlockOreList.nethertin_ore.getDefaultState(), OreGenerationConfig.tinVeinSize.get()),
                    COUNT_RANGE, new CountRangeConfig(OreGenerationConfig.tinPerChunk.get(), OreGenerationConfig.tinMinHeight.get(), OreGenerationConfig.tinMinHeight.get(), OreGenerationConfig.tinMaxHeight.get()), DimensionType.NETHER));

        }
    }
}
