package com.cscot.basicnetherores.blocks;

import com.cscot.basicnetherores.BasicNetherOres;
import com.cscot.basicnetherores.api.ItemLists;
import com.cscot.basicnetherores.api.OreBlockLists;
import com.cscot.basicnetherores.config.ModConfig;
import com.cscot.basicnetherores.util.helpers.OreTooltipHelper.*;
import com.sun.istack.internal.Nullable;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;

import java.util.List;

public class ModOreBlock extends OreBlock
{

    public ModOreBlock(String oreName)
    {
        super(Settings.of(Material.STONE).strength(3.0f, 3.0f).sounds(BlockSoundGroup.NETHER_GOLD_ORE));
        new Identifier(BasicNetherOres.MOD_ID, oreName);

        ItemLists.add(oreName, new BlockItem(this, new Item.Settings().group(BasicNetherOres.ITEMGROUP))/*.setRegistryName(RegisteryHandler.RegistryEvents.location(oreName))*/);
        //OreBlockLists.blockores.add(this);
    }

    @Override
    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack stack, @Nullable BlockView worldIn, List<Text> tooltip, TooltipContext flagIn)
    {
        if(this == OreBlockLists.NETHEREMERALD_ORE){
            if (!ModConfig.emeraldGeneration){
                tooltip.add(new TranslatableText("tooltip.config.tip"));}
            else tooltip.add(new TranslatableText(EmeraldOreTip.oreTip, ModConfig.emeraldMinHeight.toString(), ModConfig.emeraldMaxHeight.get().toString()));}
        else if (this == BlockOreList.netherdiamond_ore){
            if (!OreGenerationConfig.diamondGeneration.get()){
                tooltip.add(new TranslationTextComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslationTextComponent(DiamondOreTip.oreTip, OreGenerationConfig.diamondMinHeight.get().toString(), OreGenerationConfig.diamondMaxHeight.get().toString()));}
        else if (this == BlockOreList.netherredstone_ore){
            if (!OreGenerationConfig.redstoneGeneration.get()){
                tooltip.add(new TranslationTextComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslationTextComponent(RedstoneOreTip.oreTip, OreGenerationConfig.redstoneMinHeight.get().toString(), OreGenerationConfig.redstoneMaxHeight.get().toString()));}
        else if (this == BlockOreList.netherlapis_ore){
            if (!OreGenerationConfig.lapisGeneration.get()){
                tooltip.add(new TranslationTextComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslationTextComponent(LapisOreTip.oreTip, OreGenerationConfig.lapisMinHeight.get().toString(), OreGenerationConfig.lapisMaxHeight.get().toString()));}
        else if (this == BlockOreList.nethercoal_ore){
            if (!OreGenerationConfig.coalGeneration.get()){
                tooltip.add(new TranslationTextComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslationTextComponent(CoalOreTip.oreTip, OreGenerationConfig.coalMinHeight.get().toString(), OreGenerationConfig.coalMaxHeight.get().toString()));}
        else if (this == BlockOreList.nethersilver_ore){
            if (!OreGenerationConfig.silverGeneration.get()){
                tooltip.add(new TranslationTextComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslationTextComponent(SilverOreTip.oreTip, OreGenerationConfig.silverMinHeight.get().toString(), OreGenerationConfig.silverMaxHeight.get().toString()));}
        else if (this == BlockOreList.netheriron_ore){
            if (!OreGenerationConfig.ironGeneration.get()){
                tooltip.add(new TranslationTextComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslationTextComponent(IronOreTip.oreTip, OreGenerationConfig.ironMinHeight.get().toString(), OreGenerationConfig.ironMaxHeight.get().toString()));}
        else if (this == BlockOreList.netherlead_ore){
            if (!OreGenerationConfig.leadGeneration.get()){
                tooltip.add(new TranslationTextComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslationTextComponent(LeadOreTip.oreTip, OreGenerationConfig.leadMinHeight.get().toString(), OreGenerationConfig.leadMaxHeight.get().toString()));}
        else if (this == BlockOreList.nethernickel_ore){
            if (!OreGenerationConfig.nickelGeneration.get()){
                tooltip.add(new TranslationTextComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslationTextComponent(NickelOreTip.oreTip, OreGenerationConfig.nickelMinHeight.get().toString(), OreGenerationConfig.nickelMaxHeight.get().toString()));}
        else if (this == BlockOreList.nethercopper_ore){
            if (!OreGenerationConfig.copperGeneration.get()){
                tooltip.add(new TranslationTextComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslationTextComponent(CopperOreTip.oreTip, OreGenerationConfig.copperMinHeight.get().toString(), OreGenerationConfig.copperMaxHeight.get().toString()));}
        else if (this == BlockOreList.netheraluminum_ore){
            if (!OreGenerationConfig.aluminumGeneration.get()){
                tooltip.add(new TranslationTextComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslationTextComponent(AluminumOreTip.oreTip, OreGenerationConfig.aluminumMinHeight.get().toString(), OreGenerationConfig.aluminumMaxHeight.get().toString()));}
        else if (this == BlockOreList.nethertin_ore){
            if (!OreGenerationConfig.tinGeneration.get()){
                tooltip.add(new TranslationTextComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslationTextComponent(TinOreTip.oreTip, OreGenerationConfig.tinMinHeight.get().toString(), OreGenerationConfig.tinMaxHeight.get().toString()));}
        else if (this == BlockOreList.netherosmium_ore){
            if (!OreGenerationConfig.osmiumGeneration.get()){
                tooltip.add(new TranslationTextComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslationTextComponent(OsmiumOreTip.oreTip, OreGenerationConfig.osmiumMinHeight.get().toString(), OreGenerationConfig.osmiumMaxHeight.get().toString()));}
        else if (this == BlockOreList.netheruranium_ore){
            if (!OreGenerationConfig.uraniumGeneration.get()){
                tooltip.add(new TranslationTextComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslationTextComponent(UraniumOreTip.oreTip, OreGenerationConfig.uraniumMinHeight.get().toString(), OreGenerationConfig.uraniumMaxHeight.get().toString()));}
    }


}
