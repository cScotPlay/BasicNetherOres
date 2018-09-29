package cscot.basicnetherores.util.helper;

import com.google.common.base.Predicate;
import cscot.basicnetherores.util.handler.ConfigHandler;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class BlockListHelper implements Predicate<IBlockState> {

    public static Predicate<IBlockState> PREDICATE_BLOCKS = BlockListHelper.forBlock(BlockListHelper.getBlockList(ConfigHandler.protectedBlocks));

    private final Block[] block;

    private BlockListHelper(Block... blocks)
    {
        this.block = blocks;
    }

    public static BlockListHelper forBlock(Block... blocks)
    {
        return new BlockListHelper(blocks);
    }

    public static BlockListHelper forBlock(List<Block> list)
    {
        return new BlockListHelper(list.toArray(new Block[]{}));
    }

    @Override
    public boolean apply(@Nullable IBlockState state) {

        for (Block block : this.block)
            if (state != null && state.getBlock() == block)
                return true;

        return false;
    }

    public static List<Block> getBlockList(String[] array) {

        List<Block> list = new ArrayList<>();
        for (String name : array) {
            if (name != null && !name.isEmpty()) {
                Block block = Block.getBlockFromName(name);
                if (block != null) {
                    list.add(block);
                    //System.out.println(" Test " );
                }
            }
        }

        return list;
    }

}
