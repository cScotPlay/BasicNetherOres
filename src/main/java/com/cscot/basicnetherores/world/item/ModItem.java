package com.cscot.basicnetherores.world.item;

import com.cscot.basicnetherores.BasicNetherOres;
import net.minecraft.world.item.Item;

public class ModItem extends Item
{

    public ModItem() {
        super(new Item.Properties().tab(BasicNetherOres.bnoItemGroup));
    }
}
