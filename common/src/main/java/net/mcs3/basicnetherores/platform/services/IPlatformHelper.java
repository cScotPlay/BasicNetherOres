package net.mcs3.basicnetherores.platform.services;

import net.mcs3.basicnetherores.platform.Services;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public interface IPlatformHelper {

    default boolean isFabric() {
        return !isForge();
    }

    default boolean isForge() {
        return !isFabric();
    }

    /**
     * Gets the name of the current platform
     *
     * @return The name of the current platform.
     */
    String getPlatformName();

    /**
     * Checks if a mod with the given id is loaded.
     *
     * @param modId The mod to check if it is loaded.
     * @return True if the mod is loaded, false otherwise.
     */
    boolean isModLoaded(String modId);

    /**
     * Check if the game is currently in a development environment.
     *
     * @return True if in a development environment, false otherwise.
     */
    boolean isDevelopmentEnvironment();

    /**
     * Gets the name of the environment type as a string.
     *
     * @return The name of the environment type.
     */
    default String getEnvironmentName() {

        return isDevelopmentEnvironment() ? "development" : "production";
    }

    Item.Properties defaultItemBuilder();
    CreativeModeTab.Builder creativeTab();


    IPlatformHelper INSTANCE = Services.loadService(IPlatformHelper.class, null);
}