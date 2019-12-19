package jayden.mod.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockRuby extends BlockBase {

	public BlockRuby(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5.2F);
		setHarvestLevel("pickaxe", 2);
		setResistance(30.0F);
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
