package com.cscot.basicnetherores.client;

import com.cscot.basicnetherores.BasicNetherOres;
import com.cscot.basicnetherores.client.renderer.IHelpRender;
import com.cscot.basicnetherores.world.level.block.ModBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.RegistryObject;

//@OnlyIn(Dist.CLIENT)
//@Mod.EventBusSubscriber(modid = BasicNetherOres.modid, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientHandler
{
    //@SubscribeEvent
    public static void /*clientSetup*/ registerBlockRender(FMLClientSetupEvent event) {

        for (RegistryObject<Block> reg : ModBlocks.BLOCKS.getEntries()) {
            Block block = reg.get();

            if (block instanceof IHelpRender)
                ItemBlockRenderTypes.setRenderLayer(block, ((IHelpRender) block).getRenderType());
        }
    }
}
