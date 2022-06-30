package com.cscot.basicnetherores.data;

import com.cscot.basicnetherores.BasicNetherOres;
import com.cscot.basicnetherores.data.loottables.LootTableGenerator;
import com.cscot.basicnetherores.data.models.BlockStateGenerator;
import com.cscot.basicnetherores.data.models.ItemModelGenerator;
import com.cscot.basicnetherores.data.recipes.CraftingRecipeBuilder;
import com.cscot.basicnetherores.data.tags.BlockTagGenerator;
import com.cscot.basicnetherores.data.tags.ItemTagGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = BasicNetherOres.modid, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators
{
    @SubscribeEvent
    public static void gatherData(GatherDataEvent evt) {
        if (evt.includeServer()) {
            evt.getGenerator().addProvider(true, new CraftingRecipeBuilder(evt.getGenerator()));
            evt.getGenerator().addProvider(true, new LootTableGenerator(evt.getGenerator()));
            BlockTagsProvider blocktags = new BlockTagGenerator(evt.getGenerator(), evt.getExistingFileHelper());
            evt.getGenerator().addProvider(true, blocktags);
            evt.getGenerator().addProvider(true, new ItemTagGenerator(evt.getGenerator(), blocktags, evt.getExistingFileHelper()));
        }

        if (evt.includeClient()) {
            evt.getGenerator().addProvider(true, new BlockStateGenerator(evt.getGenerator(), evt.getExistingFileHelper()));
            evt.getGenerator().addProvider(true, new ItemModelGenerator(evt.getGenerator(), evt.getExistingFileHelper()));
        }
    }
}
