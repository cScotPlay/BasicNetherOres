package com.cscot.basicnetherores.world.gen.feature;

import com.cscot.basicnetherores.BasicNetherOres;
import com.cscot.basicnetherores.api.OreBlockLists;
import com.cscot.basicnetherores.config.ModConfig;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.feature.*;

public class ModOreConfiguredFeatures
{
    public static String modID = BasicNetherOres.MOD_ID;

    public static ConfiguredFeature<?, ?> ORE_EMERALD_NETHER = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreConfiguredFeatures.BASE_STONE_NETHER, OreBlockLists.NETHEREMERALD_ORE.getDefaultState(),
                    ModConfig.emeraldVeinSize));

    public static ConfiguredFeature<?, ?> ORE_DIAMOND_NETHER = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreConfiguredFeatures.BASE_STONE_NETHER, OreBlockLists.NETHERDIAMOND_ORE.getDefaultState(),
                    ModConfig.diamondVeinSize));

    public static ConfiguredFeature<?, ?> ORE_REDSTONE_NETHER = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreConfiguredFeatures.BASE_STONE_NETHER, OreBlockLists.NETHERREDSTONE_ORE.getDefaultState(),
                    ModConfig.redstoneVeinSize));

    public static ConfiguredFeature<?, ?> ORE_LAPIS_NETHER = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreConfiguredFeatures.BASE_STONE_NETHER, OreBlockLists.NETHERLAPIS_ORE.getDefaultState(),
                    ModConfig.lapisVeinSize));

    public static ConfiguredFeature<?, ?> ORE_COAL_NETHER = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreConfiguredFeatures.BASE_STONE_NETHER, OreBlockLists.NETHERCOAL_ORE.getDefaultState(),
                    ModConfig.coalVeinSize));

    public static ConfiguredFeature<?, ?> ORE_SILVER_NETHER = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreConfiguredFeatures.BASE_STONE_NETHER, OreBlockLists.NETHERSILVER_ORE.getDefaultState(),
                    ModConfig.silverVeinSize));

    public static ConfiguredFeature<?, ?> ORE_IRON_NETHER = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreConfiguredFeatures.BASE_STONE_NETHER, OreBlockLists.NETHERIRON_ORE.getDefaultState(),
                    ModConfig.ironVeinSize));

    public static ConfiguredFeature<?, ?> ORE_LEAD_NETHER = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreConfiguredFeatures.BASE_STONE_NETHER, OreBlockLists.NETHERLEAD_ORE.getDefaultState(),
                    ModConfig.leadVeinSize));

    public static ConfiguredFeature<?, ?> ORE_NICKEL_NETHER = Feature.ORE
        .configure(new OreFeatureConfig(
                OreConfiguredFeatures.BASE_STONE_NETHER, OreBlockLists.NETHERNICKEL_ORE.getDefaultState(),
                ModConfig.nickelVeinSize));

    public static ConfiguredFeature<?, ?> ORE_COPPER_NETHER = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreConfiguredFeatures.BASE_STONE_NETHER, OreBlockLists.NETHERCOPPER_ORE.getDefaultState(),
                    ModConfig.copperVeinSize));

    public static ConfiguredFeature<?, ?> ORE_ALUMINUM_NETHER = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreConfiguredFeatures.BASE_STONE_NETHER, OreBlockLists.NETHERALUMINUM_ORE.getDefaultState(),
                    ModConfig.aluminumVeinSize));

    public static ConfiguredFeature<?, ?> ORE_TIN_NETHER = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreConfiguredFeatures.BASE_STONE_NETHER, OreBlockLists.NETHERTIN_ORE.getDefaultState(),
                    ModConfig.tinVeinSize));

    public static ConfiguredFeature<?, ?> ORE_OSMIUM_NETHER = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreConfiguredFeatures.BASE_STONE_NETHER, OreBlockLists.NETHEROSMIUM_ORE.getDefaultState(),
                    ModConfig.osmiumVeinSize));

    public static ConfiguredFeature<?, ?> ORE_URANIUM_NETHER = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreConfiguredFeatures.BASE_STONE_NETHER, OreBlockLists.NETHERURANIUM_ORE.getDefaultState(),
                    ModConfig.uraniumVeinSize));


    public static void initModOreConfiguredFeatures()
    {
        RegistryKey<ConfiguredFeature<?, ?>> oreEmeraldNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(modID, "ore_emerald_nether"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreEmeraldNether.getValue(), ORE_EMERALD_NETHER);

        RegistryKey<ConfiguredFeature<?, ?>> oreDiamondNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(modID, "ore_diamond_nether"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreDiamondNether.getValue(), ORE_DIAMOND_NETHER);

        RegistryKey<ConfiguredFeature<?, ?>> oreRedstoneNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(modID, "ore_redstone_nether"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreRedstoneNether.getValue(), ORE_REDSTONE_NETHER);

        RegistryKey<ConfiguredFeature<?, ?>> oreLapisNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(modID, "ore_lapis_nether"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreLapisNether.getValue(), ORE_LAPIS_NETHER);

        RegistryKey<ConfiguredFeature<?, ?>> oreCoalNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(modID, "ore_coal_nether"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreCoalNether.getValue(), ORE_COAL_NETHER);

        RegistryKey<ConfiguredFeature<?, ?>> oreSilverNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(modID, "ore_silver_nether"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSilverNether.getValue(), ORE_SILVER_NETHER);

        RegistryKey<ConfiguredFeature<?, ?>> oreIronNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(modID, "ore_iron_nether"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreIronNether.getValue(), ORE_IRON_NETHER);

        RegistryKey<ConfiguredFeature<?, ?>> oreLeadNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(modID, "ore_lead_nether"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreLeadNether.getValue(), ORE_LEAD_NETHER);

        RegistryKey<ConfiguredFeature<?, ?>> oreNickelNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(modID, "ore_nickel_nether"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreNickelNether.getValue(), ORE_NICKEL_NETHER);

        RegistryKey<ConfiguredFeature<?, ?>> oreCopperNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(modID, "ore_copper_nether"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreCopperNether.getValue(), ORE_COPPER_NETHER);

        RegistryKey<ConfiguredFeature<?, ?>> oreAluminumNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(modID, "ore_aluminum_nether"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreAluminumNether.getValue(), ORE_ALUMINUM_NETHER);

        RegistryKey<ConfiguredFeature<?, ?>> oreTinNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(modID, "ore_tin_nether"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTinNether.getValue(), ORE_TIN_NETHER);

        RegistryKey<ConfiguredFeature<?, ?>> oreOsmiumNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(modID, "ore_osmium_nether"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreOsmiumNether.getValue(), ORE_OSMIUM_NETHER);

        RegistryKey<ConfiguredFeature<?, ?>> oreUraniumNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(modID, "ore_uranium_nether"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreUraniumNether.getValue(), ORE_URANIUM_NETHER);
    }
}
