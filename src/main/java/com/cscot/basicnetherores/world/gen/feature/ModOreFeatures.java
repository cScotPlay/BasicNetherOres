package com.cscot.basicnetherores.world.gen.feature;

import com.cscot.basicnetherores.BasicNetherOres;
import com.cscot.basicnetherores.config.OreGenerationConfig;
import com.cscot.basicnetherores.lists.BlockOreList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;

public class ModOreFeatures
{
    public static String modID = BasicNetherOres.modid;

    public static ConfiguredFeature<?, ?> ORE_EMERALD_NETHER = Feature.ORE
            .withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.field_241883_b, BlockOreList.netheremerald_ore.getDefaultState(),
                    OreGenerationConfig.emeraldVeinSize.get()))
            .withPlacement(Placement.field_242907_l.configure(
                    new TopSolidRangeConfig(
                            OreGenerationConfig.emeraldMinHeight.get(),
                            0,
                            OreGenerationConfig.emeraldMaxHeight.get())))
            .func_242728_a().func_242731_b(OreGenerationConfig.emeraldPerChunk.get());

    public static ConfiguredFeature<?, ?> ORE_DIAMOND_NETHER = Feature.ORE
            .withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.field_241883_b, BlockOreList.netherdiamond_ore.getDefaultState(),
                    OreGenerationConfig.diamondVeinSize.get()))
            .withPlacement(Placement.field_242907_l.configure(
                    new TopSolidRangeConfig(
                            OreGenerationConfig.diamondMinHeight.get(),
                            0,
                            OreGenerationConfig.diamondMaxHeight.get())))
            .func_242728_a().func_242731_b(OreGenerationConfig.diamondPerChunk.get());

    public static ConfiguredFeature<?, ?> ORE_REDSTONE_NETHER = Feature.ORE
            .withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.field_241883_b, BlockOreList.netherredstone_ore.getDefaultState(),
                    OreGenerationConfig.redstoneVeinSize.get()))
            .withPlacement(Placement.field_242907_l.configure(
                    new TopSolidRangeConfig(
                            OreGenerationConfig.redstoneMinHeight.get(),
                            0,
                            OreGenerationConfig.redstoneMaxHeight.get())))
            .func_242728_a().func_242731_b(OreGenerationConfig.redstonePerChunk.get());

    public static ConfiguredFeature<?, ?> ORE_LAPIS_NETHER = Feature.ORE
            .withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.field_241883_b, BlockOreList.netherlapis_ore.getDefaultState(),
                    OreGenerationConfig.lapisVeinSize.get()))
            .withPlacement(Placement.field_242907_l.configure(
                    new TopSolidRangeConfig(
                            OreGenerationConfig.lapisMinHeight.get(),
                            0,
                            OreGenerationConfig.lapisMaxHeight.get())))
            .func_242728_a().func_242731_b(OreGenerationConfig.lapisPerChunk.get());

    public static ConfiguredFeature<?, ?> ORE_COAL_NETHER = Feature.ORE
            .withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.field_241883_b, BlockOreList.nethercoal_ore.getDefaultState(),
                    OreGenerationConfig.coalVeinSize.get()))
            .withPlacement(Placement.field_242907_l.configure(
                    new TopSolidRangeConfig(
                            OreGenerationConfig.coalMinHeight.get(),
                            0,
                            OreGenerationConfig.coalMaxHeight.get())))
            .func_242728_a().func_242731_b(OreGenerationConfig.coalPerChunk.get());

    public static ConfiguredFeature<?, ?> ORE_SILVER_NETHER = Feature.ORE
            .withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.field_241883_b, BlockOreList.nethersilver_ore.getDefaultState(),
                    OreGenerationConfig.silverVeinSize.get()))
            .withPlacement(Placement.field_242907_l.configure(
                    new TopSolidRangeConfig(
                            OreGenerationConfig.silverMinHeight.get(),
                            0,
                            OreGenerationConfig.silverMaxHeight.get())))
            .func_242728_a().func_242731_b(OreGenerationConfig.silverPerChunk.get());

    public static ConfiguredFeature<?, ?> ORE_IRON_NETHER = Feature.ORE
            .withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.field_241883_b, BlockOreList.netheriron_ore.getDefaultState(),
                    OreGenerationConfig.ironVeinSize.get()))
            .withPlacement(Placement.field_242907_l.configure(
                    new TopSolidRangeConfig(
                            OreGenerationConfig.ironMinHeight.get(),
                            0,
                            OreGenerationConfig.ironMaxHeight.get())))
            .func_242728_a().func_242731_b(OreGenerationConfig.ironPerChunk.get());

    public static ConfiguredFeature<?, ?> ORE_LEAD_NETHER = Feature.ORE
            .withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.field_241883_b, BlockOreList.netherlead_ore.getDefaultState(),
                    OreGenerationConfig.leadVeinSize.get()))
            .withPlacement(Placement.field_242907_l.configure(
                    new TopSolidRangeConfig(
                            OreGenerationConfig.leadMinHeight.get(),
                            0,
                            OreGenerationConfig.leadMaxHeight.get())))
            .func_242728_a().func_242731_b(OreGenerationConfig.leadPerChunk.get());

    public static ConfiguredFeature<?, ?> ORE_NICKEL_NETHER = Feature.ORE
            .withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.field_241883_b, BlockOreList.nethernickel_ore.getDefaultState(),
                    OreGenerationConfig.nickelVeinSize.get()))
            .withPlacement(Placement.field_242907_l.configure(
                    new TopSolidRangeConfig(
                            OreGenerationConfig.nickelMinHeight.get(),
                            0,
                            OreGenerationConfig.nickelMaxHeight.get())))
            .func_242728_a().func_242731_b(OreGenerationConfig.nickelPerChunk.get());
    
    public static ConfiguredFeature<?, ?> ORE_COPPER_NETHER = Feature.ORE
            .withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.field_241883_b, BlockOreList.nethercopper_ore.getDefaultState(),
                    OreGenerationConfig.copperVeinSize.get()))
            .withPlacement(Placement.field_242907_l.configure(
                    new TopSolidRangeConfig(
                            OreGenerationConfig.copperMinHeight.get(),
                            0,
                            OreGenerationConfig.copperMaxHeight.get())))
            .func_242728_a().func_242731_b(OreGenerationConfig.copperPerChunk.get());

    public static ConfiguredFeature<?, ?> ORE_ALUMINUM_NETHER = Feature.ORE
            .withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.field_241883_b, BlockOreList.netheraluminum_ore.getDefaultState(),
                    OreGenerationConfig.aluminumVeinSize.get()))
            .withPlacement(Placement.field_242907_l.configure(
                    new TopSolidRangeConfig(
                            OreGenerationConfig.aluminumMinHeight.get(),
                            0,
                            OreGenerationConfig.aluminumMaxHeight.get())))
            .func_242728_a().func_242731_b(OreGenerationConfig.aluminumPerChunk.get());

    public static ConfiguredFeature<?, ?> ORE_TIN_NETHER = Feature.ORE
            .withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.field_241883_b, BlockOreList.nethertin_ore.getDefaultState(),
                    OreGenerationConfig.tinVeinSize.get()))
            .withPlacement(Placement.field_242907_l.configure(
                    new TopSolidRangeConfig(
                            OreGenerationConfig.tinMinHeight.get(),
                            0,
                            OreGenerationConfig.tinMaxHeight.get())))
            .func_242728_a().func_242731_b(OreGenerationConfig.tinPerChunk.get());

    public static ConfiguredFeature<?, ?> ORE_OSMIUM_NETHER = Feature.ORE
            .withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.field_241883_b, BlockOreList.netherosmium_ore.getDefaultState(),
                    OreGenerationConfig.osmiumVeinSize.get()))
            .withPlacement(Placement.field_242907_l.configure(
                    new TopSolidRangeConfig(
                            OreGenerationConfig.osmiumMinHeight.get(),
                            0,
                            OreGenerationConfig.osmiumMaxHeight.get())))
            .func_242728_a().func_242731_b(OreGenerationConfig.osmiumPerChunk.get());

    public static ConfiguredFeature<?, ?> ORE_URANIUM_NETHER = Feature.ORE
            .withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.field_241883_b, BlockOreList.netheruranium_ore.getDefaultState(),
                    OreGenerationConfig.uraniumVeinSize.get()))
            .withPlacement(Placement.field_242907_l.configure(
                    new TopSolidRangeConfig(
                            OreGenerationConfig.uraniumMinHeight.get(),
                            0,
                            OreGenerationConfig.uraniumMaxHeight.get())))
            .func_242728_a().func_242731_b(OreGenerationConfig.uraniumPerChunk.get());


    public static void initModFeatures ()
    {
        Registry.register(WorldGenRegistries.field_243653_e, new ResourceLocation(modID, "ore_emerald_nether"), ORE_EMERALD_NETHER);
        Registry.register(WorldGenRegistries.field_243653_e, new ResourceLocation(modID, "ore_diamond_nether"), ORE_DIAMOND_NETHER);
        Registry.register(WorldGenRegistries.field_243653_e, new ResourceLocation(modID, "ore_redstone_nether"), ORE_REDSTONE_NETHER);
        Registry.register(WorldGenRegistries.field_243653_e, new ResourceLocation(modID, "ore_lapis_nether"), ORE_LAPIS_NETHER);
        Registry.register(WorldGenRegistries.field_243653_e, new ResourceLocation(modID, "ore_coal_nether"), ORE_COAL_NETHER);
        Registry.register(WorldGenRegistries.field_243653_e, new ResourceLocation(modID, "ore_silver_nether"), ORE_SILVER_NETHER);
        Registry.register(WorldGenRegistries.field_243653_e, new ResourceLocation(modID, "ore_iron_nether"), ORE_IRON_NETHER);
        Registry.register(WorldGenRegistries.field_243653_e, new ResourceLocation(modID, "ore_lead_nether"), ORE_LEAD_NETHER);
        Registry.register(WorldGenRegistries.field_243653_e, new ResourceLocation(modID, "ore_nickel_nether"), ORE_NICKEL_NETHER);
        Registry.register(WorldGenRegistries.field_243653_e, new ResourceLocation(modID, "ore_copper_nether"), ORE_COPPER_NETHER);
        Registry.register(WorldGenRegistries.field_243653_e, new ResourceLocation(modID, "ore_aluminum_nether"), ORE_ALUMINUM_NETHER);
        Registry.register(WorldGenRegistries.field_243653_e, new ResourceLocation(modID, "ore_tin_nether"), ORE_TIN_NETHER);
        Registry.register(WorldGenRegistries.field_243653_e, new ResourceLocation(modID, "ore_osmium_nether"), ORE_OSMIUM_NETHER);
        Registry.register(WorldGenRegistries.field_243653_e, new ResourceLocation(modID, "ore_uranium_nether"), ORE_URANIUM_NETHER);
    }

}
