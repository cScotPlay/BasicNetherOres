package com.cscot.basicnetherores.world.level.block;

import com.cscot.basicnetherores.BasicNetherOres;
import com.cscot.basicnetherores.api.BlockList;
import com.cscot.basicnetherores.api.ItemList;
import com.cscot.basicnetherores.util.handler.RegisteryHandler;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class ModRawOreBlock extends Block
{
    private String name;

    public ModRawOreBlock(String name)
    {
        super(BlockBehaviour.Properties.of(Material.STONE)
                .requiresCorrectToolForDrops()
                .strength(5.0f, 6.0f)
                .sound(SoundType.STONE));
        setRegistryName(BasicNetherOres.modid, name);

        ItemList.items.add(new BlockItem(this, new Item.Properties().tab(BasicNetherOres.bnoItemGroup)).setRegistryName(RegisteryHandler.RegistryEvents.location(name)));
        BlockList.blocks.add(this);
    }
}
