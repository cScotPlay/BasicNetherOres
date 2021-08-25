package com.cscot.basicnetherores.world.level.block;

import com.cscot.basicnetherores.BasicNetherOres;
import com.cscot.basicnetherores.api.BlockList;
import com.cscot.basicnetherores.api.ItemList;
import com.cscot.basicnetherores.util.handler.RegisteryHandler;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

//This class takes the BlockList blocks and creates them with specific properties
public class ModMetalBlock extends Block
{
    private String name;

    public ModMetalBlock(String name)
    {
        super(BlockBehaviour.Properties.of(Material.METAL)
                .requiresCorrectToolForDrops()
                .strength(5.0f, 6.0f)
                .sound(SoundType.METAL));
        setRegistryName(BasicNetherOres.modid, name);

        ItemList.items.add(new BlockItem(this, new Item.Properties().tab(BasicNetherOres.bnoItemGroup)).setRegistryName(RegisteryHandler.RegistryEvents.location(name)));
        BlockList.blocks.add(this);
    }
}
