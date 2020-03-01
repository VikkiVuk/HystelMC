package jayden.mod.objects.blocks;

import java.util.List;

import javax.annotation.Nullable;

import com.google.common.collect.Lists;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockCustomGlassyMobble extends BlockBase
{
	private static final AxisAlignedBB CUBE1 = new AxisAlignedBB(0, 0, 0, 1, 0.062, 1);
	private static final AxisAlignedBB CUBE2 = new AxisAlignedBB(0.062, 0.062, 0.438, 0.125, 0.188, 0.562);
	private static final AxisAlignedBB CUBE3 = new AxisAlignedBB(0.875, 0.062, 0.438, 0.938, 0.188, 0.562);
	private static final AxisAlignedBB CUBE4 = new AxisAlignedBB(0.875, 0.062, 0.062, 0.938, 0.188, 0.188);
	private static final AxisAlignedBB CUBE5 = new AxisAlignedBB(0.875, 0.062, 0.812, 0.938, 0.188, 0.938);
	private static final AxisAlignedBB CUBE6 = new AxisAlignedBB(0.062, 0.062, 0.812, 0.125, 0.188, 0.938);
	private static final AxisAlignedBB CUBE7 = new AxisAlignedBB(0.062, 0.062, 0.062, 0.125, 0.188, 0.188);
	private static final AxisAlignedBB CUBE8 = new AxisAlignedBB(0, 0.188, 0, 1, 0.312, 1.062);
	private static final AxisAlignedBB CUBE9 = new AxisAlignedBB(0.062, 0.312, 0.062, 0.938, 0.438, 1);
	private static final AxisAlignedBB CUBE10 = new AxisAlignedBB(0, 0.5, 0, 0.062, 0.562, 1.062);
	private static final AxisAlignedBB CUBE11 = new AxisAlignedBB(0.062, 0.438, 0, 0.125, 0.5, 1.062);
	private static final AxisAlignedBB CUBE12 = new AxisAlignedBB(0.875, 0.438, 0, 0.938, 0.5, 1.062);
	private static final AxisAlignedBB CUBE13 = new AxisAlignedBB(0.938, 0.5, 0, 1, 0.562, 1.062);
	private static final AxisAlignedBB CUBE14 = new AxisAlignedBB(0.125, 0.438, 1, 0.875, 0.5, 1.062);
	private static final AxisAlignedBB CUBE15 = new AxisAlignedBB(0.125, 0.5, 1.062, 0.875, 0.562, 1.125);
	private static final AxisAlignedBB CUBE16 = new AxisAlignedBB(0.125, 0.438, 0, 0.875, 0.5, 0.062);
	private static final AxisAlignedBB CUBE17 = new AxisAlignedBB(0.125, 0.5, -0.062, 0.875, 0.562, 0);
	private static final AxisAlignedBB CUBE18 = new AxisAlignedBB(0.312, 0.438, 0.312, 0.688, 0.812, 0.75);
	
	private static final List<AxisAlignedBB> COLLISION_BOXES = Lists.newArrayList(CUBE1, CUBE2, CUBE3, CUBE4, CUBE5, CUBE6, CUBE7, CUBE8, CUBE9, CUBE10, CUBE11, CUBE12, CUBE13, CUBE14, CUBE15, CUBE16, CUBE17, CUBE18);
	private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0, 0, -0.062, 1, 0.812, 1.125);
	
	public BlockCustomGlassyMobble(String name)
	{
		super(name, Material.WOOD);
		setSoundType(SoundType.WOOD);
		setHardness(5.1F);
		setHarvestLevel("pickaxe", 2);
		setResistance(3.0F);
		
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;			
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	
	@Override
	public BlockRenderLayer getBlockLayer()
	{
		return BlockRenderLayer.TRANSLUCENT;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	{
	    return BOUNDING_BOX;
	}

	@Override
	public void addCollisionBoxToList(IBlockState state, World world, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entity, boolean isActualState)
	{
	    entityBox = entityBox.offset(-pos.getX(), -pos.getY(), -pos.getZ());
	    for (AxisAlignedBB box : COLLISION_BOXES)
	    {
	        if (entityBox.intersects(box))
	            collidingBoxes.add(box.offset(pos));  
	    }
	}

	@Override
	@Nullable
	public RayTraceResult collisionRayTrace(IBlockState state, World world, BlockPos pos, Vec3d start, Vec3d end)
	{
	    double distanceSq;
	    double distanceSqShortest = Double.POSITIVE_INFINITY;
	    RayTraceResult resultClosest = null;
	    RayTraceResult result;
	    start = start.subtract(pos.getX(), pos.getY(), pos.getZ());
	    end = end.subtract(pos.getX(), pos.getY(), pos.getZ());
	    for (AxisAlignedBB box : COLLISION_BOXES)
	    {
	        result = box.calculateIntercept(start, end);
	        if (result == null)
	            continue;

	        distanceSq = result.hitVec.squareDistanceTo(start);
	        if (distanceSq < distanceSqShortest)
	        {
	            distanceSqShortest = distanceSq;
	            resultClosest = result;
	        }
	    }
	    return resultClosest == null ? null : new RayTraceResult(RayTraceResult.Type.BLOCK, resultClosest.hitVec.addVector(pos.getX(), pos.getY(), pos.getZ()), resultClosest.sideHit, pos);
	}
	

	
}
