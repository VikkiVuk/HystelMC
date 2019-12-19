package jayden.mod.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockRainbowPlanks extends BlockBase
{
	public BlockRainbowPlanks(String name) 
	{
		super(name, Material.WOOD);
		setSoundType(SoundType.WOOD);
		setHardness(2.5F);
		setHarvestLevel("pickaxe", 1);
		setResistance(17.0F);
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
