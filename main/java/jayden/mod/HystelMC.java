package jayden.mod;

import java.io.File;

import jayden.mod.proxy.CommonProxy;
import jayden.mod.tabs.HystelTab;
import jayden.mod.util.Reference;
import jayden.mod.util.handlers.RegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class HystelMC
{
        @Instance 
        public static HystelMC instance;
        
        public static final CreativeTabs hysteltab = new HystelTab("hysteltab");
        
        static { FluidRegistry.enableUniversalBucket(); }
        
        @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
        public static CommonProxy proxy;

		public static File config;
        
        @EventHandler
        public void preInit(FMLPreInitializationEvent event)
        {
        	RegistryHandler.preInitRegistries(event);
        	RegistryHandler.otherRegistries();
        }
        
        @EventHandler
        public void init(FMLInitializationEvent event) 
        {
        	RegistryHandler.initRegistries(event);
        }
        
        @EventHandler
        public void PostInit(FMLPostInitializationEvent event) 
        {
        	RegistryHandler.postInitRegistries(event);
        }
        
        @EventHandler
        public void serverInit(FMLServerStartingEvent event) 
        {
        	RegistryHandler.serverRegistries(event);
        }
}