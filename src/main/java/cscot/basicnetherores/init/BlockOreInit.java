package cscot.basicnetherores.init;

import java.util.ArrayList;
import java.util.List;

import cscot.basicnetherores.objects.blocks.BlockOreBase;
import net.minecraft.block.Block;

public class BlockOreInit {

	public static final List<Block> BLOCKORES = new ArrayList<Block>();
	
	public static final Block ORE_NETHEREMERALD = new BlockOreBase("ore_netheremerald", "Emerald");
	public static final Block ORE_NETHERDIAMOND = new BlockOreBase("ore_netherdiamond", "Diamond");
	public static final Block ORE_NETHERREDSTONE = new BlockOreBase("ore_netherredstone", "Redstone");
	public static final Block ORE_NETHERLAPIS = new BlockOreBase("ore_netherlapis", "Lapis");
	public static final Block ORE_NETHERCOAL = new BlockOreBase("ore_nethercoal", "Coal");
	public static final Block ORE_NETHERGOLD = new BlockOreBase("ore_nethergold", "Gold");
	public static final Block ORE_NETHERIRON = new BlockOreBase("ore_netheriron", "Iron");
	public static final Block ORE_NETHERCOPPER = new BlockOreBase("ore_nethercopper", "Copper");
	public static final Block ORE_NETHERTIN = new BlockOreBase("ore_nethertin", "Tin");
}
