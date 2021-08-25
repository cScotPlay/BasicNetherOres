package com.cscot.basicnetherores.util.handler;

import com.cscot.basicnetherores.BasicNetherOres;
import com.cscot.basicnetherores.api.BlockList;
import com.cscot.basicnetherores.api.BlockOreList;
import com.cscot.basicnetherores.api.IngotList;
import com.cscot.basicnetherores.api.ItemList;
import com.cscot.basicnetherores.util.helpers.BlockListHelper;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RegisteryHandler
{
    private static final Logger LOGGER = LogManager.getLogger(BasicNetherOres.modid);


    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents
    {
        @SubscribeEvent
        public static void onOreRegistry(final RegistryEvent.Register<Block> oreRegistryEvent)
        {
            //For loop to register the Array of the ore blocks
            for (Block block : BlockOreList.blockores)
            {
                oreRegistryEvent.getRegistry().register(block);
            }

            LOGGER.info("Ore Blocks Registered");

        }

        @SubscribeEvent
        public static void onItemRegistry(final RegistryEvent.Register<Item> itemRegisterEvent)
        {
            //For loop to register Array of the Items from Blocks
            for (Item item : ItemList.items)
            {
                itemRegisterEvent.getRegistry().register(item);
            }

            LOGGER.info("ItemBlocks Registered");
        }

        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent)
        {
            for (Block block : BlockList.blocks) {

                blockRegistryEvent.getRegistry().register(block);
            }

            LOGGER.info("Blocks Registered");
        }

        @SubscribeEvent
        public static void onIngotRegistry(final RegistryEvent.Register<Item> ingotRegistryEvent)
        {
            ingotRegistryEvent.getRegistry().registerAll(

                    //Register Ingots
                    IngotList.ALUMINUM_INGOT = new Item(new Item.Properties().tab(BasicNetherOres.bnoItemGroup)).setRegistryName(location("aluminum_ingot")),
                    IngotList.LEAD_INGOT = new Item(new Item.Properties().tab(BasicNetherOres.bnoItemGroup)).setRegistryName(location("lead_ingot")),
                    IngotList.NICKEL_INGOT = new Item(new Item.Properties().tab(BasicNetherOres.bnoItemGroup)).setRegistryName(location("nickel_ingot")),
                    IngotList.SILVER_INGOT = new Item(new Item.Properties().tab(BasicNetherOres.bnoItemGroup)).setRegistryName(location("silver_ingot")),
                    IngotList.TIN_INGOT = new Item(new Item.Properties().tab(BasicNetherOres.bnoItemGroup)).setRegistryName(location("tin_ingot")),
                    IngotList.OSMIUM_INGOT = new Item(new Item.Properties().tab(BasicNetherOres.bnoItemGroup)).setRegistryName(location("osmium_ingot")),
                    IngotList.URANIUM_INGOT = new Item(new Item.Properties().tab(BasicNetherOres.bnoItemGroup)).setRegistryName(location("uranium_ingot")),

                    //Register Nuggets
                    IngotList.ALUMINUM_NUGGET = new Item(new Item.Properties().tab(BasicNetherOres.bnoItemGroup)).setRegistryName(location("aluminum_nugget")),
                    IngotList.COPPER_NUGGET = new Item(new Item.Properties().tab(BasicNetherOres.bnoItemGroup)).setRegistryName(location("copper_nugget")),
                    IngotList.LEAD_NUGGET = new Item(new Item.Properties().tab(BasicNetherOres.bnoItemGroup)).setRegistryName(location("lead_nugget")),
                    IngotList.NICKEL_NUGGET = new Item(new Item.Properties().tab(BasicNetherOres.bnoItemGroup)).setRegistryName(location("nickel_nugget")),
                    IngotList.SILVER_NUGGET = new Item(new Item.Properties().tab(BasicNetherOres.bnoItemGroup)).setRegistryName(location("silver_nugget")),
                    IngotList.TIN_NUGGET = new Item(new Item.Properties().tab(BasicNetherOres.bnoItemGroup)).setRegistryName(location("tin_nugget")),
                    IngotList.OSMIUM_NUGGET = new Item(new Item.Properties().tab(BasicNetherOres.bnoItemGroup)).setRegistryName(location("osmium_nugget")),

                    //Raw Ore List
                    IngotList.RAW_ALUMINUM = new Item(new Item.Properties().tab(BasicNetherOres.bnoItemGroup)).setRegistryName(location("raw_aluminum")),
                    IngotList.RAW_LEAD = new Item(new Item.Properties().tab(BasicNetherOres.bnoItemGroup)).setRegistryName(location("raw_lead")),
                    IngotList.RAW_NICKEL = new Item(new Item.Properties().tab(BasicNetherOres.bnoItemGroup)).setRegistryName(location("raw_nickel")),
                    IngotList.RAW_SILVER = new Item(new Item.Properties().tab(BasicNetherOres.bnoItemGroup)).setRegistryName(location("raw_silver")),
                    IngotList.RAW_TIN = new Item(new Item.Properties().tab(BasicNetherOres.bnoItemGroup)).setRegistryName(location("raw_tin")),
                    IngotList.RAW_OSMIUM = new Item(new Item.Properties().tab(BasicNetherOres.bnoItemGroup)).setRegistryName(location("raw_osmium")),
                    IngotList.RAW_URANIUM = new Item(new Item.Properties().tab(BasicNetherOres.bnoItemGroup)).setRegistryName(location("raw_uranium"))
            );

            LOGGER.info("Ingots Registered");
        }

        public static ResourceLocation location (String name)
        {
            return new ResourceLocation(BasicNetherOres.modid, name);
        }
    }

    public static void ProtectedListInit()
    {
        //Loads the list of protected blocks
        BlockListHelper.initProtectedBlocks();
    }
}
