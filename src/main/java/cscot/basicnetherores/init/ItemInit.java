package cscot.basicnetherores.init;

import java.util.ArrayList;
import java.util.List;

import cscot.basicnetherores.objects.items.ItemBase;
import net.minecraft.item.Item;

public class ItemInit {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item INGOT_COPPER = new ItemBase("ingot_copper", "ingot_Copper");
	public static final Item INGOT_TIN	= new ItemBase("ingot_tin", "ingot_Tin");
	
	public static final Item NUGGET_COPPER = new ItemBase("nugget_copper", "nugget_Copper");
	public static final Item NUGGET_TIN	= new ItemBase("nugget_tin", "nugget_Tin");
	
}
