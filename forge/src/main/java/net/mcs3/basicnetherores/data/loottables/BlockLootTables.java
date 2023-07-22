package net.mcs3.basicnetherores.data.loottables;

import net.mcs3.basicnetherores.init.BNOBlocks;
import net.mcs3.basicnetherores.init.BNOItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashSet;
import java.util.Set;

public class BlockLootTables extends BlockLootSubProvider
{
    private final Set<Block> knownBlocks = new HashSet<>();

    public BlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

//    @Override
//    protected void add(Block block, LootTable.Builder builder) {
//        super.add(block, builder);
//        knownBlocks.add(block);
//    }


//        dropSelf(ModBlocks.ALUMINUM_BLOCK.get());
//        dropSelf(ModBlocks.LEAD_BLOCK.get());
//        dropSelf(ModBlocks.NICKEL_BLOCK.get());
//        dropSelf(ModBlocks.OSMIUM_BLOCK.get());
//        dropSelf(ModBlocks.SILVER_BLOCK.get());
//        dropSelf(ModBlocks.TIN_BLOCK.get());
//        dropSelf(ModBlocks.URANIUM_BLOCK.get());
//        dropSelf(ModBlocks.ZINC_BLOCK.get());
//
//        dropSelf(ModBlocks.RAW_ALUMINUM_BLOCK.get());
//        dropSelf(ModBlocks.RAW_LEAD_BLOCK.get());
//        dropSelf(ModBlocks.RAW_NICKEL_BLOCK.get());
//        dropSelf(ModBlocks.RAW_OSMIUM_BLOCK.get());
//        dropSelf(ModBlocks.RAW_SILVER_BLOCK.get());
//        dropSelf(ModBlocks.RAW_TIN_BLOCK.get());
//        dropSelf(ModBlocks.RAW_URANIUM_BLOCK.get());
//        dropSelf(ModBlocks.RAW_ZINC_BLOCK.get());
//
//        add(ModBlocks.NETHER_EMERALD_ORE.get(), (emerald) -> createOreDrop(emerald, Items.EMERALD));
//        add(ModBlocks.NETHER_DIAMOND_ORE.get(), (diamond) -> createOreDrop(diamond, Items.DIAMOND));
//        add(ModBlocks.NETHER_REDSTONE_ORE.get(), BlockLoot::createRedstoneOreDrops);
//        add(ModBlocks.NETHER_LAPIS_ORE.get(), (lapis) -> createSilkTouchDispatchTable(lapis, applyExplosionDecay(lapis, LootItem.lootTableItem(Items.LAPIS_LAZULI).apply(SetItemCountFunction.setCount(UniformGenerator.between(4.0F, 9.0F))).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)))));
//        add(ModBlocks.NETHER_COAL_ORE.get(), (coal) -> createOreDrop(coal, Items.COAL));
//
//        add(ModBlocks.NETHER_SILVER_ORE.get(), (silver) -> createOreDrop(silver, ModItems.RAW_SILVER.get()));
//        add(ModBlocks.NETHER_IRON_ORE.get(),(iron) -> createOreDrop(iron, Items.RAW_IRON));
//        add(ModBlocks.NETHER_LEAD_ORE.get(), (lead) -> createOreDrop(lead, ModItems.RAW_LEAD.get()));
//        add(ModBlocks.NETHER_NICKEL_ORE.get(), (nickel) -> createOreDrop(nickel, ModItems.RAW_NICKEL.get()));
//        add(ModBlocks.NETHER_COPPER_ORE.get(), BlockLoot::createCopperOreDrops);
//        add(ModBlocks.NETHER_ALUMINUM_ORE.get(), (aluminum) -> createOreDrop(aluminum, ModItems.RAW_ALUMINUM.get()));
//        add(ModBlocks.NETHER_TIN_ORE.get(), (tin) -> createOreDrop(tin, ModItems.RAW_TIN.get()));
//        add(ModBlocks.NETHER_OSMIUM_ORE.get(), (osmium) -> createOreDrop(osmium, ModItems.RAW_OSMIUM.get()));
//        add(ModBlocks.NETHER_URANIUM_ORE.get(), (uranium) -> createOreDrop(uranium, ModItems.RAW_URANIUM.get()));
//        add(ModBlocks.NETHER_ZINC_ORE.get(), (zinc) -> createOreDrop(zinc, ModItems.RAW_ZINC.get()));


    @Override
    protected void generate() {

        createOreLoot(BNOBlocks.NETHER_EMERALD_ORE, Items.EMERALD);
        createOreLoot(BNOBlocks.NETHER_DIAMOND_ORE, Items.DIAMOND);
        createRedstoneOreDrops(BNOBlocks.NETHER_REDSTONE_ORE);
        createLapisOreDrops(BNOBlocks.NETHER_LAPIS_ORE);
        createOreLoot(BNOBlocks.NETHER_COAL_ORE, Items.COAL);
        createOreLoot(BNOBlocks.NETHER_SILVER_ORE, BNOItems.RAW_SILVER);
        createOreLoot(BNOBlocks.NETHER_IRON_ORE, Items.RAW_IRON);
        createOreLoot(BNOBlocks.NETHER_LEAD_ORE, BNOItems.RAW_LEAD);
        createOreLoot(BNOBlocks.NETHER_NICKEL_ORE, BNOItems.RAW_NICKEL);
        createCopperOreDrops(BNOBlocks.NETHER_COPPER_ORE);
        createOreLoot(BNOBlocks.NETHER_ALUMINUM_ORE, BNOItems.RAW_ALUMINUM);
        createOreLoot(BNOBlocks.NETHER_TIN_ORE, BNOItems.RAW_TIN);
        createOreLoot(BNOBlocks.NETHER_OSMIUM_ORE, BNOItems.RAW_OSMIUM);
        createOreLoot(BNOBlocks.NETHER_URANIUM_ORE, BNOItems.RAW_URANIUM);
        createOreLoot(BNOBlocks.NETHER_ZINC_ORE, BNOItems.RAW_ZINC);

        createSelfDrop(BNOBlocks.ALUMINUM_BLOCK);
        createSelfDrop(BNOBlocks.LEAD_BLOCK);
        createSelfDrop(BNOBlocks.NICKEL_BLOCK);
        createSelfDrop(BNOBlocks.OSMIUM_BLOCK);
        createSelfDrop(BNOBlocks.SILVER_BLOCK);
        createSelfDrop(BNOBlocks.TIN_BLOCK);
        createSelfDrop(BNOBlocks.URANIUM_BLOCK);
        createSelfDrop(BNOBlocks.ZINC_BLOCK);

        createSelfDrop(BNOBlocks.RAW_ALUMINUM_BLOCK);
        createSelfDrop(BNOBlocks.RAW_LEAD_BLOCK);
        createSelfDrop(BNOBlocks.RAW_NICKEL_BLOCK);
        createSelfDrop(BNOBlocks.RAW_OSMIUM_BLOCK);
        createSelfDrop(BNOBlocks.RAW_SILVER_BLOCK);
        createSelfDrop(BNOBlocks.RAW_TIN_BLOCK);
        createSelfDrop(BNOBlocks.RAW_URANIUM_BLOCK);
        createSelfDrop(BNOBlocks.RAW_ZINC_BLOCK);



    }

    @Override
    protected Iterable<Block> getKnownBlocks()
    {
        return knownBlocks;
    }

    private void createOreLoot(Block block, Item item) {
        this.add(block, (b) -> {
            return this.createOreDrop(b, item);
        });
        knownBlocks.add(block);
    }

    private void createSelfDrop(Block block) {
        dropSelf(block);
        knownBlocks.add(block);
    }
}