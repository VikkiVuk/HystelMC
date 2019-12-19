package jayden.mod.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockRBOre extends BlockBase 
{
	public BlockRBOre(String name) {
		super(name, Material.ROCK);
		setSoundType(SoundType.STONE);
		setHardness(2.9F);
		setHarvestLevel("pickaxe", 2);
		setResistance(30.5F);
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
}
