package net.mcs3.basicnetherores.data.loottables;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.mcs3.basicnetherores.init.BNOBlocks;
import net.mcs3.basicnetherores.init.BNOItems;
import net.minecraft.world.item.Items;

import java.util.stream.Stream;

public class LootTableGenerator extends FabricBlockLootTableProvider {

    public LootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        Stream.of(
                BNOBlocks.ALUMINUM_BLOCK,
                BNOBlocks.LEAD_BLOCK,
                BNOBlocks.NICKEL_BLOCK,
                BNOBlocks.OSMIUM_BLOCK,
                BNOBlocks.SILVER_BLOCK,
                BNOBlocks.TIN_BLOCK,
                BNOBlocks.URANIUM_BLOCK,
                BNOBlocks.ZINC_BLOCK,

                BNOBlocks.RAW_ALUMINUM_BLOCK,
                BNOBlocks.RAW_LEAD_BLOCK,
                BNOBlocks.RAW_NICKEL_BLOCK,
                BNOBlocks.RAW_OSMIUM_BLOCK,
                BNOBlocks.RAW_SILVER_BLOCK,
                BNOBlocks.RAW_TIN_BLOCK,
                BNOBlocks.RAW_URANIUM_BLOCK,
                BNOBlocks.RAW_ZINC_BLOCK

        ).forEach(this::dropSelf);

        add(BNOBlocks.NETHER_EMERALD_ORE, (block -> createOreDrop(block, Items.EMERALD)));
        add(BNOBlocks.NETHER_DIAMOND_ORE, (block -> createOreDrop(block, Items.DIAMOND)));
        add(BNOBlocks.NETHER_REDSTONE_ORE, (this::createRedstoneOreDrops));
        add(BNOBlocks.NETHER_LAPIS_ORE, (this::createLapisOreDrops));
        add(BNOBlocks.NETHER_COAL_ORE, (block -> createOreDrop(block, Items.COAL)));
        add(BNOBlocks.NETHER_SILVER_ORE, (block -> createOreDrop(block, BNOItems.RAW_SILVER)));
        add(BNOBlocks.NETHER_IRON_ORE, (block -> createOreDrop(block, Items.RAW_IRON)));
        add(BNOBlocks.NETHER_LEAD_ORE, (block -> createOreDrop(block, BNOItems.RAW_LEAD)));
        add(BNOBlocks.NETHER_NICKEL_ORE, (block -> createOreDrop(block, BNOItems.RAW_NICKEL)));
        add(BNOBlocks.NETHER_COPPER_ORE, (this::createCopperOreDrops));
        add(BNOBlocks.NETHER_ALUMINUM_ORE, (block -> createOreDrop(block, BNOItems.RAW_ALUMINUM)));
        add(BNOBlocks.NETHER_TIN_ORE, (block -> createOreDrop(block, BNOItems.RAW_TIN)));
        add(BNOBlocks.NETHER_OSMIUM_ORE, (block -> createOreDrop(block, BNOItems.RAW_OSMIUM)));
        add(BNOBlocks.NETHER_URANIUM_ORE, (block -> createOreDrop(block, BNOItems.RAW_URANIUM)));
        add(BNOBlocks.NETHER_ZINC_ORE, (block -> createOreDrop(block, BNOItems.RAW_ZINC)));
    }
}
