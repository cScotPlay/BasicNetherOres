package net.mcs3.basicnetherores.worldgen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.ModificationPhase;
import net.mcs3.basicnetherores.helpers.FabricBiomeChecker;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.io.File;

import static net.mcs3.basicnetherores.util.helper.ResourceLocationHelper.prefix;

public class BNOFabricBiomeModifiers {

    public void biomeModificationHelper() {

        var modifications = BiomeModifications.create(prefix("biome_modifications"));
        modifications.add(ModificationPhase.ADDITIONS, biomeSelectionContext -> true, (biomeSelectionContext, builder) -> {
            Holder<Biome> biome = biomeSelectionContext.getBiomeRegistryEntry();

            if (biome.is(BiomeTags.IS_NETHER)) {
                if(FabricBiomeChecker.checkPlacedFeature("ore_emerald_nether")){
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_emerald_nether"));
                }
//                if(FabricBiomeChecker.checkPlacedFeature("ore_diamond_nether")){
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_diamond_nether"));
//                }
//                if(FabricBiomeChecker.checkPlacedFeature("ore_redstone_nether")){
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_redstone_nether"));
//                }
//                if(FabricBiomeChecker.checkPlacedFeature("ore_lapis_nether")){
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_lapis_nether"));
//                }
//                if(FabricBiomeChecker.checkPlacedFeature("ore_coal_nether")){
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_coal_nether"));
//                }
//                if(FabricBiomeChecker.checkPlacedFeature("ore_silver_nether")){
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_silver_nether"));
//                }
//                if(FabricBiomeChecker.checkPlacedFeature("ore_iron_nether")){
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_iron_nether"));
//                }
//                if(FabricBiomeChecker.checkPlacedFeature("ore_lead_nether")){
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_lead_nether"));
//                }
//                if(FabricBiomeChecker.checkPlacedFeature("ore_nickel_nether")){
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_nickel_nether"));
//                }
//                if(FabricBiomeChecker.checkPlacedFeature("ore_copper_nether")){
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_copper_nether"));
//                }
//                if(FabricBiomeChecker.checkPlacedFeature("ore_aluminum_nether")){
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_aluminum_nether"));
//                }
//                if(FabricBiomeChecker.checkPlacedFeature("ore_tin_nether")){
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_tin_nether"));
//                }
//                if(FabricBiomeChecker.checkPlacedFeature("ore_osmium_nether")){
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_osmium_nether"));
//                }
//                if(FabricBiomeChecker.checkPlacedFeature("ore_uranium_nether")){
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_uranium_nether"));
//                }
//                if(FabricBiomeChecker.checkPlacedFeature("ore_zinc_nether")){
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_zinc_nether"));
//                }
            }
        });
    }

    private ResourceKey<PlacedFeature> getPlacedFeatureKey(String key) {
        return ResourceKey.create(Registries.PLACED_FEATURE, prefix(key));
    }
}
