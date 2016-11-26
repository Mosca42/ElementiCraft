package elementicraft.common.event;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

public class EventRegister {

	public static void init(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(new DropEssence());
		MinecraftForge.EVENT_BUS.register(new Capabilities());
		if(event.getSide().isClient())
		{
		MinecraftForge.EVENT_BUS.register(new Overlays());
		}
	}

}
