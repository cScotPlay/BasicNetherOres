package cscot.basicnetherores.objects.items;

import cscot.basicnetherores.BasicNetherOres;
import cscot.basicnetherores.init.ItemInit;
import cscot.basicnetherores.util.interfaces.IHasModel;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{

	public String localizedName;
	
	public ItemBase(String name, String localName) {
		
		setUnlocalizedName(localName);
		setRegistryName(name);
		setCreativeTab(BasicNetherOres.BASICNETHERORES);

		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		
		BasicNetherOres.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
