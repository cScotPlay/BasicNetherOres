package com.cscot.basicnetherores;

import com.cscot.basicnetherores.api.OreBlockLists;
import com.cscot.basicnetherores.config.ModConfig;
import com.cscot.basicnetherores.util.handlers.ConfigHandler;
import com.cscot.basicnetherores.util.handlers.RegistryHandler;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BasicNetherOres implements ModInitializer {

	public static final String MOD_ID = "bno";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
	public static BasicNetherOres INSTANCE;

	public static ItemGroup ITEMGROUP = FabricItemGroupBuilder.build(
			new Identifier("basicnetherore", "item_group"),
			() -> new ItemStack(Item.BLOCK_ITEMS.get(OreBlockLists.NETHEREMERALD_ORE)));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		INSTANCE = this;

		new ConfigHandler(ModConfig.class, MOD_ID);
		RegistryHandler.onOreRegistry();
		RegistryHandler.onBlockRegistry();
		RegistryHandler.onItemRegistry();
		RegistryHandler.onIngotRegistry();



		LOGGER.info("Basic Nether Ores setup done!");
	}
}
