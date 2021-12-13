package com.cscot.basicnetherores.world;


import com.cscot.basicnetherores.BasicNetherOres;
import com.cscot.basicnetherores.config.OreGenerationConfig;
import com.cscot.basicnetherores.data.worldgen.ModOrePlacedFeature;
import com.cscot.basicnetherores.data.worldgen.ModOrePlacedFeature;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Map;


//@Mod.EventBusSubscriber(modid = BasicNetherOres.modid, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class OreGenerator
{
    @SubscribeEvent(priority= EventPriority.HIGH)
    public static void biomeLoadingEvent(BiomeLoadingEvent event)
    {
        BiomeGenerationSettingsBuilder builder = event.getGeneration();
        Biome.BiomeCategory biome = event.getCategory();

        if (biome == Biome.BiomeCategory.NETHER)
        {
            if(OreGenerationConfig.emeraldGeneration.get()){
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeature.ORE_EMERALD_NETHER);
            }

            if(OreGenerationConfig.diamondGeneration.get()){
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeature.ORE_DIAMOND_NETHER);
            }

            if(OreGenerationConfig.redstoneGeneration.get()){
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeature.ORE_REDSTONE_NETHER);
            }

            if(OreGenerationConfig.lapisGeneration.get()){
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeature.ORE_LAPIS_NETHER);
            }

            if(OreGenerationConfig.coalGeneration.get()){
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeature.ORE_COAL_NETHER);
            }

            if(OreGenerationConfig.silverGeneration.get()){
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeature.ORE_SILVER_NETHER);
            }

            if(OreGenerationConfig.ironGeneration.get()){
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeature.ORE_IRON_NETHER);
            }

            if(OreGenerationConfig.leadGeneration.get()){
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_DECORATION).add(() -> ModOrePlacedFeature.ORE_LEAD_NETHER);
            }

            if(OreGenerationConfig.nickelGeneration.get()){
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_DECORATION).add(() -> ModOrePlacedFeature.ORE_NICKEL_NETHER);
            }

            if(OreGenerationConfig.copperGeneration.get()){
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_DECORATION).add(() -> ModOrePlacedFeature.ORE_COPPER_NETHER);
            }

            if(OreGenerationConfig.aluminumGeneration.get()){
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_DECORATION).add(() -> ModOrePlacedFeature.ORE_ALUMINUM_NETHER);
            }

            if(OreGenerationConfig.tinGeneration.get()){
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_DECORATION).add(() -> ModOrePlacedFeature.ORE_TIN_NETHER);
            }

            if(OreGenerationConfig.osmiumGeneration.get()){
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_DECORATION).add(() -> ModOrePlacedFeature.ORE_OSMIUM_NETHER);
            }

            if(OreGenerationConfig.uraniumGeneration.get()){
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_DECORATION).add(() -> ModOrePlacedFeature.ORE_URANIUM_NETHER);
            }

            if(OreGenerationConfig.zincGeneration.get()){
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_DECORATION).add(() -> ModOrePlacedFeature.ORE_ZINC_NETHER);
            }
        }
    }
}
