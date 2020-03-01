package jayden.mod.tabs;

import jayden.mod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class HystelTab extends CreativeTabs 
{
   public HystelTab(String label) { super("hysteltab");
   this.setBackgroundImageName("hysteltab.png");  }

       @Override
       public ItemStack getTabIconItem() { return new ItemStack(ItemInit.BLUESTONE_INGOT); }
       
       @Override
    	public boolean hasSearchBar() {
    		return true;
    	}
       
       

}
