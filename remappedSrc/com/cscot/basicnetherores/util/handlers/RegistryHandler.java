package com.cscot.basicnetherores.util.handlers;

import com.cscot.basicnetherores.BasicNetherOres;
import com.cscot.basicnetherores.api.BlockLists;
import com.cscot.basicnetherores.api.ItemLists;
import com.cscot.basicnetherores.api.OreBlockLists;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RegistryHandler
{
    private static final Logger LOGGER = LogManager.getLogger(BasicNetherOres.MOD_ID);

    //TODO Clean up registery of blocks and items to sequentially load

    public static void onOreRegistry()
    {
        //For loop to register the Array of the ore blocks
        for (Identifier id : OreBlockLists.OREBLOCKS.keySet())
        {
            Registry.register(Registry.BLOCK, id, OreBlockLists.OREBLOCKS.get(id));
        }
        LOGGER.info("BNO Ore Blocks Registered");
    }

    public static void onBlockRegistry()
    {
        for (Identifier id : BlockLists.BLOCKS.keySet())
        {
            Registry.register(Registry.BLOCK, id, BlockLists.BLOCKS.get(id));
        }
        LOGGER.info("BNO Blocks Registered");
    }

    public static void onItemRegistry()
    {
        for (Identifier id : ItemLists.ITEMS.keySet())
        {
            Registry.register(Registry.ITEM, id, ItemLists.ITEMS.get(id));
        }
        LOGGER.info("BNO Items Registered");
    }

    public static void onIngotRegistry()
    {
        for (Identifier id : ItemLists.INGOTS.keySet())
        {
            Registry.register(Registry.ITEM, id, ItemLists.INGOTS.get(id));
        }
        LOGGER.info("BNO Ingots & Nuggets Registered");

    }
}
