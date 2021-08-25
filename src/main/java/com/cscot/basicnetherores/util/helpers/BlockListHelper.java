package com.cscot.basicnetherores.util.helpers;


import com.cscot.basicnetherores.config.OreProtectionConfig;
import com.cscot.basicnetherores.util.handler.ConfigHandler;
import net.minecraft.world.level.block.Block;

import java.util.ArrayList;
import java.util.List;

public class BlockListHelper
{
    public static List<String> PROTECTED_ORES;

    //Pull the list of protected ores from the config to be compared in BlockOreEvent
    public static boolean protectedOres(Block block) {
        String name = block.getRegistryName().toString();
        if (PROTECTED_ORES.contains(name))
            return true;
        else {
            boolean contains = false;
            /*for (String s : PROTECTED_ORES)
            {
                if (s.contains("*"))
                {
                    if (name.contains(s.replace("*","")))
                        contains = true;
                }
            }*/
            return contains;
        }
    }

    //Registers the list of protected blocks from the config
    @SuppressWarnings("unchecked")
    public static void initProtectedBlocks()
    {
        List<String> protOres = (List<String>) OreProtectionConfig.protectedBlocks.get();
        PROTECTED_ORES = new ArrayList<String>();

        for (int i = 0; i < protOres.size(); i++)
        {
            PROTECTED_ORES.add(protOres.get(i));
        }
    }
}