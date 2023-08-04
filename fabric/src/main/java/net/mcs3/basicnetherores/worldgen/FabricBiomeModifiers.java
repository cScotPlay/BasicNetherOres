package net.mcs3.basicnetherores.worldgen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.ModificationPhase;
import net.mcs3.basicnetherores.config.BasicNetherOresConfig;
import net.mcs3.basicnetherores.helpers.FabricBiomeChecker;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import static net.mcs3.basicnetherores.util.helper.ResourceLocationHelper.prefix;

public class FabricBiomeModifiers {

    public void biomeModificationHelper() {

        var modifications = BiomeModifications.create(prefix("biome_modifications"));
        modifications.add(ModificationPhase.ADDITIONS, biomeSelectionContext -> true, (biomeSelectionContext, builder) -> {
            Holder<Biome> biome = biomeSelectionContext.getBiomeRegistryEntry();

            if (biome.is(BiomeTags.IS_NETHER)) {
                if(BasicNetherOresConfig.common().emeraldGeneration()) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_emerald_nether"));
                }
                if(BasicNetherOresConfig.common().diamondGeneration()){
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_diamond_nether"));
                }
                if(BasicNetherOresConfig.common().redstoneGeneration()){
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_redstone_nether"));
                }
                if(BasicNetherOresConfig.common().lapisGeneration()) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_lapis_nether"));
                }
                if(BasicNetherOresConfig.common().coalGeneration()) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_coal_nether"));
                }
                if (BasicNetherOresConfig.common().silverGeneration()){
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_silver_nether"));
                }
                if(BasicNetherOresConfig.common().ironGeneration()) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_iron_nether"));
                }
                if(BasicNetherOresConfig.common().leadGeneration()) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_lead_nether"));
                }
                if(BasicNetherOresConfig.common().nickelGeneration()) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_nickel_nether"));
                }
                if(BasicNetherOresConfig.common().copperGeneration()) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_copper_nether"));
                }
                if(BasicNetherOresConfig.common().aluminumGeneration()) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_aluminum_nether"));
                }
                if(BasicNetherOresConfig.common().tinGeneration()) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_tin_nether"));
                }
                if(BasicNetherOresConfig.common().osmiumGeneration()) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_osmium_nether"));
                }
                if(BasicNetherOresConfig.common().uraniumGeneration()) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_uranium_nether"));
                }
                if(BasicNetherOresConfig.common().zincGeneration()) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_zinc_nether"));
                }
            }
        });
    }

    private ResourceKey<PlacedFeature> getPlacedFeatureKey(String key) {
        return ResourceKey.create(Registries.PLACED_FEATURE, prefix(key));
    }
}
