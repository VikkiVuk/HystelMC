package jayden.mod.objects.blocks;

import java.util.List;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockSantaHat extends BlockBase 
{
	private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0.1875D, 0, 0.1875D, 0.8125D, 0.8125D, 0.8125D);
	private static final AxisAlignedBB COLLISION_BOX = new AxisAlignedBB(0.1875D * 1, 0, 0.1875D, 0.8125D, 0.08125D, 0.8125D);

	
	public BlockSantaHat(String name) 
	{
		super(name, Material.CLOTH);
		setSoundType(SoundType.CLOTH);
		setHardness(1.5F);
		setHarvestLevel("axe", 1);
		setResistance(1.5F);
	}
	
	@Override
	public boolean isFullBlock(IBlockState state) 
	{
		return false;
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) 
	{
		return false;
	}
	
	@Override
	public BlockRenderLayer getBlockLayer()
	{
		return BlockRenderLayer.SOLID;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) 
	{
		return BOUNDING_BOX;
	}

	@Override
	public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, Entity entityIn, boolean isActualState) 
	{
		super.addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX);
	}
}
