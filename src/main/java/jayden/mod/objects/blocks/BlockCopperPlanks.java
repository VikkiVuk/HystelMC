package jayden.mod.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockCopperPlanks extends BlockBase 
{
	public BlockCopperPlanks(String name) 
	{
		super(name, Material.WOOD);
		setSoundType(SoundType.WOOD);
		setHardness(2.1F);
		setHarvestLevel("pickaxe", 1);
		setResistance(15.4F);
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
