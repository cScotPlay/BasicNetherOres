package com.cscot.basicnetherores;


import com.cscot.basicnetherores.util.handler.ConfigHandler;
import com.cscot.basicnetherores.util.handler.RegisteryHandler;
import com.cscot.basicnetherores.util.itemgroups.BNOItemGroup;
import com.cscot.basicnetherores.world.OreGenerator;
import com.cscot.basicnetherores.data.worldgen.ModOreFeatures;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("bno")
public class BasicNetherOres
{
    public static BasicNetherOres instance;
    public static final String modid = "bno";

    public static final CreativeModeTab bnoItemGroup = new BNOItemGroup();

    private static final Logger LOGGER = LogManager.getLogger(modid);


    public BasicNetherOres()
    {
        instance = this;

        // Register the setup method for mod loading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the clientRegistries method for mod loading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Registers and Loads Config File
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ConfigHandler.COMMON_CONFIG);
        ConfigHandler.loadConfig(ConfigHandler.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve("bno-common.toml"));

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    public static final Logger logger = LogManager.getLogger();

    //This used to be the PreInit
    private void setup(FMLCommonSetupEvent event)
    {
        ModOreFeatures.initModFeatures();
        RegisteryHandler.ProtectedListInit();

        LOGGER.info("Setup Method Registered (PreInit)");
    }

    //This is something that can only be done on the client
    private void clientRegistries(FMLClientSetupEvent event)
    {
        LOGGER.info("Client Registries Method Registered (Client Side)");
    }
}
