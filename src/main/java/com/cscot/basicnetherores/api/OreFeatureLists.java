package com.cscot.basicnetherores.api;

import com.cscot.basicnetherores.BasicNetherOres;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class OreFeatureLists
{
    private static String MODID = BasicNetherOres.modid;

    public static final String EMERALD_ORE_FEATURE_ID = "ore_emerald_nether";
    public static final String DIAMOND_ORE_FEATURE_ID = "ore_diamond_nether";
    public static final String REDSTONE_ORE_FEATURE_ID = "ore_redstone_nether";
    public static final String LAPIS_ORE_FEATURE_ID = "ore_lapis_nether";
    public static final String COAL_ORE_FEATURE_ID = "ore_coal_nether";
    public static final String SILVER_ORE_FEATURE_ID = "ore_silver_nether";
    public static final String IRON_ORE_FEATURE_ID = "ore_iron_nether";
    public static final String LEAD_ORE_FEATURE_ID = "ore_lead_nether";
    public static final String NICKEL_ORE_FEATURE_ID = "ore_nickel_nether";
    public static final String COPPER_ORE_FEATURE_ID = "ore_copper_nether";
    public static final String ALUMINUM_ORE_FEATURE_ID = "ore_aluminum_nether";
    public static final String TIN_ORE_FEATURE_ID = "ore_tin_nether";
    public static final String OSMIUM_ORE_FEATURE_ID = "ore_osmium_nether";
    public static final String URANIUM_ORE_FEATURE_ID = "ore_uranium_nether";
    public static final String ZINC_ORE_FEATURE_ID = "ore_zinc_nether";

    public static final ResourceLocation EMERALD_ORE_RL = new ResourceLocation(MODID, OreFeatureLists.EMERALD_ORE_FEATURE_ID);
    public static final ResourceLocation DIAMOND_ORE_RL = new ResourceLocation(MODID, OreFeatureLists.DIAMOND_ORE_FEATURE_ID);
    public static final ResourceLocation REDSTONE_ORE_RL = new ResourceLocation(MODID, OreFeatureLists.REDSTONE_ORE_FEATURE_ID);
    public static final ResourceLocation LAPIS_ORE_RL = new ResourceLocation(MODID, OreFeatureLists.LAPIS_ORE_FEATURE_ID);
    public static final ResourceLocation COAL_ORE_RL = new ResourceLocation(MODID, OreFeatureLists.COAL_ORE_FEATURE_ID);
    public static final ResourceLocation SILVER_ORE_RL = new ResourceLocation(MODID, OreFeatureLists.SILVER_ORE_FEATURE_ID);
    public static final ResourceLocation IRON_ORE_RL = new ResourceLocation(MODID, OreFeatureLists.IRON_ORE_FEATURE_ID);
    public static final ResourceLocation LEAD_ORE_RL = new ResourceLocation(MODID, OreFeatureLists.LEAD_ORE_FEATURE_ID);
    public static final ResourceLocation NICKEL_ORE_RL = new ResourceLocation(MODID, OreFeatureLists.NICKEL_ORE_FEATURE_ID);
    public static final ResourceLocation COPPER_ORE_RL = new ResourceLocation(MODID, OreFeatureLists.COPPER_ORE_FEATURE_ID);
    public static final ResourceLocation ALUMINUM_ORE_RL = new ResourceLocation(MODID, OreFeatureLists.ALUMINUM_ORE_FEATURE_ID);
    public static final ResourceLocation TIN_ORE_RL = new ResourceLocation(MODID, OreFeatureLists.TIN_ORE_FEATURE_ID);
    public static final ResourceLocation OSMIUM_ORE_RL = new ResourceLocation(MODID, OreFeatureLists.OSMIUM_ORE_FEATURE_ID);
    public static final ResourceLocation URANIUM_ORE_RL = new ResourceLocation(MODID, OreFeatureLists.URANIUM_ORE_FEATURE_ID);
    public static final ResourceLocation ZINC_ORE_RL = new ResourceLocation(MODID, OreFeatureLists.ZINC_ORE_FEATURE_ID);

    public static final  ResourceKey<PlacedFeature> EMERALD_ORE_KEY = ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, EMERALD_ORE_RL);
    public static final  ResourceKey<PlacedFeature> DIAMOND_ORE_KEY = ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, DIAMOND_ORE_RL);
    public static final  ResourceKey<PlacedFeature> REDSTONE_ORE_KEY = ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, REDSTONE_ORE_RL);
    public static final  ResourceKey<PlacedFeature> LAPIS_ORE_KEY = ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, LAPIS_ORE_RL);
    public static final  ResourceKey<PlacedFeature> COAL_ORE_KEY = ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, COAL_ORE_RL);
    public static final  ResourceKey<PlacedFeature> SILVER_ORE_KEY = ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, SILVER_ORE_RL);
    public static final  ResourceKey<PlacedFeature> IRON_ORE_KEY = ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, IRON_ORE_RL);
    public static final  ResourceKey<PlacedFeature> LEAD_ORE_KEY = ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, LEAD_ORE_RL);
    public static final  ResourceKey<PlacedFeature> NICKEL_ORE_KEY = ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, NICKEL_ORE_RL);
    public static final  ResourceKey<PlacedFeature> COPPER_ORE_KEY = ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, COPPER_ORE_RL);
    public static final  ResourceKey<PlacedFeature> ALUMINUM_ORE_KEY = ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, ALUMINUM_ORE_RL);
    public static final  ResourceKey<PlacedFeature> TIN_ORE_KEY = ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, TIN_ORE_RL);
    public static final  ResourceKey<PlacedFeature> OSMIUM_ORE_KEY = ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, OSMIUM_ORE_RL);
    public static final  ResourceKey<PlacedFeature> URANIUM_ORE_KEY = ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, URANIUM_ORE_RL);
    public static final  ResourceKey<PlacedFeature> ZINC_ORE_KEY = ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, ZINC_ORE_RL);

}
