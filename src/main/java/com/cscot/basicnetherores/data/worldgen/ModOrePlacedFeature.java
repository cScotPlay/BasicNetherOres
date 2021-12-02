package com.cscot.basicnetherores.data.worldgen;

import com.cscot.basicnetherores.BasicNetherOres;
import com.cscot.basicnetherores.config.OreGenerationConfig;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModOrePlacedFeature
{
    public static String MODID = BasicNetherOres.modid;

    public static final PlacedFeature ORE_EMERALD_NETHER = ModOreConfiguredFeatures.ORE_EMERALD_NETHER.placed(commonOrePlacement(OreGenerationConfig.emeraldPerChunk.get(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OreGenerationConfig.emeraldMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.emeraldMaxHeight.get()))));
    public static final PlacedFeature ORE_DIAMOND_NETHER = ModOreConfiguredFeatures.ORE_DIAMOND_NETHER.placed(commonOrePlacement(OreGenerationConfig.diamondPerChunk.get(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OreGenerationConfig.diamondMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.diamondMaxHeight.get()))));
    public static final PlacedFeature ORE_REDSTONE_NETHER = ModOreConfiguredFeatures.ORE_REDSTONE_NETHER.placed(commonOrePlacement(OreGenerationConfig.redstonePerChunk.get(), HeightRangePlacement.triangle(VerticalAnchor.absolute(OreGenerationConfig.redstoneMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.redstoneMaxHeight.get()))));
    public static final PlacedFeature ORE_LAPIS_NETHER = ModOreConfiguredFeatures.ORE_LAPIS_NETHER.placed(commonOrePlacement(OreGenerationConfig.lapisPerChunk.get(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OreGenerationConfig.lapisMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.lapisMaxHeight.get()))));
    public static final PlacedFeature ORE_COAL_NETHER = ModOreConfiguredFeatures.ORE_COAL_NETHER.placed(commonOrePlacement(OreGenerationConfig.coalPerChunk.get(), HeightRangePlacement.triangle(VerticalAnchor.absolute(OreGenerationConfig.coalMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.coalMaxHeight.get()))));
    public static final PlacedFeature ORE_SILVER_NETHER = ModOreConfiguredFeatures.ORE_SILVER_NETHER.placed(commonOrePlacement(OreGenerationConfig.silverPerChunk.get(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OreGenerationConfig.silverMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.silverMaxHeight.get()))));
    public static final PlacedFeature ORE_IRON_NETHER = ModOreConfiguredFeatures.ORE_IRON_NETHER.placed(commonOrePlacement(OreGenerationConfig.ironPerChunk.get(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OreGenerationConfig.ironMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.ironMaxHeight.get()))));
    public static final PlacedFeature ORE_LEAD_NETHER = ModOreConfiguredFeatures.ORE_LEAD_NETHER.placed(commonOrePlacement(OreGenerationConfig.leadPerChunk.get(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OreGenerationConfig.leadMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.leadMaxHeight.get()))));
    public static final PlacedFeature ORE_NICKEL_NETHER = ModOreConfiguredFeatures.ORE_NICKEL_NETHER.placed(commonOrePlacement(OreGenerationConfig.nickelPerChunk.get(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OreGenerationConfig.nickelMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.nickelMaxHeight.get()))));
    public static final PlacedFeature ORE_COPPER_NETHER = ModOreConfiguredFeatures.ORE_COPPER_NETHER.placed(commonOrePlacement(OreGenerationConfig.copperPerChunk.get(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OreGenerationConfig.copperMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.copperMaxHeight.get()))));
    public static final PlacedFeature ORE_ALUMINUM_NETHER = ModOreConfiguredFeatures.ORE_ALUMINUM_NETHER.placed(commonOrePlacement(OreGenerationConfig.aluminumPerChunk.get(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OreGenerationConfig.aluminumMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.aluminumMaxHeight.get()))));
    public static final PlacedFeature ORE_TIN_NETHER = ModOreConfiguredFeatures.ORE_TIN_NETHER.placed(commonOrePlacement(OreGenerationConfig.tinPerChunk.get(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OreGenerationConfig.tinMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.tinMaxHeight.get()))));
    public static final PlacedFeature ORE_OSMIUM_NETHER = ModOreConfiguredFeatures.ORE_OSMIUM_NETHER.placed(commonOrePlacement(OreGenerationConfig.osmiumPerChunk.get(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OreGenerationConfig.osmiumMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.osmiumMaxHeight.get()))));
    public static final PlacedFeature ORE_URANIUM_NETHER = ModOreConfiguredFeatures.ORE_URANIUM_NETHER.placed(commonOrePlacement(OreGenerationConfig.uraniumPerChunk.get(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OreGenerationConfig.uraniumMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.uraniumMaxHeight.get()))));

    public static void initOrePlacedFeatures()
    {

        PlacementUtils.register( new ResourceLocation(MODID, "ore_emerald_nether").toString(), ORE_EMERALD_NETHER);
        PlacementUtils.register( new ResourceLocation(MODID, "ore_diamond_nether").toString(), ORE_DIAMOND_NETHER);
        PlacementUtils.register( new ResourceLocation(MODID, "ore_redstone_nether").toString(), ORE_REDSTONE_NETHER);
        PlacementUtils.register( new ResourceLocation(MODID, "ore_lapis_nether").toString(), ORE_LAPIS_NETHER);
        PlacementUtils.register( new ResourceLocation(MODID, "ore_coal_nether").toString(), ORE_COAL_NETHER);
        PlacementUtils.register( new ResourceLocation(MODID, "ore_silver_nether").toString(), ORE_SILVER_NETHER);
        PlacementUtils.register( new ResourceLocation(MODID, "ore_iron_nether").toString(), ORE_IRON_NETHER);
        PlacementUtils.register( new ResourceLocation(MODID, "ore_lead_nether").toString(), ORE_LEAD_NETHER);
        PlacementUtils.register( new ResourceLocation(MODID, "ore_nickel_nether").toString(), ORE_NICKEL_NETHER);
        PlacementUtils.register( new ResourceLocation(MODID, "ore_copper_nether").toString(), ORE_COPPER_NETHER);
        PlacementUtils.register( new ResourceLocation(MODID, "ore_aluminum_nether").toString(), ORE_ALUMINUM_NETHER);
        PlacementUtils.register( new ResourceLocation(MODID, "ore_tin_nether").toString(), ORE_TIN_NETHER);
        PlacementUtils.register( new ResourceLocation(MODID, "ore_osmium_nether").toString(), ORE_OSMIUM_NETHER);
        PlacementUtils.register( new ResourceLocation(MODID, "ore_uranium_nether").toString(), ORE_URANIUM_NETHER);

    }

    private static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    private static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    private static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }
}
