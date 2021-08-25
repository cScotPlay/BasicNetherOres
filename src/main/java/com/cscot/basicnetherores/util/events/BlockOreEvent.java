package com.cscot.basicnetherores.util.events;

import com.cscot.basicnetherores.BasicNetherOres;
import com.cscot.basicnetherores.config.OreProtectionConfig;
import com.cscot.basicnetherores.world.level.block.ModOreBlock;
import com.cscot.basicnetherores.util.helpers.BlockListHelper;
import com.cscot.basicnetherores.world.level.block.ModRedstoneOreBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.world.BlockEvent.*;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BasicNetherOres.modid)
public class BlockOreEvent
{

    /** Reference to the Player who broke the block. If no player is available, use a EntityFakePlayer */

    @SubscribeEvent (priority = EventPriority.HIGH, receiveCanceled = false)
    public static void BreakEvent(BreakEvent event)
    {
        Player player = event.getPlayer();
        int isSilkTouching = EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SILK_TOUCH, player.getMainHandItem());
        Level world = player.level;;
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

    private static void guardOres(Block block, Level world, BlockPos pos, Player player)
    {
        if(BlockListHelper.protectedOres(block))
        {
            ModOreBlock.piglinGuards(world, pos, player);
            ModRedstoneOreBlock.piglinGuards(world, pos, player);
        }
    }
}
