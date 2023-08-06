package net.mcs3.basicnetherores.config;

import net.mcs3.basicnetherores.Constants;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import org.apache.commons.lang3.tuple.Pair;

import java.util.Arrays;
import java.util.List;

@Mod.EventBusSubscriber(modid = Constants.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ForgeBasicNetherOresConfig {

    private static class Common implements BasicNetherOresConfig.ConfigAccess {

        public static ForgeConfigSpec.BooleanValue piglinGuard;
        public static ForgeConfigSpec.BooleanValue silkEffect;
        public static ForgeConfigSpec.IntValue protectionRange;
        public static ForgeConfigSpec.ConfigValue<List<? extends String>> protectedBlocks;

        public Common(ForgeConfigSpec.Builder builder) {
//            builder.push("oreGeneration");
            builder.comment("Piglin Projection Settings");
            builder.push("protName");

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
                                    "bno:nether_zinc_ore",
                                    "minecraft:glowstone",
                                    "minecraft:nether_quartz_ore"
                            }), (obj) -> obj instanceof String ? true : false);

            //World Ore Generation
//            emeraldGeneration = builder
//                    .comment("Generate Emerald Ore")
//                    .define("ore_generation.world_generation.emerald", true);

            builder.pop();

        }

        @Override
        public boolean emeraldGeneration() {
            return false;
        }

        @Override
        public boolean diamondGeneration() {
            return false;
        }

        @Override
        public boolean redstoneGeneration() {
            return false;
        }

        @Override
        public boolean lapisGeneration() {
            return false;
        }

        @Override
        public boolean coalGeneration() {
            return false;
        }

        @Override
        public boolean silverGeneration() {
            return false;
        }

        @Override
        public boolean ironGeneration() {
            return false;
        }

        @Override
        public boolean leadGeneration() {
            return false;
        }

        @Override
        public boolean nickelGeneration() {
            return false;
        }

        @Override
        public boolean copperGeneration() {
            return false;
        }

        @Override
        public boolean aluminumGeneration() {
            return false;
        }

        @Override
        public boolean tinGeneration() {
            return false;
        }

        @Override
        public boolean osmiumGeneration() {
            return false;
        }

        @Override
        public boolean uraniumGeneration() {
            return false;
        }

        @Override
        public boolean zincGeneration() {
            return false;
        }

        @Override
        public boolean piglinGuard() {
            return piglinGuard.get();
        }

        @Override
        public boolean silkEffect() {
            return silkEffect.get();
        }

        @Override
        public int protectionRange() {
            return protectionRange.get();
        }

        @Override
        public List<? extends String> protectedBlocks() {
            return protectedBlocks.get();
        }
    }

    private static final Common COMMON;
    private static final ForgeConfigSpec COMMON_SPEC;
    static {
        final Pair<Common, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(Common::new);
        COMMON_SPEC = specPair.getRight();
        COMMON = specPair.getLeft();
    }

    public static void setup() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, COMMON_SPEC);
        BasicNetherOresConfig.setCommon(COMMON);
    }

}
