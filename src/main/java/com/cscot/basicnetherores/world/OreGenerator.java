package com.cscot.basicnetherores.world;


import com.cscot.basicnetherores.config.OreGenerationConfig;
import com.cscot.basicnetherores.data.worldgen.ModOrePlacement;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;


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
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacement.ORE_EMERALD_PLACED_FEATURE);
            }

            if(OreGenerationConfig.diamondGeneration.get()){
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacement.ORE_DIAMOND_PLACED_FEATURE);
            }

            if(OreGenerationConfig.redstoneGeneration.get()){
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacement.ORE_REDSTONE_PLACED_FEATURE);
            }

            if(OreGenerationConfig.lapisGeneration.get()){
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacement.ORE_LAPIS_PLACED_FEATURE);
            }

            if(OreGenerationConfig.coalGeneration.get()){
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacement.ORE_COAL_PLACED_FEATURE);
            }

            if(OreGenerationConfig.silverGeneration.get()){
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacement.ORE_SILVER_PLACED_FEATURE);
            }

            if(OreGenerationConfig.ironGeneration.get()){
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacement.ORE_IRON_PLACED_FEATURE);
            }

            if(OreGenerationConfig.leadGeneration.get()){
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, ModOrePlacement.ORE_LEAD_PLACED_FEATURE);
            }

            if(OreGenerationConfig.nickelGeneration.get()){
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, ModOrePlacement.ORE_NICKEL_PLACED_FEATURE);
            }

            if(OreGenerationConfig.copperGeneration.get()){
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, ModOrePlacement.ORE_COPPER_PLACED_FEATURE);
            }

            if(OreGenerationConfig.aluminumGeneration.get()){
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, ModOrePlacement.ORE_ALUMINUM_PLACED_FEATURE);
            }

            if(OreGenerationConfig.tinGeneration.get()){
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, ModOrePlacement.ORE_TIN_PLACED_FEATURE);
            }

            if(OreGenerationConfig.osmiumGeneration.get()){
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, ModOrePlacement.ORE_OSMIUM_PLACED_FEATURE);
            }

            if(OreGenerationConfig.uraniumGeneration.get()){
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, ModOrePlacement.ORE_URANIUM_PLACED_FEATURE);
            }

            if(OreGenerationConfig.zincGeneration.get()){
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, ModOrePlacement.ORE_ZINC_PLACED_FEATURE);
            }
        }
    }
}
