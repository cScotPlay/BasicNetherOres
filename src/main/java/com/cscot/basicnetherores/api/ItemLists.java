package com.cscot.basicnetherores.api;

import com.cscot.basicnetherores.BasicNetherOres;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemLists
{
    //All Blocks are added to this list for registration
    //public static final List<Item> items = new ArrayList<Item>();
    public static final Map<Identifier, BlockItem> ITEMS = new HashMap<>();
    public static final Map<Identifier, Item> INGOTS = new HashMap<>();

    //Ingots List
    public static Item ALUMINUM_INGOT = addItem("aluminum_ingot", new Item((new Item.Settings()).group(BasicNetherOres.ITEMGROUP)));
    public static Item COPPER_INGOT = addItem("copper_ingot", new Item((new Item.Settings()).group(BasicNetherOres.ITEMGROUP)));
    public static Item LEAD_INGOT = addItem("lead_ingot", new Item((new Item.Settings()).group(BasicNetherOres.ITEMGROUP)));
    public static Item NICKEL_INGOT = addItem("nickel_ingot", new Item((new Item.Settings()).group(BasicNetherOres.ITEMGROUP)));
    public static Item SILVER_INGOT = addItem("silver_ingot", new Item((new Item.Settings()).group(BasicNetherOres.ITEMGROUP)));
    public static Item TIN_INGOT = addItem("tin_ingot", new Item((new Item.Settings()).group(BasicNetherOres.ITEMGROUP)));
    public static Item OSMIUM_INGOT = addItem("osmium_ingot", new Item((new Item.Settings()).group(BasicNetherOres.ITEMGROUP)));
    public static Item URANIUM_INGOT = addItem("uranium_ingot", new Item((new Item.Settings()).group(BasicNetherOres.ITEMGROUP)));

    //Nugget List
    public static Item ALUMINUM_NUGGET = addItem("aluminum_nugget", new Item((new Item.Settings()).group(BasicNetherOres.ITEMGROUP)));
    public static Item COPPER_NUGGET = addItem("copper_nugget", new Item((new Item.Settings()).group(BasicNetherOres.ITEMGROUP)));
    public static Item LEAD_NUGGET = addItem("lead_nugget", new Item((new Item.Settings()).group(BasicNetherOres.ITEMGROUP)));
    public static Item NICKEL_NUGGET = addItem("nickel_nugget", new Item((new Item.Settings()).group(BasicNetherOres.ITEMGROUP)));
    public static Item SILVER_NUGGET = addItem("silver_nugget", new Item((new Item.Settings()).group(BasicNetherOres.ITEMGROUP)));
    public static Item OSMIUM_NUGGET = addItem("osmium_nugget", new Item((new Item.Settings()).group(BasicNetherOres.ITEMGROUP)));
    public static Item TIN_NUGGET = addItem("tin_nugget", new Item((new Item.Settings()).group(BasicNetherOres.ITEMGROUP)));


    public static <I extends BlockItem> I add(String name, I item) {
        item.appendBlocks(Item.BLOCK_ITEMS, item);
        ITEMS.put(new Identifier(BasicNetherOres.MOD_ID, name), item);
        return item;
    }

    public static <I extends Item> I addItem(String name, I item)
    {
        INGOTS.put(new Identifier(BasicNetherOres.MOD_ID, name), item);
        return item;
    }
}
