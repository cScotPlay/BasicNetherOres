package com.cscot.basicnetherores.client;

import com.cscot.basicnetherores.api.OreBlockLists;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class ClientHandler implements ClientModInitializer
{
    @Override
    public void onInitializeClient()
    {
        ShippedResourcePacks.extractFiles("Basic Nether Ores 16x");
        registerRenderTypes();
    }

    private static void registerRenderTypes()
    {
        BlockRenderLayerMap.INSTANCE.putBlock(OreBlockLists.NETHER_EMERALD_ORE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OreBlockLists.NETHER_DIAMOND_ORE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OreBlockLists.NETHER_REDSTONE_ORE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OreBlockLists.NETHER_LAPIS_ORE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OreBlockLists.NETHER_COAL_ORE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OreBlockLists.NETHER_SILVER_ORE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OreBlockLists.NETHER_IRON_ORE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OreBlockLists.NETHER_LEAD_ORE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OreBlockLists.NETHER_NICKEL_ORE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OreBlockLists.NETHER_COPPER_ORE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OreBlockLists.NETHER_ALUMINUM_ORE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OreBlockLists.NETHER_TIN_ORE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OreBlockLists.NETHER_OSMIUM_ORE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OreBlockLists.NETHER_URANIUM_ORE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OreBlockLists.NETHER_ZINC_ORE, RenderLayer.getCutout());

    }
}
