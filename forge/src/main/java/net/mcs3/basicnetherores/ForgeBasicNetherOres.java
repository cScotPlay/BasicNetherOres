package net.mcs3.basicnetherores;

import net.mcs3.basicnetherores.config.ForgeBasicNetherOresConfig;
import net.mcs3.basicnetherores.init.BNOBlocks;
import net.mcs3.basicnetherores.init.BNOItems;
import net.mcs3.basicnetherores.worldgen.item.ModCreativeModeTabs;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.*;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

@Mod(Constants.MOD_ID)
public class ForgeBasicNetherOres {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Constants.MOD_ID);
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES = DeferredRegister.create(Registries.CONFIGURED_FEATURE, Constants.MOD_ID);
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registries.PLACED_FEATURE, Constants.MOD_ID);


    public static final RegistryObject<CreativeModeTab> BNO_TAB = CREATIVE_MODE_TABS.register("example_tab", () -> ModCreativeModeTabs.BNO_TAB);
    
    public ForgeBasicNetherOres() {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        registryInit();
        CREATIVE_MODE_TABS.register(modEventBus);
    
        // This method is invoked by the Forge mod loader when it is ready
        // to load your mod. You can access Forge and Common code in this
        // project.
    
        // Use Forge to bootstrap the Common mod.
//        Constants.LOGGER.info("Hello Forge world!");
        ForgeBasicNetherOresConfig.setup();
        CommonClass.init();
        PLACED_FEATURES.register(modEventBus);

    }

    private void registryInit() {
        bind(Registries.BLOCK, BNOBlocks::registerBlocks);
        bind(Registries.ITEM, BNOBlocks::registerItemBlocks);
        bind(Registries.ITEM, BNOItems::registerItems);

    }

    private static <T> void bind(ResourceKey<Registry<T>> registry, Consumer<BiConsumer<T, ResourceLocation>> source) {
        FMLJavaModLoadingContext.get().getModEventBus().addListener((RegisterEvent event) -> {
            if (registry.equals(event.getRegistryKey())) {
                source.accept((t, rl) -> event.register(registry, rl, () -> t));
            }
        });
    }
}