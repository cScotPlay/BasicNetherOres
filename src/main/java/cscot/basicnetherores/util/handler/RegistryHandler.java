package cscot.basicnetherores.util.handler;

import cscot.basicnetherores.init.BlockInit;
import cscot.basicnetherores.init.BlockOreInit;
import cscot.basicnetherores.init.IngotInit;
import cscot.basicnetherores.init.ItemInit;
import cscot.basicnetherores.registries.OreDictionaryRegistry;
import cscot.basicnetherores.util.interfaces.IHasModel;
import cscot.basicnetherores.world.gen.WorldGenCustomOres;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;


@EventBusSubscriber
public class RegistryHandler {

	@SubscribeEvent
	public static void onBlockOreRegister(RegistryEvent.Register<Block> event) {
	
		event.getRegistry().registerAll(BlockOreInit.BLOCKORES.toArray(new Block[0]));
	}
	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
	
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
	}

	@SubscribeEvent
	public static void onIngotRegister(RegistryEvent.Register<Item> event) {

		if(ConfigHandler.regeisterIngots) {

			event.getRegistry().registerAll(IngotInit.ITEMINGOTS.toArray(new Item[0]));
		}
	}

	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
	
		if(ConfigHandler.regeisterIngots) {

			event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
		}
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		
		for (Block block : BlockOreInit.BLOCKORES) {
			
			if (block instanceof IHasModel) {
				((IHasModel)block).registerModels();
			}
		}
		
		for (Block block : BlockInit.BLOCKS) {
			
			if (block instanceof IHasModel) {
				((IHasModel)block).registerModels();
			}
		}
		
		for(Item item : ItemInit.ITEMS) {
			
			if(item instanceof IHasModel) {
				
				((IHasModel)item).registerModels();
			}
		}

		for(Item item : IngotInit.ITEMINGOTS) {

			if(item instanceof IHasModel) {

				((IHasModel)item).registerModels();
			}
		}
	}

	public static void preInitRegistries(FMLPreInitializationEvent event)
	{
		GameRegistry.registerWorldGenerator(new WorldGenCustomOres(), 0);
		ConfigHandler.registerConfig(event);

	}
	
	public static void initRegistries(FMLInitializationEvent event) {
		
		GameRegistry.addSmelting(BlockOreInit.ORE_NETHEREMERALD, new ItemStack(Items.EMERALD), 1F);
		GameRegistry.addSmelting(BlockOreInit.ORE_NETHERDIAMOND, new ItemStack(Items.DIAMOND), 1F);
		GameRegistry.addSmelting(BlockOreInit.ORE_NETHERREDSTONE, new ItemStack(Items.REDSTONE, 4), 1F);
		GameRegistry.addSmelting(BlockOreInit.ORE_NETHERLAPIS, new ItemStack(Items.DYE, 4, 4), 1F);
		GameRegistry.addSmelting(BlockOreInit.ORE_NETHERCOAL, new ItemStack(Items.COAL), 0.7F);
		GameRegistry.addSmelting(BlockOreInit.ORE_NETHERGOLD, new ItemStack(Items.GOLD_INGOT), 1F);
		GameRegistry.addSmelting(BlockOreInit.ORE_NETHERIRON, new ItemStack(Items.IRON_INGOT), 0.7F);
		GameRegistry.addSmelting(BlockOreInit.ORE_NETHERCOPPER, new ItemStack(IngotInit.INGOT_COPPER), 0.7F);
		GameRegistry.addSmelting(BlockOreInit.ORE_NETHERTIN, new ItemStack(IngotInit.INGOT_TIN), 0.7F);
		
	}

	
	public static void postInitRegistries(FMLPostInitializationEvent event) {
		
		OreDictionaryRegistry.registerDictionaryOres();
	}
}
