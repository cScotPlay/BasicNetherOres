package com.cscot.basicnetherores.world.gen.feature;

import com.cscot.basicnetherores.BasicNetherOres;
import com.cscot.basicnetherores.api.OreBlockLists;
import com.cscot.basicnetherores.config.ModConfig;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class ModConfiguredFeatures
{
    public static String modID = BasicNetherOres.MOD_ID;

    public static ConfiguredFeature<?, ?> ORE_EMERALD_NETHER = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_NETHER, OreBlockLists.NETHEREMERALD_ORE.getDefaultState(),
                    ModConfig.emeraldVeinSize))
            .decorate(Decorator.RANGE.configure(
                            new RangeDecoratorConfig(
                                    ModConfig.emeraldMinHeight,
                                    0,
                                    ModConfig.emeraldMaxHeight)))
            .spreadHorizontally().repeat(ModConfig.emeraldPerChunk);

    public static ConfiguredFeature<?, ?> ORE_DIAMOND_NETHER = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_NETHER, OreBlockLists.NETHERDIAMOND_ORE.getDefaultState(),
                    ModConfig.diamondVeinSize))
            .decorate(Decorator.RANGE.configure(
                    new RangeDecoratorConfig(
                            ModConfig.diamondMinHeight,
                            0,
                            ModConfig.diamondMaxHeight)))
            .spreadHorizontally().repeat(ModConfig.diamondPerChunk);

    public static ConfiguredFeature<?, ?> ORE_REDSTONE_NETHER = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_NETHER, OreBlockLists.NETHERREDSTONE_ORE.getDefaultState(),
                    ModConfig.redstoneVeinSize))
            .decorate(Decorator.RANGE.configure(
                    new RangeDecoratorConfig(
                            ModConfig.redstoneMinHeight,
                            0,
                            ModConfig.redstoneMaxHeight)))
            .spreadHorizontally().repeat(ModConfig.redstonePerChunk);

    public static ConfiguredFeature<?, ?> ORE_LAPIS_NETHER = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_NETHER, OreBlockLists.NETHERLAPIS_ORE.getDefaultState(),
                    ModConfig.lapisVeinSize))
            .decorate(Decorator.RANGE.configure(
                    new RangeDecoratorConfig(
                            ModConfig.lapisMinHeight,
                            0,
                            ModConfig.lapisMaxHeight)))
            .spreadHorizontally().repeat(ModConfig.lapisPerChunk);

    public static ConfiguredFeature<?, ?> ORE_COAL_NETHER = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_NETHER, OreBlockLists.NETHERCOAL_ORE.getDefaultState(),
                    ModConfig.coalVeinSize))
            .decorate(Decorator.RANGE.configure(
                    new RangeDecoratorConfig(
                            ModConfig.coalMinHeight,
                            0,
                            ModConfig.coalMaxHeight)))
            .spreadHorizontally().repeat(ModConfig.coalPerChunk);

    public static ConfiguredFeature<?, ?> ORE_SILVER_NETHER = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_NETHER, OreBlockLists.NETHERSILVER_ORE.getDefaultState(),
                    ModConfig.silverVeinSize))
            .decorate(Decorator.RANGE.configure(
                    new RangeDecoratorConfig(
                            ModConfig.silverMinHeight,
                            0,
                            ModConfig.silverMaxHeight)))
            .spreadHorizontally().repeat(ModConfig.silverPerChunk);

    public static ConfiguredFeature<?, ?> ORE_IRON_NETHER = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_NETHER, OreBlockLists.NETHERIRON_ORE.getDefaultState(),
                    ModConfig.ironVeinSize))
            .decorate(Decorator.RANGE.configure(
                    new RangeDecoratorConfig(
                            ModConfig.ironMinHeight,
                            0,
                            ModConfig.ironMaxHeight)))
            .spreadHorizontally().repeat(ModConfig.ironPerChunk);

    public static ConfiguredFeature<?, ?> ORE_LEAD_NETHER = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_NETHER, OreBlockLists.NETHERLEAD_ORE.getDefaultState(),
                    ModConfig.leadVeinSize))
            .decorate(Decorator.RANGE.configure(
                    new RangeDecoratorConfig(
                            ModConfig.leadMinHeight,
                            0,
                            ModConfig.leadMaxHeight)))
            .spreadHorizontally().repeat(ModConfig.leadPerChunk);

    public static ConfiguredFeature<?, ?> ORE_NICKEL_NETHER = Feature.ORE
        .configure(new OreFeatureConfig(
                OreFeatureConfig.Rules.BASE_STONE_NETHER, OreBlockLists.NETHERNICKEL_ORE.getDefaultState(),
                ModConfig.nickelVeinSize))
        .decorate(Decorator.RANGE.configure(
                new RangeDecoratorConfig(
                        ModConfig.nickelMinHeight,
                        0,
                        ModConfig.nickelMaxHeight)))
        .spreadHorizontally().repeat(ModConfig.nickelPerChunk);

    public static ConfiguredFeature<?, ?> ORE_COPPER_NETHER = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_NETHER, OreBlockLists.NETHERCOPPER_ORE.getDefaultState(),
                    ModConfig.copperVeinSize))
            .decorate(Decorator.RANGE.configure(
                    new RangeDecoratorConfig(
                            ModConfig.copperMinHeight,
                            0,
                            ModConfig.copperMaxHeight)))
            .spreadHorizontally().repeat(ModConfig.copperPerChunk);

    public static ConfiguredFeature<?, ?> ORE_ALUMINUM_NETHER = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_NETHER, OreBlockLists.NETHERALUMINUM_ORE.getDefaultState(),
                    ModConfig.aluminumVeinSize))
            .decorate(Decorator.RANGE.configure(
                    new RangeDecoratorConfig(
                            ModConfig.aluminumMinHeight,
                            0,
                            ModConfig.aluminumMaxHeight)))
            .spreadHorizontally().repeat(ModConfig.aluminumPerChunk);

    public static ConfiguredFeature<?, ?> ORE_TIN_NETHER = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_NETHER, OreBlockLists.NETHERTIN_ORE.getDefaultState(),
                    ModConfig.tinVeinSize))
            .decorate(Decorator.RANGE.configure(
                    new RangeDecoratorConfig(
                            ModConfig.tinMinHeight,
                            0,
                            ModConfig.tinMaxHeight)))
            .spreadHorizontally().repeat(ModConfig.tinPerChunk);

    public static ConfiguredFeature<?, ?> ORE_OSMIUM_NETHER = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_NETHER, OreBlockLists.NETHEROSMIUM_ORE.getDefaultState(),
                    ModConfig.osmiumVeinSize))
            .decorate(Decorator.RANGE.configure(
                    new RangeDecoratorConfig(
                            ModConfig.osmiumMinHeight,
                            0,
                            ModConfig.osmiumMaxHeight)))
            .spreadHorizontally().repeat(ModConfig.osmiumPerChunk);

    public static ConfiguredFeature<?, ?> ORE_URANIUM_NETHER = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_NETHER, OreBlockLists.NETHERURANIUM_ORE.getDefaultState(),
                    ModConfig.uraniumVeinSize))
            .decorate(Decorator.RANGE.configure(
                    new RangeDecoratorConfig(
                            ModConfig.uraniumMinHeight,
                            0,
                            ModConfig.uraniumMaxHeight)))
            .spreadHorizontally().repeat(ModConfig.uraniumPerChunk);


    public static void initModFeatures ()
    {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(modID, "ore_emerald_nether"), ORE_EMERALD_NETHER);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(modID, "ore_diamond_nether"), ORE_DIAMOND_NETHER);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(modID, "ore_redstone_nether"), ORE_REDSTONE_NETHER);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(modID, "ore_lapis_nether"), ORE_LAPIS_NETHER);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(modID, "ore_coal_nether"), ORE_COAL_NETHER);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(modID, "ore_silver_nether"), ORE_SILVER_NETHER);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(modID, "ore_iron_nether"), ORE_IRON_NETHER);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(modID, "ore_lead_nether"), ORE_LEAD_NETHER);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(modID, "ore_nickel_nether"), ORE_NICKEL_NETHER);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(modID, "ore_copper_nether"), ORE_COPPER_NETHER);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(modID, "ore_aluminum_nether"), ORE_ALUMINUM_NETHER);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(modID, "ore_tin_nether"), ORE_TIN_NETHER);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(modID, "ore_osmium_nether"), ORE_OSMIUM_NETHER);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(modID, "ore_uranium_nether"), ORE_URANIUM_NETHER);
    }
}
