package net.mcs3.basicnetherores.data.worldgen;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

import static net.mcs3.basicnetherores.init.BNOPlacedFeatures.*;

public class BiomeModifierGenerator {

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        HolderGetter<Biome> biomeGetter = context.lookup(Registries.BIOME);
        HolderGetter<PlacedFeature> placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        HolderSet<Biome> netherBiomes = biomeGetter.getOrThrow(BiomeTags.IS_NETHER);

        registerOreModifier(context, placedFeatures, ORE_EMERALD_PLACED_FEATURE, netherBiomes);
    }

    private static void registerOreModifier(BootstapContext<BiomeModifier> context, HolderGetter<PlacedFeature> placedFeatures, ResourceKey<PlacedFeature> key, HolderSet<Biome> biomes) {
        ForgeBiomeModifiers.AddFeaturesBiomeModifier modifier = new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes, HolderSet.direct(placedFeatures.getOrThrow(key)), GenerationStep.Decoration.UNDERGROUND_ORES);
        context.register(ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(key.location() + "_generation")), modifier);
    }

}
