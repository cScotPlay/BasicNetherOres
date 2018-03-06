package cscot.basicnetherores.registries;

import cscot.basicnetherores.init.BlockInit;
import cscot.basicnetherores.init.BlockOreInit;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FuranceRegistry {

	public static void registerFurnaceRecipes() {
		
		GameRegistry.addSmelting(BlockOreInit.ORE_NETHEREMERALD, new ItemStack(Items.EMERALD), 1F);
		GameRegistry.addSmelting(BlockOreInit.ORE_NETHERDIAMOND, new ItemStack(Items.DIAMOND), 1F);
		GameRegistry.addSmelting(BlockOreInit.ORE_NETHERREDSTONE, new ItemStack(Items.REDSTONE, 4), 1F);
		GameRegistry.addSmelting(BlockOreInit.ORE_NETHERLAPIS, new ItemStack(Items.DYE, 4, 4), 1F);
		GameRegistry.addSmelting(BlockOreInit.ORE_NETHERCOAL, new ItemStack(Items.COAL), 0.7F);
		GameRegistry.addSmelting(BlockOreInit.ORE_NETHERGOLD, new ItemStack(Items.GOLD_INGOT), 1F);
		GameRegistry.addSmelting(BlockOreInit.ORE_NETHERIRON, new ItemStack(Items.IRON_INGOT), 0.7F);
		GameRegistry.addSmelting(BlockOreInit.ORE_NETHERCOPPER, new ItemStack(Items.IRON_INGOT), 0.7F);
		GameRegistry.addSmelting(BlockOreInit.ORE_NETHERTIN, new ItemStack(Items.IRON_INGOT), 0.7F);
		
	}
}
