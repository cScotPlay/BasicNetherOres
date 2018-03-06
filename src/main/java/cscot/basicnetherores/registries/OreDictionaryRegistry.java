package cscot.basicnetherores.registries;

import cscot.basicnetherores.init.BlockInit;
import cscot.basicnetherores.init.BlockOreInit;
import cscot.basicnetherores.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryRegistry {

	public static void registerDictionaryOres() {
		
		for(Block block : BlockOreInit.BLOCKORES) {
			
			OreDictionary.registerOre("ore" + block.getLocalizedName().substring(7, block.getLocalizedName().length() - 4), block);
		}
		
		for(Block block : BlockInit.BLOCKS) {
			
			OreDictionary.registerOre("block" + block.getLocalizedName().substring(0, block.getLocalizedName().length() - 6), block);
			
		}

		OreDictionary.registerOre("ingot" + ItemInit.INGOT_COPPER.getUnlocalizedName().substring(11, ItemInit.INGOT_COPPER.getUnlocalizedName().length() - 0), ItemInit.INGOT_COPPER);
		OreDictionary.registerOre("ingot" + ItemInit.INGOT_TIN.getUnlocalizedName().substring(11, ItemInit.INGOT_TIN.getUnlocalizedName().length() - 0), ItemInit.INGOT_TIN);
		
		OreDictionary.registerOre("nugget" + ItemInit.NUGGET_COPPER.getUnlocalizedName().substring(12, ItemInit.NUGGET_COPPER.getUnlocalizedName().length() - 0), ItemInit.NUGGET_COPPER);
		OreDictionary.registerOre("nugget" + ItemInit.NUGGET_TIN.getUnlocalizedName().substring(12, ItemInit.NUGGET_TIN.getUnlocalizedName().length() - 0), ItemInit.NUGGET_TIN);
		
	}
}
