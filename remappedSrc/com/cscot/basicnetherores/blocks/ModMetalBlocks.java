package com.cscot.basicnetherores.blocks;

import com.cscot.basicnetherores.BasicNetherOres;
import com.cscot.basicnetherores.api.ItemLists;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModMetalBlocks extends Block
{
    public ModMetalBlocks(String name)
    {
        super(FabricBlockSettings.of(Material.STONE)
                .requiresTool()
                .strength(5.0f, 6.0f)
                .sounds(BlockSoundGroup.METAL));

        new Identifier(BasicNetherOres.MOD_ID, name);

        ItemLists.add(name, new BlockItem(this, new Item.Settings().group(BasicNetherOres.ITEMGROUP)));
    }
}
