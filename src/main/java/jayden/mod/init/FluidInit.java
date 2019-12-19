package jayden.mod.init;

import java.util.ArrayList;
import java.util.List;

import jayden.mod.fluids.FluidLiquid;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class FluidInit 
{
	public static final List<Fluid> FLUIDS = new ArrayList<Fluid>();
	
	public static final Fluid CHOCOLATE_MILK_FLUID = new FluidLiquid("chocolate_milk", new ResourceLocation("hrm:blocks/chocolate_milk_still"), new ResourceLocation("hrm:blocks/chocolate_milk_flow"));
	
	public static void registerFluids()
	{
		registerFluid(CHOCOLATE_MILK_FLUID);
	}
	
	public static void registerFluid(Fluid fluid)
	{
		FluidRegistry.registerFluid(fluid);
		FluidRegistry.addBucketForFluid(fluid);
	}
}
