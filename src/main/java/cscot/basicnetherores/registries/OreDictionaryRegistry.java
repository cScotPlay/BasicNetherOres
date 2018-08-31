package cscot.basicnetherores.registries;

import cscot.basicnetherores.init.BlockInit;
import cscot.basicnetherores.init.BlockOreInit;
import cscot.basicnetherores.init.IngotInit;
import cscot.basicnetherores.init.ItemInit;
import cscot.basicnetherores.util.handler.ConfigHandler;
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

		if (ConfigHandler.regeisterIngots) {

			OreDictionary.registerOre("ingot" + IngotInit.INGOT_COPPER.getUnlocalizedName().substring(11, IngotInit.INGOT_COPPER.getUnlocalizedName().length() - 0), IngotInit.INGOT_COPPER);
			OreDictionary.registerOre("ingot" + IngotInit.INGOT_TIN.getUnlocalizedName().substring(11, IngotInit.INGOT_TIN.getUnlocalizedName().length() - 0), IngotInit.INGOT_TIN);

			OreDictionary.registerOre("nugget" + IngotInit.NUGGET_COPPER.getUnlocalizedName().substring(12, IngotInit.NUGGET_COPPER.getUnlocalizedName().length() - 0), IngotInit.NUGGET_COPPER);
			OreDictionary.registerOre("nugget" + IngotInit.NUGGET_TIN.getUnlocalizedName().substring(12, IngotInit.NUGGET_TIN.getUnlocalizedName().length() - 0), IngotInit.NUGGET_TIN);

		}
		
	}
}
