package cscot.basicnetherores.tabs;

import cscot.basicnetherores.init.BlockOreInit;
import cscot.basicnetherores.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class BasicNetherOresTab extends CreativeTabs {
	
	public BasicNetherOresTab(String label) { super("basicnetherorestab");
	this.setBackgroundImageName("basicnetheroresgui.png");}
	public ItemStack getTabIconItem() { return new ItemStack(BlockOreInit.ORE_NETHEREMERALD, 1);}
		
}
