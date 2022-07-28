package com.cscot.basicnetherores.data.worldgen.configuredfeatures;

import com.cscot.basicnetherores.BasicNetherOres;
import com.cscot.basicnetherores.data.worldgen.ModOreConfiguredFeatures;
import com.google.gson.JsonElement;
import com.mojang.serialization.JsonOps;
import net.minecraft.core.Registry;
import net.minecraft.core.RegistryAccess;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.RegistryOps;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.JsonCodecProvider;
import net.minecraftforge.data.event.GatherDataEvent;

import java.util.Map;

import static com.cscot.basicnetherores.api.OreFeatureLists.*;


public class ConfiguredFeatureGenerator
{
    private static String MODID = BasicNetherOres.modid;

    public static void onGatherData(GatherDataEvent event)
    {
        final DataGenerator generator = event.getGenerator();
        final ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        final RegistryOps<JsonElement> ops = RegistryOps.create(JsonOps.INSTANCE, RegistryAccess.builtinCopy());

        final ConfiguredFeature emeraldOreConfig = new ConfiguredFeature(Feature.ORE, ModOreConfiguredFeatures.ORE_EMERALD_CONFIGURED_FEATURE);
        final ConfiguredFeature diamondOreConfig = new ConfiguredFeature(Feature.ORE, ModOreConfiguredFeatures.ORE_DIAMOND_CONFIGURED_FEATURE);
        final ConfiguredFeature redstoneOreConfig = new ConfiguredFeature(Feature.ORE, ModOreConfiguredFeatures.ORE_REDSTONE_CONFIGURED_FEATURE);
        final ConfiguredFeature lapisOreConfig = new ConfiguredFeature(Feature.ORE, ModOreConfiguredFeatures.ORE_LAPIS_CONFIGURED_FEATURE);
        final ConfiguredFeature coalOreConfig = new ConfiguredFeature(Feature.ORE, ModOreConfiguredFeatures.ORE_COAL_CONFIGURED_FEATURE);
        final ConfiguredFeature silverOreConfig = new ConfiguredFeature(Feature.ORE, ModOreConfiguredFeatures.ORE_SILVER_CONFIGURED_FEATURE);
        final ConfiguredFeature ironOreConfig = new ConfiguredFeature(Feature.ORE, ModOreConfiguredFeatures.ORE_IRON_CONFIGURED_FEATURE);
        final ConfiguredFeature leadOreConfig = new ConfiguredFeature(Feature.ORE, ModOreConfiguredFeatures.ORE_LEAD_CONFIGURED_FEATURE);
        final ConfiguredFeature nickelOreConfig = new ConfiguredFeature(Feature.ORE, ModOreConfiguredFeatures.ORE_NICKEL_CONFIGURED_FEATURE);
        final ConfiguredFeature copperOreConfig = new ConfiguredFeature(Feature.ORE, ModOreConfiguredFeatures.ORE_COPPER_CONFIGURED_FEATURE);
        final ConfiguredFeature aluminumOreConfig = new ConfiguredFeature(Feature.ORE, ModOreConfiguredFeatures.ORE_ALUMINUM_CONFIGURED_FEATURE);
        final ConfiguredFeature tinOreConfig = new ConfiguredFeature(Feature.ORE, ModOreConfiguredFeatures.ORE_TIN_CONFIGURED_FEATURE);
        final ConfiguredFeature osmiumOreConfig = new ConfiguredFeature(Feature.ORE, ModOreConfiguredFeatures.ORE_OSMIUM_CONFIGURED_FEATURE);
        final ConfiguredFeature uraniumOreConfig = new ConfiguredFeature(Feature.ORE, ModOreConfiguredFeatures.ORE_URANIUM_CONFIGURED_FEATURE);
        final ConfiguredFeature zincOreConfig = new ConfiguredFeature(Feature.ORE, ModOreConfiguredFeatures.ORE_ZINC_CONFIGURED_FEATURE);

        generator.addProvider(event.includeServer(), JsonCodecProvider.forDatapackRegistry(
                generator, existingFileHelper, MODID, ops, Registry.CONFIGURED_FEATURE_REGISTRY, Map.of(
                        EMERALD_ORE_RL, emeraldOreConfig,
                        DIAMOND_ORE_RL, diamondOreConfig,
                        REDSTONE_ORE_RL, redstoneOreConfig,
                        LAPIS_ORE_RL, lapisOreConfig,
                        COAL_ORE_RL, coalOreConfig,
                        SILVER_ORE_RL, silverOreConfig,
                        IRON_ORE_RL, ironOreConfig,
                        LEAD_ORE_RL, leadOreConfig,
                        NICKEL_ORE_RL, nickelOreConfig,
                        COPPER_ORE_RL, copperOreConfig)));

        generator.addProvider(event.includeServer(), JsonCodecProvider.forDatapackRegistry(
                generator, existingFileHelper, MODID, ops, Registry.CONFIGURED_FEATURE_REGISTRY, Map.of(
                        ALUMINUM_ORE_RL, aluminumOreConfig,
                        TIN_ORE_RL, tinOreConfig,
                        OSMIUM_ORE_RL, osmiumOreConfig,
                        URANIUM_ORE_RL, uraniumOreConfig,
                        ZINC_ORE_RL, zincOreConfig)));
    }
}
