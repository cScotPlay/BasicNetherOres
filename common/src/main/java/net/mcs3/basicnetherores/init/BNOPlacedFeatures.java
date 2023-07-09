package net.mcs3.basicnetherores.init;


import net.mcs3.basicnetherores.util.helper.OreTextHelper;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

import static net.mcs3.basicnetherores.util.helper.ResourceLocationHelper.prefix;

public class BNOPlacedFeatures {

    public static final ResourceKey<PlacedFeature> ORE_EMERALD_PLACED_FEATURE = createKey("ore_emerald_nether");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> holderGetter = context.lookup(Registries.CONFIGURED_FEATURE);

        Holder.Reference<ConfiguredFeature<?, ?>> holderEmerald = holderGetter.getOrThrow(BNOConfiguredFeatures.ORE_EMERALD_CONFIGURED_FEATURE);

        register(context, ORE_EMERALD_PLACED_FEATURE, holderEmerald,
                commonOrePlacement(OreTextHelper.emeraldPerChunk,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(OreTextHelper.emeraldMinHeight), VerticalAnchor.absolute(OreTextHelper.emeraldMaxHeight))));

    }

    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }


    private static ResourceKey<PlacedFeature> createKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, prefix(name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }

    public static void initialize() {};
}
