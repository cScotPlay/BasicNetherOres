package cscot.basicnetherores.util.handler;

import cscot.basicnetherores.BasicNetherOres;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;

public class ConfigHandler {

    public static Configuration config;

    public static boolean pigmanGuard;
    public static boolean regeisterIngots;
    public static boolean silkEffect;

    public static String[] protectedBlocksArray = new String[]{

            "bno:ore_netheremerald",
            "bno:ore_netherdiamond",
            "bno:ore_netherlapis",
            "bno:ore_netherredstone",
            "bno:ore_nethergold",
            "bno:ore_netheriron",
            "bno:ore_nethercoal",
            "bno:ore_nethercopper",
            "bno:ore_nethertin",
            "minecraft:glowstone",
            "minecraft:quartz_ore"

    };

    public static int protectionRange = 16;

    public static String[] protectedBlocks;

    //Emerald Settings
    public static int emeraldVeinSize = 3;
    public static int emeraldChance = 15;
    public static int emeraldMinHeight = 0;
    public static int emeraldMaxHeight = 125;

    //Diamond Settings
    public static int diamondVeinSize = 4;
    public static int diamondChance = 20;
    public static int diamondMinHeight = 0;
    public static int diamondMaxHeight = 125;

    //Redstone Settings
    public static int redstoneVeinSize = 6;
    public static int redstoneChance = 30;
    public static int redstoneMinHeight = 0;
    public static int redstoneMaxHeight = 125;

    //lapis Settings
    public static int lapisVeinSize = 5;
    public static int lapisChance = 25;
    public static int lapisMinHeight = 0;
    public static int lapisMaxHeight = 125;

    //Coal Settings
    public static int coalVeinSize = 10;
    public static int coalChance = 50;
    public static int coalMinHeight = 0;
    public static int coalMaxHeight = 125;

    //Gold Settings
    public static int goldVeinSize = 6;
    public static int goldChance = 30;
    public static int goldMinHeight = 0;
    public static int goldMaxHeight = 125;

    //Iron Settings
    public static int ironVeinSize = 8;
    public static int ironChance = 50;
    public static int ironMinHeight = 0;
    public static int ironMaxHeight = 125;

    //Copper Settings
    public static int copperVeinSize = 6;
    public static int copperChance = 35;
    public static int copperMinHeight = 0;
    public static int copperMaxHeight = 125;

    //Tin Settings
    public static int tinVeinSize = 4;
    public static int tinChance = 30;
    public static int tinMinHeight = 0;
    public static int tinMaxHeight = 125;

    public static void init(File file) {

        config = new Configuration(file);

        String category;

        category = "Ore Protector";
        config.addCustomCategoryComment(category, "Pigman Projection Settings");
        pigmanGuard = config.getBoolean("Pigmen Protection", category, true, "If set to 'true' Pigmen will protect Nether Ores");
        protectionRange = config.getInt("Projection Range", category, 16, 1, 64,"Set range that Pigmen will aggro when mining ores");
        silkEffect = config.getBoolean("Silk Enchantment Effect", category, true, "Set to false if you want the Pigmen to attack when using Silk Touch Tools");
        protectedBlocks = config.getStringList("Protected Blocks", category, protectedBlocksArray, "Add Blocks to be protected by Pigmen ***Not Fully Implemented Yet ***(Example: minecraft:glowstone)");

        category = "Nuggets, Ingots, & Blocks";
        config.addCustomCategoryComment(category, "Register Ingot and Blocks");
        regeisterIngots = config.getBoolean("Register Copper and Tin Items", category, true, "Set to false to turn off registering of Metals");

        category = "Ore Generation";
        config.addCustomCategoryComment(category, "Ore Generation Configurations");

        emeraldVeinSize = config.getInt("Emerald Vein Size", category, 3, 0, 64, "Set Emerald Vein Size");
        emeraldChance = config.getInt("Emerald Spawn Chance",category, 15, 0, 45, "Set Emerald Spawn Chance");
        emeraldMinHeight = config.getInt("Emerald Min Height", category, 0,0,125, "Set Emerald Min Spawn Height");
        emeraldMaxHeight = config.getInt("Emerald Max Height", category, 125, 0, 126, "Set Emerald Max Spawn Height");

        diamondVeinSize = config.getInt("Diamond Vein Size", category, 4, 0, 64, "Set Diamond Vein Size");
        diamondChance = config.getInt("Diamond Spawn Chance",category, 20, 0, 45, "Set Diamond Spawn Chance");
        diamondMinHeight = config.getInt("Diamond Min Height", category, 0,0,125, "Set Diamond Min Spawn Height");
        diamondMaxHeight = config.getInt("Diamond Max Height", category, 125, 0, 126, "Set Diamond Max Spawn Height");

        redstoneVeinSize = config.getInt("Redstone Vein Size", category, 6, 0, 64, "Set Redstone Vein Size");
        redstoneChance = config.getInt("Redstone Spawn Chance",category, 30, 0, 60, "Set Redstone Spawn Chance");
        redstoneMinHeight = config.getInt("Redstone Min Height", category, 0,0,125, "Set Redstone Min Spawn Height");
        redstoneMaxHeight = config.getInt("Redstone Max Height", category, 125, 0, 126, "Set Redstone Max Spawn Height");

        lapisVeinSize = config.getInt("Lapis Vein Size", category, 5, 0, 64, "Set Lapis Vein Size");
        lapisChance = config.getInt("Lapis Spawn Chance",category, 25, 0, 60, "Set Lapis Spawn Chance");
        lapisMinHeight = config.getInt("Lapis Min Height", category, 0,0,125, "Set Lapis Min Spawn Height");
        lapisMaxHeight = config.getInt("Lapis Max Height", category, 125, 0, 126, "Set Lapis Max Spawn Height");

        coalVeinSize = config.getInt("Coal Vein Size", category, 10, 0, 64, "Set Coal Vein Size");
        coalChance = config.getInt("Coal Spawn Chance",category, 50, 0, 75, "Set Coal Spawn Chance");
        coalMinHeight = config.getInt("Coal Min Height", category, 0,0,125, "Set Coal Min Spawn Height");
        coalMaxHeight = config.getInt("Coal Max Height", category, 125, 0, 126, "Set Coal Max Spawn Height");

        goldVeinSize = config.getInt("Gold Vein Size", category, 6, 0, 64, "Set Gold Vein Size");
        goldChance = config.getInt("Gold Spawn Chance",category, 30, 0, 75, "Set Gold Spawn Chance");
        goldMinHeight = config.getInt("Gold Min Height", category, 0,0,125, "Set Gold Min Spawn Height");
        goldMaxHeight = config.getInt("Gold Max Height", category, 125, 0, 126, "Set Gold Max Spawn Height");

        ironVeinSize = config.getInt("Iron Vein Size", category, 8, 0, 64, "Set Iron Vein Size");
        ironChance = config.getInt("Iron Spawn Chance",category, 50, 0, 75, "Set Iron Spawn Chance");
        ironMinHeight = config.getInt("Iron Min Height", category, 0,0,125, "Set Iron Min Spawn Height");
        ironMaxHeight = config.getInt("Iron Max Height", category, 125, 0, 126, "Set Iron Max Spawn Height");

        copperVeinSize = config.getInt("Copper Vein Size", category, 6, 0, 64, "Set Copper Vein Size");
        copperChance = config.getInt("Copper Spawn Chance",category, 35, 0, 75, "Set Copper Spawn Chance");
        copperMinHeight = config.getInt("Copper Min Height", category, 0,0,125, "Set Copper Min Spawn Height");
        copperMaxHeight = config.getInt("Copper Max Height", category, 125, 0, 126, "Set Copper Max Spawn Height");

        tinVeinSize = config.getInt("Tin Vein Size", category, 4, 0, 64, "Set Tin Vein Size");
        tinChance = config.getInt("Tin Spawn Chance",category, 30, 0, 75, "Set Tin Spawn Chance");
        tinMinHeight = config.getInt("Tin Min Height", category, 0,0,125, "Set Tin Min Spawn Height");
        tinMaxHeight = config.getInt("Tin Max Height", category, 125, 0, 126, "Set Tin Max Spawn Height");


        config.save();
    }

    public static void registerConfig(FMLPreInitializationEvent event) {

        BasicNetherOres.config = new File(event.getModConfigurationDirectory() + "/BasicNetherOres");
        BasicNetherOres.config.mkdirs();
        init(new File(BasicNetherOres.config.getPath(), "BasicNetherOres.cfg"));
    }

}
