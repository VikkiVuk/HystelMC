package jayden.mod.objects.blocks;

import java.util.List;

import javax.annotation.Nullable;

import com.google.common.collect.Lists;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockSpkB extends BlockBase {
	
	private static final AxisAlignedBB CUBE1 = new AxisAlignedBB(0.25, 0, 0.438, 0.688, 1, 0.688);
	private static final AxisAlignedBB CUBE2 = new AxisAlignedBB(0.25, 0, 0.375, 0.688, 0.812, 0.438);
	
	private static final List<AxisAlignedBB> COLLISION_BOXES = Lists.newArrayList(CUBE1, CUBE2);
	private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0.25, 0, 0.375, 0.688, 1, 0.688);	
	
	public BlockSpkB(String name, Material material) {
		super(name, material);
		setHardness(2.0F);
		setHarvestLevel("pickaxe", 1);
		setResistance(10.1F);
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
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
