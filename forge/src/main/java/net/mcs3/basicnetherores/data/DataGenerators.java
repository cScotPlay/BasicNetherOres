package net.mcs3.basicnetherores.data;


import net.mcs3.basicnetherores.Constants;
import net.mcs3.basicnetherores.data.loottables.LootTableGenerator;
import net.mcs3.basicnetherores.data.models.BlockStateGenerator;
import net.mcs3.basicnetherores.data.models.ItemModelGenerator;
import net.mcs3.basicnetherores.data.recipes.CraftingRecipeBuilder;
import net.mcs3.basicnetherores.data.tags.BlockTagGenerator;
import net.mcs3.basicnetherores.data.tags.ItemTagGenerator;
import net.mcs3.basicnetherores.data.worldgen.WorldDataGenerator;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = Constants.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators
{
    @SubscribeEvent
    public static void gatherData(GatherDataEvent evt) {
        Constants.LOGGER.info("Datagen WORKS");
        DataGenerator generator = evt.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = evt.getLookupProvider();
        if (evt.includeServer()) {
            generator.addProvider(true, new LootTableGenerator(packOutput));

            generator.addProvider(true, new CraftingRecipeBuilder(packOutput));

            BlockTagsProvider blocktags = new BlockTagGenerator(packOutput, lookupProvider, evt.getExistingFileHelper());
            generator.addProvider(true, blocktags);
            generator.addProvider(true, new ItemTagGenerator(packOutput, lookupProvider, blocktags.contentsGetter(), evt.getExistingFileHelper()));

            generator.addProvider(true, new WorldDataGenerator(packOutput, lookupProvider));
        }

        if (evt.includeClient()) {
            generator.addProvider(true, new BlockStateGenerator(generator, evt.getExistingFileHelper()));
            generator.addProvider(true, new ItemModelGenerator(generator, evt.getExistingFileHelper()));
        }
    }
}
