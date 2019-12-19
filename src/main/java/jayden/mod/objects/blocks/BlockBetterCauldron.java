package jayden.mod.objects.blocks;

import java.util.List;

import javax.annotation.Nullable;

import com.google.common.collect.Lists;

import jayden.mod.Main;
import jayden.mod.init.BlockInit;
import jayden.mod.init.ItemInit;
import jayden.mod.util.IHasModel;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

  
public class BlockBetterCauldron extends BlockHorizontal implements IHasModel
{

	private static final AxisAlignedBB LOG_1 = new AxisAlignedBB(0, 0, 0.406, 1, 0.188, 0.594);
	private static final AxisAlignedBB LOG_4 = new AxisAlignedBB(0.406, 0, 0, 0.594, 0.188, 1);
	private static final AxisAlignedBB POT_BASE = new AxisAlignedBB(0.125, 0.188, 0.125, 0.875, 0.25, 0.875);
	private static final AxisAlignedBB POT_SIDE_EAST = new AxisAlignedBB(0.812, 0.25, 0.125, 0.875, 0.875, 0.875);
	private static final AxisAlignedBB POT_SIDE_WEST = new AxisAlignedBB(0.125, 0.25, 0.125, 0.188, 0.875, 0.875);
	private static final AxisAlignedBB POT_SIDE_SOUTH = new AxisAlignedBB(0.188, 0.25, 0.812, 0.812, 0.875, 0.875);
	private static final AxisAlignedBB POT_SIDE_NORTH = new AxisAlignedBB(0.188, 0.25, 0.125, 0.812, 0.875, 0.188);
	
	private static final List<AxisAlignedBB> COLLISION_BOXES = Lists.newArrayList(LOG_1, LOG_4, POT_BASE, POT_SIDE_EAST, POT_SIDE_WEST, POT_SIDE_SOUTH, POT_SIDE_NORTH);
	private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0, 0, 0, 1, 0.875, 1);
		
		public static final PropertyDirection FACING = BlockHorizontal.FACING;
	
	public BlockBetterCauldron(String name)
	{
		super(Material.IRON);
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setHarvestLevel("pickaxe", 2);
		setResistance(30.0F);
		setUnlocalizedName(name);
		setRegistryName(name);
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));

		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
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
	
	@Override
	protected net.minecraft.block.state.BlockStateContainer createBlockState() {
		return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{FACING});
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(FACING, EnumFacing.getFront(meta));
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return ((EnumFacing) state.getValue(FACING)).getIndex();
	}




	@Override
	public void registerModels() {
    Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

	

	
}
