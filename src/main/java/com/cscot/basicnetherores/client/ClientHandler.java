package com.cscot.basicnetherores.client;


import com.cscot.basicnetherores.client.renderer.IHelpRender;
import com.cscot.basicnetherores.world.level.block.ModBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.RegistryObject;

public class ClientHandler
{
    public static void registerBlockRender(FMLClientSetupEvent event) {

        for (RegistryObject<Block> reg : ModBlocks.BLOCKS.getEntries()) {
            Block block = reg.get();

            if (block instanceof IHelpRender)
                ItemBlockRenderTypes.setRenderLayer(block, ((IHelpRender) block).getRenderType());
        }
    }
}
