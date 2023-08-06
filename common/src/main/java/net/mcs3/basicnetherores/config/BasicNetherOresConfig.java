package net.mcs3.basicnetherores.config;

import net.mcs3.basicnetherores.Constants;

import java.util.List;

public class BasicNetherOresConfig {

    public interface ConfigAccess {

        //Ore Generation Toggle
        boolean emeraldGeneration();
        boolean diamondGeneration();
        boolean redstoneGeneration();
        boolean lapisGeneration();
        boolean coalGeneration();
        boolean silverGeneration();
        boolean ironGeneration();
        boolean leadGeneration();
        boolean nickelGeneration();
        boolean copperGeneration();
        boolean aluminumGeneration();
        boolean tinGeneration();
        boolean osmiumGeneration();
        boolean uraniumGeneration();
        boolean zincGeneration();

        //Variables for Ore Protection
        boolean piglinGuard();
        boolean silkEffect();
        int protectionRange();
        List<? extends String> protectedBlocks();
    }

    private static ConfigAccess config = null;

    public static ConfigAccess common() {
        return config;
    }

    public static void setCommon(ConfigAccess access) {
        if (config != null) {
            Constants.LOGGER.warn("ConfigAccess was replaced! Old {} New {}",
                    config.getClass().getName(), access.getClass().getName());
        }
        config = access;
    }
}
