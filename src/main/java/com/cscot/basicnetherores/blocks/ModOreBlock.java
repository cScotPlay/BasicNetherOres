package com.cscot.basicnetherores.blocks;

import com.cscot.basicnetherores.BasicNetherOres;
import com.cscot.basicnetherores.api.ItemLists;
import com.cscot.basicnetherores.api.OreBlockLists;
import com.cscot.basicnetherores.config.ModConfig;
import com.cscot.basicnetherores.util.helpers.OreTooltipHelper.*;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.mob.PiglinBrain;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.tag.BlockTags;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public class ModOreBlock extends OreBlock
{

    public ModOreBlock(String oreName)
    {
        super(FabricBlockSettings.of(Material.STONE)
                .breakByTool(FabricToolTags.PICKAXES, 2)
                .requiresTool()
                .strength(3.0f, 3.0f)
                .sounds(BlockSoundGroup.NETHER_GOLD_ORE));
        new Identifier(BasicNetherOres.MOD_ID, oreName);

        ItemLists.add(oreName, new BlockItem(this, new Item.Settings().group(BasicNetherOres.ITEMGROUP)));
    }

    @Override
    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack stack, BlockView worldIn, List<Text> tooltip, TooltipContext flagIn)
    {
        if(this == OreBlockLists.NETHEREMERALD_ORE){
            if (!ModConfig.emeraldGeneration){
                tooltip.add(new TranslatableText("tooltip.config.tip"));}
            else tooltip.add(new TranslatableText(EmeraldOreTip.oreTip, ModConfig.emeraldMinHeight, ModConfig.emeraldMaxHeight));}
        else if (this == OreBlockLists.NETHERDIAMOND_ORE){
            if (!ModConfig.diamondGeneration){
                tooltip.add(new TranslatableText("tooltip.config.tip"));}
            else tooltip.add(new TranslatableText(DiamondOreTip.oreTip, ModConfig.diamondMinHeight, ModConfig.diamondMaxHeight));}
        else if (this == OreBlockLists.NETHERREDSTONE_ORE){
            if (!ModConfig.redstoneGeneration){
                tooltip.add(new TranslatableText("tooltip.config.tip"));}
            else tooltip.add(new TranslatableText(RedstoneOreTip.oreTip, ModConfig.redstoneMinHeight, ModConfig.redstoneMaxHeight));}
        else if (this == OreBlockLists.NETHERLAPIS_ORE){
            if (!ModConfig.lapisGeneration){
                tooltip.add(new TranslatableText("tooltip.config.tip"));}
            else tooltip.add(new TranslatableText(LapisOreTip.oreTip, ModConfig.lapisMinHeight, ModConfig.lapisMaxHeight));}
        else if (this == OreBlockLists.NETHERCOAL_ORE){
            if (!ModConfig.coalGeneration){
                tooltip.add(new TranslatableText("tooltip.config.tip"));}
            else tooltip.add(new TranslatableText(CoalOreTip.oreTip, ModConfig.coalMinHeight, ModConfig.coalMaxHeight));}
        else if (this == OreBlockLists.NETHERSILVER_ORE){
            if (!ModConfig.silverGeneration){
                tooltip.add(new TranslatableText("tooltip.config.tip"));}
            else tooltip.add(new TranslatableText(SilverOreTip.oreTip, ModConfig.silverMinHeight, ModConfig.silverMaxHeight));}
        else if (this == OreBlockLists.NETHERIRON_ORE){
            if (!ModConfig.ironGeneration){
                tooltip.add(new TranslatableText("tooltip.config.tip"));}
            else tooltip.add(new TranslatableText(IronOreTip.oreTip, ModConfig.ironMinHeight, ModConfig.ironMaxHeight));}
        else if (this == OreBlockLists.NETHERLEAD_ORE){
            if (!ModConfig.leadGeneration){
                tooltip.add(new TranslatableText("tooltip.config.tip"));}
            else tooltip.add(new TranslatableText(LeadOreTip.oreTip, ModConfig.leadMinHeight, ModConfig.leadMaxHeight));}
        else if (this == OreBlockLists.NETHERNICKEL_ORE){
            if (!ModConfig.nickelGeneration){
                tooltip.add(new TranslatableText("tooltip.config.tip"));}
            else tooltip.add(new TranslatableText(NickelOreTip.oreTip, ModConfig.nickelMinHeight, ModConfig.nickelMaxHeight));}
        else if (this == OreBlockLists.NETHERCOPPER_ORE){
            if (!ModConfig.copperGeneration){
                tooltip.add(new TranslatableText("tooltip.config.tip"));}
            else tooltip.add(new TranslatableText(CopperOreTip.oreTip, ModConfig.copperMinHeight, ModConfig.copperMaxHeight));}
        else if (this == OreBlockLists.NETHERALUMINUM_ORE){
            if (!ModConfig.aluminumGeneration){
                tooltip.add(new TranslatableText("tooltip.config.tip"));}
            else tooltip.add(new TranslatableText(AluminumOreTip.oreTip, ModConfig.aluminumMinHeight, ModConfig.aluminumMaxHeight));}
        else if (this == OreBlockLists.NETHERTIN_ORE){
            if (!ModConfig.tinGeneration){
                tooltip.add(new TranslatableText("tooltip.config.tip"));}
            else tooltip.add(new TranslatableText(TinOreTip.oreTip, ModConfig.tinMinHeight, ModConfig.tinMaxHeight));}
        else if (this == OreBlockLists.NETHEROSMIUM_ORE){
            if (!ModConfig.osmiumGeneration){
                tooltip.add(new TranslatableText("tooltip.config.tip"));}
            else tooltip.add(new TranslatableText(OsmiumOreTip.oreTip, ModConfig.osmiumMinHeight, ModConfig.osmiumMaxHeight));}
        else if (this == OreBlockLists.NETHERURANIUM_ORE){
            if (!ModConfig.uraniumGeneration){
                tooltip.add(new TranslatableText("tooltip.config.tip"));}
            else tooltip.add(new TranslatableText(UraniumOreTip.oreTip, ModConfig.uraniumMinHeight, ModConfig.uraniumMaxHeight));}
    }

    @Override  //Updated getExperience
    protected int getExperienceWhenMined(Random random) {
        if (this == OreBlockLists.NETHERCOAL_ORE) {
            return MathHelper.nextInt(random, 0, 2);
        } else if (this == OreBlockLists.NETHERDIAMOND_ORE) {
            return MathHelper.nextInt(random, 3, 7);
        } else if (this == OreBlockLists.NETHEREMERALD_ORE) {
            return MathHelper.nextInt(random, 3, 7);
        } else if (this == OreBlockLists.NETHERLAPIS_ORE) {
            return MathHelper.nextInt(random, 2, 5);
        } else {
            return this == OreBlockLists.NETHERREDSTONE_ORE ? MathHelper.nextInt(random, 2, 5) : 0;
        }
    }

    @Override
    public void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos, ItemStack stack) {
        super.onStacksDropped(state, world, pos, stack);
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        world.syncWorldEvent(player, 2001, pos, getRawIdFromState(state));
        int isSilkTouching = EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, player.getMainHandStack());

        if (this.isIn(BlockTags.GUARDED_BY_PIGLINS) && ModConfig.piglinGuard) {
            if (ModConfig.silkEffect) {
                if (isSilkTouching < 1) {
                    PiglinBrain.onGuardedBlockInteracted(player, false);
                }
            }else PiglinBrain.onGuardedBlockInteracted(player, false);
        }
    }
}
