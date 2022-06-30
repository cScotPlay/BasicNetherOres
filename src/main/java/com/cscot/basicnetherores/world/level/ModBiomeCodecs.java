package com.cscot.basicnetherores.world.level;

import com.cscot.basicnetherores.BasicNetherOres;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBiomeCodecs
{
    public static DeferredRegister<Codec<? extends BiomeModifier>> BIOME_MODIFIER_SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, BasicNetherOres.modid);

    public static RegistryObject<Codec<ModBiomeModifier>> NETHER_ORE_CODEC = BIOME_MODIFIER_SERIALIZERS.register("nether_ore_codec", () ->
            RecordCodecBuilder.create(builder -> builder.group(
                    Biome.LIST_CODEC.fieldOf("biomes").forGetter(ModBiomeModifier::biomes),
                    PlacedFeature.CODEC.fieldOf("feature").forGetter(ModBiomeModifier::feature)
            ).apply(builder, ModBiomeModifier::new)));
}
