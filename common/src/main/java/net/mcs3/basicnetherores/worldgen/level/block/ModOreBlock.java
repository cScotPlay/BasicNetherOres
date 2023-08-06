package net.mcs3.basicnetherores.worldgen.level.block;

import net.mcs3.basicnetherores.init.BNOBlocks;
import net.mcs3.basicnetherores.util.helper.GuardOreBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.stats.Stats;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nullable;
import java.util.List;

import static net.mcs3.basicnetherores.util.helper.OreTextHelper.*;

public class ModOreBlock extends DropExperienceBlock {

    private final IntProvider xpRange;

    public ModOreBlock(Properties properties, IntProvider experienceDropped) {
        super(properties.noOcclusion());
        this.xpRange = experienceDropped;
    }

    public ModOreBlock(Properties properties) {
        this(properties, UniformInt.of(0, 0));
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter worldIn, List<Component> tooltip, TooltipFlag flagIn) {
        if (this == BNOBlocks.NETHER_EMERALD_ORE) {
            tooltip.add(Component.translatable(emeraldOreTip, emeraldMinHeight.toString(), emeraldMaxHeight.toString()));
        } else if (this == BNOBlocks.NETHER_DIAMOND_ORE) {
            tooltip.add(Component.translatable(diamondOreTip, diamondMinHeight.toString(), diamondMaxHeight.toString()));
        } else if (this == BNOBlocks.NETHER_LAPIS_ORE) {
            tooltip.add(Component.translatable(lapisOreTip, lapisMinHeight.toString(), lapisMaxHeight.toString()));
        } else if (this == BNOBlocks.NETHER_COAL_ORE) {
            tooltip.add(Component.translatable(coalOreTip, coalMinHeight.toString(), coalMaxHeight.toString()));
        } else if (this == BNOBlocks.NETHER_SILVER_ORE) {
            tooltip.add(Component.translatable(silverOreTip, silverMinHeight.toString(), silverMaxHeight.toString()));
        } else if (this == BNOBlocks.NETHER_IRON_ORE) {
            tooltip.add(Component.translatable(ironOreTip, ironMinHeight.toString(), ironMaxHeight.toString()));
        } else if (this == BNOBlocks.NETHER_LEAD_ORE) {
            tooltip.add(Component.translatable(leadOreTip, leadMinHeight.toString(), leadMaxHeight.toString()));
        } else if (this == BNOBlocks.NETHER_NICKEL_ORE) {
            tooltip.add(Component.translatable(nickelOreTip, nickelMinHeight.toString(), nickelMaxHeight.toString()));
        } else if (this == BNOBlocks.NETHER_COPPER_ORE) {
            tooltip.add(Component.translatable(copperOreTip, copperMinHeight.toString(), copperMaxHeight.toString()));
        } else if (this == BNOBlocks.NETHER_ALUMINUM_ORE) {
            tooltip.add(Component.translatable(aluminumOreTip, aluminumMinHeight.toString(), aluminumMaxHeight.toString()));
        } else if (this == BNOBlocks.NETHER_TIN_ORE) {
            tooltip.add(Component.translatable(tinOreTip, tinMinHeight.toString(), tinMaxHeight.toString()));
        } else if (this == BNOBlocks.NETHER_OSMIUM_ORE) {
            tooltip.add(Component.translatable(osmiumOreTip, osmiumMinHeight.toString(), osmiumMaxHeight.toString()));
        } else if (this == BNOBlocks.NETHER_URANIUM_ORE) {
            tooltip.add(Component.translatable(uraniumOreTip, uraniumMinHeight.toString(), uraniumMaxHeight.toString()));
        } else if (this == BNOBlocks.NETHER_ZINC_ORE) {
            tooltip.add(Component.translatable(zincOreTip, zincMinHeight.toString(), zincMaxHeight.toString()));
        }
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
//        player.awardStat(Stats.BLOCK_MINED.get(this));
//        player.causeFoodExhaustion(0.005F);
//        dropResources(blockState, level, blockPos, blockEntity, player, itemStack);
        super.playerDestroy(level, player, blockPos, blockState, blockEntity, itemStack);
    }
}
