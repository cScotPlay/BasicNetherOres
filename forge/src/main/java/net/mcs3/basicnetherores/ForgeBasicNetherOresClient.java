package net.mcs3.basicnetherores;

import net.mcs3.basicnetherores.client.ShippedResourcePack;
import net.mcs3.basicnetherores.client.renderer.BlockRenderLayers;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Constants.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ForgeBasicNetherOresClient {

    @SubscribeEvent
    public static void clientInit(FMLClientSetupEvent evt) {
        ShippedResourcePack.extractFiles("Basic Nether Ores 32x");
        BlockRenderLayers.registerRenderLayers(ItemBlockRenderTypes::setRenderLayer);
    }
}
