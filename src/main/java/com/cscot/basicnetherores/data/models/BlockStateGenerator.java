package com.cscot.basicnetherores.data.models;

import com.cscot.basicnetherores.BasicNetherOres;
import com.cscot.basicnetherores.api.BlockLists;
import com.cscot.basicnetherores.blocks.ModMetalBlocks;
import com.cscot.basicnetherores.blocks.ModOreBlock;
import com.google.common.collect.ImmutableMap;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockStateDefinitionProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.model.*;
import net.minecraft.util.Identifier;

import java.util.Optional;
import java.util.function.Consumer;

public class BlockStateGenerator extends FabricBlockStateDefinitionProvider
{
    String MODID = BasicNetherOres.MOD_ID;

    public BlockStateGenerator(FabricDataGenerator generator) {
        super(generator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator)
    {
        for (Identifier id : BlockLists.BLOCKS.keySet())
        {
            Block block = BlockLists.BLOCKS.get(id);

            if (block instanceof ModMetalBlocks)
            {
                blockStateModelGenerator.registerSimpleCubeAll(block);
            }

            if (block instanceof ModOreBlock)
            {
                oreBblock(block.getTranslationKey());
            }



        }

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }

    public void simpleOreBlock(Block block)
    {
//        var baseName = block.getName().toString();
//
//        Identifier parentName = new Identifier(MODID, "block/cube_overlay_all");
//        String oreName = block.getRegistryName().getPath();
//
//        ImmutableMap.builder().put(block,Texture.getSubId(block.getName().toString(), "top")).build();
//
//
//        simpleBlock(block, models().withExistingParent(block.getRegistryName().getPath(), parentName).texture("all", mcLoc("block/netherrack")).texture("overlay", modLoc("block/" + oreName)));
//
//        ImmutableMap.builder().put(Blocks.SANDSTONE, TexturedModel.SIDE_TOP_BOTTOM_WALL.get(Blocks.SANDSTONE)).put(Blocks.RED_SANDSTONE, TexturedModel.SIDE_TOP_BOTTOM_WALL.get(Blocks.RED_SANDSTONE)).put(Blocks.SMOOTH_SANDSTONE, TexturedModel.getCubeAll(Texture.getSubId(Blocks.SANDSTONE, "_top"))).put(Blocks.SMOOTH_RED_SANDSTONE, TexturedModel.getCubeAll(Texture.getSubId(Blocks.RED_SANDSTONE, "_top"))).put(Blocks.CUT_SANDSTONE, TexturedModel.CUBE_COLUMN.get(Blocks.SANDSTONE).texture((texture) -> {
//            texture.put(TextureKey.SIDE, Texture.getId(Blocks.CUT_SANDSTONE));
//        })).put(Blocks.CUT_RED_SANDSTONE, TexturedModel.CUBE_COLUMN.get(Blocks.RED_SANDSTONE).texture((texture) -> {
//            texture.put(TextureKey.SIDE, Texture.getId(Blocks.CUT_RED_SANDSTONE));
//        })).put(Blocks.QUARTZ_BLOCK, TexturedModel.CUBE_COLUMN.get(Blocks.QUARTZ_BLOCK)).put(Blocks.SMOOTH_QUARTZ, TexturedModel.getCubeAll(Texture.getSubId(Blocks.QUARTZ_BLOCK, "_bottom"))).put(Blocks.BLACKSTONE, TexturedModel.SIDE_END_WALL.get(Blocks.BLACKSTONE)).put(Blocks.DEEPSLATE, TexturedModel.SIDE_END_WALL.get(Blocks.DEEPSLATE)).put(Blocks.CHISELED_QUARTZ_BLOCK, TexturedModel.CUBE_COLUMN.get(Blocks.CHISELED_QUARTZ_BLOCK).texture((texture) -> {
//            texture.put(TextureKey.SIDE, Texture.getId(Blocks.CHISELED_QUARTZ_BLOCK));
//        })).put(Blocks.CHISELED_SANDSTONE, TexturedModel.CUBE_COLUMN.get(Blocks.CHISELED_SANDSTONE).texture((texture) -> {
//            texture.put(TextureKey.END, Texture.getSubId(Blocks.SANDSTONE, "_top"));
//            texture.put(TextureKey.SIDE, Texture.getId(Blocks.CHISELED_SANDSTONE));
//        })).put(Blocks.CHISELED_RED_SANDSTONE, TexturedModel.CUBE_COLUMN.get(Blocks.CHISELED_RED_SANDSTONE).texture((texture) -> {
//            texture.put(TextureKey.END, Texture.getSubId(Blocks.RED_SANDSTONE, "_top"));
//            texture.put(TextureKey.SIDE, Texture.getId(Blocks.CHISELED_RED_SANDSTONE));
//        })).build();
    }

    private static Model oreBblock(String parent, TextureKey... requiredTextures) {
        return new Model(Optional.of(new Identifier(BasicNetherOres.MOD_ID, "block/" + parent)), Optional.empty(), requiredTextures);
    }

    public Identifier modLoc(String name)
    {
        return new Identifier(MODID, name);
    }

}
