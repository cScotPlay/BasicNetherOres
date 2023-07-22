package net.mcs3.basicnetherores.worldgen.level.block;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.RedStoneOreBlock;
import net.minecraft.world.level.block.RedstoneTorchBlock;
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

//    public static void piglinGuards(Level worldIn, BlockPos pos, Player thief) {
//
//        int x = pos.getX(), y = pos.getY(), z = pos.getZ();
//        int rngProt;
//
//        rngProt = OreProtectionConfig.protectionRange.get();
//
//        List<Piglin> list = worldIn.getEntitiesOfClass(Piglin.class, new AABB(x - rngProt, y - rngProt, z - rngProt, x + rngProt, y + rngProt, z + rngProt));
//
//        PiglinEvent event = new PiglinEvent(worldIn, pos, thief, list);
//        if (net.minecraftforge.common.MinecraftForge.EVENT_BUS.post(event)) return;
//
//        /**
//         * Aggro the Piglins (Pulls function from PiglinsTasks/ Line 403.)
//         */
//        for(Piglin guard : list) {
//
//            PiglinAi.angerNearbyPiglins(thief, true);
//        }
//
//        List<ZombifiedPiglin> zombifiedPiglinList = worldIn.getEntitiesOfClass(ZombifiedPiglin.class, new AABB(x - rngProt, y - rngProt, z - rngProt, x + rngProt, y + rngProt, z + rngProt));
//
//        /**
//         * Aggro the Zombified Piglins (Pulls function from ZombifiedPiglin/ Line 152.)
//         */
//        for(ZombifiedPiglin guard : zombifiedPiglinList) {
//
//            guard.setTarget(event.getThief());
//        }
//    }
}
