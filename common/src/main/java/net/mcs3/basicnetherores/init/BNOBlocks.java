package net.mcs3.basicnetherores.init;

import net.mcs3.basicnetherores.Constants;
import net.mcs3.basicnetherores.worldgen.level.block.ModOreBlock;
import net.mcs3.basicnetherores.worldgen.level.block.ModRedstoneOreBlock;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

import java.util.function.BiConsumer;
import java.util.function.ToIntFunction;

import static net.mcs3.basicnetherores.util.helper.ResourceLocationHelper.prefix;

public class BNOBlocks {

    public static final BlockBehaviour.Properties NETHER_ORES_PROPERTIES = BlockBehaviour.Properties.of().mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.NETHER_GOLD_ORE);
    public static final BlockBehaviour.Properties REDSTONE_ORE_PROPERTIES = BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().randomTicks().lightLevel(litBlockEmission(9)).strength(3.0F, 3.0F).sound(SoundType.NETHER_GOLD_ORE);
    public static final BlockBehaviour.Properties METAL_BLOCKS = BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.XYLOPHONE).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL);
    public static final BlockBehaviour.Properties RAW_ORE_BLOCKS = BlockBehaviour.Properties.of().mapColor(MapColor.RAW_IRON).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(5.0F, 6.0F);

    public static final Block NETHER_EMERALD_ORE = new ModOreBlock(NETHER_ORES_PROPERTIES, UniformInt.of(3, 7));
    public static final Block NETHER_DIAMOND_ORE = new ModOreBlock(NETHER_ORES_PROPERTIES, UniformInt.of(3,7));
    public static final Block NETHER_REDSTONE_ORE = new ModRedstoneOreBlock(REDSTONE_ORE_PROPERTIES);
    public static final Block NETHER_LAPIS_ORE = new ModOreBlock(NETHER_ORES_PROPERTIES, UniformInt.of(2,5));
    public static final Block NETHER_COAL_ORE = new ModOreBlock(NETHER_ORES_PROPERTIES, UniformInt.of(0,2));
    public static final Block NETHER_SILVER_ORE = new ModOreBlock(NETHER_ORES_PROPERTIES);
    public static final Block NETHER_IRON_ORE = new ModOreBlock(NETHER_ORES_PROPERTIES);
    public static final Block NETHER_LEAD_ORE = new ModOreBlock(NETHER_ORES_PROPERTIES);
    public static final Block NETHER_NICKEL_ORE = new ModOreBlock(NETHER_ORES_PROPERTIES);
    public static final Block NETHER_COPPER_ORE = new ModOreBlock(NETHER_ORES_PROPERTIES);
    public static final Block NETHER_ALUMINUM_ORE = new ModOreBlock(NETHER_ORES_PROPERTIES);
    public static final Block NETHER_TIN_ORE = new ModOreBlock(NETHER_ORES_PROPERTIES);
    public static final Block NETHER_OSMIUM_ORE = new ModOreBlock(NETHER_ORES_PROPERTIES);
    public static final Block NETHER_URANIUM_ORE = new ModOreBlock(NETHER_ORES_PROPERTIES);
    public static final Block NETHER_ZINC_ORE = new ModOreBlock(NETHER_ORES_PROPERTIES);

    public static final Block ALUMINUM_BLOCK = new Block(METAL_BLOCKS);
    public static final Block LEAD_BLOCK = new Block(METAL_BLOCKS);
    public static final Block NICKEL_BLOCK = new Block(METAL_BLOCKS);
    public static final Block SILVER_BLOCK = new Block(METAL_BLOCKS);
    public static final Block TIN_BLOCK = new Block(METAL_BLOCKS);
    public static final Block OSMIUM_BLOCK = new Block(METAL_BLOCKS);
    public static final Block URANIUM_BLOCK = new Block(METAL_BLOCKS);
    public static final Block ZINC_BLOCK = new Block(METAL_BLOCKS);

    public static final Block RAW_ALUMINUM_BLOCK = new Block(RAW_ORE_BLOCKS);
    public static final Block RAW_LEAD_BLOCK = new Block(RAW_ORE_BLOCKS);
    public static final Block RAW_NICKEL_BLOCK = new Block(RAW_ORE_BLOCKS);
    public static final Block RAW_SILVER_BLOCK = new Block(RAW_ORE_BLOCKS);
    public static final Block RAW_TIN_BLOCK = new Block(RAW_ORE_BLOCKS);
    public static final Block RAW_OSMIUM_BLOCK = new Block(RAW_ORE_BLOCKS);
    public static final Block RAW_URANIUM_BLOCK = new Block(RAW_ORE_BLOCKS);
    public static final Block RAW_ZINC_BLOCK = new Block(RAW_ORE_BLOCKS);

    public static void registerBlocks(BiConsumer<Block, ResourceLocation> r) {

        r.accept(NETHER_EMERALD_ORE, prefix("nether_emerald_ore"));
        r.accept(NETHER_DIAMOND_ORE, prefix("nether_diamond_ore"));
        r.accept(NETHER_REDSTONE_ORE, prefix("nether_redstone_ore"));
        r.accept(NETHER_LAPIS_ORE, prefix("nether_lapis_ore"));
        r.accept(NETHER_COAL_ORE, prefix("nether_coal_ore"));
        r.accept(NETHER_SILVER_ORE, prefix("nether_silver_ore"));
        r.accept(NETHER_IRON_ORE, prefix("nether_iron_ore"));
        r.accept(NETHER_LEAD_ORE, prefix("nether_lead_ore"));
        r.accept(NETHER_NICKEL_ORE, prefix("nether_nickel_ore"));
        r.accept(NETHER_COPPER_ORE, prefix("nether_copper_ore"));
        r.accept(NETHER_ALUMINUM_ORE, prefix("nether_aluminum_ore"));
        r.accept(NETHER_TIN_ORE, prefix("nether_tin_ore"));
        r.accept(NETHER_OSMIUM_ORE, prefix("nether_osmium_ore"));
        r.accept(NETHER_URANIUM_ORE, prefix("nether_uranium_ore"));
        r.accept(NETHER_ZINC_ORE, prefix("nether_zinc_ore"));

        r.accept(ALUMINUM_BLOCK, prefix("aluminum_block"));
        r.accept(LEAD_BLOCK, prefix("lead_block"));
        r.accept(NICKEL_BLOCK, prefix("nickel_block"));
        r.accept(SILVER_BLOCK, prefix("silver_block"));
        r.accept(TIN_BLOCK, prefix("tin_block"));
        r.accept(OSMIUM_BLOCK, prefix("osmium_block"));
        r.accept(URANIUM_BLOCK, prefix("uranium_block"));
        r.accept(ZINC_BLOCK, prefix("zinc_block"));

        r.accept(RAW_ALUMINUM_BLOCK, prefix("raw_aluminum_block"));
        r.accept(RAW_LEAD_BLOCK, prefix("raw_lead_block"));
        r.accept(RAW_NICKEL_BLOCK, prefix("raw_nickel_block"));
        r.accept(RAW_SILVER_BLOCK, prefix("raw_silver_block"));
        r.accept(RAW_TIN_BLOCK, prefix("raw_tin_block"));
        r.accept(RAW_OSMIUM_BLOCK, prefix("raw_osmium_block"));
        r.accept(RAW_URANIUM_BLOCK, prefix("raw_uranium_block"));
        r.accept(RAW_ZINC_BLOCK, prefix("raw_zinc_block"));

        Constants.LOGGER.info("BNO - Block Registered");
    }

    public static void registerItemBlocks(BiConsumer<Item, ResourceLocation> r) {
        Item.Properties properties = BNOItems.defaultBuilder();

        r.accept(new BlockItem(NETHER_EMERALD_ORE, properties), BuiltInRegistries.BLOCK.getKey(NETHER_EMERALD_ORE));
        r.accept(new BlockItem(NETHER_DIAMOND_ORE, properties), BuiltInRegistries.BLOCK.getKey(NETHER_DIAMOND_ORE));
        r.accept(new BlockItem(NETHER_REDSTONE_ORE, properties), BuiltInRegistries.BLOCK.getKey(NETHER_REDSTONE_ORE));
        r.accept(new BlockItem(NETHER_LAPIS_ORE, properties), BuiltInRegistries.BLOCK.getKey(NETHER_LAPIS_ORE));
        r.accept(new BlockItem(NETHER_COAL_ORE, properties), BuiltInRegistries.BLOCK.getKey(NETHER_COAL_ORE));
        r.accept(new BlockItem(NETHER_SILVER_ORE, properties), BuiltInRegistries.BLOCK.getKey(NETHER_SILVER_ORE));
        r.accept(new BlockItem(NETHER_IRON_ORE, properties), BuiltInRegistries.BLOCK.getKey(NETHER_IRON_ORE));
        r.accept(new BlockItem(NETHER_LEAD_ORE, properties), BuiltInRegistries.BLOCK.getKey(NETHER_LEAD_ORE));
        r.accept(new BlockItem(NETHER_NICKEL_ORE, properties), BuiltInRegistries.BLOCK.getKey(NETHER_NICKEL_ORE));
        r.accept(new BlockItem(NETHER_COPPER_ORE, properties), BuiltInRegistries.BLOCK.getKey(NETHER_COPPER_ORE));
        r.accept(new BlockItem(NETHER_ALUMINUM_ORE, properties), BuiltInRegistries.BLOCK.getKey(NETHER_ALUMINUM_ORE));
        r.accept(new BlockItem(NETHER_TIN_ORE, properties), BuiltInRegistries.BLOCK.getKey(NETHER_TIN_ORE));
        r.accept(new BlockItem(NETHER_OSMIUM_ORE, properties), BuiltInRegistries.BLOCK.getKey(NETHER_OSMIUM_ORE));
        r.accept(new BlockItem(NETHER_URANIUM_ORE, properties), BuiltInRegistries.BLOCK.getKey(NETHER_URANIUM_ORE));
        r.accept(new BlockItem(NETHER_ZINC_ORE, properties), BuiltInRegistries.BLOCK.getKey(NETHER_ZINC_ORE));

        r.accept(new BlockItem(ALUMINUM_BLOCK, properties), BuiltInRegistries.BLOCK.getKey(ALUMINUM_BLOCK));
        r.accept(new BlockItem(LEAD_BLOCK, properties), BuiltInRegistries.BLOCK.getKey(LEAD_BLOCK));
        r.accept(new BlockItem(NICKEL_BLOCK, properties), BuiltInRegistries.BLOCK.getKey(NICKEL_BLOCK));
        r.accept(new BlockItem(SILVER_BLOCK, properties), BuiltInRegistries.BLOCK.getKey(SILVER_BLOCK));
        r.accept(new BlockItem(TIN_BLOCK, properties), BuiltInRegistries.BLOCK.getKey(TIN_BLOCK));
        r.accept(new BlockItem(OSMIUM_BLOCK, properties), BuiltInRegistries.BLOCK.getKey(OSMIUM_BLOCK));
        r.accept(new BlockItem(URANIUM_BLOCK, properties), BuiltInRegistries.BLOCK.getKey(URANIUM_BLOCK));
        r.accept(new BlockItem(ZINC_BLOCK, properties), BuiltInRegistries.BLOCK.getKey(ZINC_BLOCK));

        r.accept(new BlockItem(RAW_ALUMINUM_BLOCK, properties), BuiltInRegistries.BLOCK.getKey(RAW_ALUMINUM_BLOCK));
        r.accept(new BlockItem(RAW_LEAD_BLOCK, properties), BuiltInRegistries.BLOCK.getKey(RAW_LEAD_BLOCK));
        r.accept(new BlockItem(RAW_NICKEL_BLOCK, properties), BuiltInRegistries.BLOCK.getKey(RAW_NICKEL_BLOCK));
        r.accept(new BlockItem(RAW_SILVER_BLOCK, properties), BuiltInRegistries.BLOCK.getKey(RAW_SILVER_BLOCK));
        r.accept(new BlockItem(RAW_TIN_BLOCK, properties), BuiltInRegistries.BLOCK.getKey(RAW_TIN_BLOCK));
        r.accept(new BlockItem(RAW_OSMIUM_BLOCK, properties), BuiltInRegistries.BLOCK.getKey(RAW_OSMIUM_BLOCK));
        r.accept(new BlockItem(RAW_URANIUM_BLOCK, properties), BuiltInRegistries.BLOCK.getKey(RAW_URANIUM_BLOCK));
        r.accept(new BlockItem(RAW_ZINC_BLOCK, properties), BuiltInRegistries.BLOCK.getKey(RAW_ZINC_BLOCK));

        Constants.LOGGER.info("BNO - Block Items Registered");
    }

    private static ToIntFunction<BlockState> litBlockEmission(int $$0) {
        return ($$1) -> $$1.getValue(BlockStateProperties.LIT) ? $$0 : 0;
    }
}
