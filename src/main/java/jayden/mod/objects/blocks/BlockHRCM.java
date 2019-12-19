package jayden.mod.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockHRCM extends BlockBase {

	public BlockHRCM(String name) {
		super(name, Material.GROUND);
		setSoundType(SoundType.GROUND);
		setHardness(2.5F);
		setHarvestLevel("pickaxe", 1);
		setResistance(20.0F);
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
