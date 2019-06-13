package com.cscot.basicnetherores.util.events;

import com.cscot.basicnetherores.config.OreProtectionConfig;
import com.cscot.basicnetherores.objects.BlockOreBase;
import com.cscot.basicnetherores.util.helpers.BlockListHelper;
import net.minecraft.block.Block;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class BlockOreEvent
{

    //When a Nether Ore is harvested it is checked against the following conditions
    @SubscribeEvent (priority = EventPriority.HIGH, receiveCanceled = true)
    public static void onBlockHarvested(BlockEvent.HarvestDropsEvent event) {

        //Check to see if tool has Silk Touch
        if(!event.isSilkTouching() && OreProtectionConfig.silkEffect.get()) {

            //Checks if the Config file is set to true
            if (OreProtectionConfig.pigmanGuard.get()) {

                Block block = event.getState().getBlock();

                //Compares the broken Block to a list generated in the Config File
                if(BlockListHelper.protectedOres(block))
                {
                    BlockOreBase.pigmenGuards(event.getWorld().getWorld(), event.getPos(), event.getHarvester());
                }
            }
        }
    }
}
