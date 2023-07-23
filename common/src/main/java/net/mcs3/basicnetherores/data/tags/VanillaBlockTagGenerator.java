package net.mcs3.basicnetherores.data.tags;

import net.mcs3.basicnetherores.init.BNOBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.IntrinsicHolderTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

public class VanillaBlockTagGenerator extends IntrinsicHolderTagsProvider<Block> {

    public VanillaBlockTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, Registries.BLOCK, lookupProvider, (block) -> block.builtInRegistryHolder().key());
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {

        // ***************************************************************************** //
        //  Vanilla Tags (Only Account for Vanilla Tags Here)
        // ***************************************************************************** //

        tag(BlockTags.EMERALD_ORES).add(BNOBlocks.NETHER_EMERALD_ORE);
        tag(BlockTags.DIAMOND_ORES).add(BNOBlocks.NETHER_DIAMOND_ORE);
        tag(BlockTags.REDSTONE_ORES).add(BNOBlocks.NETHER_REDSTONE_ORE);
        tag(BlockTags.LAPIS_ORES).add(BNOBlocks.NETHER_LAPIS_ORE);
        tag(BlockTags.COAL_ORES).add(BNOBlocks.NETHER_COAL_ORE);
        tag(BlockTags.IRON_ORES).add(BNOBlocks.NETHER_IRON_ORE);
        tag(BlockTags.COPPER_ORES).add(BNOBlocks.NETHER_COPPER_ORE);

        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                BNOBlocks.NETHER_DIAMOND_ORE,
                BNOBlocks.NETHER_EMERALD_ORE,
                BNOBlocks.NETHER_REDSTONE_ORE,
                BNOBlocks.NETHER_COAL_ORE,
                BNOBlocks.NETHER_IRON_ORE,
                BNOBlocks.NETHER_LAPIS_ORE,
                BNOBlocks.NETHER_COPPER_ORE,
                BNOBlocks.NETHER_SILVER_ORE,
                BNOBlocks.RAW_SILVER_BLOCK,
                BNOBlocks.SILVER_BLOCK,
                BNOBlocks.NETHER_LEAD_ORE,
                BNOBlocks.RAW_LEAD_BLOCK,
                BNOBlocks.LEAD_BLOCK,
                BNOBlocks.NETHER_NICKEL_ORE,
                BNOBlocks.RAW_NICKEL_BLOCK,
                BNOBlocks.NICKEL_BLOCK,
                BNOBlocks.NETHER_URANIUM_ORE,
                BNOBlocks.RAW_URANIUM_BLOCK,
                BNOBlocks.URANIUM_BLOCK,
                BNOBlocks.NETHER_ZINC_ORE,
                BNOBlocks.RAW_ZINC_BLOCK,
                BNOBlocks.ZINC_BLOCK,
                BNOBlocks.NETHER_ALUMINUM_ORE,
                BNOBlocks.RAW_ALUMINUM_BLOCK,
                BNOBlocks.ALUMINUM_BLOCK,
                BNOBlocks.NETHER_TIN_ORE,
                BNOBlocks.RAW_TIN_BLOCK,
                BNOBlocks.TIN_BLOCK,
                BNOBlocks.NETHER_OSMIUM_ORE,
                BNOBlocks.RAW_OSMIUM_BLOCK,
                BNOBlocks.OSMIUM_BLOCK
        );

        tag(BlockTags.NEEDS_IRON_TOOL).add(
                BNOBlocks.NETHER_DIAMOND_ORE,
                BNOBlocks.NETHER_EMERALD_ORE,
                BNOBlocks.NETHER_REDSTONE_ORE,
                BNOBlocks.NETHER_SILVER_ORE,
                BNOBlocks.RAW_SILVER_BLOCK,
                BNOBlocks.SILVER_BLOCK,
                BNOBlocks.NETHER_LEAD_ORE,
                BNOBlocks.RAW_LEAD_BLOCK,
                BNOBlocks.LEAD_BLOCK,
                BNOBlocks.NETHER_NICKEL_ORE,
                BNOBlocks.RAW_NICKEL_BLOCK,
                BNOBlocks.NICKEL_BLOCK,
                BNOBlocks.NETHER_URANIUM_ORE,
                BNOBlocks.RAW_URANIUM_BLOCK,
                BNOBlocks.URANIUM_BLOCK,
                BNOBlocks.NETHER_ZINC_ORE,
                BNOBlocks.RAW_ZINC_BLOCK,
                BNOBlocks.ZINC_BLOCK
        );

        tag(BlockTags.NEEDS_STONE_TOOL).add(
                BNOBlocks.NETHER_IRON_ORE,
                BNOBlocks.NETHER_LAPIS_ORE,
                BNOBlocks.NETHER_COPPER_ORE,
                BNOBlocks.NETHER_ALUMINUM_ORE,
                BNOBlocks.RAW_ALUMINUM_BLOCK,
                BNOBlocks.ALUMINUM_BLOCK,
                BNOBlocks.NETHER_TIN_ORE,
                BNOBlocks.RAW_TIN_BLOCK,
                BNOBlocks.TIN_BLOCK,
                BNOBlocks.NETHER_OSMIUM_ORE,
                BNOBlocks.RAW_OSMIUM_BLOCK,
                BNOBlocks.OSMIUM_BLOCK
        );
    }
}
