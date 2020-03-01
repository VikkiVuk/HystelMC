package jayden.mod.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockCustomBlock extends BlockBase {


	public BlockCustomBlock(String name)
	{
		super(name, Material.WOOD);
		setSoundType(SoundType.WOOD);
		setHardness(2.0F);
		setHarvestLevel("axe", 1);
		setResistance(15.0F);
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;			
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}

	
 
}
