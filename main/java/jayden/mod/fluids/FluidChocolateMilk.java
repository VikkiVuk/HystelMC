package jayden.mod.fluids;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

public class FluidChocolateMilk extends Fluid 
{
	public FluidChocolateMilk(String name, ResourceLocation still, ResourceLocation flow) 
	{
		super(name, still, flow);
		setUnlocalizedName(name);
	}
}
