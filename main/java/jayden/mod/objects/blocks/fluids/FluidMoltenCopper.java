package jayden.mod.objects.blocks.fluids;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

public class FluidMoltenCopper extends Fluid
{
	public FluidMoltenCopper(String name, ResourceLocation still, ResourceLocation flow, ResourceLocation overlay) 
	{
		super(name, still, flow, overlay);
		this.setUnlocalizedName(name);
	}
}
