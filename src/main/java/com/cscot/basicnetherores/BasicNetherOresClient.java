package com.cscot.basicnetherores;

import com.cscot.basicnetherores.client.ClientHandler;
import com.cscot.basicnetherores.client.ShippedResourcePack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class BasicNetherOresClient
{
    public static void clientSetup(IEventBus modEventBus, IEventBus forgeEventBus)
    {
        modEventBus.addListener(BasicNetherOresClient::clientInit);
    }

    public static void clientInit(final FMLClientSetupEvent event)
    {
        ShippedResourcePack.extractFiles("Basic Nether Ores 16x");
//        if(ModList.get().isLoaded("create"))
//        {
//            BasicNetherOres.logger.info("Create is installed");
//        } else BasicNetherOres.logger.info("Create is not installed");
        ClientHandler.registerBlockRender(event);
    }
}
