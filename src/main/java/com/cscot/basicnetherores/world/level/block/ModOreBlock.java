package com.cscot.basicnetherores.world.level.block;

import com.cscot.basicnetherores.BasicNetherOres;
import com.cscot.basicnetherores.config.OreGenerationConfig;
import com.cscot.basicnetherores.config.OreProtectionConfig;
import com.cscot.basicnetherores.api.BlockOreList;
import com.cscot.basicnetherores.api.ItemList;
import com.cscot.basicnetherores.api.event.PiglinEvent;
import com.cscot.basicnetherores.util.handler.RegisteryHandler;
import com.cscot.basicnetherores.util.helpers.OreTooltipHelper.*;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.entity.monster.piglin.PiglinAi;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.phys.AABB;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


import javax.annotation.Nullable;
import java.util.List;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class ModOreBlock extends OreBlock
{
    private String oreName, tagName;
    private Block oreBlock;
    private final UniformInt xpRange;

    public ModOreBlock(String oreName, UniformInt experienceDropped)
    {
        super(BlockBehaviour.Properties.of(Material.STONE)
                .requiresCorrectToolForDrops()
                .strength(3.0f, 3.0f)
                .sound(SoundType.NETHER_GOLD_ORE));
        setRegistryName(BasicNetherOres.modid, oreName);
        this.xpRange = experienceDropped;

        ItemList.items.add(new BlockItem(this, new Item.Properties().tab(BasicNetherOres.bnoItemGroup)).setRegistryName(RegisteryHandler.RegistryEvents.location(oreName)));
        BlockOreList.blockores.add(this);
    }

    public ModOreBlock(String oreName)
    {
        this(oreName, UniformInt.of(0, 0));
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter worldIn, List<Component> tooltip, TooltipFlag flagIn)
    {
        if(this == BlockOreList.netheremerald_ore){
            if (!OreGenerationConfig.emeraldGeneration.get()){
            tooltip.add(new TranslatableComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslatableComponent(EmeraldOreTip.oreTip, OreGenerationConfig.emeraldMinHeight.get().toString(), OreGenerationConfig.emeraldMaxHeight.get().toString()));}
        else if (this == BlockOreList.netherdiamond_ore){
            if (!OreGenerationConfig.diamondGeneration.get()){
                tooltip.add(new TranslatableComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslatableComponent(DiamondOreTip.oreTip, OreGenerationConfig.diamondMinHeight.get().toString(), OreGenerationConfig.diamondMaxHeight.get().toString()));}
        else if (this == BlockOreList.netherredstone_ore){
            if (!OreGenerationConfig.redstoneGeneration.get()){
                tooltip.add(new TranslatableComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslatableComponent(RedstoneOreTip.oreTip, OreGenerationConfig.redstoneMinHeight.get().toString(), OreGenerationConfig.redstoneMaxHeight.get().toString()));}
        else if (this == BlockOreList.netherlapis_ore){
            if (!OreGenerationConfig.lapisGeneration.get()){
                tooltip.add(new TranslatableComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslatableComponent(LapisOreTip.oreTip, OreGenerationConfig.lapisMinHeight.get().toString(), OreGenerationConfig.lapisMaxHeight.get().toString()));}
        else if (this == BlockOreList.nethercoal_ore){
            if (!OreGenerationConfig.coalGeneration.get()){
                tooltip.add(new TranslatableComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslatableComponent(CoalOreTip.oreTip, OreGenerationConfig.coalMinHeight.get().toString(), OreGenerationConfig.coalMaxHeight.get().toString()));}
        else if (this == BlockOreList.nethersilver_ore){
            if (!OreGenerationConfig.silverGeneration.get()){
                tooltip.add(new TranslatableComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslatableComponent(SilverOreTip.oreTip, OreGenerationConfig.silverMinHeight.get().toString(), OreGenerationConfig.silverMaxHeight.get().toString()));}
        else if (this == BlockOreList.netheriron_ore){
            if (!OreGenerationConfig.ironGeneration.get()){
                tooltip.add(new TranslatableComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslatableComponent(IronOreTip.oreTip, OreGenerationConfig.ironMinHeight.get().toString(), OreGenerationConfig.ironMaxHeight.get().toString()));}
        else if (this == BlockOreList.netherlead_ore){
            if (!OreGenerationConfig.leadGeneration.get()){
                tooltip.add(new TranslatableComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslatableComponent(LeadOreTip.oreTip, OreGenerationConfig.leadMinHeight.get().toString(), OreGenerationConfig.leadMaxHeight.get().toString()));}
        else if (this == BlockOreList.nethernickel_ore){
            if (!OreGenerationConfig.nickelGeneration.get()){
                tooltip.add(new TranslatableComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslatableComponent(NickelOreTip.oreTip, OreGenerationConfig.nickelMinHeight.get().toString(), OreGenerationConfig.nickelMaxHeight.get().toString()));}
        else if (this == BlockOreList.nethercopper_ore){
            if (!OreGenerationConfig.copperGeneration.get()){
                tooltip.add(new TranslatableComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslatableComponent(CopperOreTip.oreTip, OreGenerationConfig.copperMinHeight.get().toString(), OreGenerationConfig.copperMaxHeight.get().toString()));}
        else if (this == BlockOreList.netheraluminum_ore){
            if (!OreGenerationConfig.aluminumGeneration.get()){
                tooltip.add(new TranslatableComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslatableComponent(AluminumOreTip.oreTip, OreGenerationConfig.aluminumMinHeight.get().toString(), OreGenerationConfig.aluminumMaxHeight.get().toString()));}
        else if (this == BlockOreList.nethertin_ore){
            if (!OreGenerationConfig.tinGeneration.get()){
                tooltip.add(new TranslatableComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslatableComponent(TinOreTip.oreTip, OreGenerationConfig.tinMinHeight.get().toString(), OreGenerationConfig.tinMaxHeight.get().toString()));}
        else if (this == BlockOreList.netherosmium_ore){
            if (!OreGenerationConfig.osmiumGeneration.get()){
                tooltip.add(new TranslatableComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslatableComponent(OsmiumOreTip.oreTip, OreGenerationConfig.osmiumMinHeight.get().toString(), OreGenerationConfig.osmiumMaxHeight.get().toString()));}
        else if (this == BlockOreList.netheruranium_ore){
            if (!OreGenerationConfig.uraniumGeneration.get()){
                tooltip.add(new TranslatableComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslatableComponent(UraniumOreTip.oreTip, OreGenerationConfig.uraniumMinHeight.get().toString(), OreGenerationConfig.uraniumMaxHeight.get().toString()));}
    }

    /*@Override
    public ToolType getHarvestTool(BlockState state) {
        return ToolType.PICKAXE;
    }

    @Override
    public int getHarvestLevel(BlockState state) {
        return 2;
    }*/


    /*@Override  //Updated getExperience
    protected int xpOnDrop(Random p_220281_1_) {
        if (this == BlockOreList.nethercoal_ore) {
            return Mth.nextInt(p_220281_1_, 0, 2);
        } else if (this == BlockOreList.netherdiamond_ore) {
            return Mth.nextInt(p_220281_1_, 3, 7);
        } else if (this == BlockOreList.netheremerald_ore) {
            return Mth.nextInt(p_220281_1_, 3, 7);
        } else if (this == BlockOreList.netherlapis_ore) {
            return Mth.nextInt(p_220281_1_, 2, 5);
        } else {
            return this == BlockOreList.netherredstone_ore ? Mth.nextInt(p_220281_1_, 2, 5) : 0;
        }
    }*/

    /**
     * Spawn additional block drops such as experience or other entities
     */
    @Override
    public void spawnAfterBreak(BlockState state, ServerLevel worldIn, BlockPos blockPos, ItemStack itemStack) {
        super.spawnAfterBreak(state, worldIn, blockPos, itemStack);
    }

    /*@Override  //New from 1.13 Upadated function now has SilkTouch as a variable
    public int getExpDrop(BlockState state, net.minecraft.world.level.LevelReader reader, BlockPos pos, int fortune, int silktouch)
    {
        Level world = reader instanceof Level ? (Level)reader : null;

        if (silktouch == 0)
        {
            int i = 0;
            if (this == BlockOreList.nethercoal_ore) {
                i = Mth.nextInt(RANDOM, 1, 3);
            } else if (this == BlockOreList.netherdiamond_ore) {
                i = Mth.nextInt(RANDOM, 4, 8);
            } else if (this == BlockOreList.netheremerald_ore) {
                i = Mth.nextInt(RANDOM, 4, 8);
            } else if (this == BlockOreList.netherlapis_ore) {
                i = Mth.nextInt(RANDOM, 3, 6);
            } else if (this == BlockOreList.netherredstone_ore) {
                i = Mth.nextInt(RANDOM, 2, 6);
            }
            return i;
        }
        return 0;
    }*/

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
}
