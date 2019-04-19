package com.cscot.basicnetherores.objects;

import com.cscot.basicnetherores.BasicNetherOres;
import com.cscot.basicnetherores.config.OreGenerationConfig;
import com.cscot.basicnetherores.config.OreProtectionConfig;
import com.cscot.basicnetherores.lists.BlockOreList;
import com.cscot.basicnetherores.lists.ItemList;
import com.cscot.basicnetherores.util.handler.RegisteryHandler;
import com.cscot.basicnetherores.util.helpers.OreTooltipHelper.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

public class BlockOreBase extends BlockOre
{
    private String oreName, tagName;
    private Block oreBlock;

    public BlockOreBase(String oreName)
    {
        super(Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f));
        setRegistryName(BasicNetherOres.modid, oreName);

        ItemList.items.add(new ItemBlock(this.getBlock(), new Item.Properties().group(BasicNetherOres.bnoItemGroup)).setRegistryName(RegisteryHandler.RegistryEvents.location(oreName)));
        BlockOreList.blockores.add(this);
    }
    //TODO add information regarding spawn charactisitics to Ores
    @Override
    @OnlyIn(Dist.CLIENT)
    public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
    {
        if(this == BlockOreList.netheremerald_ore){
            tooltip.add(new TextComponentTranslation(EmeraldOreTip.oreTip, OreGenerationConfig.emeraldMinHeight.get().toString(), OreGenerationConfig.emeraldMaxHeight.get().toString()));}
        else if (this == BlockOreList.netherdiamond_ore){
            tooltip.add(new TextComponentTranslation(DiamondOreTip.oreTip, OreGenerationConfig.diamondMinHeight.get().toString(), OreGenerationConfig.diamondMaxHeight.get().toString()));}
        else if (this == BlockOreList.netherredstone_ore){
            tooltip.add(new TextComponentTranslation(RedstoneOreTip.oreTip, OreGenerationConfig.redstoneMinHeight.get().toString(), OreGenerationConfig.redstoneMaxHeight.get().toString()));}
        else if (this == BlockOreList.netherlapis_ore){
            tooltip.add(new TextComponentTranslation(LapisOreTip.oreTip, OreGenerationConfig.lapisMinHeight.get().toString(), OreGenerationConfig.lapisMaxHeight.get().toString()));}
        else if (this == BlockOreList.nethercoal_ore){
            tooltip.add(new TextComponentTranslation(CoalOreTip.oreTip, OreGenerationConfig.coalMinHeight.get().toString(), OreGenerationConfig.coalMaxHeight.get().toString()));}
        else if (this == BlockOreList.nethergold_ore){
            tooltip.add(new TextComponentTranslation(GoldOreTip.oreTip, OreGenerationConfig.goldMinHeight.get().toString(), OreGenerationConfig.goldMaxHeight.get().toString()));}
        else if (this == BlockOreList.nethersilver_ore){
            tooltip.add(new TextComponentTranslation(SilverOreTip.oreTip, OreGenerationConfig.silverMinHeight.get().toString(), OreGenerationConfig.silverMaxHeight.get().toString()));}
        else if (this == BlockOreList.netheriron_ore){
            tooltip.add(new TextComponentTranslation(IronOreTip.oreTip, OreGenerationConfig.ironMinHeight.get().toString(), OreGenerationConfig.ironMaxHeight.get().toString()));}
        else if (this == BlockOreList.netherlead_ore){
            tooltip.add(new TextComponentTranslation(LeadOreTip.oreTip, OreGenerationConfig.leadMinHeight.get().toString(), OreGenerationConfig.leadMaxHeight.get().toString()));}
        else if (this == BlockOreList.nethernickel_ore){
            tooltip.add(new TextComponentTranslation(NickelOreTip.oreTip, OreGenerationConfig.nickelMinHeight.get().toString(), OreGenerationConfig.nickelMaxHeight.get().toString()));}
        else if (this == BlockOreList.nethercopper_ore){
            tooltip.add(new TextComponentTranslation(CopperOreTip.oreTip, OreGenerationConfig.copperMinHeight.get().toString(), OreGenerationConfig.copperMaxHeight.get().toString()));}
        else if (this == BlockOreList.netheraluminum_ore){
            tooltip.add(new TextComponentTranslation(AluminumOreTip.oreTip, OreGenerationConfig.aluminumMinHeight.get().toString(), OreGenerationConfig.aluminumMaxHeight.get().toString()));}
        else if (this == BlockOreList.nethertin_ore){
            tooltip.add(new TextComponentTranslation(TinOreTip.oreTip, OreGenerationConfig.tinMinHeight.get().toString(), OreGenerationConfig.tinMaxHeight.get().toString()));}
    }

    @Override
    public ToolType getHarvestTool(IBlockState state) {
        return ToolType.PICKAXE;
    }

    @Override
    public int getHarvestLevel(IBlockState state) {
        return 2;
    }

    @Override
    public IItemProvider getItemDropped(IBlockState state, World worldIn, BlockPos pos, int fortune)
    {
        if (this == BlockOreList.nethercoal_ore) {
            return Items.COAL;}
        else if (this == BlockOreList.netherdiamond_ore) {
            return Items.DIAMOND;}
        else if (this == BlockOreList.netherlapis_ore) {
            return Items.LAPIS_LAZULI;}
        else if (this == BlockOreList.netheremerald_ore) {
            return Items.EMERALD;}
        else
            return (IItemProvider)(this == BlockOreList.netherredstone_ore ? Items.REDSTONE : this);
    }

    @Override
    public int quantityDropped(IBlockState state, Random random)
    {
        if (this == BlockOreList.netherlapis_ore)
            return 4 + random.nextInt(5);
        else
            return this == BlockOreList.netherredstone_ore ? 4 + random.nextInt(2) : 1;
    }

    @Override
    public int getExpDrop(IBlockState state, net.minecraft.world.IWorldReader reader, BlockPos pos, int fortune) {
        World world = reader instanceof World ? (World)reader : null;
        if (world == null || this.getItemDropped(state, world, pos, fortune) != this) {
            int i = 0;
            if (this == BlockOreList.nethercoal_ore) {
                i = MathHelper.nextInt(RANDOM, 1, 3);
            } else if (this == BlockOreList.netherdiamond_ore) {
                i = MathHelper.nextInt(RANDOM, 4, 8);
            } else if (this == BlockOreList.netheremerald_ore) {
                i = MathHelper.nextInt(RANDOM, 4, 8);
            } else if (this == BlockOreList.netherlapis_ore) {
                i = MathHelper.nextInt(RANDOM, 3, 6);
            } else if (this == BlockOreList.netherredstone_ore) {
                i = MathHelper.nextInt(RANDOM, 2, 6);
            }
            return i;
        }
        return 0;
    }

    public static void pigmenGuards(World worldIn, BlockPos pos, EntityPlayer thief) {

        int x = pos.getX(), y = pos.getY(), z = pos.getZ();
        int rngProt;

        rngProt = OreProtectionConfig.protectionRange.get();

        List<?> list = worldIn.getEntitiesWithinAABB(EntityPigZombie.class, new AxisAlignedBB(x - rngProt, y - rngProt, z - rngProt, x + rngProt, y + rngProt, z + rngProt));

        for(int i = 0; i < list.size(); i++) {

            Entity entity = (Entity)list.get(i);
            if(entity instanceof EntityPigZombie) {

                EntityPigZombie guardPigs = (EntityPigZombie)entity;
                guardPigs.setRevengeTarget(thief);
            }
        }
    }
}
