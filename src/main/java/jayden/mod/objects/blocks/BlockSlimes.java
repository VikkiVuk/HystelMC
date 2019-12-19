package jayden.mod.objects.blocks;

import jayden.mod.Main;
import jayden.mod.init.BlockInit;
import jayden.mod.init.ItemInit;
import jayden.mod.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;

public class BlockSlimes extends BlockBase
{

	public BlockSlimes(String name) {
		super(name, Material.CLAY);
		this.setSoundType(SoundType.SLIME);
		
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
   