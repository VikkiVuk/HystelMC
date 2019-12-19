package jayden.mod.objects.blocks;

import java.util.List;

import javax.annotation.Nullable;

import com.google.common.collect.Lists;

import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockChairsy extends BlockBase 
{
	
	
	private static final AxisAlignedBB RIGHT_ARM_TOP = new AxisAlignedBB(0, 0.625, 0, 0.125, 0.75, 1);
	private static final AxisAlignedBB RIGHT_ARM_BOTTOM = new AxisAlignedBB(0, 0, 0, 0.125, 0.125, 1);
	private static final AxisAlignedBB LEFT_ARM_TOP = new AxisAlignedBB(0.875, 0.625, 0, 1, 0.75, 1);
	private static final AxisAlignedBB RIGHT_ARM_FRONT = new AxisAlignedBB(0, 0.125, 0.875, 0.125, 0.625, 1);
	private static final AxisAlignedBB RIGHT_ARM_BACK = new AxisAlignedBB(0, 0.125, 0, 0.125, 0.625, 0.125);
	private static final AxisAlignedBB LEFT_ARM_BACK = new AxisAlignedBB(0.875, 0.125, 0, 1, 0.625, 0.125);
	private static final AxisAlignedBB LEFT_ARM_FRONT = new AxisAlignedBB(0.875, 0.125, 0.875, 1, 0.625, 1);
	private static final AxisAlignedBB CHAIR_BASE = new AxisAlignedBB(0.125, 0, 0, 0.875, 0.438, 1);
	private static final AxisAlignedBB CHAIR_BACKREST = new AxisAlignedBB(0.125, 0.438, 0, 0.875, 1, 0.312);
	private static final AxisAlignedBB LEFT_ARM_BOTTOM = new AxisAlignedBB(0.875, 0, 0, 1, 0.125, 1);
	
	private static final List<AxisAlignedBB> COLLISION_BOX = Lists.newArrayList(RIGHT_ARM_TOP, RIGHT_ARM_BOTTOM, LEFT_ARM_TOP, RIGHT_ARM_FRONT, RIGHT_ARM_BACK, LEFT_ARM_BACK, LEFT_ARM_FRONT, CHAIR_BASE, CHAIR_BACKREST, LEFT_ARM_BOTTOM);
	private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0, 0, 0, 1, 1, 1);
	
	
	public BlockChairsy(String name)
	{
		super(name, Material.WOOD);
		setSoundType(SoundType.CLOTH);
		setHardness(2.9F);
		setHarvestLevel("axe", 1);
		setResistance(15.7F);
		
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
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	{
	    return BOUNDING_BOX;
	}

	@Override
	public void addCollisionBoxToList(IBlockState state, World world, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entity, boolean isActualState)
	{
	    entityBox = entityBox.offset(-pos.getX(), -pos.getY(), -pos.getZ());
	    for (AxisAlignedBB box : COLLISION_BOX)
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
	    for (AxisAlignedBB box : COLLISION_BOX)
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
