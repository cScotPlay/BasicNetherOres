package com.cscot.basicnetherores.util.itemgroups;

import com.cscot.basicnetherores.lists.BlockOreList;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

//This class creates the ItemGroup(Creative Tab) for Basic Nether Ores
public class BNOItemGroup extends ItemGroup
{
    public BNOItemGroup()
    {
        super("basicnetheroreitemgroup");
    }

    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(Item.BLOCK_TO_ITEM.get(BlockOreList.netheremerald_ore));
    }
}
