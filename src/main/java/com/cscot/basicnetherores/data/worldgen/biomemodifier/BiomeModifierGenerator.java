package com.cscot.basicnetherores.data.worldgen.biomemodifier;

import com.cscot.basicnetherores.BasicNetherOres;
import com.google.gson.JsonElement;
import com.mojang.serialization.JsonOps;
import net.minecraft.core.HolderSet;
import net.minecraft.core.Registry;
import net.minecraft.core.RegistryAccess;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.RegistryOps;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.JsonCodecProvider;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Map;

import static com.cscot.basicnetherores.api.OreFeatureLists.*;

public class BiomeModifierGenerator
{
    private static String MODID = BasicNetherOres.modid;

    public static void onGatherData(GatherDataEvent event)
    {
        final DataGenerator generator = event.getGenerator();
        final ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        final RegistryOps<JsonElement> ops = RegistryOps.create(JsonOps.INSTANCE, RegistryAccess.builtinCopy());

        final HolderSet.Named<Biome> netherTag = new HolderSet.Named<>(ops.registry(Registry.BIOME_REGISTRY).get(), BiomeTags.IS_NETHER);

        final BiomeModifier addEmeraldOre = new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                netherTag,
                HolderSet.direct(ops.registry(Registry.PLACED_FEATURE_REGISTRY).get().getOrCreateHolderOrThrow(ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, EMERALD_ORE_KEY.location()))),
                GenerationStep.Decoration.UNDERGROUND_ORES);

        final BiomeModifier addDiamondOre = new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                netherTag,
                HolderSet.direct(ops.registry(Registry.PLACED_FEATURE_REGISTRY).get().getOrCreateHolderOrThrow(ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, DIAMOND_ORE_KEY.location()))),
                GenerationStep.Decoration.UNDERGROUND_ORES);

        final BiomeModifier addRedstoneOre = new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                netherTag,
                HolderSet.direct(ops.registry(Registry.PLACED_FEATURE_REGISTRY).get().getOrCreateHolderOrThrow(ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, REDSTONE_ORE_KEY.location()))),
                GenerationStep.Decoration.UNDERGROUND_ORES);

        final BiomeModifier addLapisOre = new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                netherTag,
                HolderSet.direct(ops.registry(Registry.PLACED_FEATURE_REGISTRY).get().getOrCreateHolderOrThrow(ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, LAPIS_ORE_KEY.location()))),
                GenerationStep.Decoration.UNDERGROUND_ORES);

        final BiomeModifier addCoalOre = new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                netherTag,
                HolderSet.direct(ops.registry(Registry.PLACED_FEATURE_REGISTRY).get().getOrCreateHolderOrThrow(ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, COAL_ORE_KEY.location()))),
                GenerationStep.Decoration.UNDERGROUND_ORES);

        final BiomeModifier addSilverOre = new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                netherTag,
                HolderSet.direct(ops.registry(Registry.PLACED_FEATURE_REGISTRY).get().getOrCreateHolderOrThrow(ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, SILVER_ORE_KEY.location()))),
                GenerationStep.Decoration.UNDERGROUND_ORES);

        final BiomeModifier addIronOre = new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                netherTag,
                HolderSet.direct(ops.registry(Registry.PLACED_FEATURE_REGISTRY).get().getOrCreateHolderOrThrow(ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, IRON_ORE_KEY.location()))),
                GenerationStep.Decoration.UNDERGROUND_ORES);

        final BiomeModifier addLeadOre = new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                netherTag,
                HolderSet.direct(ops.registry(Registry.PLACED_FEATURE_REGISTRY).get().getOrCreateHolderOrThrow(ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, LEAD_ORE_KEY.location()))),
                GenerationStep.Decoration.UNDERGROUND_ORES);

        final BiomeModifier addNickelOre = new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                netherTag,
                HolderSet.direct(ops.registry(Registry.PLACED_FEATURE_REGISTRY).get().getOrCreateHolderOrThrow(ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, NICKEL_ORE_KEY.location()))),
                GenerationStep.Decoration.UNDERGROUND_ORES);

        final BiomeModifier addCopperOre = new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                netherTag,
                HolderSet.direct(ops.registry(Registry.PLACED_FEATURE_REGISTRY).get().getOrCreateHolderOrThrow(ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, COPPER_ORE_KEY.location()))),
                GenerationStep.Decoration.UNDERGROUND_ORES);

        final BiomeModifier addAluminumOre = new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                netherTag,
                HolderSet.direct(ops.registry(Registry.PLACED_FEATURE_REGISTRY).get().getOrCreateHolderOrThrow(ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, ALUMINUM_ORE_KEY.location()))),
                GenerationStep.Decoration.UNDERGROUND_ORES);

        final BiomeModifier addTinOre = new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                netherTag,
                HolderSet.direct(ops.registry(Registry.PLACED_FEATURE_REGISTRY).get().getOrCreateHolderOrThrow(ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, TIN_ORE_KEY.location()))),
                GenerationStep.Decoration.UNDERGROUND_ORES);

        final BiomeModifier addOsmiumOre = new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                netherTag,
                HolderSet.direct(ops.registry(Registry.PLACED_FEATURE_REGISTRY).get().getOrCreateHolderOrThrow(ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, OSMIUM_ORE_KEY.location()))),
                GenerationStep.Decoration.UNDERGROUND_ORES);

        final BiomeModifier addUraniumOre = new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                netherTag,
                HolderSet.direct(ops.registry(Registry.PLACED_FEATURE_REGISTRY).get().getOrCreateHolderOrThrow(ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, URANIUM_ORE_KEY.location()))),
                GenerationStep.Decoration.UNDERGROUND_ORES);

        final BiomeModifier addZincOre = new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                netherTag,
                HolderSet.direct(ops.registry(Registry.PLACED_FEATURE_REGISTRY).get().getOrCreateHolderOrThrow(ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, ZINC_ORE_KEY.location()))),
                GenerationStep.Decoration.UNDERGROUND_ORES);

        generator.addProvider(event.includeServer(), JsonCodecProvider.forDatapackRegistry(
                generator, existingFileHelper, MODID, ops, ForgeRegistries.Keys.BIOME_MODIFIERS, Map.of(
                        EMERALD_ORE_RL, addEmeraldOre,
                        DIAMOND_ORE_RL, addDiamondOre,
                        REDSTONE_ORE_RL, addRedstoneOre,
                        LAPIS_ORE_RL, addLapisOre,
                        COAL_ORE_RL, addCoalOre,
                        SILVER_ORE_RL, addSilverOre,
                        IRON_ORE_RL, addIronOre,
                        LEAD_ORE_RL, addLeadOre,
                        NICKEL_ORE_RL, addNickelOre,
                        COPPER_ORE_RL, addCopperOre)));

        generator.addProvider(event.includeServer(), JsonCodecProvider.forDatapackRegistry(
                generator, existingFileHelper, MODID, ops, ForgeRegistries.Keys.BIOME_MODIFIERS, Map.of(
                        ALUMINUM_ORE_RL, addAluminumOre,
                        TIN_ORE_RL, addTinOre,
                        OSMIUM_ORE_RL, addOsmiumOre,
                        URANIUM_ORE_RL, addUraniumOre,
                        ZINC_ORE_RL, addZincOre)));
    }
}
