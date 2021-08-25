package com.cscot.basicnetherores.util.handler;

import com.cscot.basicnetherores.BasicNetherOres;
import com.cscot.basicnetherores.config.OreGenerationConfig;
import com.cscot.basicnetherores.config.OreProtectionConfig;
import com.cscot.basicnetherores.util.helpers.BlockListHelper;
import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;



import java.nio.file.Path;



import static net.minecraftforge.fml.Logging.CORE;


//This class creates the Config File to be customized
@Mod.EventBusSubscriber
public class ConfigHandler
{
    public static final ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();
    public static ForgeConfigSpec COMMON_CONFIG;

    static
    {
        //Loaded from class in Config folder
        OreGenerationConfig.Init(COMMON_BUILDER);
        //Loaded from class in Config folder
        OreProtectionConfig.Init(COMMON_BUILDER);

        COMMON_CONFIG = COMMON_BUILDER.build();
    }

    public static void loadConfig(ForgeConfigSpec spec, Path file)
    {
        final CommentedFileConfig configData = CommentedFileConfig.builder(file)
                .sync()
                .autosave()
                .autoreload()
                .writingMode(WritingMode.REPLACE)
                .build();

        configData.load();
        spec.setConfig(configData);
    }

    /*@SubscribeEvent
    public static void onLoad(final ModConfig.Loading configEvent) {
        BasicNetherOres.logger.debug("Loaded {} config file {}", BasicNetherOres.modid, configEvent.getConfig().getFileName());
    }

    @SubscribeEvent
    public static void onChange(final ModConfig.Reloading event)
    {
        if(event.getConfig().getModId().equals(BasicNetherOres.modid))
        {
            BasicNetherOres.logger.fatal(CORE, "{} config just got changed on the file system!", BasicNetherOres.modid);
            BlockListHelper.initProtectedBlocks();
        }
    }*/

}
