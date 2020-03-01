package jayden.mod.objects.blocks;

import java.util.List;

import javax.annotation.Nullable;

import com.google.common.collect.Lists;

import jayden.mod.HystelMC;
import jayden.mod.init.BlockInit;
import jayden.mod.init.ItemInit;
import jayden.mod.util.IHasModel;
import net.minecraft.block.BlockHorizontal;
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

public class BlockModernChair extends BlockHorizontal implements IHasModel {

	private static final AxisAlignedBB ELEMENT1 = new AxisAlignedBB(0.125, 0, 0.125, 0.219, 0.5, 0.219);
	private static final AxisAlignedBB ELEMENT2 = new AxisAlignedBB(0.219, 0, 0.781, 0.781, 0.094, 0.875);
	private static final AxisAlignedBB ELEMENT3 = new AxisAlignedBB(0.219, 0, 0.125, 0.781, 0.094, 0.219);
	private static final AxisAlignedBB ELEMENT4 = new AxisAlignedBB(0.125, 0, 0.781, 0.219, 0.5, 0.875);
	private static final AxisAlignedBB BACK_REST_1 = new AxisAlignedBB(0.719, 0.594, 0.131, 0.812, 1.156, 0.869);
	private static final AxisAlignedBB ELEMENT = new AxisAlignedBB(0.188, 0.5, 0.131, 0.812, 0.594, 0.869);
	private static final AxisAlignedBB BACK_REST_2 = new AxisAlignedBB(0.719, 1.156, 0.194, 0.812, 1.219, 0.806);
	private static final AxisAlignedBB CUBE1 = new AxisAlignedBB(0.219, 0.406, 0.125, 0.719, 0.5, 0.219);
	private static final AxisAlignedBB CUBE2 = new AxisAlignedBB(0.219, 0.406, 0.781, 0.719, 0.5, 0.875);
	private static final AxisAlignedBB CUBE3 = new AxisAlignedBB(0.719, 0.406, 0.125, 0.812, 0.5, 0.875);
	private static final AxisAlignedBB CUBE4 = new AxisAlignedBB(0.125, 0.438, 0.219, 0.219, 0.5, 0.781);
	private static final AxisAlignedBB CUBE5 = new AxisAlignedBB(0.781, 0, 0.125, 0.875, 0.094, 0.875);
	private static final AxisAlignedBB CUBE = new AxisAlignedBB(0.125, 0.5, 0.131, 0.188, 0.531, 0.869);
	
	private static final List<AxisAlignedBB> COLLISION_BOX = Lists.newArrayList(ELEMENT1, ELEMENT2, ELEMENT3, ELEMENT4, BACK_REST_1, ELEMENT, BACK_REST_2, CUBE1, CUBE2, CUBE3, CUBE4, CUBE5, CUBE);
	private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0.125, 0, 0.125, 0.875, 1.219, 0.875);
	
	public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
	
	public BlockModernChair(String name) 
	{
		super(Material.GROUND);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(HystelMC.hysteltab);
		setHardness(2.8F);
		setHarvestLevel("pickaxe", 1);
		setResistance(0.9F);
		setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));

		
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
    HystelMC.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}


}
