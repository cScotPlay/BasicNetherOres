package com.cscot.basicnetherores.world.level.block;

import com.cscot.basicnetherores.BasicNetherOres;
import com.cscot.basicnetherores.api.BlockOreList;
import com.cscot.basicnetherores.api.ItemList;
import com.cscot.basicnetherores.api.event.PiglinEvent;
import com.cscot.basicnetherores.config.OreGenerationConfig;
import com.cscot.basicnetherores.config.OreProtectionConfig;
import com.cscot.basicnetherores.util.handler.RegisteryHandler;
import com.cscot.basicnetherores.util.helpers.OreTooltipHelper;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.entity.monster.piglin.PiglinAi;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.RedStoneOreBlock;
import net.minecraft.world.level.block.RedstoneTorchBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.AABB;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class ModRedstoneOreBlock extends RedStoneOreBlock
{
    public static final BooleanProperty LIT = RedstoneTorchBlock.LIT;

    public ModRedstoneOreBlock(String oreName) {
        super(BlockBehaviour.Properties.of(Material.STONE)
                .requiresCorrectToolForDrops()
                .strength(3.0f, 3.0f)
                .sound(SoundType.NETHER_GOLD_ORE));
        setRegistryName(BasicNetherOres.modid, oreName);
        this.registerDefaultState(this.defaultBlockState().setValue(LIT, Boolean.valueOf(false)));

        ItemList.items.add(new BlockItem(this, new Item.Properties().tab(BasicNetherOres.bnoItemGroup)).setRegistryName(RegisteryHandler.RegistryEvents.location(oreName)));
        BlockOreList.blockores.add(this);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter worldIn, List<Component> tooltip, TooltipFlag flagIn) {
        if (this == BlockOreList.netherredstone_ore) {
            if (!OreGenerationConfig.redstoneGeneration.get()) {
                tooltip.add(new TranslatableComponent("tooltip.config.tip"));
            } else
                tooltip.add(new TranslatableComponent(OreTooltipHelper.RedstoneOreTip.oreTip, OreGenerationConfig.redstoneMinHeight.get().toString(), OreGenerationConfig.redstoneMaxHeight.get().toString()));
        }
    }

    public static void piglinGuards(Level worldIn, BlockPos pos, Player thief) {

        int x = pos.getX(), y = pos.getY(), z = pos.getZ();
        int rngProt;

        rngProt = OreProtectionConfig.protectionRange.get();

        List<Piglin> list = worldIn.getEntitiesOfClass(Piglin.class, new AABB(x - rngProt, y - rngProt, z - rngProt, x + rngProt, y + rngProt, z + rngProt));

        PiglinEvent event = new PiglinEvent(worldIn, pos, thief, list);
        if (net.minecraftforge.common.MinecraftForge.EVENT_BUS.post(event)) return;

        for(Piglin guard : list) {

            //guard.setRevengeTarget(event.getThief()); //TODO This Needs to be updated to target the player when breaking the ores Look at Line 403 PiglinTasks
            PiglinAi.angerNearbyPiglins(thief, true); //TODO This seems to aggro the Piglins (Pulls function from PiglinsTasks/ Line 403.)
        }
    }

    @Override
    public int getExpDrop(BlockState state, net.minecraft.world.level.LevelReader world, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? 1 + RANDOM.nextInt(5) : 0;
    }
}
