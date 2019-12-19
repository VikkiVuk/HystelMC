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
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockHystelSomething extends BlockHorizontal implements IHasModel
{

	private static final AxisAlignedBB BASE = new AxisAlignedBB(0, 0, 0, 1, 1, 1);
	private static final AxisAlignedBB SIDE1 = new AxisAlignedBB(0, 1, 0.938, 1, 1.188, 1);
	private static final AxisAlignedBB BOOK = new AxisAlignedBB(0.562, 1, 0.5, 0.812, 1.188, 0.875);
	private static final AxisAlignedBB CAKE = new AxisAlignedBB(0.312, 1, 0.188, 0.375, 1.062, 0.562);
	private static final AxisAlignedBB NORTHHSIDE1 = new AxisAlignedBB(0.75, 0.188, -0.062, 0.812, 0.875, 0);
	private static final AxisAlignedBB NORTHHSIDE2 = new AxisAlignedBB(0.188, 0.188, -0.062, 0.25, 0.875, 0);
	private static final AxisAlignedBB NORTHHMIDDLE = new AxisAlignedBB(0.25, 0.5, -0.062, 0.75, 0.562, 0);
	private static final AxisAlignedBB BLACK_CONCRETE = new AxisAlignedBB(0.812, 1, 0.062, 0.938, 1.125, 0.375);
	private static final AxisAlignedBB BEDROCK = new AxisAlignedBB(0.062, 1, 0.5, 0.188, 1.125, 0.812);
	private static final AxisAlignedBB IDK = new AxisAlignedBB(0.062, 1, 0.062, 0.688, 1.062, 0.125);
	
	private static final List<AxisAlignedBB> COLLISION_BOXES = Lists.newArrayList(BASE, SIDE1, BOOK, CAKE, NORTHHSIDE1, NORTHHSIDE2, NORTHHMIDDLE, BLACK_CONCRETE, BEDROCK, IDK);
	private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0, 0, -0.062, 1, 1.188, 1);
	
	public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
	
	public BlockHystelSomething(String name) 
	{
		super(Material.GROUND);
		setSoundType(SoundType.GROUND);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.hysteltab);
		setHardness(0.5F);
		setHarvestLevel("pickaxe", 1);
		setResistance(30.0F);
		setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));

		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
	}
	
	@Override
	public boolean isFullCube(IBlockState state) 
	{
		return false;
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) 
	{
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
	public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY,
			float hitZ, int meta, EntityLivingBase placer, EnumHand hand) {
		return super.getStateForPlacement(world, pos, facing, hitX, hitY, hitZ, meta, placer, hand).withProperty(FACING, placer.getHorizontalFacing());
	}
	

	@Override
	protected BlockStateContainer createBlockState() {
    return new BlockStateContainer(this, new IProperty[] { FACING });
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
    return getDefaultState().withProperty(FACING, meta == 0 ? EnumFacing.WEST : EnumFacing.EAST);
	}

	@Override
	public int getMetaFromState(IBlockState state) {
    EnumFacing facing = (EnumFacing) state.getValue(FACING);
    return facing.getHorizontalIndex();
	}



	@Override
	public void registerModels() {
    Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}


}
