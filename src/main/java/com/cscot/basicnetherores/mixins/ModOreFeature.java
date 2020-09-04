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
    }

}
