package com.cscot.basicnetherores.util.itemgroups;

import com.cscot.basicnetherores.api.BlockOreList;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

//This class creates the ItemGroup(Creative Tab) for Basic Nether Ores
public class BNOItemGroup extends CreativeModeTab
{
    public BNOItemGroup()
    {
        super("basicnetheroreitemgroup");
    }

    @Override
    public ItemStack makeIcon()
    {
        return new ItemStack(Item.BY_BLOCK.get(BlockOreList.netheremerald_ore));
    }
}
