package com.cscot.basicnetherores.config;

import net.minecraftforge.common.ForgeConfigSpec;

import java.util.Arrays;
import java.util.List;

public class OreProtectionConfig
{

    //Variables for Ore Protection

    public static ForgeConfigSpec.BooleanValue piglinGuard;
    public static ForgeConfigSpec.BooleanValue silkEffect;
    public static ForgeConfigSpec.IntValue protectionRange;
    public static ForgeConfigSpec.ConfigValue<List<? extends String>> protectedBlocks;

    public static void Init(ForgeConfigSpec.Builder builder) {
        //builder.pop();
        builder.comment("Piglin Projection Settings");
        //builder.push(protName);

        piglinGuard = builder
                .comment("If set to 'true' Piglins will protect Nether Ores")
                .define("ore_protector.piglinGuard", true);
        silkEffect = builder
                .comment("Set to false if you want the Piglins to attack when using Silk Touch Tools")
                .define("ore_protector.silkEffect", true);
        protectionRange = builder
                .comment("Set range that Piglins will aggro when mining ores(Default = 16)")
                .defineInRange("ore_protector.protectionRange", 16, 0, 64);
        protectedBlocks = builder
                .comment("Add Blocks to be protected by Piglins (Example: 'minecraft:glowstone')")
                .defineList("ore_protector.protectedBlocks", Arrays.asList(new String[]
                        {
                                "bno:nether_emerald_ore",
                                "bno:nether_diamond_ore",
                                "bno:nether_lapis_ore",
                                "bno:nether_redstone_ore",
                                "minecraft:nether_gold_ore",
                                "bno:nether_silver_ore",
                                "bno:nether_iron_ore",
                                "bno:nether_lead_ore",
                                "bno:nether_nickel_ore",
                                "bno:nether_coal_ore",
                                "bno:nether_copper_ore",
                                "bno:nether_aluminum_ore",
                                "bno:nether_tin_ore",
                                "bno:nether_osmium_ore",
                                "bno:nether_uranium_ore",
                                "minecraft:glowstone",
                                "minecraft:nether_quartz_ore"
                        }), (obj) -> obj instanceof String ? true : false);
    }

}
