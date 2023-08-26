package com.cscot.basicnetherores.world.level.block;

import com.cscot.basicnetherores.client.renderer.IHelpRender;
import com.cscot.basicnetherores.config.OreProtectionConfig;
import com.cscot.basicnetherores.api.event.PiglinEvent;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.entity.monster.ZombifiedPiglin;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.entity.monster.piglin.PiglinAi;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.phys.AABB;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;
import static com.cscot.basicnetherores.util.helpers.OreTooltipHelper.*;


public class ModOreBlock extends DropExperienceBlock implements IHelpRender
{
    private final UniformInt xpRange;

    public ModOreBlock(Properties properties, UniformInt experienceDropped)
    {
        super(properties.noOcclusion());
        this.xpRange = experienceDropped;
    }

    public ModOreBlock(Properties properties)
    {
        this(properties, UniformInt.of(0, 0));
    }

    @Override
    public int getExpDrop(BlockState state, net.minecraft.world.level.LevelReader level, net.minecraft.util.RandomSource randomSource, BlockPos pos, int fortuneLevel, int silktouch) {
        return silktouch == 0 ? this.xpRange.sample(randomSource) : 0;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter worldIn, List<Component> tooltip, TooltipFlag flagIn)
    {
        if(this == ModBlocks.NETHER_EMERALD_ORE.get()){
            tooltip.add(Component.translatable(emeraldOreTip, emeraldMinHeight, emeraldMaxHeight));}
        else if (this == ModBlocks.NETHER_DIAMOND_ORE.get()){
            tooltip.add(Component.translatable(diamondOreTip, diamondMinHeight, diamondMaxHeight));}
        else if (this == ModBlocks.NETHER_LAPIS_ORE.get()){
            tooltip.add(Component.translatable(lapisOreTip, lapisMinHeight, lapisMaxHeight));}
        else if (this == ModBlocks.NETHER_COAL_ORE.get()){
            tooltip.add(Component.translatable(coalOreTip, coalMinHeight, coalMaxHeight));}
        else if (this == ModBlocks.NETHER_SILVER_ORE.get()){
            tooltip.add(Component.translatable(silverOreTip, silverMinHeight, silverMaxHeight));}
        else if (this == ModBlocks.NETHER_IRON_ORE.get()){
            tooltip.add(Component.translatable(ironOreTip, ironMinHeight, ironMaxHeight));}
        else if (this == ModBlocks.NETHER_LEAD_ORE.get()){
            tooltip.add(Component.translatable(leadOreTip, leadMinHeight, leadMaxHeight));}
        else if (this == ModBlocks.NETHER_NICKEL_ORE.get()){
            tooltip.add(Component.translatable(nickelOreTip, nickelMinHeight, nickelMaxHeight));}
        else if (this == ModBlocks.NETHER_COPPER_ORE.get()){
            tooltip.add(Component.translatable(copperOreTip, copperMinHeight, copperMaxHeight));}
        else if (this == ModBlocks.NETHER_ALUMINUM_ORE.get()){
            tooltip.add(Component.translatable(aluminumOreTip, aluminumMinHeight, aluminumMaxHeight));}
        else if (this == ModBlocks.NETHER_TIN_ORE.get()){
            tooltip.add(Component.translatable(tinOreTip, tinMinHeight, tinMaxHeight));}
        else if (this == ModBlocks.NETHER_OSMIUM_ORE.get()){
            tooltip.add(Component.translatable(osmiumOreTip, osmiumMinHeight, osmiumMaxHeight));}
        else if (this == ModBlocks.NETHER_URANIUM_ORE.get()){
            tooltip.add(Component.translatable(uraniumOreTip, uraniumMinHeight, uraniumMaxHeight));}
        else if (this == ModBlocks.NETHER_ZINC_ORE.get()){
            tooltip.add(Component.translatable(zincOreTip, zincMinHeight, zincMaxHeight));}
    }

    /**
     * Spawn additional block drops such as experience or other entities
     */
    @Override
    public void spawnAfterBreak(BlockState state, ServerLevel worldIn, BlockPos blockPos, ItemStack itemStack, boolean dropXP) {
        super.spawnAfterBreak(state, worldIn, blockPos, itemStack, dropXP);
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
    @OnlyIn(Dist.CLIENT)
    public RenderType getRenderType() {
        return RenderType.cutout();
    }
}
