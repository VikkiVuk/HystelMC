package jayden.mod.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockCusBob extends BlockBase {

	public BlockCusBob(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.CLOTH);
		setHardness(1.5F);
		setHarvestLevel("pickaxe", 1);
		setResistance(22.0F);
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
