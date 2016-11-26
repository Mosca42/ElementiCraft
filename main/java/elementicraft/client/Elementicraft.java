package elementicraft.client;

import elementicraft.client.gui.GuiHandler;
import elementicraft.client.spell.SpellRegister;
import elementicraft.common.blocs.BlocRegister;
import elementicraft.common.capabilities.CapabilitiesRegister;
import elementicraft.common.capabilities.ElementsCapabilities;
import elementicraft.common.capabilities.MagicCapabilities;
import elementicraft.common.entity.EntityRegister;
import elementicraft.common.event.EventRegister;
import elementicraft.common.items.ItemsRegister;
import elementicraft.common.packets.PacketsRegister;
import elementicraft.common.tiles.TilesEntityRegister;
import elementicraft.common.utils.Tabs;
import elementicraft.proxy.commonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;

@Mod(modid = "elementicraft",name= "Elementicraft", version="1.0.0")
public class Elementicraft {
	
	@Instance("elementicraft")
	public static Elementicraft instance;
	@CapabilityInject(MagicCapabilities.class)
	   public static final Capability<MagicCapabilities> MAGIC_CAP = null;
	@CapabilityInject(ElementsCapabilities.class)
	public static final Capability<ElementsCapabilities> ELEMENT_CAP = null;
	@SidedProxy(clientSide="elementicraft.proxy.clientProxy", serverSide="elementicraft.proxy.commonProxy")
	public static commonProxy proxy; 
	public static SimpleNetworkWrapper network;
	public static final String MODID = "elementicraft";

	public static CreativeTabs Tabs = new Tabs("Tabs");


	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		network = NetworkRegistry.INSTANCE.newSimpleChannel("elementicraft");
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
		BlocRegister.init(event);
		ItemsRegister.init(event);
		SpellRegister.init(event);
		EventRegister.init(event);
		TilesEntityRegister.init(event);

		proxy.registerRender();
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event){
		EntityRegister.init(event);
		proxy.registerRender();
		CapabilitiesRegister.init(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		PacketsRegister.init(event);
	}


}
