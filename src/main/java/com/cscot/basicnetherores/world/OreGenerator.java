package com.cscot.basicnetherores.world;


import com.cscot.basicnetherores.BasicNetherOres;
import com.cscot.basicnetherores.config.OreGenerationConfig;
import com.cscot.basicnetherores.data.worldgen.ModOreFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Map;


@Mod.EventBusSubscriber(modid = BasicNetherOres.modid,bus = Mod.EventBusSubscriber.Bus.FORGE)
public class OreGenerator
{
    @SubscribeEvent(priority= EventPriority.HIGH)
    public static void setupOreGenerator(BiomeLoadingEvent event)
    {
        for (Map.Entry<ResourceKey<Biome>, Biome> biome : BuiltinRegistries.BIOME.entrySet()) {

            if (biome.getValue().getBiomeCategory().equals(Biome.BiomeCategory.NETHER))
            {
                if(OreGenerationConfig.emeraldGeneration.get()){
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ModOreFeatures.ORE_EMERALD_NETHER);
                }

                if(OreGenerationConfig.diamondGeneration.get()){
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ModOreFeatures.ORE_DIAMOND_NETHER);
                }

                if(OreGenerationConfig.redstoneGeneration.get()){
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ModOreFeatures.ORE_REDSTONE_NETHER);
                }

                if(OreGenerationConfig.lapisGeneration.get()){
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ModOreFeatures.ORE_LAPIS_NETHER);
                }

                if(OreGenerationConfig.coalGeneration.get()){
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ModOreFeatures.ORE_COAL_NETHER);
                }

                if(OreGenerationConfig.silverGeneration.get()){
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ModOreFeatures.ORE_SILVER_NETHER);
                }

                if(OreGenerationConfig.ironGeneration.get()){
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ModOreFeatures.ORE_IRON_NETHER);
                }

                if(OreGenerationConfig.leadGeneration.get()){
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ModOreFeatures.ORE_LEAD_NETHER);
                }

                if(OreGenerationConfig.nickelGeneration.get()){
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ModOreFeatures.ORE_NICKEL_NETHER);
                }

                if(OreGenerationConfig.copperGeneration.get()){
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ModOreFeatures.ORE_COPPER_NETHER);
                }

                if(OreGenerationConfig.aluminumGeneration.get()){
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ModOreFeatures.ORE_ALUMINUM_NETHER);
                }

                if(OreGenerationConfig.tinGeneration.get()){
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ModOreFeatures.ORE_TIN_NETHER);
                }

                if(OreGenerationConfig.osmiumGeneration.get()){
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ModOreFeatures.ORE_OSMIUM_NETHER);
                }

                if(OreGenerationConfig.uraniumGeneration.get()){
                    event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ModOreFeatures.ORE_URANIUM_NETHER);
                }
            }
        }
    }
}
