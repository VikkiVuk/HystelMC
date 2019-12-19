package jayden.mod.objects.blocks;

import java.util.List;

import javax.annotation.Nullable;

import com.google.common.collect.Lists;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockTokenAtm extends BlockBase {
	
	private static final AxisAlignedBB BACK = new AxisAlignedBB(0, 0, -1, 1, 1.5, -0.875);
	private static final AxisAlignedBB LEFT_SIDE = new AxisAlignedBB(0, 0, -0.875, 0.062, 1.5, 1.125);
	private static final AxisAlignedBB RIGHT_SIDE = new AxisAlignedBB(0.938, 0, -0.875, 1, 1.5, 1.125);
	private static final AxisAlignedBB BOTTOM = new AxisAlignedBB(0.062, 0, -0.875, 0.938, 0.062, 1.125);
	private static final AxisAlignedBB TOP = new AxisAlignedBB(0.062, 1.438, -0.875, 0.938, 1.5, 1.125);
	private static final AxisAlignedBB FRONT_BOTTOM = new AxisAlignedBB(0.062, 0.062, 1.062, 0.938, 0.438, 1.125);
	private static final AxisAlignedBB FRONT_LEFT_SIDE = new AxisAlignedBB(0.062, 0.438, 1.062, 0.188, 1.438, 1.125);
	private static final AxisAlignedBB FRONT_RIGHT_SIDE = new AxisAlignedBB(0.812, 0.438, 1.062, 0.938, 1.438, 1.125);
	private static final AxisAlignedBB FRONT_TOP = new AxisAlignedBB(0.188, 1.375, 1.062, 0.812, 1.438, 1.125);
	private static final AxisAlignedBB FRONT_HOLE_FOR_TOKEN_LEFT = new AxisAlignedBB(0.312, 0.438, 1.062, 0.375, 0.688, 1.125);
	private static final AxisAlignedBB FRONT_HOLE_FOR_TOKEN_RIGH = new AxisAlignedBB(0.625, 0.438, 1.062, 0.688, 0.688, 1.125);
	private static final AxisAlignedBB FRONT_HOLE_FOR_TOKEN_TOP = new AxisAlignedBB(0.375, 0.625, 1.062, 0.625, 0.688, 1.125);
	private static final AxisAlignedBB SCREEN = new AxisAlignedBB(0.25, 1, 1.125, 0.75, 1.25, 1.188);
	private static final AxisAlignedBB BACKGROUND_FRONT_LEFT = new AxisAlignedBB(0.188, 0.438, 1.062, 0.312, 1.375, 1.125);
	private static final AxisAlignedBB BACKGROUND_FRONT_RIGHT = new AxisAlignedBB(0.688, 0.438, 1.062, 0.812, 1.375, 1.125);
	private static final AxisAlignedBB BACKGROUND_FRONT_EVERY = new AxisAlignedBB(0.312, 0.688, 1.062, 0.688, 1.375, 1.125);
	private static final AxisAlignedBB EVERYTHIUNGINSIDE = new AxisAlignedBB(0.062, 0.062, -0.375, 0.938, 1.438, 1.062);
	
	private static final List<AxisAlignedBB> COLLISION_BOXES = Lists.newArrayList(BACK, LEFT_SIDE, RIGHT_SIDE, BOTTOM, TOP, FRONT_BOTTOM, FRONT_LEFT_SIDE, FRONT_RIGHT_SIDE, FRONT_TOP, FRONT_HOLE_FOR_TOKEN_LEFT, FRONT_HOLE_FOR_TOKEN_RIGH, FRONT_HOLE_FOR_TOKEN_TOP, SCREEN, BACKGROUND_FRONT_LEFT, BACKGROUND_FRONT_RIGHT, BACKGROUND_FRONT_EVERY, EVERYTHIUNGINSIDE);
	private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0, 0, -1, 1, 1.5, 1.188);

	
	public BlockTokenAtm(String name)
	{
		super(name, Material.IRON);
		setSoundType(SoundType.METAL);
		setHardness(5.5F);
		setHarvestLevel("pickaxe", 2);
		setResistance(30.0F);

	
		
		
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