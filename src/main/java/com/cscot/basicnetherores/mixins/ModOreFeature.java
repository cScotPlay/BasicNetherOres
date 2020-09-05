package com.cscot.basicnetherores.mixins;

import com.cscot.basicnetherores.config.ModConfig;
import com.cscot.basicnetherores.world.gen.feature.ModConfiguredFeatures;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(DefaultBiomeFeatures.class)
public class ModOreFeature
{
    @Inject(method = "addNetherMineables(Lnet/minecraft/world/biome/GenerationSettings$Builder;)V", at = @At("TAIL"))
    private static void addNetherMineables(GenerationSettings.Builder builder, CallbackInfo ci)
    {
        if(ModConfig.emeraldGeneration) {
            builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ModConfiguredFeatures.ORE_EMERALD_NETHER);
        }

        if(ModConfig.diamondGeneration) {
            builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ModConfiguredFeatures.ORE_DIAMOND_NETHER);
        }

        if(ModConfig.redstoneGeneration) {
            builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ModConfiguredFeatures.ORE_REDSTONE_NETHER);
        }

        if(ModConfig.lapisGeneration) {
            builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ModConfiguredFeatures.ORE_LAPIS_NETHER);
        }

        if(ModConfig.coalGeneration) {
            builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ModConfiguredFeatures.ORE_COAL_NETHER);
        }

        if(ModConfig.silverGeneration) {
            builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ModConfiguredFeatures.ORE_SILVER_NETHER);
        }

        if(ModConfig.ironGeneration) {
            builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ModConfiguredFeatures.ORE_IRON_NETHER);
        }

        if(ModConfig.leadGeneration) {
            builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ModConfiguredFeatures.ORE_LEAD_NETHER);
        }

        if(ModConfig.nickelGeneration) {
            builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ModConfiguredFeatures.ORE_NICKEL_NETHER);
        }

        if(ModConfig.copperGeneration) {
            builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ModConfiguredFeatures.ORE_COPPER_NETHER);
        }

        if(ModConfig.aluminumGeneration) {
            builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ModConfiguredFeatures.ORE_ALUMINUM_NETHER);
        }

        if(ModConfig.tinGeneration) {
            builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ModConfiguredFeatures.ORE_TIN_NETHER);
        }

        if(ModConfig.osmiumGeneration) {
            builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ModConfiguredFeatures.ORE_OSMIUM_NETHER);
        }

        if(ModConfig.uraniumGeneration) {
            builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ModConfiguredFeatures.ORE_URANIUM_NETHER);
        }
    }

}
