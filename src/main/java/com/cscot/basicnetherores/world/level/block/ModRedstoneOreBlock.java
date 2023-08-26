package com.cscot.basicnetherores.world.level.block;

import com.cscot.basicnetherores.api.event.PiglinEvent;
import com.cscot.basicnetherores.client.renderer.IHelpRender;
import com.cscot.basicnetherores.config.OreProtectionConfig;
import com.cscot.basicnetherores.util.helpers.OreTooltipHelper;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.monster.ZombifiedPiglin;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.entity.monster.piglin.PiglinAi;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.RedStoneOreBlock;
import net.minecraft.world.level.block.RedstoneTorchBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.AABB;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

import static com.cscot.basicnetherores.util.helpers.OreTooltipHelper.*;

public class ModRedstoneOreBlock extends RedStoneOreBlock implements IHelpRender
{
    public static final BooleanProperty LIT = RedstoneTorchBlock.LIT;

    public ModRedstoneOreBlock(Properties properties) {
        super(properties.noOcclusion());
        this.registerDefaultState(this.defaultBlockState().setValue(LIT, Boolean.valueOf(false)));
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter worldIn, List<Component> tooltip, TooltipFlag flagIn) {
        if (this == ModBlocks.NETHER_REDSTONE_ORE.get()) {
                tooltip.add(Component.translatable(OreTooltipHelper.redstoneOreTip, redstoneMinHeight, redstoneMaxHeight));
        }
    }

    public static void piglinGuards(Level worldIn, BlockPos pos, Player thief) {

        int x = pos.getX(), y = pos.getY(), z = pos.getZ();
        int rngProt;

        rngProt = OreProtectionConfig.protectionRange.get();

        List<Piglin> list = worldIn.getEntitiesOfClass(Piglin.class, new AABB(x - rngProt, y - rngProt, z - rngProt, x + rngProt, y + rngProt, z + rngProt));

        PiglinEvent event = new PiglinEvent(worldIn, pos, thief, list);
        if (net.minecraftforge.common.MinecraftForge.EVENT_BUS.post(event)) return;

        /**
         * Aggro the Piglins (Pulls function from PiglinsTasks/ Line 403.)
         */
        for(Piglin guard : list) {

            PiglinAi.angerNearbyPiglins(thief, true);
        }

        List<ZombifiedPiglin> zombifiedPiglinList = worldIn.getEntitiesOfClass(ZombifiedPiglin.class, new AABB(x - rngProt, y - rngProt, z - rngProt, x + rngProt, y + rngProt, z + rngProt));

        /**
         * Aggro the Zombified Piglins (Pulls function from ZombifiedPiglin/ Line 152.)
         */
        for(ZombifiedPiglin guard : zombifiedPiglinList) {

            guard.setTarget(event.getThief());
        }
    }

    @Override
    public int getExpDrop(BlockState state, net.minecraft.world.level.LevelReader level, net.minecraft.util.RandomSource randomSource, BlockPos pos, int fortuneLevel, int silktouch) {
        return silktouch == 0 ? 1 + randomSource.nextInt(5) : 0;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public RenderType getRenderType() {
        return RenderType.cutout();
    }
}
