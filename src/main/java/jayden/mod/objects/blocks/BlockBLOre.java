package jayden.mod.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockBLOre extends BlockBase {

	public BlockBLOre(String name) {
		super(name, Material.ROCK);
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setHarvestLevel("pickaxe", 2);
		setResistance(30.9F);
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
