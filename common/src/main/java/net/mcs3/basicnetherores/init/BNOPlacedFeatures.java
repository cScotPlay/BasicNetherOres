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
    public static final ResourceKey<PlacedFeature> ORE_DIAMOND_PLACED_FEATURE = createKey("ore_diamond_nether");
    public static final ResourceKey<PlacedFeature> ORE_REDSTONE_PLACED_FEATURE = createKey("ore_redstone_nether");
    public static final ResourceKey<PlacedFeature> ORE_LAPIS_PLACED_FEATURE = createKey("ore_lapis_nether");
    public static final ResourceKey<PlacedFeature> ORE_COAL_PLACED_FEATURE = createKey("ore_coal_nether");
    public static final ResourceKey<PlacedFeature> ORE_SILVER_PLACED_FEATURE = createKey("ore_silver_nether");
    public static final ResourceKey<PlacedFeature> ORE_IRON_PLACED_FEATURE = createKey("ore_iron_nether");
    public static final ResourceKey<PlacedFeature> ORE_LEAD_PLACED_FEATURE = createKey("ore_lead_nether");
    public static final ResourceKey<PlacedFeature> ORE_NICKEL_PLACED_FEATURE = createKey("ore_nickel_nether");
    public static final ResourceKey<PlacedFeature> ORE_COPPER_PLACED_FEATURE = createKey("ore_copper_nether");
    public static final ResourceKey<PlacedFeature> ORE_ALUMINUM_PLACED_FEATURE = createKey("ore_aluminum_nether");
    public static final ResourceKey<PlacedFeature> ORE_TIN_PLACED_FEATURE = createKey("ore_tin_nether");
    public static final ResourceKey<PlacedFeature> ORE_OSMIUM_PLACED_FEATURE = createKey("ore_osmium_nether");
    public static final ResourceKey<PlacedFeature> ORE_URANIUM_PLACED_FEATURE = createKey("ore_uranium_nether");
    public static final ResourceKey<PlacedFeature> ORE_ZINC_PLACED_FEATURE = createKey("ore_zinc_nether");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> holderGetter = context.lookup(Registries.CONFIGURED_FEATURE);

        Holder.Reference<ConfiguredFeature<?, ?>> holderEmerald = holderGetter.getOrThrow(BNOConfiguredFeatures.ORE_EMERALD_CONFIGURED_FEATURE);
        Holder.Reference<ConfiguredFeature<?, ?>> holderDiamond = holderGetter.getOrThrow(BNOConfiguredFeatures.ORE_DIAMOND_CONFIGURED_FEATURE);
        Holder.Reference<ConfiguredFeature<?, ?>> holderRedstone = holderGetter.getOrThrow(BNOConfiguredFeatures.ORE_REDSTONE_CONFIGURED_FEATURE);
        Holder.Reference<ConfiguredFeature<?, ?>> holderLapis = holderGetter.getOrThrow(BNOConfiguredFeatures.ORE_LAPIS_CONFIGURED_FEATURE);
        Holder.Reference<ConfiguredFeature<?, ?>> holderCoal = holderGetter.getOrThrow(BNOConfiguredFeatures.ORE_COAL_CONFIGURED_FEATURE);
        Holder.Reference<ConfiguredFeature<?, ?>> holderSilver = holderGetter.getOrThrow(BNOConfiguredFeatures.ORE_SILVER_CONFIGURED_FEATURE);
        Holder.Reference<ConfiguredFeature<?, ?>> holderIron = holderGetter.getOrThrow(BNOConfiguredFeatures.ORE_IRON_CONFIGURED_FEATURE);
        Holder.Reference<ConfiguredFeature<?, ?>> holderLead = holderGetter.getOrThrow(BNOConfiguredFeatures.ORE_LEAD_CONFIGURED_FEATURE);
        Holder.Reference<ConfiguredFeature<?, ?>> holderNickel = holderGetter.getOrThrow(BNOConfiguredFeatures.ORE_NICKEL_CONFIGURED_FEATURE);
        Holder.Reference<ConfiguredFeature<?, ?>> holderCopper = holderGetter.getOrThrow(BNOConfiguredFeatures.ORE_COPPER_CONFIGURED_FEATURE);
        Holder.Reference<ConfiguredFeature<?, ?>> holderAluminum = holderGetter.getOrThrow(BNOConfiguredFeatures.ORE_ALUMINUM_CONFIGURED_FEATURE);
        Holder.Reference<ConfiguredFeature<?, ?>> holderTin = holderGetter.getOrThrow(BNOConfiguredFeatures.ORE_TIN_CONFIGURED_FEATURE);
        Holder.Reference<ConfiguredFeature<?, ?>> holderOsmium = holderGetter.getOrThrow(BNOConfiguredFeatures.ORE_OSMIUM_CONFIGURED_FEATURE);
        Holder.Reference<ConfiguredFeature<?, ?>> holderUranium = holderGetter.getOrThrow(BNOConfiguredFeatures.ORE_URANIUM_CONFIGURED_FEATURE);
        Holder.Reference<ConfiguredFeature<?, ?>> holderZinc = holderGetter.getOrThrow(BNOConfiguredFeatures.ORE_ZINC_CONFIGURED_FEATURE);

        register(context, ORE_EMERALD_PLACED_FEATURE, holderEmerald,
                commonOrePlacement(OreTextHelper.emeraldPerChunk,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(OreTextHelper.emeraldMinHeight), VerticalAnchor.absolute(OreTextHelper.emeraldMaxHeight))));

        register(context, ORE_DIAMOND_PLACED_FEATURE, holderDiamond,
                commonOrePlacement(OreTextHelper.diamondPerChunk,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(OreTextHelper.diamondMinHeight), VerticalAnchor.absolute(OreTextHelper.diamondMaxHeight))));

        register(context, ORE_REDSTONE_PLACED_FEATURE, holderRedstone,
                commonOrePlacement(OreTextHelper.redstonePerChunk,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(OreTextHelper.redstoneMinHeight), VerticalAnchor.absolute(OreTextHelper.redstoneMaxHeight))));

        register(context, ORE_LAPIS_PLACED_FEATURE, holderLapis,
                commonOrePlacement(OreTextHelper.lapisPerChunk,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(OreTextHelper.lapisMinHeight), VerticalAnchor.absolute(OreTextHelper.lapisMaxHeight))));

        register(context, ORE_COAL_PLACED_FEATURE, holderCoal,
                commonOrePlacement(OreTextHelper.coalPerChunk,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(OreTextHelper.coalMinHeight), VerticalAnchor.absolute(OreTextHelper.coalMaxHeight))));

        register(context, ORE_SILVER_PLACED_FEATURE, holderSilver,
                commonOrePlacement(OreTextHelper.silverPerChunk,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(OreTextHelper.silverMinHeight), VerticalAnchor.absolute(OreTextHelper.silverMaxHeight))));

        register(context, ORE_IRON_PLACED_FEATURE, holderIron,
                commonOrePlacement(OreTextHelper.ironPerChunk,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(OreTextHelper.ironMinHeight), VerticalAnchor.absolute(OreTextHelper.ironMaxHeight))));

        register(context, ORE_LEAD_PLACED_FEATURE, holderLead,
                commonOrePlacement(OreTextHelper.leadPerChunk,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(OreTextHelper.leadMinHeight), VerticalAnchor.absolute(OreTextHelper.leadMaxHeight))));

        register(context, ORE_NICKEL_PLACED_FEATURE, holderNickel,
                commonOrePlacement(OreTextHelper.nickelPerChunk,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(OreTextHelper.nickelMinHeight), VerticalAnchor.absolute(OreTextHelper.nickelMaxHeight))));

        register(context, ORE_COPPER_PLACED_FEATURE, holderCopper,
                commonOrePlacement(OreTextHelper.copperPerChunk,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(OreTextHelper.copperMinHeight), VerticalAnchor.absolute(OreTextHelper.copperMaxHeight))));

        register(context, ORE_ALUMINUM_PLACED_FEATURE, holderAluminum,
                commonOrePlacement(OreTextHelper.aluminumPerChunk,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(OreTextHelper.aluminumMinHeight), VerticalAnchor.absolute(OreTextHelper.aluminumMaxHeight))));

        register(context, ORE_TIN_PLACED_FEATURE, holderTin,
                commonOrePlacement(OreTextHelper.tinPerChunk,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(OreTextHelper.tinMinHeight), VerticalAnchor.absolute(OreTextHelper.tinMaxHeight))));

        register(context, ORE_OSMIUM_PLACED_FEATURE, holderOsmium,
                commonOrePlacement(OreTextHelper.osmiumPerChunk,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(OreTextHelper.osmiumMinHeight), VerticalAnchor.absolute(OreTextHelper.osmiumMaxHeight))));

        register(context, ORE_URANIUM_PLACED_FEATURE, holderUranium,
                commonOrePlacement(OreTextHelper.uraniumPerChunk,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(OreTextHelper.uraniumMinHeight), VerticalAnchor.absolute(OreTextHelper.uraniumMaxHeight))));

        register(context, ORE_ZINC_PLACED_FEATURE, holderZinc,
                commonOrePlacement(OreTextHelper.zincPerChunk,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(OreTextHelper.zincMinHeight), VerticalAnchor.absolute(OreTextHelper.zincMaxHeight))));
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

    public static void initialize() {};
}
