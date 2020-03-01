package jayden.mod.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockBluestone extends BlockBase {

	public BlockBluestone(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5.3F);
		setHarvestLevel("pickaxe", 2);
		setResistance(30F);
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
