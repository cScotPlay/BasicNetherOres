package com.cscot.basicnetherores.util.events;

import com.cscot.basicnetherores.config.OreProtectionConfig;
import com.cscot.basicnetherores.objects.BlockOreBase;
import com.cscot.basicnetherores.util.helpers.BlockListHelper;
import net.minecraft.block.Block;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class BlockOreEvent
{

    /** Reference to the Player who broke the block. If no player is available, use a EntityFakePlayer */

    @SubscribeEvent (priority = EventPriority.HIGH, receiveCanceled = true)
    public static void BreakEvent(BlockEvent.BreakEvent event)
    {
        PlayerEntity player = event.getPlayer();
        int isSilkTouching = EnchantmentHelper.getEnchantmentLevel(Enchantments.SILK_TOUCH, player.getHeldItemMainhand());
        World world = player.world;;
        BlockPos pos = event.getPos();
        Block block = event.getState().getBlock();

        if(OreProtectionConfig.piglinGuard.get()) {

            //Checks if the Config file is set to true
            if (OreProtectionConfig.silkEffect.get()) {

                if(isSilkTouching < 1){

                    guardOres(block, world, pos, player);
                }
            }else guardOres(block, world, pos, player);
        }
    }

    private static void guardOres(Block block, World world, BlockPos pos, PlayerEntity player)
    {
        if(BlockListHelper.protectedOres(block))
        {
            BlockOreBase.piglinGuards(world, pos, player);
        }
    }
}
