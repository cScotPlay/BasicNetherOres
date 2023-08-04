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

        //Ore Generation Toggle
        public static ForgeConfigSpec.BooleanValue emeraldGeneration;
        public static ForgeConfigSpec.BooleanValue diamondGeneration;
        public static ForgeConfigSpec.BooleanValue redstoneGeneration;
        public static ForgeConfigSpec.BooleanValue lapisGeneration;
        public static ForgeConfigSpec.BooleanValue coalGeneration;
        public static ForgeConfigSpec.BooleanValue silverGeneration;
        public static ForgeConfigSpec.BooleanValue ironGeneration;
        public static ForgeConfigSpec.BooleanValue leadGeneration;
        public static ForgeConfigSpec.BooleanValue nickelGeneration;
        public static ForgeConfigSpec.BooleanValue copperGeneration;
        public static ForgeConfigSpec.BooleanValue aluminumGeneration;
        public static ForgeConfigSpec.BooleanValue tinGeneration;
        public static ForgeConfigSpec.BooleanValue osmiumGeneration;
        public static ForgeConfigSpec.BooleanValue uraniumGeneration;
        public static ForgeConfigSpec.BooleanValue zincGeneration;

        public Common(ForgeConfigSpec.Builder builder) {
            builder.push("oreGeneration");

            //World Ore Generation
            emeraldGeneration = builder
                    .comment("Generate Emerald Ore")
                    .define("ore_generation.world_generation.emerald", true);
            diamondGeneration = builder
                    .comment("Generate Diamond Ore")
                    .define("ore_generation.world_generation.diamond", true);
            redstoneGeneration = builder
                    .comment("Generate Redstone Ore")
                    .define("ore_generation.world_generation.redstone", true);
            lapisGeneration = builder
                    .comment("Generate Lapis Ore")
                    .define("ore_generation.world_generation.lapis", true);
            coalGeneration = builder
                    .comment("Generate Coal Ore")
                    .define("ore_generation.world_generation.coal", true);
            silverGeneration = builder
                    .comment("Generate Silver Ore")
                    .define("ore_generation.world_generation.silver", false);
            ironGeneration = builder
                    .comment("Generate Iron Ore")
                    .define("ore_generation.world_generation.iron", true);
            leadGeneration = builder
                    .comment("Generate Lead Ore")
                    .define("ore_generation.world_generation.lead", false);
            nickelGeneration = builder
                    .comment("Generate Nickel Ore")
                    .define("ore_generation.world_generation.nickel", false);
            copperGeneration = builder
                    .comment("Generate Copper Ore")
                    .define("ore_generation.world_generation.copper", true);
            aluminumGeneration = builder
                    .comment("Generate Aluminum Ore")
                    .define("ore_generation.world_generation.aluminum", false);
            tinGeneration = builder
                    .comment("Generate Tin Ore")
                    .define("ore_generation.world_generation.tin", false);
            osmiumGeneration = builder
                    .comment("Generate Osmium Ore")
                    .define("ore_generation.world_generation.osmium", false);
            uraniumGeneration = builder
                    .comment("Generate Uranium Ore")
                    .define("ore_generation.world_generation.uranium", false);
            zincGeneration = builder
                    .comment("Generate Zinc Ore")
                    .define("ore_generation.world_generation.zinc", false);

            builder.pop();

        }

        @Override
        public boolean emeraldGeneration() {
            return emeraldGeneration.get();
        }

        @Override
        public boolean diamondGeneration() {
            return diamondGeneration.get();
        }

        @Override
        public boolean redstoneGeneration() {
            return redstoneGeneration.get();
        }

        @Override
        public boolean lapisGeneration() {
            return lapisGeneration.get();
        }

        @Override
        public boolean coalGeneration() {
            return coalGeneration.get();
        }

        @Override
        public boolean silverGeneration() {
            return silverGeneration.get();
        }

        @Override
        public boolean ironGeneration() {
            return ironGeneration.get();
        }

        @Override
        public boolean leadGeneration() {
            return leadGeneration.get();
        }

        @Override
        public boolean nickelGeneration() {
            return nickelGeneration.get();
        }

        @Override
        public boolean copperGeneration() {
            return copperGeneration.get();
        }

        @Override
        public boolean aluminumGeneration() {
            return aluminumGeneration.get();
        }

        @Override
        public boolean tinGeneration() {
            return tinGeneration.get();
        }

        @Override
        public boolean osmiumGeneration() {
            return osmiumGeneration.get();
        }

        @Override
        public boolean uraniumGeneration() {
            return uraniumGeneration.get();
        }

        @Override
        public boolean zincGeneration() {
            return zincGeneration.get();
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
