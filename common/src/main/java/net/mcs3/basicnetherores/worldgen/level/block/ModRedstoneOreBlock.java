package net.mcs3.basicnetherores.worldgen.level.block;

import net.mcs3.basicnetherores.util.helper.GuardOreBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.stats.Stats;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.RedStoneOreBlock;
import net.minecraft.world.level.block.RedstoneTorchBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BooleanProperty;

import javax.annotation.Nullable;
import java.util.List;

import static net.mcs3.basicnetherores.util.helper.OreTextHelper.*;

public class ModRedstoneOreBlock extends RedStoneOreBlock {

    public static final BooleanProperty LIT = RedstoneTorchBlock.LIT;

    public ModRedstoneOreBlock(Properties properties) {
        super(properties.noOcclusion());
        this.registerDefaultState(this.defaultBlockState().setValue(LIT, Boolean.valueOf(false)));
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter worldIn, List<Component> tooltip, TooltipFlag flagIn) {
        tooltip.add(Component.translatable(redstoneOreTip, redstoneMinHeight.toString(), redstoneMaxHeight.toString()));
    }

    /**
     * Spawn additional block drops such as experience or other entities
     */
    @Override
    public void spawnAfterBreak(BlockState state, ServerLevel worldIn, BlockPos blockPos, ItemStack itemStack, boolean dropXP) {
        super.spawnAfterBreak(state, worldIn, blockPos, itemStack, dropXP);
    }

    @Override
    public void playerDestroy(Level level, Player player, BlockPos blockPos, BlockState blockState, @Nullable BlockEntity blockEntity, ItemStack itemStack) {
        level.levelEvent(player, 2001, blockPos, getId(blockState));
        GuardOreBlocks.guardOres(player, level, blockPos, blockState.getBlock());
        super.playerDestroy(level, player, blockPos, blockState, blockEntity, itemStack);
    }
}
