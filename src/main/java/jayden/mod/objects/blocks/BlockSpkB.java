package jayden.mod.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockSpkB extends BlockBase {

	public BlockSpkB(String name, Material material) {
		super(name, material);
		setHardness(2.0F);
		setHarvestLevel("pickaxe", 1);
		setResistance(24.0F);
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
