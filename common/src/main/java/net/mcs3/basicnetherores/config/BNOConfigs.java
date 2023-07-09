package net.mcs3.basicnetherores.config;

import com.kyanite.paragon.api.ConfigOption;
import com.kyanite.paragon.api.interfaces.Config;

public class BNOConfigs implements Config {
    public static final ConfigOption<Boolean> GENERATE_EMERALD = new ConfigOption<>("Generate Emerald Ore", true);
}
