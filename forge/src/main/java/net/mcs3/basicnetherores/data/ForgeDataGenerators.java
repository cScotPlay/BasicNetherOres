package net.mcs3.basicnetherores.data;


import net.mcs3.basicnetherores.Constants;
import net.mcs3.basicnetherores.data.tags.ForgeBlockTagGenerator;
import net.mcs3.basicnetherores.data.tags.ForgeItemTagGenerator;
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
public class ForgeDataGenerators
{
    @SubscribeEvent
    public static void gatherData(GatherDataEvent evt) {
        DataGenerator generator = evt.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = evt.getLookupProvider();
        if (evt.includeServer()) {
            BlockTagsProvider blocktags = new ForgeBlockTagGenerator(packOutput, lookupProvider, evt.getExistingFileHelper());

            generator.addProvider(true, blocktags);
            generator.addProvider(true, new ForgeItemTagGenerator(packOutput, lookupProvider, blocktags.contentsGetter(), evt.getExistingFileHelper()));

            generator.addProvider(true, new WorldDataGenerator(packOutput, lookupProvider));
        }
    }
}
