package cscot.basicnetherores.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class BasicNetherOresTab extends CreativeTabs {
	
	public BasicNetherOresTab(String label) { super("basicnetherorestab");
	this.setBackgroundImageName("basicnetheroresgui.png");}
	public ItemStack getTabIconItem() { return new ItemStack(Items.QUARTZ);}
		
}
