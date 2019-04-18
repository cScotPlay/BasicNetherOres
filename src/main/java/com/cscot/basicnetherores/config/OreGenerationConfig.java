package com.cscot.basicnetherores.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class OreGenerationConfig
{
    //Variables for Ore Generation

    //Emerald Settings
    public static ForgeConfigSpec.IntValue emeraldVeinSize;
    public static ForgeConfigSpec.IntValue emeraldPerChunk;
    public static ForgeConfigSpec.IntValue emeraldMinHeight;
    public static ForgeConfigSpec.IntValue emeraldMaxHeight;

    //Diamond Settings
    public static ForgeConfigSpec.IntValue diamondVeinSize;
    public static ForgeConfigSpec.IntValue diamondPerChunk;
    public static ForgeConfigSpec.IntValue diamondMinHeight;
    public static ForgeConfigSpec.IntValue diamondMaxHeight;

    //Redstone Settings
    public static ForgeConfigSpec.IntValue redstoneVeinSize;
    public static ForgeConfigSpec.IntValue redstonePerChunk;
    public static ForgeConfigSpec.IntValue redstoneMinHeight;
    public static ForgeConfigSpec.IntValue redstoneMaxHeight;

    //Lapis Settings
    public static ForgeConfigSpec.IntValue lapisVeinSize;
    public static ForgeConfigSpec.IntValue lapisPerChunk;
    public static ForgeConfigSpec.IntValue lapisMinHeight;
    public static ForgeConfigSpec.IntValue lapisMaxHeight;

    //Coal Settings
    public static ForgeConfigSpec.IntValue coalVeinSize;
    public static ForgeConfigSpec.IntValue coalPerChunk;
    public static ForgeConfigSpec.IntValue coalMinHeight;
    public static ForgeConfigSpec.IntValue coalMaxHeight;

    //Gold Settings
    public static ForgeConfigSpec.IntValue goldVeinSize;
    public static ForgeConfigSpec.IntValue goldPerChunk;
    public static ForgeConfigSpec.IntValue goldMinHeight;
    public static ForgeConfigSpec.IntValue goldMaxHeight;

    //Silver Settings
    public static ForgeConfigSpec.IntValue silverVeinSize;
    public static ForgeConfigSpec.IntValue silverPerChunk;
    public static ForgeConfigSpec.IntValue silverMinHeight;
    public static ForgeConfigSpec.IntValue silverMaxHeight;
    
    //Iron Settings
    public static ForgeConfigSpec.IntValue ironVeinSize;
    public static ForgeConfigSpec.IntValue ironPerChunk;
    public static ForgeConfigSpec.IntValue ironMinHeight;
    public static ForgeConfigSpec.IntValue ironMaxHeight;

    //Lead Settings
    public static ForgeConfigSpec.IntValue leadVeinSize;
    public static ForgeConfigSpec.IntValue leadPerChunk;
    public static ForgeConfigSpec.IntValue leadMinHeight;
    public static ForgeConfigSpec.IntValue leadMaxHeight;

    //Nickel Settings
    public static ForgeConfigSpec.IntValue nickelVeinSize;
    public static ForgeConfigSpec.IntValue nickelPerChunk;
    public static ForgeConfigSpec.IntValue nickelMinHeight;
    public static ForgeConfigSpec.IntValue nickelMaxHeight;

    //Copper Settings
    public static ForgeConfigSpec.IntValue copperVeinSize;
    public static ForgeConfigSpec.IntValue copperPerChunk;
    public static ForgeConfigSpec.IntValue copperMinHeight;
    public static ForgeConfigSpec.IntValue copperMaxHeight;

    //Aluminum Settings
    public static ForgeConfigSpec.IntValue aluminumVeinSize;
    public static ForgeConfigSpec.IntValue aluminumPerChunk;
    public static ForgeConfigSpec.IntValue aluminumMinHeight;
    public static ForgeConfigSpec.IntValue aluminumMaxHeight;

    //Tin Settings
    public static ForgeConfigSpec.IntValue tinVeinSize;
    public static ForgeConfigSpec.IntValue tinPerChunk;
    public static ForgeConfigSpec.IntValue tinMinHeight;
    public static ForgeConfigSpec.IntValue tinMaxHeight;


    public static void Init(ForgeConfigSpec.Builder builder) {

        //Emerald Ore Values
        emeraldVeinSize = builder
                .comment("Set Max Emerald Vein Size (Default = 8)")
                .defineInRange("ore_generation.emerald.emeraldVeinSize", 8, 0, 36);
        emeraldPerChunk = builder
                .comment("Set Emerald Spawn Chance (Default = 2)")
                .defineInRange("ore_generation.emerald.emeraldChance", 2, 0, 32);
        emeraldMinHeight = builder
                .comment("Set Emerald Min Spawn Height (Default = 0)")
                .defineInRange("ore_generation.emerald.emeraldMinHeight", 0, 0, 32);
        emeraldMaxHeight = builder
                .comment("Set Emerald Max Spawn Height (Default = 255)")
                .defineInRange("ore_generation.emerald.emeraldMaxHeight", 255, 0, 255);


        //Diamond Ore Values
        diamondVeinSize = builder
                .comment("Set Max Diamond Vein Size (Default = 8)")
                .defineInRange("ore_generation.diamond.diamondVeinSize", 8, 0, 36);
        diamondPerChunk = builder
                .comment("Set Diamond Spawn Chance (Default = 3)")
                .defineInRange("ore_generation.diamond.diamondChance", 3, 0, 32);
        diamondMinHeight = builder
                .comment("Set Diamond Min Spawn Height (Default = 0)")
                .defineInRange("ore_generation.diamond.diamondMinHeight", 0, 0, 32);
        diamondMaxHeight = builder
                .comment("Set Diamond Max Spawn Height (Default = 255)")
                .defineInRange("ore_generation.diamond.diamondMaxHeight", 255, 0, 255);

        //Redstone Ore Values
        redstoneVeinSize = builder
                .comment("Set Max Redstone Vein Size (Default = 8)")
                .defineInRange("ore_generation.redstone.redstoneVeinSize", 8, 0, 36);
        redstonePerChunk = builder
                .comment("Set Redstone Spawn Chance (Default = 8)")
                .defineInRange("ore_generation.redstone.redstoneChance", 8, 0, 64);
        redstoneMinHeight = builder
                .comment("Set Redstone Min Spawn Height (Default = 0)")
                .defineInRange("ore_generation.redstone.redstoneMinHeight", 0, 0, 32);
        redstoneMaxHeight = builder
                .comment("Set Redstone Max Spawn Height (Default = 255)")
                .defineInRange("ore_generation.redstone.redstoneMaxHeight", 255, 0, 255);

        //Lapis Ore Values
        lapisVeinSize = builder
                .comment("Set Max Lapis Vein Size (Default = 7)")
                .defineInRange("ore_generation.lapis.lapisVeinSize", 7, 0, 36);
        lapisPerChunk = builder
                .comment("Set Lapis Spawn Chance (Default = 2)")
                .defineInRange("ore_generation.lapis.lapisChance", 2, 0, 64);
        lapisMinHeight = builder
                .comment("Set Lapis Min Spawn Height (Default = 0)")
                .defineInRange("ore_generation.lapis.lapisMinHeight", 0, 0, 32);
        lapisMaxHeight = builder
                .comment("Set Lapis Max Spawn Height (Default = 255)")
                .defineInRange("ore_generation.lapis.lapisMaxHeight", 255, 0, 255);

        //Coal Ore Values
        coalVeinSize = builder
                .comment("Set Max Coal Vein Size (Default = 17)")
                .defineInRange("ore_generation.coal.coalVeinSize", 17, 0, 64);
        coalPerChunk = builder
                .comment("Set Coal Spawn Chance (Default = 20)")
                .defineInRange("ore_generation.coal.coalChance", 20, 0, 64);
        coalMinHeight = builder
                .comment("Set Coal Min Spawn Height (Default = 0)")
                .defineInRange("ore_generation.coal.coalMinHeight", 0, 0, 32);
        coalMaxHeight = builder
                .comment("Set Coal Max Spawn Height (Default = 255)")
                .defineInRange("ore_generation.coal.coalMaxHeight", 255, 0, 255);

        //Gold Ore Values
        goldVeinSize = builder
                .comment("Set Max Gold Vein Size (Default = 9)")
                .defineInRange("ore_generation.gold.goldVeinSize", 9, 0, 64);
        goldPerChunk = builder
                .comment("Set Gold Spawn Chance (Default = 4)")
                .defineInRange("ore_generation.gold.goldChance", 4, 0, 64);
        goldMinHeight = builder
                .comment("Set Gold Min Spawn Height (Default = 0)")
                .defineInRange("ore_generation.gold.goldMinHeight", 0, 0, 32);
        goldMaxHeight = builder
                .comment("Set Gold Max Spawn Height (Default = 255)")
                .defineInRange("ore_generation.gold.goldMaxHeight", 255, 0, 255);

        //Silver Ore Values
        silverVeinSize = builder
                .comment("Set Max Silver Vein Size (Default = 9)")
                .defineInRange("ore_generation.silver.silverVeinSize", 9, 0, 64);
        silverPerChunk = builder
                .comment("Set Silver Spawn Chance (Default = 4)")
                .defineInRange("ore_generation.silver.silverChance", 4, 0, 64);
        silverMinHeight = builder
                .comment("Set Silver Min Spawn Height (Default = 0)")
                .defineInRange("ore_generation.silver.silverMinHeight", 0, 0, 32);
        silverMaxHeight = builder
                .comment("Set Silver Max Spawn Height (Default = 255)")
                .defineInRange("ore_generation.silver.silverMaxHeight", 255, 0, 255);
        
        //Iron Ore Values
        ironVeinSize = builder
                .comment("Set Max Iron Vein Size (Default = 9)")
                .defineInRange("ore_generation.iron.ironVeinSize", 8, 0, 32);
        ironPerChunk = builder
                .comment("Set Iron Spawn Chance (Default = 20)")
                .defineInRange("ore_generation.iron.ironChance", 20, 0, 64);
        ironMinHeight = builder
                .comment("Set Iron Min Spawn Height (Default = 0)")
                .defineInRange("ore_generation.iron.ironMinHeight", 0, 0, 32);
        ironMaxHeight = builder
                .comment("Set Iron Max Spawn Height (Default = 255)")
                .defineInRange("ore_generation.iron.ironMaxHeight", 255, 0, 255);

        //Lead Ore Values
        leadVeinSize = builder
                .comment("Set Max Lead Vein Size (Default = 9)")
                .defineInRange("ore_generation.lead.leadVeinSize", 8, 0, 32);
        leadPerChunk = builder
                .comment("Set Lead Spawn Chance (Default = 8)")
                .defineInRange("ore_generation.lead.leadChance", 8, 0, 64);
        leadMinHeight = builder
                .comment("Set Lead Min Spawn Height (Default = 0)")
                .defineInRange("ore_generation.lead.leadMinHeight", 0, 0, 32);
        leadMaxHeight = builder
                .comment("Set Lead Max Spawn Height (Default = 255)")
                .defineInRange("ore_generation.lead.leadMaxHeight", 255, 0, 255);

        //nickel Ore Values
        nickelVeinSize = builder
                .comment("Set Max Nickel Vein Size (Default = 9)")
                .defineInRange("ore_generation.nickel.nickelVeinSize", 8, 0, 32);
        nickelPerChunk = builder
                .comment("Set Nickel Spawn Chance (Default = 4)")
                .defineInRange("ore_generation.nickel.nickelChance", 4, 0, 64);
        nickelMinHeight = builder
                .comment("Set Nickel Min Spawn Height (Default = 0)")
                .defineInRange("ore_generation.nickel.nickelMinHeight", 0, 0, 32);
        nickelMaxHeight = builder
                .comment("Set Nickel Max Spawn Height (Default = 255)")
                .defineInRange("ore_generation.nickel.nickelMaxHeight", 255, 0, 255);

        //Copper Ore Values
        copperVeinSize = builder
                .comment("Set Max Copper Vein Size (Default = 9)")
                .defineInRange("ore_generation.copper.copperVeinSize", 8, 0, 32);
        copperPerChunk = builder
                .comment("Set Copper Spawn Chance (Default = 20)")
                .defineInRange("ore_generation.copper.copperChance", 20, 0, 64);
        copperMinHeight = builder
                .comment("Set Copper Min Spawn Height (Default = 0)")
                .defineInRange("ore_generation.copper.copperMinHeight", 0, 0, 32);
        copperMaxHeight = builder
                .comment("Set Copper Max Spawn Height (Default = 255)")
                .defineInRange("ore_generation.copper.copperMaxHeight", 255, 0, 255);

        //Aluminum Ore Values
        aluminumVeinSize = builder
                .comment("Set Max Aluminum Vein Size (Default = 9)")
                .defineInRange("ore_generation.aluminum.aluminumVeinSize", 8, 0, 32);
        aluminumPerChunk = builder
                .comment("Set Aluminum Spawn Chance (Default = 10)")
                .defineInRange("ore_generation.aluminum.aluminumChance", 10, 0, 64);
        aluminumMinHeight = builder
                .comment("Set Aluminum Min Spawn Height (Default = 0)")
                .defineInRange("ore_generation.aluminum.aluminumMinHeight", 0, 0, 32);
        aluminumMaxHeight = builder
                .comment("Set Aluminum Max Spawn Height (Default = 255)")
                .defineInRange("ore_generation.aluminum.aluminumMaxHeight", 255, 0, 255);

        //Tin Ore Values
        tinVeinSize = builder
                .comment("Set Max Tin Vein Size (Default = 9)")
                .defineInRange("ore_generation.tin.tinVeinSize", 8, 0, 32);
        tinPerChunk = builder
                .comment("Set Tin Spawn Chance (Default = 20)")
                .defineInRange("ore_generation.tin.tinChance", 20, 0, 64);
        tinMinHeight = builder
                .comment("Set Tin Min Spawn Height (Default = 0)")
                .defineInRange("ore_generation.tin.tinMinHeight", 0, 0, 32);
        tinMaxHeight = builder
                .comment("Set Tin Max Spawn Height (Default = 255)")
                .defineInRange("ore_generation.tin.tinMaxHeight", 255, 0, 255);

    }
}
