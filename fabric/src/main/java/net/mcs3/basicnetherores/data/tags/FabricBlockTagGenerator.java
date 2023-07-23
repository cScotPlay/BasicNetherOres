package net.mcs3.basicnetherores.data.tags;

import net.mcs3.basicnetherores.init.BNOBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

public class FabricBlockTagGenerator extends VanillaBlockTagGenerator {

    public static final TagKey<Block> ORES = blockTag(new ResourceLocation("c", "ores"));

    public static final TagKey<Block> ORES_EMERALD = blockTag(new ResourceLocation("c", "emerald_ores"));
    public static final TagKey<Block> ORES_DIAMOND = blockTag(new ResourceLocation("c", "diamond_ores"));
    public static final TagKey<Block> ORES_REDSTONE = blockTag(new ResourceLocation("c", "redstone_ores"));
    public static final TagKey<Block> ORES_LAPIS = blockTag(new ResourceLocation("c", "lapis_ores"));
    public static final TagKey<Block> ORES_COAL = blockTag(new ResourceLocation("c", "coal_ores"));
    public static final TagKey<Block> ORES_IRON = blockTag(new ResourceLocation("c", "iron_ores"));
    public static final TagKey<Block> ORES_ALUMINUM = blockTag(new ResourceLocation("c", "aluminum_ores"));
    public static final TagKey<Block> ORES_SILVER = blockTag(new ResourceLocation("c", "silver_ores"));
    public static final TagKey<Block> ORES_LEAD = blockTag(new ResourceLocation("c", "lead_ores"));
    public static final TagKey<Block> ORES_NICKEL = blockTag(new ResourceLocation("c", "nickel_ores"));
    public static final TagKey<Block> ORES_COPPER = blockTag(new ResourceLocation("c", "copper_ores"));
    public static final TagKey<Block> ORES_TIN = blockTag(new ResourceLocation("c", "tin_ores"));
    public static final TagKey<Block> ORES_OSMIUM = blockTag(new ResourceLocation("c", "osmium_ores"));
    public static final TagKey<Block> ORES_URANIUM = blockTag(new ResourceLocation("c", "uranium_ores"));
    public static final TagKey<Block> ORES_ZINC = blockTag(new ResourceLocation("c", "zinc_ores"));

    public static final TagKey<Block> ALUMINUM_BLOCK = blockTag(new ResourceLocation("c", "aluminum_blocks"));
    public static final TagKey<Block> SILVER_BLOCK = blockTag(new ResourceLocation("c", "silver_blocks"));
    public static final TagKey<Block> LEAD_BLOCK = blockTag(new ResourceLocation("c", "lead_blocks"));
    public static final TagKey<Block> NICKEL_BLOCK = blockTag(new ResourceLocation("c", "nickel_blocks"));
    public static final TagKey<Block> TIN_BLOCK = blockTag(new ResourceLocation("c", "tin_blocks"));
    public static final TagKey<Block> OSMIUM_BLOCK = blockTag(new ResourceLocation("c", "osmium_blocks"));
    public static final TagKey<Block> URANIUM_BLOCK = blockTag(new ResourceLocation("c", "uranium_blocks"));
    public static final TagKey<Block> ZINC_BLOCK = blockTag(new ResourceLocation("c", "zinc_blocks"));

    public static final TagKey<Block> RAW_ALUMINUM_BLOCK = blockTag(new ResourceLocation("c", "raw_aluminum_blocks"));
    public static final TagKey<Block> RAW_SILVER_BLOCK = blockTag(new ResourceLocation("c", "raw_silver_blocks"));
    public static final TagKey<Block> RAW_LEAD_BLOCK = blockTag(new ResourceLocation("c", "raw_lead_blocks"));
    public static final TagKey<Block> RAW_NICKEL_BLOCK = blockTag(new ResourceLocation("c", "raw_nickel_blocks"));
    public static final TagKey<Block> RAW_TIN_BLOCK = blockTag(new ResourceLocation("c", "raw_tin_blocks"));
    public static final TagKey<Block> RAW_OSMIUM_BLOCK = blockTag(new ResourceLocation("c", "raw_osmium_blocks"));
    public static final TagKey<Block> RAW_URANIUM_BLOCK = blockTag(new ResourceLocation("c", "raw_uranium_blocks"));
    public static final TagKey<Block> RAW_ZINC_BLOCK = blockTag(new ResourceLocation("c", "raw_zinc_blocks"));

    public FabricBlockTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    private static TagKey<Block> blockTag(ResourceLocation location) {
        return TagKey.create(Registries.BLOCK, location);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {

        // ***************************************************************************** //
        //  Fabric Tags (Only Account for Fabric Tags Here)
        // ***************************************************************************** //

        tag(ORES).add(
                BNOBlocks.NETHER_EMERALD_ORE,
                BNOBlocks.NETHER_DIAMOND_ORE,
                BNOBlocks.NETHER_REDSTONE_ORE,
                BNOBlocks.NETHER_LAPIS_ORE,
                BNOBlocks.NETHER_COAL_ORE,
                BNOBlocks.NETHER_SILVER_ORE,
                BNOBlocks.NETHER_IRON_ORE,
                BNOBlocks.NETHER_LEAD_ORE,
                BNOBlocks.NETHER_NICKEL_ORE,
                BNOBlocks.NETHER_COPPER_ORE,
                BNOBlocks.NETHER_ALUMINUM_ORE,
                BNOBlocks.NETHER_TIN_ORE,
                BNOBlocks.NETHER_OSMIUM_ORE,
                BNOBlocks.NETHER_URANIUM_ORE,
                BNOBlocks.NETHER_ZINC_ORE
        );

        tag(ORES_COAL).add(BNOBlocks.NETHER_COAL_ORE);
        tag(ORES_DIAMOND).add(BNOBlocks.NETHER_DIAMOND_ORE);
        tag(ORES_EMERALD).add(BNOBlocks.NETHER_EMERALD_ORE);
        tag(ORES_IRON).add(BNOBlocks.NETHER_IRON_ORE);
        tag(ORES_LAPIS).add(BNOBlocks.NETHER_LAPIS_ORE);
        tag(ORES_REDSTONE).add(BNOBlocks.NETHER_REDSTONE_ORE);

        tag(ORES_ALUMINUM).add(BNOBlocks.NETHER_ALUMINUM_ORE);
        tag(ORES_SILVER).add(BNOBlocks.NETHER_SILVER_ORE);
        tag(ORES_LEAD).add(BNOBlocks.NETHER_LEAD_ORE);
        tag(ORES_NICKEL).add(BNOBlocks.NETHER_NICKEL_ORE);
        tag(ORES_COPPER).add(BNOBlocks.NETHER_COPPER_ORE);
        tag(ORES_TIN).add(BNOBlocks.NETHER_TIN_ORE);
        tag(ORES_OSMIUM).add(BNOBlocks.NETHER_OSMIUM_ORE);
        tag(ORES_URANIUM).add(BNOBlocks.NETHER_URANIUM_ORE);
        tag(ORES_ZINC).add(BNOBlocks.NETHER_ZINC_ORE);

        tag(ALUMINUM_BLOCK).add(BNOBlocks.ALUMINUM_BLOCK);
        tag(SILVER_BLOCK).add(BNOBlocks.SILVER_BLOCK);
        tag(LEAD_BLOCK).add(BNOBlocks.LEAD_BLOCK);
        tag(NICKEL_BLOCK).add(BNOBlocks.NICKEL_BLOCK);
        tag(TIN_BLOCK).add(BNOBlocks.TIN_BLOCK);
        tag(OSMIUM_BLOCK).add(BNOBlocks.OSMIUM_BLOCK);
        tag(URANIUM_BLOCK).add(BNOBlocks.URANIUM_BLOCK);
        tag(ZINC_BLOCK).add(BNOBlocks.ZINC_BLOCK);

        tag(RAW_ALUMINUM_BLOCK).add(BNOBlocks.RAW_ALUMINUM_BLOCK);
        tag(RAW_SILVER_BLOCK).add(BNOBlocks.RAW_SILVER_BLOCK);
        tag(RAW_LEAD_BLOCK).add(BNOBlocks.RAW_LEAD_BLOCK);
        tag(RAW_NICKEL_BLOCK).add(BNOBlocks.RAW_NICKEL_BLOCK);
        tag(RAW_TIN_BLOCK).add(BNOBlocks.RAW_TIN_BLOCK);
        tag(RAW_OSMIUM_BLOCK).add(BNOBlocks.RAW_OSMIUM_BLOCK);
        tag(RAW_URANIUM_BLOCK).add(BNOBlocks.RAW_URANIUM_BLOCK);
        tag(RAW_ZINC_BLOCK).add(BNOBlocks.RAW_ZINC_BLOCK);
    }
}
