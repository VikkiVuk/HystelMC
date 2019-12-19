package jayden.mod.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockCOOre extends BlockBase {

	
	public BlockCOOre(String name) {
		super(name, Material.ROCK);
		setSoundType(SoundType.STONE);
		setHardness(2.8F);
		setHarvestLevel("pickaxe", 2);
		setResistance(30.3F);
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
