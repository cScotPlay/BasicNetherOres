package net.mcs3.basicnetherores.client.renderer;

import net.mcs3.basicnetherores.init.BNOBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;

import java.util.function.BiConsumer;

public class BlockRenderLayers {

    public static void registerRenderLayers(BiConsumer<Block, RenderType> consumer) {

        consumer.accept(BNOBlocks.NETHER_EMERALD_ORE, RenderType.cutout());
    }

    private BlockRenderLayers() {}
}
