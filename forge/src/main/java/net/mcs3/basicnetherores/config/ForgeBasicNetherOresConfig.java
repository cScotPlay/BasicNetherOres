package net.mcs3.basicnetherores.config;

import net.mcs3.basicnetherores.Constants;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import org.apache.commons.lang3.tuple.Pair;

@Mod.EventBusSubscriber(modid = Constants.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ForgeBasicNetherOresConfig {

    private static class Common implements BasicNetherOresConfig.ConfigAccess {

        public Common(ForgeConfigSpec.Builder builder) {
            builder.push("oreGeneration");

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
