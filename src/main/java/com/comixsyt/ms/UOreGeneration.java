package com.comixsyt.ms;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class UOreGeneration implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
			IChunkProvider chunkProvider) {

		switch (world.provider.dimensionId) {
		case -1:
			generateEnd(world, random, chunkX, chunkZ);
			break;
		case 0:
			generateOverworld(world, random, chunkX, chunkZ);
			break;
		case 1:
			generateNether(world, random, chunkX, chunkZ);
			break;

		}

	}

	public void generateNether(World world, Random rand, int x, int z) {
		// -1

	}

	public void generateOverworld(World world, Random rand, int x, int z) {
		// 0

		//generateOre(ORE_BLOCK, world, rand, x, z, MIN_VIEN, MAX_VIEN, CHANCE, MIN_HEIGHT, MAX_HEIGHT, BLOCK_IN);
		generateOre(ms.UltimatiumOre, world, rand, x, z, 1, 4, 50, 1, 20, Blocks.stone);
		generateOre(ms.RubyOre, world, rand, x, z, 1, 8, 3, 1, 30, Blocks.stone);
		generateOre(ms.Graphite_block, world, rand, x, z, 3, 20, 10, 3, 150, Blocks.stone);
	}

	public void generateEnd(World world, Random rand, int x, int z) {
		// 1

	}

	public void generateOre(Block block, World world, Random random, int chunkX, int chunkZ, int minVienSize,
			int maxVienSize, int chance, int minY, int maxY, Block generateIn) {

		int vienSize = minVienSize + random.nextInt(maxVienSize - minVienSize);
		int heightRange = maxY - minY;
		WorldGenMinable gen = new WorldGenMinable(block, vienSize, generateIn);
		for (int i = 0; i < chance; i++) {

			int xRand = chunkX * random.nextInt(16);
			int yRand = random.nextInt(heightRange) + minY;
			int zRand = chunkZ * random.nextInt(16);
			gen.generate(world, random, xRand, yRand, zRand);

		}

	}

}
