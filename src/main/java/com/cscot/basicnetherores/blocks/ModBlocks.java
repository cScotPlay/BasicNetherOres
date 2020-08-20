package com.cscot.basicnetherores.blocks;

import com.cscot.basicnetherores.BasicNetherOres;
import com.cscot.basicnetherores.api.ItemLists;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks extends Block
{
    public ModBlocks(String name)
    {
        super(Settings.of(Material.METAL).strength(5.0f, 6.0f).sounds(BlockSoundGroup.METAL));
        new Identifier(BasicNetherOres.MOD_ID, name);

        ItemLists.add(name, new BlockItem(this, new Item.Settings().group(BasicNetherOres.ITEMGROUP)));

        //ItemList.items.add(new BlockItem(this.getBlock(), new Item.Properties().group(BasicNetherOres.bnoItemGroup)).setRegistryName(RegisteryHandler.RegistryEvents.location(name)));

        //BlockList.blocks.add(this);
    }

}
