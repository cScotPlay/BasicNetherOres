package cscot.basicnetherores;

import cscot.basicnetherores.proxy.CommonProxy;
import cscot.basicnetherores.tabs.BasicNetherOresTab;
import cscot.basicnetherores.util.handler.RegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;

@Mod(modid = BasicNetherOres.MOD_ID, name = BasicNetherOres.MOD_NAME, version = BasicNetherOres.VERSION)
public class BasicNetherOres {

	public static File config;

	public static final String MOD_ID = "bno";
	public static final String MOD_NAME = "Basic Nether Ores";
	public static final String VERSION = "1.12.2-1.0.4.0";
	
	public static final String CLIENTPROXY = "cscot.basicnetherores.proxy.ClientProxy";
	public static final String COMMONPROXY = "cscot.basicnetherores.proxy.CommonProxy";
	
	@Instance
	public static BasicNetherOres instance;
	
	//Add Creative Tab
	public static final CreativeTabs BASICNETHERORES = new BasicNetherOresTab("basicnetherorestab");
	
	@SidedProxy(clientSide = BasicNetherOres.CLIENTPROXY, serverSide = BasicNetherOres.COMMONPROXY)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {RegistryHandler.preInitRegistries(event);}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {RegistryHandler.initRegistries(event);}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {RegistryHandler.postInitRegistries(event);}

}