package com.cscot.basicnetherores.mixins;

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
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ModConfiguredFeatures.ORE_EMERALD_NETHER);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ModConfiguredFeatures.ORE_DIAMOND_NETHER);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ModConfiguredFeatures.ORE_REDSTONE_NETHER);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ModConfiguredFeatures.ORE_LAPIS_NETHER);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ModConfiguredFeatures.ORE_COAL_NETHER);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ModConfiguredFeatures.ORE_SILVER_NETHER);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ModConfiguredFeatures.ORE_IRON_NETHER);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ModConfiguredFeatures.ORE_LEAD_NETHER);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ModConfiguredFeatures.ORE_NICKEL_NETHER);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ModConfiguredFeatures.ORE_COPPER_NETHER);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ModConfiguredFeatures.ORE_ALUMINUM_NETHER);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ModConfiguredFeatures.ORE_TIN_NETHER);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ModConfiguredFeatures.ORE_OSMIUM_NETHER);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ModConfiguredFeatures.ORE_URANIUM_NETHER);
    }

}
