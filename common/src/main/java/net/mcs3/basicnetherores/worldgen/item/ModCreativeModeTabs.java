package net.mcs3.basicnetherores.worldgen.item;

import net.mcs3.basicnetherores.Constants;
import net.mcs3.basicnetherores.init.BNOBlocks;
import net.mcs3.basicnetherores.init.BNOItems;
import net.mcs3.basicnetherores.platform.services.IPlatformHelper;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

import static net.mcs3.basicnetherores.util.helper.ResourceLocationHelper.prefix;

@SuppressWarnings("unused")
public class ModCreativeModeTabs {

    public static final ResourceKey<CreativeModeTab> BNO_TAB_KEY = ResourceKey.create(Registries.CREATIVE_MODE_TAB, prefix("basicnetherores"));

    public static final CreativeModeTab BNO_TAB = IPlatformHelper.INSTANCE.creativeTab()
            .icon(() -> new ItemStack(BNOBlocks.NETHER_EMERALD_ORE.asItem()))
            .title(Component.translatable("itemGroup.bno.basicnetherores"))
            .displayItems((params, output) -> {
                output.accept(BNOBlocks.NETHER_EMERALD_ORE.asItem());
                output.accept(BNOBlocks.NETHER_DIAMOND_ORE.asItem());
                output.accept(BNOBlocks.NETHER_REDSTONE_ORE.asItem());
                output.accept(BNOBlocks.NETHER_LAPIS_ORE.asItem());
                output.accept(BNOBlocks.NETHER_COAL_ORE.asItem());
                output.accept(BNOBlocks.NETHER_SILVER_ORE.asItem());
                output.accept(BNOBlocks.NETHER_IRON_ORE.asItem());
                output.accept(BNOBlocks.NETHER_LEAD_ORE.asItem());
                output.accept(BNOBlocks.NETHER_NICKEL_ORE.asItem());
                output.accept(BNOBlocks.NETHER_COPPER_ORE.asItem());
                output.accept(BNOBlocks.NETHER_ALUMINUM_ORE.asItem());
                output.accept(BNOBlocks.NETHER_TIN_ORE.asItem());
                output.accept(BNOBlocks.NETHER_OSMIUM_ORE.asItem());
                output.accept(BNOBlocks.NETHER_URANIUM_ORE.asItem());
                output.accept(BNOBlocks.NETHER_ZINC_ORE.asItem());

                output.accept(BNOBlocks.ALUMINUM_BLOCK.asItem());
                output.accept(BNOBlocks.LEAD_BLOCK.asItem());
                output.accept(BNOBlocks.NICKEL_BLOCK.asItem());
                output.accept(BNOBlocks.SILVER_BLOCK.asItem());
                output.accept(BNOBlocks.TIN_BLOCK.asItem());
                output.accept(BNOBlocks.OSMIUM_BLOCK.asItem());
                output.accept(BNOBlocks.URANIUM_BLOCK.asItem());
                output.accept(BNOBlocks.ZINC_BLOCK.asItem());

                output.accept(BNOBlocks.RAW_ALUMINUM_BLOCK.asItem());
                output.accept(BNOBlocks.RAW_LEAD_BLOCK.asItem());
                output.accept(BNOBlocks.RAW_NICKEL_BLOCK.asItem());
                output.accept(BNOBlocks.RAW_SILVER_BLOCK.asItem());
                output.accept(BNOBlocks.RAW_TIN_BLOCK.asItem());
                output.accept(BNOBlocks.RAW_OSMIUM_BLOCK.asItem());
                output.accept(BNOBlocks.RAW_URANIUM_BLOCK.asItem());
                output.accept(BNOBlocks.RAW_ZINC_BLOCK.asItem());

                output.accept(BNOItems.RAW_ALUMINUM);
                output.accept(BNOItems.RAW_LEAD);
                output.accept(BNOItems.RAW_NICKEL);
                output.accept(BNOItems.RAW_SILVER);
                output.accept(BNOItems.RAW_TIN);
                output.accept(BNOItems.RAW_OSMIUM);
                output.accept(BNOItems.RAW_URANIUM);
                output.accept(BNOItems.RAW_ZINC);


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
