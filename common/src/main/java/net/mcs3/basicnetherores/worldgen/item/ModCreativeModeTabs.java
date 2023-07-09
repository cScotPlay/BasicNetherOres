package net.mcs3.basicnetherores.worldgen.item;

import net.mcs3.basicnetherores.Constants;
import net.mcs3.basicnetherores.init.BNOBlocks;
import net.mcs3.basicnetherores.platform.services.IPlatformHelper;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import static net.mcs3.basicnetherores.util.helper.ResourceLocationHelper.prefix;

@SuppressWarnings("unused")
public class ModCreativeModeTabs {

    public static final ResourceKey<CreativeModeTab> BNO_TAB_KEY = ResourceKey.create(Registries.CREATIVE_MODE_TAB, prefix("itemgroup"));

    public static final CreativeModeTab BNO_TAB = IPlatformHelper.INSTANCE.creativeTab()
            .icon(() -> new ItemStack(BNOBlocks.NETHER_EMERALD_ORE.asItem()))
            .title(Component.translatable(Constants.MOD_ID + "itemgroup"))
            .displayItems((params, output) -> {
                output.accept(BNOBlocks.NETHER_EMERALD_ORE.asItem());
            })
            .build();

//    public static final RegistryInterface<CreativeModeTab> TABS = XPlatform.INSTANCE.registryInterface(BuiltInRegistries.CREATIVE_MODE_TAB);
//    public static final List<RegistryHolder<? extends ItemLike>> ENTRIES = new ArrayList<>();
//
//    public static final RegistryHolder<CreativeModeTab> TAB = TABS.register("items", () -> XPlatform.INSTANCE.creativeTab()
//            .icon(() -> new ItemStack((Items.BUCKET.asItem()))
//            .title(Component.translatable(Constants.MOD_ID + "itemgroup"))
//            .displayItems((params, output) -> {
//                for (RegistryHolder<? extends ItemLike> entry : ENTRIES)
//                {
//                    output.accept(entry.get());
//                }
//            })
//            .build());
}
