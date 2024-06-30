package net.mcs3.basicnetherores.config;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.mcs3.basicnetherores.Constants;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.loading.FMLConfig;
import net.neoforged.fml.loading.FMLPaths;
import net.neoforged.neoforge.common.ModConfigSpec;
import net.neoforged.neoforge.common.NeoForgeConfig;
import org.apache.commons.lang3.tuple.Pair;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;


public class NeoBasicNetherOresConfig {

    private static ModConfigSpec COMMON_SPEC;
    private static Common COMMON;

    private static class Common implements BasicNetherOresConfig.ConfigAccess {

        public static ModConfigSpec.BooleanValue piglinGuard;
        public static ModConfigSpec.BooleanValue silkEffect;
        public static ModConfigSpec.IntValue protectionRange;
        public static ModConfigSpec.ConfigValue<List<? extends String>> protectedBlocks;

        public Common(final ModConfigSpec.Builder builder) {
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
                                    "bno:basalt_emerald_ore",
                                    "bno:basalt_diamond_ore",
                                    "bno:basalt_lapis_ore",
                                    "bno:basalt_redstone_ore",
                                    "bno:basalt_silver_ore",
                                    "bno:basalt_iron_ore",
                                    "bno:basalt_lead_ore",
                                    "bno:basalt_nickel_ore",
                                    "bno:basalt_coal_ore",
                                    "bno:basalt_copper_ore",
                                    "bno:basalt_aluminum_ore",
                                    "bno:basalt_tin_ore",
                                    "bno:basalt_osmium_ore",
                                    "bno:basalt_uranium_ore",
                                    "bno:basalt_zinc_ore",
                                    "bno:soul_emerald_ore",
                                    "bno:soul_diamond_ore",
                                    "bno:soul_lapis_ore",
                                    "bno:soul_redstone_ore",
                                    "bno:soul_silver_ore",
                                    "bno:soul_iron_ore",
                                    "bno:soul_lead_ore",
                                    "bno:soul_nickel_ore",
                                    "bno:soul_coal_ore",
                                    "bno:soul_copper_ore",
                                    "bno:soul_aluminum_ore",
                                    "bno:soul_tin_ore",
                                    "bno:soul_osmium_ore",
                                    "bno:soul_uranium_ore",
                                    "bno:soul_zinc_ore",
                                    "minecraft:glowstone",
                                    "minecraft:nether_quartz_ore"
                            }), (obj) -> obj instanceof String ? true : false);

            builder.pop();

            COMMON_SPEC = builder.build();

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

    static {
        Pair<Common, ModConfigSpec> specPair = new ModConfigSpec.Builder().configure(Common::new);
        COMMON_SPEC = specPair.getRight();
        COMMON = specPair.getLeft();
    }

    public static void setup() {
        ModLoadingContext.get().getActiveContainer().registerConfig(ModConfig.Type.COMMON, COMMON_SPEC);
        BasicNetherOresConfig.setCommon(COMMON);
    }

}
