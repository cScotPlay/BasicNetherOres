package net.mcs3.basicnetherores.init;

import net.mcs3.basicnetherores.Constants;
import net.mcs3.basicnetherores.worldgen.level.block.ModOreBlock;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

import java.util.function.BiConsumer;

import static net.mcs3.basicnetherores.util.helper.ResourceLocationHelper.prefix;

public class BNOBlocks {

    public static final BlockBehaviour.Properties NETHER_ORES_PROPERTIES = BlockBehaviour.Properties.of().mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.NETHER_GOLD_ORE);


    public static final Block NETHER_EMERALD_ORE = new ModOreBlock(NETHER_ORES_PROPERTIES, UniformInt.of(3, 7));

    public static void registerBlocks(BiConsumer<Block, ResourceLocation> r) {

        r.accept(NETHER_EMERALD_ORE, prefix("nether_emerald_ore"));

        Constants.LOGGER.info("BNO - Block Registered");
    }

    public static void registerItemBlocks(BiConsumer<Item, ResourceLocation> r) {
        Item.Properties properties = BNOItems.defaultBuilder();

        r.accept(new BlockItem(NETHER_EMERALD_ORE, properties), BuiltInRegistries.BLOCK.getKey(NETHER_EMERALD_ORE));

        Constants.LOGGER.info("BNO - Block Items Registered");
    }
}
