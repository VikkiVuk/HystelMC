package jayden.mod.init;

import jayden.mod.fluids.FluidChocolateMilk;
import jayden.mod.objects.blocks.fluids.FluidMoltenBluestone;
import jayden.mod.objects.blocks.fluids.FluidMoltenCopper;
import jayden.mod.objects.blocks.fluids.FluidMoltenRuby;
import jayden.mod.objects.blocks.fluids.FluidWhiteWater;
import jayden.mod.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class FluidInit 
{
	
	public static final Fluid CHOCOLATE_MILK_FLUID = new FluidChocolateMilk("chocolate_milk", new ResourceLocation("hrm:blocks/chocolate_milk_still"), new ResourceLocation("hrm:blocks/chocolate_milk_flow"));
	public static final Fluid WHITE_WATER_FLUID = new FluidWhiteWater("white_water", new ResourceLocation(Reference.MOD_ID + ":blocks/white_water_still"), new ResourceLocation(Reference.MOD_ID + ":blocks/white_water_flow"), new ResourceLocation(Reference.MOD_ID + ":blocks/white_water_overlay"));
	public static final Fluid MOLTEN_COPPER_FLUID = new FluidMoltenCopper("molten_copper", new ResourceLocation(Reference.MOD_ID + ":blocks/molten_copper_still"), new ResourceLocation(Reference.MOD_ID + ":blocks/molten_copper_flow"), new ResourceLocation(Reference.MOD_ID + ":blocks/molten_copper_overlay"));
	public static final Fluid MOLTEN_BLUESTONE_FLUID = new FluidMoltenBluestone("molten_bluestone", new ResourceLocation(Reference.MOD_ID + ":blocks/molten_bluestone_still"), new ResourceLocation(Reference.MOD_ID + ":blocks/molten_bluestone_flow"), new ResourceLocation(Reference.MOD_ID + ":blocks/molten_bluestone_overlay"));
	public static final Fluid MOLTEN_RUBY_FLUID = new FluidMoltenRuby("molten_ruby", new ResourceLocation(Reference.MOD_ID + ":blocks/molten_ruby_still"), new ResourceLocation(Reference.MOD_ID + ":blocks/molten_ruby_flow"), new ResourceLocation(Reference.MOD_ID + ":blocks/molten_ruby_overlay"));

	public static void registerFluids()
	{
		registerFluid(CHOCOLATE_MILK_FLUID);
		registerFluid(WHITE_WATER_FLUID);
		registerFluid(MOLTEN_COPPER_FLUID);
		registerFluid(MOLTEN_BLUESTONE_FLUID);
		registerFluid(MOLTEN_RUBY_FLUID);
	}
	
	public static void registerFluid(Fluid fluid)
	{
		FluidRegistry.registerFluid(fluid);
		FluidRegistry.addBucketForFluid(fluid);
	}
}
