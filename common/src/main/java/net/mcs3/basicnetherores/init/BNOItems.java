package net.mcs3.basicnetherores.init;

import net.mcs3.basicnetherores.platform.services.IPlatformHelper;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

import static net.mcs3.basicnetherores.util.helper.ResourceLocationHelper.prefix;

public class BNOItems {
    public static final Map<ResourceLocation, Item> ITEMS = new LinkedHashMap<>();

    public static final Item RAW_ALUMINUM = make(prefix("raw_aluminum"), new Item(defaultBuilder()));
    public static final Item RAW_LEAD = make(prefix("raw_lead"), new Item(defaultBuilder()));
    public static final Item RAW_NICKEL = make(prefix("raw_nickel"), new Item(defaultBuilder()));
    public static final Item RAW_SILVER = make(prefix("raw_silver"), new Item(defaultBuilder()));
    public static final Item RAW_TIN = make(prefix("raw_tin"), new Item(defaultBuilder()));
    public static final Item RAW_OSMIUM = make(prefix("raw_osmium"), new Item(defaultBuilder()));
    public static final Item RAW_URANIUM = make(prefix("raw_uranium"), new Item(defaultBuilder()));
    public static final Item RAW_ZINC = make(prefix("raw_zinc"), new Item(defaultBuilder()));

    public static Item.Properties defaultBuilder() {
        return IPlatformHelper.INSTANCE.defaultItemBuilder();
    }

    private static <T extends Item> T make(ResourceLocation id, T item) {
        var old = ITEMS.put(id, item);
        if (old != null) {
            throw new IllegalArgumentException("Typo? Duplicate id " + id);
        }
        return item;
    }

    public static void registerItems(BiConsumer<Item, ResourceLocation> r) {
        for (var e : ITEMS.entrySet()) {
            r.accept(e.getValue(), e.getKey());
        }
    }
}
