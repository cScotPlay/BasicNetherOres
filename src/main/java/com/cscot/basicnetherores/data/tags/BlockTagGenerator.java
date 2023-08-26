package com.cscot.basicnetherores.data.tags;

import com.cscot.basicnetherores.api.BlockLists;
import com.cscot.basicnetherores.api.OreBlockLists;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.tag.BlockTags;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.cscot.basicnetherores.api.OreBlockLists.*;
import static com.cscot.basicnetherores.api.BlockLists.*;

public class BlockTagGenerator extends FabricTagProvider.BlockTagProvider {

    public BlockTagGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    public static final TagKey<Block> ORES = blockTag(new Identifier("c", "ores"));

    public static final TagKey<Block> ORES_EMERALD = blockTag(new Identifier("c", "emerald_ores"));
    public static final TagKey<Block> ORES_DIAMOND = blockTag(new Identifier("c", "diamond_ores"));
    public static final TagKey<Block> ORES_REDSTONE = blockTag(new Identifier("c", "redstone_ores"));
    public static final TagKey<Block> ORES_LAPIS = blockTag(new Identifier("c", "lapis_ores"));
    public static final TagKey<Block> ORES_COAL = blockTag(new Identifier("c", "coal_ores"));
    public static final TagKey<Block> ORES_IRON = blockTag(new Identifier("c", "iron_ores"));
    public static final TagKey<Block> ORES_ALUMINUM = blockTag(new Identifier("c", "aluminum_ores"));
    public static final TagKey<Block> ORES_SILVER = blockTag(new Identifier("c", "silver_ores"));
    public static final TagKey<Block> ORES_LEAD = blockTag(new Identifier("c", "lead_ores"));
    public static final TagKey<Block> ORES_NICKEL = blockTag(new Identifier("c", "nickel_ores"));
    public static final TagKey<Block> ORES_COPPER = blockTag(new Identifier("c", "copper_ores"));
    public static final TagKey<Block> ORES_TIN = blockTag(new Identifier("c", "tin_ores"));
    public static final TagKey<Block> ORES_OSMIUM = blockTag(new Identifier("c", "osmium_ores"));
    public static final TagKey<Block> ORES_URANIUM = blockTag(new Identifier("c", "uranium_ores"));
    public static final TagKey<Block> ORES_ZINC = blockTag(new Identifier("c", "zinc_ores"));

    public static final TagKey<Block> ALUMINUM_BLOCK_TAG = blockTag(new Identifier("c", "aluminum_blocks"));
    public static final TagKey<Block> SILVER_BLOCK_TAG = blockTag(new Identifier("c", "silver_blocks"));
    public static final TagKey<Block> LEAD_BLOCK_TAG = blockTag(new Identifier("c", "lead_blocks"));
    public static final TagKey<Block> NICKEL_BLOCK_TAG = blockTag(new Identifier("c", "nickel_blocks"));
    public static final TagKey<Block> TIN_BLOCK_TAG = blockTag(new Identifier("c", "tin_blocks"));
    public static final TagKey<Block> OSMIUM_BLOCK_TAG = blockTag(new Identifier("c", "osmium_blocks"));
    public static final TagKey<Block> URANIUM_BLOCK_TAG = blockTag(new Identifier("c", "uranium_blocks"));
    public static final TagKey<Block> ZINC_BLOCK_TAG = blockTag(new Identifier("c", "zinc_blocks"));

    public static final TagKey<Block> RAW_ALUMINUM_BLOCK_TAG = blockTag(new Identifier("c", "raw_aluminum_blocks"));
    public static final TagKey<Block> RAW_SILVER_BLOCK_TAG = blockTag(new Identifier("c", "raw_silver_blocks"));
    public static final TagKey<Block> RAW_LEAD_BLOCK_TAG = blockTag(new Identifier("c", "raw_lead_blocks"));
    public static final TagKey<Block> RAW_NICKEL_BLOCK_TAG = blockTag(new Identifier("c", "raw_nickel_blocks"));
    public static final TagKey<Block> RAW_TIN_BLOCK_TAG = blockTag(new Identifier("c", "raw_tin_blocks"));
    public static final TagKey<Block> RAW_OSMIUM_BLOCK_TAG = blockTag(new Identifier("c", "raw_osmium_blocks"));
    public static final TagKey<Block> RAW_URANIUM_BLOCK_TAG = blockTag(new Identifier("c", "raw_uranium_blocks"));
    public static final TagKey<Block> RAW_ZINC_BLOCK_TAG = blockTag(new Identifier("c", "raw_zinc_blocks"));

    @Override
    protected void generateTags() {

        getOrCreateTagBuilder(BlockTags.EMERALD_ORES).add(NETHER_EMERALD_ORE);
        getOrCreateTagBuilder(BlockTags.DIAMOND_ORES).add(NETHER_DIAMOND_ORE);
        getOrCreateTagBuilder(BlockTags.REDSTONE_ORES).add(NETHER_REDSTONE_ORE);
        getOrCreateTagBuilder(BlockTags.LAPIS_ORES).add(NETHER_LAPIS_ORE);
        getOrCreateTagBuilder(BlockTags.COAL_ORES).add(NETHER_COAL_ORE);
        getOrCreateTagBuilder(BlockTags.IRON_ORES).add(NETHER_IRON_ORE);
        getOrCreateTagBuilder(BlockTags.COPPER_ORES).add(NETHER_COPPER_ORE);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(
                NETHER_DIAMOND_ORE,
                NETHER_EMERALD_ORE,
                NETHER_REDSTONE_ORE,
                NETHER_COAL_ORE,
                NETHER_IRON_ORE,
                NETHER_LAPIS_ORE,
                NETHER_COPPER_ORE,
                NETHER_SILVER_ORE,
                RAW_SILVER_BLOCK,
                SILVER_BLOCK,
                NETHER_LEAD_ORE,
                RAW_LEAD_BLOCK,
                LEAD_BLOCK,
                NETHER_NICKEL_ORE,
                RAW_NICKEL_BLOCK,
                NICKEL_BLOCK,
                NETHER_URANIUM_ORE,
                RAW_URANIUM_BLOCK,
                URANIUM_BLOCK,
                NETHER_ZINC_ORE,
                RAW_ZINC_BLOCK,
                ZINC_BLOCK,
                NETHER_ALUMINUM_ORE,
                RAW_ALUMINUM_BLOCK,
                ALUMINUM_BLOCK,
                NETHER_TIN_ORE,
                RAW_TIN_BLOCK,
                TIN_BLOCK,
                NETHER_OSMIUM_ORE,
                RAW_OSMIUM_BLOCK,
                OSMIUM_BLOCK
        );

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL).add(
                NETHER_DIAMOND_ORE,
                NETHER_EMERALD_ORE,
                NETHER_REDSTONE_ORE,
                NETHER_SILVER_ORE,
                RAW_SILVER_BLOCK,
                SILVER_BLOCK,
                NETHER_LEAD_ORE,
                RAW_LEAD_BLOCK,
                LEAD_BLOCK,
                NETHER_NICKEL_ORE,
                RAW_NICKEL_BLOCK,
                NICKEL_BLOCK,
                NETHER_URANIUM_ORE,
                RAW_URANIUM_BLOCK,
                URANIUM_BLOCK,
                NETHER_ZINC_ORE,
                RAW_ZINC_BLOCK,
                ZINC_BLOCK
        );

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL).add(
                NETHER_IRON_ORE,
                NETHER_LAPIS_ORE,
                NETHER_COPPER_ORE,
                NETHER_ALUMINUM_ORE,
                RAW_ALUMINUM_BLOCK,
                ALUMINUM_BLOCK,
                NETHER_TIN_ORE,
                RAW_TIN_BLOCK,
                TIN_BLOCK,
                NETHER_OSMIUM_ORE,
                RAW_OSMIUM_BLOCK,
                OSMIUM_BLOCK
        );

        // ***************************************************************************** //
        //  Fabric Tags (Only Account for Fabric Tags Here)
        // ***************************************************************************** //

        getOrCreateTagBuilder(ORES).add(
                NETHER_EMERALD_ORE,
                NETHER_DIAMOND_ORE,
                NETHER_REDSTONE_ORE,
                NETHER_LAPIS_ORE,
                NETHER_COAL_ORE,
                NETHER_SILVER_ORE,
                NETHER_IRON_ORE,
                NETHER_LEAD_ORE,
                NETHER_NICKEL_ORE,
                NETHER_COPPER_ORE,
                NETHER_ALUMINUM_ORE,
                NETHER_TIN_ORE,
                NETHER_OSMIUM_ORE,
                NETHER_URANIUM_ORE,
                NETHER_ZINC_ORE
        );

        getOrCreateTagBuilder(ORES_COAL).add(NETHER_COAL_ORE);
        getOrCreateTagBuilder(ORES_DIAMOND).add(NETHER_DIAMOND_ORE);
        getOrCreateTagBuilder(ORES_EMERALD).add(NETHER_EMERALD_ORE);
        getOrCreateTagBuilder(ORES_IRON).add(NETHER_IRON_ORE);
        getOrCreateTagBuilder(ORES_LAPIS).add(NETHER_LAPIS_ORE);
        getOrCreateTagBuilder(ORES_REDSTONE).add(NETHER_REDSTONE_ORE);

        getOrCreateTagBuilder(ORES_ALUMINUM).add(NETHER_ALUMINUM_ORE);
        getOrCreateTagBuilder(ORES_SILVER).add(NETHER_SILVER_ORE);
        getOrCreateTagBuilder(ORES_LEAD).add(NETHER_LEAD_ORE);
        getOrCreateTagBuilder(ORES_NICKEL).add(NETHER_NICKEL_ORE);
        getOrCreateTagBuilder(ORES_COPPER).add(NETHER_COPPER_ORE);
        getOrCreateTagBuilder(ORES_TIN).add(NETHER_TIN_ORE);
        getOrCreateTagBuilder(ORES_OSMIUM).add(NETHER_OSMIUM_ORE);
        getOrCreateTagBuilder(ORES_URANIUM).add(NETHER_URANIUM_ORE);
        getOrCreateTagBuilder(ORES_ZINC).add(NETHER_ZINC_ORE);

        getOrCreateTagBuilder(ALUMINUM_BLOCK_TAG).add(ALUMINUM_BLOCK);
        getOrCreateTagBuilder(SILVER_BLOCK_TAG).add(SILVER_BLOCK);
        getOrCreateTagBuilder(LEAD_BLOCK_TAG).add(LEAD_BLOCK);
        getOrCreateTagBuilder(NICKEL_BLOCK_TAG).add(NICKEL_BLOCK);
        getOrCreateTagBuilder(TIN_BLOCK_TAG).add(TIN_BLOCK);
        getOrCreateTagBuilder(OSMIUM_BLOCK_TAG).add(OSMIUM_BLOCK);
        getOrCreateTagBuilder(URANIUM_BLOCK_TAG).add(URANIUM_BLOCK);
        getOrCreateTagBuilder(ZINC_BLOCK_TAG).add(ZINC_BLOCK);

        getOrCreateTagBuilder(RAW_ALUMINUM_BLOCK_TAG).add(RAW_ALUMINUM_BLOCK);
        getOrCreateTagBuilder(RAW_SILVER_BLOCK_TAG).add(RAW_SILVER_BLOCK);
        getOrCreateTagBuilder(RAW_LEAD_BLOCK_TAG).add(RAW_LEAD_BLOCK);
        getOrCreateTagBuilder(RAW_NICKEL_BLOCK_TAG).add(RAW_NICKEL_BLOCK);
        getOrCreateTagBuilder(RAW_TIN_BLOCK_TAG).add(RAW_TIN_BLOCK);
        getOrCreateTagBuilder(RAW_OSMIUM_BLOCK_TAG).add(RAW_OSMIUM_BLOCK);
        getOrCreateTagBuilder(RAW_URANIUM_BLOCK_TAG).add(RAW_URANIUM_BLOCK);
        getOrCreateTagBuilder(RAW_ZINC_BLOCK_TAG).add(RAW_ZINC_BLOCK);

    }

    private static TagKey<Block> blockTag(Identifier location) {
        return TagKey.of(Registry.BLOCK_KEY, location);
    }
}
