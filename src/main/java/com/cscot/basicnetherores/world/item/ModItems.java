package com.cscot.basicnetherores.world.item;

import com.cscot.basicnetherores.BasicNetherOres;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BasicNetherOres.modid);

    public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot", ModItem :: new);
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot", ModItem :: new);
    public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot", ModItem :: new);
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", ModItem :: new);
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", ModItem :: new);
    public static final RegistryObject<Item> OSMIUM_INGOT = ITEMS.register("osmium_ingot", ModItem :: new);
    public static final RegistryObject<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot", ModItem :: new);
    public static final RegistryObject<Item> ZINC_INGOT = ITEMS.register("zinc_ingot", ModItem :: new);

    public static final RegistryObject<Item> ALUMINUM_NUGGET = ITEMS.register("aluminum_nugget", ModItem :: new);
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", ModItem :: new);
    public static final RegistryObject<Item> LEAD_NUGGET = ITEMS.register("lead_nugget", ModItem :: new);
    public static final RegistryObject<Item> NICKEL_NUGGET = ITEMS.register("nickel_nugget", ModItem :: new);
    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget", ModItem :: new);
    public static final RegistryObject<Item> OSMIUM_NUGGET = ITEMS.register("osmium_nugget", ModItem :: new);
    public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget", ModItem :: new);
    public static final RegistryObject<Item> ZINC_NUGGET = ITEMS.register("zinc_nugget", ModItem :: new);

    public static final RegistryObject<Item> RAW_ALUMINUM = ITEMS.register("raw_aluminum", ModItem :: new);
    public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead", ModItem :: new);
    public static final RegistryObject<Item> RAW_NICKEL = ITEMS.register("raw_nickel", ModItem :: new);
    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver", ModItem :: new);
    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin", ModItem :: new);
    public static final RegistryObject<Item> RAW_OSMIUM = ITEMS.register("raw_osmium", ModItem :: new);
    public static final RegistryObject<Item> RAW_URANIUM = ITEMS.register("raw_uranium", ModItem :: new);
    public static final RegistryObject<Item> RAW_ZINC = ITEMS.register("raw_zinc", ModItem :: new);

}
