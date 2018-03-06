package cscot.basicnetherores.world.gen;

import java.util.Random;

import cscot.basicnetherores.init.BlockOreInit;

import net.minecraft.block.Block;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenCustomOres implements IWorldGenerator
{
	private WorldGenerator ore_netheremerald;
	private WorldGenerator ore_netherdiamond;
	private WorldGenerator ore_netherredstone;
	private WorldGenerator ore_netherlapis;
	private WorldGenerator ore_nethercoal;
	private WorldGenerator ore_nethergold;
	private WorldGenerator ore_netheriron;
	private WorldGenerator ore_nethercopper;
	private WorldGenerator ore_nethertin;
	
	public WorldGenCustomOres() 
	{
		//Block that will spawn, size of the ore vein, block that the ore will spawn in
		ore_netheremerald = new WorldGenMinable(BlockOreInit.ORE_NETHEREMERALD.getDefaultState(), 3, BlockMatcher.forBlock(Blocks.NETHERRACK));
		ore_netherdiamond = new WorldGenMinable(BlockOreInit.ORE_NETHERDIAMOND.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.NETHERRACK));
		ore_netherredstone = new WorldGenMinable(BlockOreInit.ORE_NETHERREDSTONE.getDefaultState(), 6, BlockMatcher.forBlock(Blocks.NETHERRACK));
		ore_netherlapis = new WorldGenMinable(BlockOreInit.ORE_NETHERLAPIS.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.NETHERRACK));
		ore_nethercoal = new WorldGenMinable(BlockOreInit.ORE_NETHERCOAL.getDefaultState(), 10, BlockMatcher.forBlock(Blocks.NETHERRACK));
		ore_nethergold = new WorldGenMinable(BlockOreInit.ORE_NETHERGOLD.getDefaultState(), 6, BlockMatcher.forBlock(Blocks.NETHERRACK));
		ore_netheriron = new WorldGenMinable(BlockOreInit.ORE_NETHERIRON.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.NETHERRACK));
		ore_nethercopper = new WorldGenMinable(BlockOreInit.ORE_NETHERCOPPER.getDefaultState(), 6, BlockMatcher.forBlock(Blocks.NETHERRACK));
		ore_nethertin = new WorldGenMinable(BlockOreInit.ORE_NETHERTIN.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.NETHERRACK));
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
		case -1: 
			//Int represent the 
			runGenerator(ore_netheremerald, world, random, chunkX, chunkZ, 15, 0, 125);
			runGenerator(ore_netherdiamond, world, random, chunkX, chunkZ, 20, 0, 125);
			runGenerator(ore_netherredstone, world, random, chunkX, chunkZ, 30, 0, 125);
			runGenerator(ore_netherlapis, world, random, chunkX, chunkZ, 25, 0, 125);
			runGenerator(ore_nethercoal, world, random, chunkX, chunkZ, 50, 0, 125);
			runGenerator(ore_nethergold, world, random, chunkX, chunkZ, 30, 0, 125);
			runGenerator(ore_netheriron, world, random, chunkX, chunkZ, 50, 0, 125);
			runGenerator(ore_nethercopper, world, random, chunkX, chunkZ, 35, 0, 125);
			runGenerator(ore_nethertin, world, random, chunkX, chunkZ, 30, 0, 125);

		}
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight)
	{
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore Generated below or above the min and max height");
		
		int heightDiff = maxHeight - minHeight + 1;
		for(int i = 0; i < chance; i++)
		{
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x,y,z));
		}
	}
}
