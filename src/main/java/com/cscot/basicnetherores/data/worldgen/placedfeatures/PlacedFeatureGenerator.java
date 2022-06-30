package com.cscot.basicnetherores.data.worldgen.placedfeatures;

import com.cscot.basicnetherores.BasicNetherOres;
import com.cscot.basicnetherores.data.worldgen.ModOrePlacement;
import com.google.gson.JsonElement;
import com.mojang.serialization.JsonOps;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.RegistryAccess;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.RegistryOps;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.JsonCodecProvider;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

import java.util.Map;

import static com.cscot.basicnetherores.api.OreFeatureLists.*;

public class PlacedFeatureGenerator
{
    private static String MODID = BasicNetherOres.modid;

    public static void onGatherData(GatherDataEvent event)
    {
        final DataGenerator generator = event.getGenerator();
        final ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        final RegistryOps<JsonElement> ops = RegistryOps.create(JsonOps.INSTANCE, RegistryAccess.builtinCopy());

        final Holder<ConfiguredFeature<?,?>> configuredEmeraldFeatureHolder = ops.registry(Registry.CONFIGURED_FEATURE_REGISTRY).get().getOrCreateHolderOrThrow(ResourceKey.create(Registry.CONFIGURED_FEATURE_REGISTRY, EMERALD_ORE_KEY.location()));
        final Holder<ConfiguredFeature<?,?>> configuredDiamondFeatureHolder = ops.registry(Registry.CONFIGURED_FEATURE_REGISTRY).get().getOrCreateHolderOrThrow(ResourceKey.create(Registry.CONFIGURED_FEATURE_REGISTRY, DIAMOND_ORE_KEY.location()));
        final Holder<ConfiguredFeature<?,?>> configuredRedstoneFeatureHolder = ops.registry(Registry.CONFIGURED_FEATURE_REGISTRY).get().getOrCreateHolderOrThrow(ResourceKey.create(Registry.CONFIGURED_FEATURE_REGISTRY, REDSTONE_ORE_KEY.location()));
        final Holder<ConfiguredFeature<?,?>> configuredLapisFeatureHolder = ops.registry(Registry.CONFIGURED_FEATURE_REGISTRY).get().getOrCreateHolderOrThrow(ResourceKey.create(Registry.CONFIGURED_FEATURE_REGISTRY, LAPIS_ORE_KEY.location()));
        final Holder<ConfiguredFeature<?,?>> configuredCoalFeatureHolder = ops.registry(Registry.CONFIGURED_FEATURE_REGISTRY).get().getOrCreateHolderOrThrow(ResourceKey.create(Registry.CONFIGURED_FEATURE_REGISTRY, COAL_ORE_KEY.location()));
        final Holder<ConfiguredFeature<?,?>> configuredSilverFeatureHolder = ops.registry(Registry.CONFIGURED_FEATURE_REGISTRY).get().getOrCreateHolderOrThrow(ResourceKey.create(Registry.CONFIGURED_FEATURE_REGISTRY, SILVER_ORE_KEY.location()));
        final Holder<ConfiguredFeature<?,?>> configuredIronFeatureHolder = ops.registry(Registry.CONFIGURED_FEATURE_REGISTRY).get().getOrCreateHolderOrThrow(ResourceKey.create(Registry.CONFIGURED_FEATURE_REGISTRY, IRON_ORE_KEY.location()));
        final Holder<ConfiguredFeature<?,?>> configuredLeadFeatureHolder = ops.registry(Registry.CONFIGURED_FEATURE_REGISTRY).get().getOrCreateHolderOrThrow(ResourceKey.create(Registry.CONFIGURED_FEATURE_REGISTRY, LEAD_ORE_KEY.location()));
        final Holder<ConfiguredFeature<?,?>> configuredNickelFeatureHolder = ops.registry(Registry.CONFIGURED_FEATURE_REGISTRY).get().getOrCreateHolderOrThrow(ResourceKey.create(Registry.CONFIGURED_FEATURE_REGISTRY, NICKEL_ORE_KEY.location()));
        final Holder<ConfiguredFeature<?,?>> configuredCopperFeatureHolder = ops.registry(Registry.CONFIGURED_FEATURE_REGISTRY).get().getOrCreateHolderOrThrow(ResourceKey.create(Registry.CONFIGURED_FEATURE_REGISTRY, COPPER_ORE_KEY.location()));
        final Holder<ConfiguredFeature<?,?>> configuredAluminumFeatureHolder = ops.registry(Registry.CONFIGURED_FEATURE_REGISTRY).get().getOrCreateHolderOrThrow(ResourceKey.create(Registry.CONFIGURED_FEATURE_REGISTRY, ALUMINUM_ORE_KEY.location()));
        final Holder<ConfiguredFeature<?,?>> configuredTinFeatureHolder = ops.registry(Registry.CONFIGURED_FEATURE_REGISTRY).get().getOrCreateHolderOrThrow(ResourceKey.create(Registry.CONFIGURED_FEATURE_REGISTRY, TIN_ORE_KEY.location()));
        final Holder<ConfiguredFeature<?,?>> configuredOsmiumFeatureHolder = ops.registry(Registry.CONFIGURED_FEATURE_REGISTRY).get().getOrCreateHolderOrThrow(ResourceKey.create(Registry.CONFIGURED_FEATURE_REGISTRY, OSMIUM_ORE_KEY.location()));
        final Holder<ConfiguredFeature<?,?>> configuredUraniumFeatureHolder = ops.registry(Registry.CONFIGURED_FEATURE_REGISTRY).get().getOrCreateHolderOrThrow(ResourceKey.create(Registry.CONFIGURED_FEATURE_REGISTRY, URANIUM_ORE_KEY.location()));
        final Holder<ConfiguredFeature<?,?>> configuredZincFeatureHolder = ops.registry(Registry.CONFIGURED_FEATURE_REGISTRY).get().getOrCreateHolderOrThrow(ResourceKey.create(Registry.CONFIGURED_FEATURE_REGISTRY, ZINC_ORE_KEY.location()));

        final PlacedFeature emeraldOreFeature = new PlacedFeature(configuredEmeraldFeatureHolder, ModOrePlacement.ORE_EMERALD_PLACED_FEATURE);
        final PlacedFeature diamondOreFeature = new PlacedFeature(configuredDiamondFeatureHolder, ModOrePlacement.ORE_DIAMOND_PLACED_FEATURE);
        final PlacedFeature redstoneOreFeature = new PlacedFeature(configuredRedstoneFeatureHolder, ModOrePlacement.ORE_REDSTONE_PLACED_FEATURE);
        final PlacedFeature lapisOreFeature = new PlacedFeature(configuredLapisFeatureHolder, ModOrePlacement.ORE_LAPIS_PLACED_FEATURE);
        final PlacedFeature coalOreFeature = new PlacedFeature(configuredCoalFeatureHolder, ModOrePlacement.ORE_COAL_PLACED_FEATURE);
        final PlacedFeature silverOreFeature = new PlacedFeature(configuredSilverFeatureHolder, ModOrePlacement.ORE_SILVER_PLACED_FEATURE);
        final PlacedFeature ironOreFeature = new PlacedFeature(configuredIronFeatureHolder, ModOrePlacement.ORE_IRON_PLACED_FEATURE);
        final PlacedFeature leadOreFeature = new PlacedFeature(configuredLeadFeatureHolder, ModOrePlacement.ORE_LEAD_PLACED_FEATURE);
        final PlacedFeature nickelOreFeature = new PlacedFeature(configuredNickelFeatureHolder, ModOrePlacement.ORE_NICKEL_PLACED_FEATURE);
        final PlacedFeature copperOreFeature = new PlacedFeature(configuredCopperFeatureHolder, ModOrePlacement.ORE_COPPER_PLACED_FEATURE);
        final PlacedFeature aluminumOreFeature = new PlacedFeature(configuredAluminumFeatureHolder, ModOrePlacement.ORE_ALUMINUM_PLACED_FEATURE);
        final PlacedFeature tinOreFeature = new PlacedFeature(configuredTinFeatureHolder, ModOrePlacement.ORE_TIN_PLACED_FEATURE);
        final PlacedFeature osmiumOreFeature = new PlacedFeature(configuredOsmiumFeatureHolder, ModOrePlacement.ORE_OSMIUM_PLACED_FEATURE);
        final PlacedFeature uraniumOreFeature = new PlacedFeature(configuredUraniumFeatureHolder, ModOrePlacement.ORE_URANIUM_PLACED_FEATURE);
        final PlacedFeature zincOreFeature = new PlacedFeature(configuredZincFeatureHolder, ModOrePlacement.ORE_ZINC_PLACED_FEATURE);

        generator.addProvider(event.includeServer(), JsonCodecProvider.forDatapackRegistry(
                generator, existingFileHelper, MODID, ops, Registry.PLACED_FEATURE_REGISTRY, Map.of(
                        EMERALD_ORE_RL, emeraldOreFeature,
                        DIAMOND_ORE_RL, diamondOreFeature,
                        REDSTONE_ORE_RL, redstoneOreFeature,
                        LAPIS_ORE_RL, lapisOreFeature,
                        COAL_ORE_RL, coalOreFeature,
                        SILVER_ORE_RL, silverOreFeature,
                        IRON_ORE_RL, ironOreFeature,
                        LEAD_ORE_RL, leadOreFeature,
                        NICKEL_ORE_RL, nickelOreFeature,
                        COPPER_ORE_RL, copperOreFeature)));

        generator.addProvider(event.includeServer(), JsonCodecProvider.forDatapackRegistry(
                generator, existingFileHelper, MODID, ops, Registry.PLACED_FEATURE_REGISTRY, Map.of(
                        ALUMINUM_ORE_RL, aluminumOreFeature,
                        TIN_ORE_RL, tinOreFeature,
                        OSMIUM_ORE_RL, osmiumOreFeature,
                        URANIUM_ORE_RL, uraniumOreFeature,
                        ZINC_ORE_RL, zincOreFeature)));

    }
}
