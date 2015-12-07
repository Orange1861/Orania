 package orangeVillager61.Orania;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Orania {
	
	@Instance
	public static Orania instance = new Orania();
	
	@SidedProxy(clientSide="orangeVillager61.Orania.ClientProxy", serverSide="orangeVillager61.Orania.ServerProxy")
	public static CommonProxy proxy;
	
	public static final OraniaTab tabOrania = new OraniaTab("tabOrania");
	public static final DebugTab tabDebug = new DebugTab("tabDebug");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
	   proxy.preInit(e);
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
	    proxy.init(e);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
	    proxy.postInit(e);
	}
};
