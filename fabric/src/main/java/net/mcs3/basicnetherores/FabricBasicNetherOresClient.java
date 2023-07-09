package net.mcs3.basicnetherores;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.mcs3.basicnetherores.client.renderer.BlockRenderLayers;

public class FabricBasicNetherOresClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        BlockRenderLayers.registerRenderLayers(BlockRenderLayerMap.INSTANCE::putBlock);
    }


}
