package com.cscot.basicnetherores.config;

import com.cscot.basicnetherores.api.interfaces.IConfig;

import java.util.Arrays;
import java.util.List;

public class ModConfig
{
    //Ore Projection Settings
    @IConfig(config = "bno_config", category = "oreProtection", key = "piglinGuard", comment = "If set to true Piglins will protect Nether Ores (Default: true)")
    public static boolean piglinGuard = true;

    @IConfig(config = "bno_config", category = "oreProtection", key = "silkEffect", comment = "Set to false if you want the Piglins to attack when using Silk Touch Tools (Default: true)")
    public static boolean silkEffect = true;

    @IConfig(config = "bno_config", category = "oreProtection", key = "protectionRange", comment = "Set range that Piglins will aggro when mining ores(Default: 16)")
    public static int protectionRange = 16;

    @IConfig(config = "bno_config", category = "oreProtection", key = "protectedBlocks", comment = "Add Blocks to be protected by Piglins (Example: minecraft:glowstone, bno:netheremerald_ore, ect. )")
    public static List<String> protectedBlocks = Arrays.asList(
            "bno:netheremerald_ore",
            "bno:netherdiamond_ore",
            "bno:netherlapis_ore",
            "bno:netherredstone_ore",
            "minecraft:nether_gold_ore",
            "bno:nethersilver_ore",
            "bno:netheriron_ore",
            "bno:netherlead_ore",
            "bno:nethernickel_ore",
            "bno:nethercoal_ore",
            "bno:nethercopper_ore",
            "bno:netheraluminum_ore",
            "bno:nethertin_ore",
            "bno:netherosmium_ore",
            "bno:netheruranium_ore",
            "minecraft:glowstone",
            "minecraft:nether_quartz_ore");

    ///////Ore Generation Settings////////////////

    //Emerald Ore Settings
    @IConfig(config = "bno_config", category = "emeraldOre", key = "emeraldGeneration", comment = "Generate Emerald Ore")
    public static boolean emeraldGeneration = true;

    @IConfig(config = "bno_config", category = "emeraldOre", key = "emeraldVeinSize", comment = "Set Max Emerald Vein Size (Default: 4)")
    public static int emeraldVeinSize = 4;

    @IConfig(config = "bno_config", category = "emeraldOre", key = "emeraldPerChunk", comment = "Set Emerald Spawn Chance (Default: 2)")
    public static int emeraldPerChunk = 2;

    @IConfig(config = "bno_config", category = "emeraldOre", key = "emeraldMinHeight", comment = "Set Emerald Min Spawn Height (Default: 25)")
    public static int emeraldMinHeight = 25;

    @IConfig(config = "bno_config", category = "emeraldOre", key = "emeraldMaxHeight", comment = "Set Emerald Max Spawn Height (Default: 55)")
    public static int emeraldMaxHeight = 55;



    //Diamond Ore Settings
    @IConfig(config = "bno_config", category = "diamondOre", key = "diamondGeneration", comment = "Generate Diamond Ore")
    public static boolean diamondGeneration = true;

    @IConfig(config = "bno_config", category = "diamondOre", key = "diamondVeinSize", comment = "Set Max Diamond Vein Size (Default: 8)")
    public static int diamondVeinSize = 8;

    @IConfig(config = "bno_config", category = "diamondOre", key = "diamondPerChunk", comment = "Set Diamond Spawn Chance (Default: 3)")
    public static int diamondPerChunk = 3;

    @IConfig(config = "bno_config", category = "diamondOre", key = "diamondMinHeight", comment = "Set Diamond Min Spawn Height (Default: 90)")
    public static int diamondMinHeight = 90;

    @IConfig(config = "bno_config", category = "diamondOre", key = "diamondMaxHeight", comment = "Set Diamond Max Spawn Height (Default: 125)")
    public static int diamondMaxHeight = 125;



    //Redstone Ore Settings
    @IConfig(config = "bno_config", category = "redstoneOre", key = "redstoneGeneration", comment = "Generate Redstone Ore")
    public static boolean redstoneGeneration = true;

    @IConfig(config = "bno_config", category = "redstoneOre", key = "redstoneVeinSize", comment = "Set Max Redstone Vein Size (Default: 8)")
    public static int redstoneVeinSize = 8;

    @IConfig(config = "bno_config", category = "redstoneOre", key = "redstonePerChunk", comment = "Set Redstone Spawn Chance (Default: 8)")
    public static int redstonePerChunk = 8;

    @IConfig(config = "bno_config", category = "redstoneOre", key = "redstoneMinHeight", comment = "Set Redstone Min Spawn Height (Default: 80)")
    public static int redstoneMinHeight = 80;

    @IConfig(config = "bno_config", category = "redstoneOre", key = "redstoneMaxHeight", comment = "Set Redstone Max Spawn Height (Default: 115)")
    public static int redstoneMaxHeight = 115;



    //Lapis Ore Settings
    @IConfig(config = "bno_config", category = "lapisOre", key = "lapisGeneration", comment = "Generate Lapis Ore")
    public static boolean lapisGeneration = true;

    @IConfig(config = "bno_config", category = "lapisOre", key = "lapisVeinSize", comment = "Set Max Lapis Vein Size (Default: 7)")
    public static int lapisVeinSize = 7;

    @IConfig(config = "bno_config", category = "lapisOre", key = "lapisPerChunk", comment = "Set Lapis Spawn Chance (Default: 2)")
    public static int lapisPerChunk = 2;

    @IConfig(config = "bno_config", category = "lapisOre", key = "lapisMinHeight", comment = "Set Lapis Min Spawn Height (Default: 30)")
    public static int lapisMinHeight = 30;

    @IConfig(config = "bno_config", category = "lapisOre", key = "lapisMaxHeight", comment = "Set Lapis Max Spawn Height (Default: 60)")
    public static int lapisMaxHeight = 60;



    //Coal Ore Settings
    @IConfig(config = "bno_config", category = "coalOre", key = "coalGeneration", comment = "Generate Coal Ore")
    public static boolean coalGeneration = true;

    @IConfig(config = "bno_config", category = "coalOre", key = "coalVeinSize", comment = "Set Max Coal Vein Size (Default: 17)")
    public static int coalVeinSize = 17;

    @IConfig(config = "bno_config", category = "coalOre", key = "coalPerChunk", comment = "Set Coal Spawn Chance (Default: 20)")
    public static int coalPerChunk = 20;

    @IConfig(config = "bno_config", category = "coalOre", key = "coalMinHeight", comment = "Set Coal Min Spawn Height (Default: 25)")
    public static int coalMinHeight = 25;

    @IConfig(config = "bno_config", category = "coalOre", key = "coalMaxHeight", comment = "Set Coal Max Spawn Height (Default: 115)")
    public static int coalMaxHeight = 115;



    //Silver Ore Settings
    @IConfig(config = "bno_config", category = "silverOre", key = "silverGeneration", comment = "Generate Silver Ore")
    public static boolean silverGeneration = false;

    @IConfig(config = "bno_config", category = "silverOre", key = "silverVeinSize", comment = "Set Max Silver Vein Size (Default: 9)")
    public static int silverVeinSize = 9;

    @IConfig(config = "bno_config", category = "silverOre", key = "silverPerChunk", comment = "Set Silver Spawn Chance (Default: 4)")
    public static int silverPerChunk = 4;

    @IConfig(config = "bno_config", category = "silverOre", key = "silverMinHeight", comment = "Set Silver Min Spawn Height (Default: 30)")
    public static int silverMinHeight = 30;

    @IConfig(config = "bno_config", category = "silverOre", key = "silverMaxHeight", comment = "Set Silver Max Spawn Height (Default: 60)")
    public static int silverMaxHeight = 60;



    //Iron Ore Settings
    @IConfig(config = "bno_config", category = "ironOre", key = "ironGeneration", comment = "Generate Iron Ore")
    public static boolean ironGeneration = true;

    @IConfig(config = "bno_config", category = "ironOre", key = "ironVeinSize", comment = "Set Max Iron Vein Size (Default: 8)")
    public static int ironVeinSize = 8;

    @IConfig(config = "bno_config", category = "ironOre", key = "ironPerChunk", comment = "Set Iron Spawn Chance (Default: 20)")
    public static int ironPerChunk = 20;

    @IConfig(config = "bno_config", category = "ironOre", key = "ironMinHeight", comment = "Set Iron Min Spawn Height (Default: 40)")
    public static int ironMinHeight = 40;

    @IConfig(config = "bno_config", category = "ironOre", key = "ironMaxHeight", comment = "Set Iron Max Spawn Height (Default: 110)")
    public static int ironMaxHeight = 110;



    //Lead Ore Settings
    @IConfig(config = "bno_config", category = "leadOre", key = "leadGeneration", comment = "Generate Lead Ore")
    public static boolean leadGeneration = false;

    @IConfig(config = "bno_config", category = "leadOre", key = "leadVeinSize", comment = "Set Max Lead Vein Size (Default: 8)")
    public static int leadVeinSize = 8;

    @IConfig(config = "bno_config", category = "leadOre", key = "leadPerChunk", comment = "Set Lead Spawn Chance (Default: 8)")
    public static int leadPerChunk = 8;

    @IConfig(config = "bno_config", category = "leadOre", key = "leadMinHeight", comment = "Set Lead Min Spawn Height (Default: 40)")
    public static int leadMinHeight = 40;

    @IConfig(config = "bno_config", category = "leadOre", key = "leadMaxHeight", comment = "Set Lead Max Spawn Height (Default: 110)")
    public static int leadMaxHeight = 110;



    //Nickel Ore Settings
    @IConfig(config = "bno_config", category = "nickelOre", key = "nickelGeneration", comment = "Generate Nickel Ore")
    public static boolean nickelGeneration = false;

    @IConfig(config = "bno_config", category = "nickelOre", key = "nickelVeinSize", comment = "Set Max Nickel Vein Size (Default: 4)")
    public static int nickelVeinSize = 4;

    @IConfig(config = "bno_config", category = "nickelOre", key = "nickelPerChunk", comment = "Set Nickel Spawn Chance (Default: 8)")
    public static int nickelPerChunk = 8;

    @IConfig(config = "bno_config", category = "nickelOre", key = "nickelMinHeight", comment = "Set Nickel Min Spawn Height (Default: 30)")
    public static int nickelMinHeight = 30;

    @IConfig(config = "bno_config", category = "nickelOre", key = "nickelMaxHeight", comment = "Set Nickel Max Spawn Height (Default: 50)")
    public static int nickelMaxHeight = 50;



    //Copper Ore Settings
    @IConfig(config = "bno_config", category = "copperOre", key = "copperGeneration", comment = "Generate Copper Ore")
    public static boolean copperGeneration = false;

    @IConfig(config = "bno_config", category = "copperOre", key = "copperVeinSize", comment = "Set Max Copper Vein Size (Default: 8)")
    public static int copperVeinSize = 8;

    @IConfig(config = "bno_config", category = "copperOre", key = "copperPerChunk", comment = "Set Copper Spawn Chance (Default: 20)")
    public static int copperPerChunk = 20;

    @IConfig(config = "bno_config", category = "copperOre", key = "copperMinHeight", comment = "Set Copper Min Spawn Height (Default: 35)")
    public static int copperMinHeight = 35;

    @IConfig(config = "bno_config", category = "copperOre", key = "copperMaxHeight", comment = "Set Copper Max Spawn Height (Default: 75)")
    public static int copperMaxHeight = 75;



    //Aluminum Ore Settings
    @IConfig(config = "bno_config", category = "aluminumOre", key = "aluminumGeneration", comment = "Generate Aluminum Ore")
    public static boolean aluminumGeneration = false;

    @IConfig(config = "bno_config", category = "aluminumOre", key = "aluminumVeinSize", comment = "Set Max Aluminum Vein Size (Default: 8)")
    public static int aluminumVeinSize = 8;

    @IConfig(config = "bno_config", category = "aluminumOre", key = "aluminumPerChunk", comment = "Set Aluminum Spawn Chance (Default: 10)")
    public static int aluminumPerChunk = 10;

    @IConfig(config = "bno_config", category = "aluminumOre", key = "aluminumMinHeight", comment = "Set Aluminum Min Spawn Height (Default: 75)")
    public static int aluminumMinHeight = 75;

    @IConfig(config = "bno_config", category = "aluminumOre", key = "aluminumMaxHeight", comment = "Set Aluminum Max Spawn Height (Default: 110)")
    public static int aluminumMaxHeight = 110;



    //Tin Ore Settings
    @IConfig(config = "bno_config", category = "tinOre", key = "tinGeneration", comment = "Generate Tin Ore")
    public static boolean tinGeneration = false;

    @IConfig(config = "bno_config", category = "tinOre", key = "tinVeinSize", comment = "Set Max Tin Vein Size (Default: 8)")
    public static int tinVeinSize = 8;

    @IConfig(config = "bno_config", category = "tinOre", key = "tinPerChunk", comment = "Set Tin Spawn Chance (Default: 20)")
    public static int tinPerChunk = 20;

    @IConfig(config = "bno_config", category = "tinOre", key = "tinMinHeight", comment = "Set Tin Min Spawn Height (Default: 40)")
    public static int tinMinHeight = 40;

    @IConfig(config = "bno_config", category = "tinOre", key = "tinMaxHeight", comment = "Set Tin Max Spawn Height (Default: 110)")
    public static int tinMaxHeight = 110;



    //Osmium Ore Settings
    @IConfig(config = "bno_config", category = "osmiumOre", key = "osmiumGeneration", comment = "Generate Osmium Ore")
    public static boolean osmiumGeneration = false;

    @IConfig(config = "bno_config", category = "osmiumOre", key = "osmiumVeinSize", comment = "Set Max Osmium Vein Size (Default: 8)")
    public static int osmiumVeinSize = 8;

    @IConfig(config = "bno_config", category = "osmiumOre", key = "osmiumPerChunk", comment = "Set Osmium Spawn Chance (Default: 8)")
    public static int osmiumPerChunk = 8;

    @IConfig(config = "bno_config", category = "osmiumOre", key = "osmiumMinHeight", comment = "Set Osmium Min Spawn Height (Default: 30)")
    public static int osmiumMinHeight = 30;

    @IConfig(config = "bno_config", category = "osmiumOre", key = "osmiumMaxHeight", comment = "Set Osmium Max Spawn Height (Default: 75)")
    public static int osmiumMaxHeight = 75;



    //Uranium Ore Settings
    @IConfig(config = "bno_config", category = "uraniumOre", key = "uraniumGeneration", comment = "Generate Uranium Ore")
    public static boolean uraniumGeneration = false;

    @IConfig(config = "bno_config", category = "uraniumOre", key = "uraniumVeinSize", comment = "Set Max Uranium Vein Size (Default: 4)")
    public static int uraniumVeinSize = 4;

    @IConfig(config = "bno_config", category = "uraniumOre", key = "uraniumPerChunk", comment = "Set Uranium Spawn Chance (Default: 6)")
    public static int uraniumPerChunk = 6;

    @IConfig(config = "bno_config", category = "uraniumOre", key = "uraniumMinHeight", comment = "Set Uranium Min Spawn Height (Default: 90)")
    public static int uraniumMinHeight = 90;

    @IConfig(config = "bno_config", category = "uraniumOre", key = "uraniumMaxHeight", comment = "Set Uranium Max Spawn Height (Default: 125)")
    public static int uraniumMaxHeight = 125;
}