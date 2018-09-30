package cscot.basicnetherores.event;



import cscot.basicnetherores.objects.blocks.BlockOreBase;
import cscot.basicnetherores.util.handler.ConfigHandler;
import cscot.basicnetherores.util.helper.BlockListHelper;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@Mod.EventBusSubscriber
public final class BlockOreEvents {


    @SubscribeEvent(priority=EventPriority.HIGHEST, receiveCanceled=false)
    public static void onBlockHarvest(BlockEvent.HarvestDropsEvent event) {

        if(!event.isSilkTouching()) {

            if (ConfigHandler.pigmanGuard) {

                IBlockState block = event.getState();
                World world = event.getWorld();
                BlockPos blockPos = event.getPos();

                if(block.getBlock().isReplaceableOreGen(block, world, blockPos, BlockListHelper.PREDICATE_BLOCKS)) {

                    BlockOreBase.pigmenGuards(event.getHarvester(), event.getWorld(), event.getPos());

                }
            }
        }
    }
}
