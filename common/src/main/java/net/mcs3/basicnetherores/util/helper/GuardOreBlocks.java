package net.mcs3.basicnetherores.util.helper;

import net.mcs3.basicnetherores.Constants;
import net.mcs3.basicnetherores.config.BasicNetherOresConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.monster.ZombifiedPiglin;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.entity.monster.piglin.PiglinAi;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.AABB;

import java.util.ArrayList;
import java.util.List;

public class GuardOreBlocks {

    public static List<String> PROTECTED_ORES;

    public static void guardOres(Player player, Level level,  BlockPos pos, Block block) {

        int isSilkTouching = EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SILK_TOUCH, player.getMainHandItem());
        initProtectedBlocks();

        if(BasicNetherOresConfig.common().piglinGuard()) {
            if(BasicNetherOresConfig.common().silkEffect()) {
                if(isSilkTouching < 1) {
                    attackThief(block, level, pos, player);
                }
            } else attackThief(block, level, pos, player);
        }
    }

    public static void attackThief(Block block, Level world, BlockPos pos, Player player) {

        if(protectedOres(block)) {
            int x = pos.getX(), y = pos.getY(), z = pos.getZ();
            int rngProt;

            rngProt = BasicNetherOresConfig.common().protectionRange();
            List<Piglin> list = world.getEntitiesOfClass(Piglin.class, new AABB(x - rngProt, y - rngProt, z - rngProt, x + rngProt, y + rngProt, z + rngProt));

            /**
            * Aggro the Piglins (Pulls function from PiglinAI/ Line 422.)
            */
            for(Piglin guard : list) {
                PiglinAi.angerNearbyPiglins(player, true);
            }

            List<ZombifiedPiglin> zombifiedPiglinList = world.getEntitiesOfClass(ZombifiedPiglin.class, new AABB(x - rngProt, y - rngProt, z - rngProt, x + rngProt, y + rngProt, z + rngProt));

            /**
            * Aggro the Zombified Piglins (Pulls function from ZombifiedPiglin/ Line 152.)
            */
            for(ZombifiedPiglin guard : zombifiedPiglinList) {
                guard.setTarget(player);
            }
        }
    }

    //Pull the list of protected ores from the config to be compared in BlockOreEvent
    public static boolean protectedOres(Block block) {
        String name = block.builtInRegistryHolder().key().location().toString();
        if (PROTECTED_ORES.contains(name))
            return true;
        else {
            boolean contains = false;

            return contains;
        }
    }

    //Registers the list of protected blocks from the config
    @SuppressWarnings("unchecked")
    public static void initProtectedBlocks()
    {
        List<String> protOres = (List<String>) BasicNetherOresConfig.common().protectedBlocks();
        PROTECTED_ORES = new ArrayList<String>();

        for (int i = 0; i < protOres.size(); i++)
        {
            PROTECTED_ORES.add(protOres.get(i));
        }
    }
}
