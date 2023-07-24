package net.mcs3.basicnetherores.client.renderer;

import net.mcs3.basicnetherores.init.BNOBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;

import java.util.function.BiConsumer;

public class BlockRenderLayers {

    public static void registerRenderLayers(BiConsumer<Block, RenderType> consumer) {

        consumer.accept(BNOBlocks.NETHER_EMERALD_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.NETHER_DIAMOND_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.NETHER_REDSTONE_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.NETHER_LAPIS_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.NETHER_COAL_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.NETHER_SILVER_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.NETHER_IRON_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.NETHER_LEAD_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.NETHER_NICKEL_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.NETHER_COPPER_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.NETHER_ALUMINUM_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.NETHER_TIN_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.NETHER_OSMIUM_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.NETHER_URANIUM_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.NETHER_ZINC_ORE, RenderType.cutout());
    }

    private BlockRenderLayers() {}
}
