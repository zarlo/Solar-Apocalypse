package xyz.zarlo.SolarApocalypse;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import xyz.zarlo.SolarApocalypse.Proxys.CommonProxy;


@Mod(modid = Main.modId, name = Main.name, version = Main.version)
public class Main {

	@SidedProxy(serverSide = "xyz.zarlo.SolarApocalypse.Proxys.CommonProxy", clientSide = "xyz.zarlo.SolarApocalypse.Proxys.ClientProxy")
	public static CommonProxy proxy;
	
	public static final String modId = "solarapocalypse";
	public static final String name = "Solar Apocalypse";
	public static final String version = "0.1.0";
	
	@Mod.Instance(modId)
	public static Main instance;
	
	@Mod.EventHandler	
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
	
}
