package jayden.mod.objects.tools;

import jayden.mod.HystelMC;
import jayden.mod.init.ItemInit;
import jayden.mod.util.IHasModel;
import net.minecraft.item.ItemHoe;

public class ToolHoe extends ItemHoe implements IHasModel {

	public ToolHoe(String name, ToolMaterial material) {
		super(material);
		 setUnlocalizedName(name);
		  setRegistryName(name);
		  setCreativeTab(HystelMC.hysteltab);
		  
		  ItemInit.ITEMS.add(this);
		
	}
	   @Override
       public void registerModels() {
	   
        	 HystelMC.proxy.registerItemRenderer(this, 0, "inventory");
        	 
}

}
