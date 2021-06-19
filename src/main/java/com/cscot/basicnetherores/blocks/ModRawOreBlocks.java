package com.cscot.basicnetherores.blocks;

import com.cscot.basicnetherores.BasicNetherOres;
import com.cscot.basicnetherores.api.ItemLists;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModRawOreBlocks extends Block
{
    public ModRawOreBlocks(String rawBlockName) {
        super(FabricBlockSettings.of(Material.STONE)
                .breakByTool(FabricToolTags.PICKAXES, 2)
                .requiresTool()
                .strength(5.0f, 6.0f)
                .sounds(BlockSoundGroup.STONE));

        new Identifier(BasicNetherOres.MOD_ID, rawBlockName);

        ItemLists.add(rawBlockName, new BlockItem(this, new Item.Settings().group(BasicNetherOres.ITEMGROUP)));
    }
}
