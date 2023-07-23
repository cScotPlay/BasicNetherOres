package net.mcs3.basicnetherores;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.mcs3.basicnetherores.client.ShippedResourcePack;
import net.mcs3.basicnetherores.client.renderer.BlockRenderLayers;

public class FabricBasicNetherOresClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        ShippedResourcePack.extractFiles("Basic Nether Ores 32x");
        BlockRenderLayers.registerRenderLayers(BlockRenderLayerMap.INSTANCE::putBlock);
    }


}
