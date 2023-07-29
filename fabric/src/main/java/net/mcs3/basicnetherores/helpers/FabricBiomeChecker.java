package net.mcs3.basicnetherores.helpers;

import com.mojang.serialization.DataResult;
import net.mcs3.basicnetherores.Constants;
import net.minecraft.resources.ResourceLocation;

import java.io.File;
import java.nio.file.Path;

public class FabricBiomeChecker {

    public static boolean checkPlacedFeature(String name) {



        File file = new File("/data/bno/worldgen/placed_feature/" + name + ".json");
        if(file.isFile()) {
            return true;
        } else
            return false;
    }
}
