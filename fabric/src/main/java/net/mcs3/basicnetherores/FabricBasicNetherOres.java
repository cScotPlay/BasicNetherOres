package net.mcs3.basicnetherores;

import net.fabricmc.api.ModInitializer;
import net.mcs3.basicnetherores.init.BNOBlocks;
import net.mcs3.basicnetherores.init.BNOItems;
import net.mcs3.basicnetherores.worldgen.BNOFabricBiomeModifiers;
import net.mcs3.basicnetherores.worldgen.item.ModCreativeModeTabs;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;

import java.util.function.BiConsumer;

public class FabricBasicNetherOres implements ModInitializer {
    public static FabricBasicNetherOres INSTANCE;

    @Override
    public void onInitialize() {
        
        // This method is invoked by the Fabric mod loader when it is ready
        // to load your mod. You can access Fabric and Common code in this
        // project.

        // Use Fabric to bootstrap the Common mod.
        INSTANCE = this;
        Constants.LOGGER.info("Loading Basic Nether Ores");

        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ModCreativeModeTabs.BNO_TAB_KEY, ModCreativeModeTabs.BNO_TAB);

        BNOBlocks.registerBlocks(bind(BuiltInRegistries.BLOCK));
        BNOBlocks.registerItemBlocks(bind(BuiltInRegistries.ITEM));
        BNOItems.registerItems(registerItemAndPutInTab);

        CommonClass.init();

        new BNOFabricBiomeModifiers().biomeModificationHelper();
    }

    private static <T> BiConsumer<T, ResourceLocation> bind(Registry<? super T> registry) {
        return (t, id) -> Registry.register(registry, id, t);
    }

    private static final BiConsumer<Item, ResourceLocation> registerItemAndPutInTab = (item, id) -> {
        Registry.register(BuiltInRegistries.ITEM, id, item);
    };
}
