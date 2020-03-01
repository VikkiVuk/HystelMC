package jayden.mod.world.gen;

import java.util.Random;

import jayden.mod.init.BlockInit;
import jayden.mod.objects.blocks.ores.BlockOres;
import jayden.mod.util.handlers.ConfigHandler;
import jayden.mod.util.handlers.EnumHandler;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenCustomOres implements IWorldGenerator {

	private WorldGenerator ore_overworld_bluestone_ore;
	private WorldGenerator ore_overworld_ruby_ore;
	private WorldGenerator ore_overworld_copper_ore;
	private WorldGenerator ore_overworld_rainbow_ore;
	
	public WorldGenCustomOres() {
		ore_overworld_bluestone_ore = new WorldGenMinable(BlockInit.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.BLUESTONE), 5);
		ore_overworld_ruby_ore = new WorldGenMinable(BlockInit.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.RUBY), 5);
		ore_overworld_copper_ore = new WorldGenMinable(BlockInit.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.COPPER), 5);
		ore_overworld_rainbow_ore = new WorldGenMinable(BlockInit.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.RAINBOW), 5);

	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		if(ConfigHandler.doOreGeneration)
		{
		switch(world.provider.getDimension())	
		{
		case 0:
		
		runGenerator(ore_overworld_bluestone_ore, world, random, chunkX, chunkZ, 41, 0, 87);
		runGenerator(ore_overworld_ruby_ore, world, random, chunkX, chunkZ, 41, 0, 87);
		runGenerator(ore_overworld_copper_ore, world, random, chunkX, chunkZ, 41, 0, 87);
		runGenerator(ore_overworld_rainbow_ore, world, random, chunkX, chunkZ, 41, 0, 87);
		
		break;
		
		}
		}
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight)
	{
		if(ConfigHandler.doOreGeneration)
		{	
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore generated out of bounds");
		
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

}
