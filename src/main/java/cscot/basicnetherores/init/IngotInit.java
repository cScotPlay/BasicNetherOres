package cscot.basicnetherores.init;

import cscot.basicnetherores.objects.items.IngotBase;
import cscot.basicnetherores.objects.items.ItemBase;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class IngotInit {

    public static final List<Item> ITEMINGOTS = new ArrayList<Item>();

    public static final Item INGOT_COPPER = new IngotBase("ingot_copper", "ingot_Copper");
    public static final Item INGOT_TIN	= new IngotBase("ingot_tin", "ingot_Tin");

    public static final Item NUGGET_COPPER = new IngotBase("nugget_copper", "nugget_Copper");
    public static final Item NUGGET_TIN	= new IngotBase("nugget_tin", "nugget_Tin");
}
