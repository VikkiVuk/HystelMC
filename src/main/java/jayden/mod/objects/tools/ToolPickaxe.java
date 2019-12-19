package jayden.mod.objects.tools;

import jayden.mod.Main;
import jayden.mod.init.ItemInit;
import jayden.mod.util.IHasModel;
import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe implements IHasModel {

	public ToolPickaxe(String name, ToolMaterial material) {
		super(material);
		 setUnlocalizedName(name);
		  setRegistryName(name);
		  setCreativeTab(Main.hysteltab);
		  
		  ItemInit.ITEMS.add(this);
		
	}

	   @Override
    public void registerModels() {
	   
     	 Main.proxy.registerItemRenderer(this, 0, "inventory");
     	 
}

}
