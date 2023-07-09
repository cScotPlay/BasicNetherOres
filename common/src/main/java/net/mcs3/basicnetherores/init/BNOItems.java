package net.mcs3.basicnetherores.init;

import net.mcs3.basicnetherores.platform.services.IPlatformHelper;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BNOItems {
    public static final Map<ResourceLocation, Item> ITEMS = new LinkedHashMap<>();

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
