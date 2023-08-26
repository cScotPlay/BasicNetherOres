package com.cscot.basicnetherores.data.worldgen;

import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

import static com.cscot.basicnetherores.util.helpers.OreTooltipHelper.*;

public class ModOrePlacement
{
    public static final List ORE_EMERALD_PLACED_FEATURE = commonOrePlacement(emeraldPerChunk,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(emeraldMinHeight), VerticalAnchor.absolute(emeraldMaxHeight)));

    public static final List ORE_DIAMOND_PLACED_FEATURE = commonOrePlacement(diamondPerChunk,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(diamondMinHeight), VerticalAnchor.absolute(diamondMaxHeight)));

    public static final List ORE_REDSTONE_PLACED_FEATURE = commonOrePlacement(redstonePerChunk,
                    HeightRangePlacement.triangle(VerticalAnchor.absolute(redstoneMinHeight), VerticalAnchor.absolute(redstoneMaxHeight)));

    public static final List ORE_LAPIS_PLACED_FEATURE = commonOrePlacement(lapisPerChunk,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(lapisMinHeight), VerticalAnchor.absolute(lapisMaxHeight)));

    public static final List ORE_COAL_PLACED_FEATURE = commonOrePlacement(coalPerChunk,
                    HeightRangePlacement.triangle(VerticalAnchor.absolute(coalMinHeight), VerticalAnchor.absolute(coalMaxHeight)));

    public static final List ORE_SILVER_PLACED_FEATURE = commonOrePlacement(silverPerChunk,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(silverMinHeight), VerticalAnchor.absolute(silverMaxHeight)));

    public static final List ORE_IRON_PLACED_FEATURE = commonOrePlacement(ironPerChunk,
                HeightRangePlacement.triangle(VerticalAnchor.absolute(ironMinHeight), VerticalAnchor.absolute(ironMaxHeight)));

    public static final List ORE_LEAD_PLACED_FEATURE = commonOrePlacement(leadPerChunk,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(leadMinHeight), VerticalAnchor.absolute(leadMaxHeight)));

    public static final List ORE_NICKEL_PLACED_FEATURE = commonOrePlacement(nickelPerChunk,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(nickelMinHeight), VerticalAnchor.absolute(nickelMaxHeight)));

    public static final List ORE_COPPER_PLACED_FEATURE = commonOrePlacement(copperPerChunk,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(copperMinHeight), VerticalAnchor.absolute(copperMaxHeight)));

    public static final List ORE_ALUMINUM_PLACED_FEATURE = commonOrePlacement(aluminumPerChunk,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(aluminumMinHeight), VerticalAnchor.absolute(aluminumMaxHeight)));

    public static final List ORE_TIN_PLACED_FEATURE = commonOrePlacement(tinPerChunk,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(tinMinHeight), VerticalAnchor.absolute(tinMaxHeight)));

    public static final List ORE_OSMIUM_PLACED_FEATURE = commonOrePlacement(osmiumPerChunk,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(osmiumMinHeight), VerticalAnchor.absolute(osmiumMaxHeight)));

    public static final List ORE_URANIUM_PLACED_FEATURE = commonOrePlacement(uraniumPerChunk,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(uraniumMinHeight), VerticalAnchor.absolute(uraniumMaxHeight)));

    public static final List ORE_ZINC_PLACED_FEATURE = commonOrePlacement(zincPerChunk,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(zincMinHeight), VerticalAnchor.absolute(zincMaxHeight)));

    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    private static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }


}
