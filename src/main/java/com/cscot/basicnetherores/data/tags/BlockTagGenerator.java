package com.cscot.basicnetherores.data.tags;

import com.cscot.basicnetherores.BasicNetherOres;
import com.cscot.basicnetherores.world.level.block.*;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.Tag;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.Comparator;
import java.util.function.Predicate;

import static net.minecraftforge.common.Tags.Blocks.*;


public class BlockTagGenerator extends BlockTagsProvider
{
    protected final Predicate<Block> ORE_BLOCKS = registry -> BasicNetherOres.modid.equals(registry.getRegistryName().getNamespace());

    public static final Tags.IOptionalNamedTag<Block> ORES_ALUMINUM = tagForge("ores/aluminum");
    public static final Tags.IOptionalNamedTag<Block> ORES_SILVER = tagForge("ores/silver");
    public static final Tags.IOptionalNamedTag<Block> ORES_LEAD = tagForge("ores/lead");
    public static final Tags.IOptionalNamedTag<Block> ORES_NICKEL = tagForge("ores/nickel");
    public static final Tags.IOptionalNamedTag<Block> ORES_COPPER = tagForge("ores/copper");
    public static final Tags.IOptionalNamedTag<Block> ORES_TIN = tagForge("ores/tin");
    public static final Tags.IOptionalNamedTag<Block> ORES_OSMIUM = tagForge("ores/osmium");
    public static final Tags.IOptionalNamedTag<Block> ORES_URANIUM = tagForge("ores/uranium");
    public static final Tags.IOptionalNamedTag<Block> ORES_ZINC = tagForge("ores/zinc");

    public static final Tags.IOptionalNamedTag<Block> ALUMINUM_BLOCK = tagForge("storage_blocks/aluminum");
    public static final Tags.IOptionalNamedTag<Block> SILVER_BLOCK = tagForge("storage_blocks/silver");
    public static final Tags.IOptionalNamedTag<Block> LEAD_BLOCK = tagForge("storage_blocks/lead");
    public static final Tags.IOptionalNamedTag<Block> NICKEL_BLOCK = tagForge("storage_blocks/nickel");
    public static final Tags.IOptionalNamedTag<Block> COPPER_BLOCK = tagForge("storage_blocks/copper");
    public static final Tags.IOptionalNamedTag<Block> TIN_BLOCK = tagForge("storage_blocks/tin");
    public static final Tags.IOptionalNamedTag<Block> OSMIUM_BLOCK = tagForge("storage_blocks/osmium");
    public static final Tags.IOptionalNamedTag<Block> URANIUM_BLOCK = tagForge("storage_blocks/uranium");
    public static final Tags.IOptionalNamedTag<Block> ZINC_BLOCK = tagForge("storage_blocks/zinc");

    public BlockTagGenerator(DataGenerator generator, ExistingFileHelper exFileHelper) {
        super(generator, BasicNetherOres.modid, exFileHelper);
    }

    @Override
    protected void addTags()
    {
        // ***************************************************************************** //
        //  Forge Tags
        // ***************************************************************************** //
        tag(ORES).add(registry.stream().filter(ORE_BLOCKS).filter(b -> b instanceof ModOreBlock).sorted(Comparator.comparing(Block::getRegistryName)).toArray(Block[]::new));
        tag(STORAGE_BLOCKS).add(registry.stream().filter(ORE_BLOCKS).filter(b -> b instanceof ModMetalBlock).sorted(Comparator.comparing(Block::getRegistryName)).toArray(Block[]::new));

        tag(ORES_COAL).add(ModBlocks.NETHER_COAL_ORE.get());
        tag(ORES_DIAMOND).add(ModBlocks.NETHER_DIAMOND_ORE.get());
        tag(ORES_EMERALD).add(ModBlocks.NETHER_EMERALD_ORE.get());
        tag(ORES_IRON).add(ModBlocks.NETHER_IRON_ORE.get());
        tag(ORES_LAPIS).add(ModBlocks.NETHER_LAPIS_ORE.get());
        tag(ORES_REDSTONE).add(ModBlocks.NETHER_REDSTONE_ORE.get());

        tag(ORES_ALUMINUM).add(ModBlocks.NETHER_ALUMINUM_ORE.get());
        tag(ORES_SILVER).add(ModBlocks.NETHER_SILVER_ORE.get());
        tag(ORES_LEAD).add(ModBlocks.NETHER_LEAD_ORE.get());
        tag(ORES_NICKEL).add(ModBlocks.NETHER_NICKEL_ORE.get());
        tag(ORES_COPPER).add(ModBlocks.NETHER_COPPER_ORE.get());
        tag(ORES_TIN).add(ModBlocks.NETHER_TIN_ORE.get());
        tag(ORES_OSMIUM).add(ModBlocks.NETHER_OSMIUM_ORE.get());
        tag(ORES_URANIUM).add(ModBlocks.NETHER_URANIUM_ORE.get());
        tag(ORES_ZINC).add(ModBlocks.NETHER_ZINC_ORE.get());

        tag(ALUMINUM_BLOCK).add(ModBlocks.ALUMINUM_BLOCK.get());
        tag(SILVER_BLOCK).add(ModBlocks.SILVER_BLOCK.get());
        tag(LEAD_BLOCK).add(ModBlocks.LEAD_BLOCK.get());
        tag(NICKEL_BLOCK).add(ModBlocks.NICKEL_BLOCK.get());
        tag(COPPER_BLOCK).add(Blocks.COPPER_BLOCK);
        tag(TIN_BLOCK).add(ModBlocks.TIN_BLOCK.get());
        tag(OSMIUM_BLOCK).add(ModBlocks.OSMIUM_BLOCK.get());
        tag(URANIUM_BLOCK).add(ModBlocks.URANIUM_BLOCK.get());
        tag(ZINC_BLOCK).add(ModBlocks.ZINC_BLOCK.get());

        // ***************************************************************************** //
        //  Vanilla Tags
        // ***************************************************************************** //

        this.tag(BlockTags.IRON_ORES).add(ModBlocks.NETHER_IRON_ORE.get());
        this.tag(BlockTags.DIAMOND_ORES).add(ModBlocks.NETHER_DIAMOND_ORE.get());
        this.tag(BlockTags.REDSTONE_ORES).add(ModBlocks.NETHER_REDSTONE_ORE.get());
        this.tag(BlockTags.COAL_ORES).add(ModBlocks.NETHER_COAL_ORE.get());
        this.tag(BlockTags.EMERALD_ORES).add(ModBlocks.NETHER_EMERALD_ORE.get());
        this.tag(BlockTags.COPPER_ORES).add(ModBlocks.NETHER_COPPER_ORE.get());
        this.tag(BlockTags.LAPIS_ORES).add(ModBlocks.NETHER_LAPIS_ORE.get());

        ///// MINEABLE WITH PICKAXE ///////
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(registry.stream().filter(ORE_BLOCKS).filter(b -> b instanceof ModOreBlock).sorted(Comparator.comparing(Block::getRegistryName)).toArray(Block[]::new));
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(registry.stream().filter(ORE_BLOCKS).filter(b -> b instanceof ModMetalBlock).sorted(Comparator.comparing(Block::getRegistryName)).toArray(Block[]::new));
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(registry.stream().filter(ORE_BLOCKS).filter(b -> b instanceof ModRawOreBlock).sorted(Comparator.comparing(Block::getRegistryName)).toArray(Block[]::new));
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(registry.stream().filter(ORE_BLOCKS).filter(b -> b instanceof ModRedstoneOreBlock).sorted(Comparator.comparing(Block::getRegistryName)).toArray(Block[]::new));

        this.tag(BlockTags.NEEDS_IRON_TOOL).add(
                ModBlocks.NETHER_DIAMOND_ORE.get(),
                ModBlocks.NETHER_EMERALD_ORE.get(),
                ModBlocks.NETHER_REDSTONE_ORE.get(),
                ModBlocks.NETHER_SILVER_ORE.get(),
                ModBlocks.RAW_SILVER_BLOCK.get(),
                ModBlocks.SILVER_BLOCK.get(),
                ModBlocks.NETHER_LEAD_ORE.get(),
                ModBlocks.RAW_LEAD_BLOCK.get(),
                ModBlocks.LEAD_BLOCK.get(),
                ModBlocks.NETHER_NICKEL_ORE.get(),
                ModBlocks.RAW_NICKEL_BLOCK.get(),
                ModBlocks.NICKEL_BLOCK.get(),
                ModBlocks.NETHER_URANIUM_ORE.get(),
                ModBlocks.RAW_URANIUM_BLOCK.get(),
                ModBlocks.URANIUM_BLOCK.get(),
                ModBlocks.RAW_ZINC_BLOCK.get(),
                ModBlocks.ZINC_BLOCK.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL).add(
                ModBlocks.NETHER_IRON_ORE.get(),
                ModBlocks.NETHER_LAPIS_ORE.get(),
                ModBlocks.NETHER_COPPER_ORE.get(),
                ModBlocks.NETHER_ALUMINUM_ORE.get(),
                ModBlocks.RAW_ALUMINUM_BLOCK.get(),
                ModBlocks.ALUMINUM_BLOCK.get(),
                ModBlocks.NETHER_TIN_ORE.get(),
                ModBlocks.RAW_TIN_BLOCK.get(),
                ModBlocks.TIN_BLOCK.get(),
                ModBlocks.NETHER_OSMIUM_ORE.get(),
                ModBlocks.RAW_OSMIUM_BLOCK.get(),
                ModBlocks.OSMIUM_BLOCK.get());
    }

    private static Tags.IOptionalNamedTag<Block> tagForge(String name)
    {
        return BlockTags.createOptional(new ResourceLocation("forge", name));
    }
}
