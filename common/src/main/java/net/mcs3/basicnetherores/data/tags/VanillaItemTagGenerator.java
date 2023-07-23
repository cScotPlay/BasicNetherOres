package net.mcs3.basicnetherores.data.tags;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;


import java.util.concurrent.CompletableFuture;

public class VanillaItemTagGenerator extends ItemTagsProvider {

    public VanillaItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagsProvider.TagLookup<Block>> blockTagProvider) {
        super(packOutput, lookupProvider, blockTagProvider);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        copy(BlockTags.COAL_ORES, ItemTags.COAL_ORES);
        copy(BlockTags.EMERALD_ORES, ItemTags.EMERALD_ORES);
//        copy(Tags.Blocks.ORES_DIAMOND, Tags.Items.ORES_DIAMOND);
//        copy(Tags.Blocks.ORES_EMERALD, Tags.Items.ORES_EMERALD);
//        copy(Tags.Blocks.ORES_IRON, Tags.Items.ORES_IRON);
//        copy(Tags.Blocks.ORES_LAPIS, Tags.Items.ORES_LAPIS);
//        copy(Tags.Blocks.ORES_REDSTONE, Tags.Items.ORES_REDSTONE);
//        ItemTags

    }
}
