package elementicraft.common.packets;

import elementicraft.client.Elementicraft;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

public class PacketsRegister {

	public static void init(FMLPostInitializationEvent event) {
		if(event.getSide().isClient()){
		Elementicraft.network.registerMessage(PacketCapabilitiesMagic.ClientHandler.class, PacketCapabilitiesMagic.class, 0, Side.CLIENT);
		Elementicraft.network.registerMessage(PacketCapabilitiesElementFire.ClientHandler.class, PacketCapabilitiesElementFire.class, 1, Side.CLIENT);
		Elementicraft.network.registerMessage(PacketCapabilitiesElementWater.ClientHandler.class, PacketCapabilitiesElementWater.class, 2, Side.CLIENT);
		Elementicraft.network.registerMessage(PacketCapabilitiesElementEarth.ClientHandler.class, PacketCapabilitiesElementEarth.class, 3, Side.CLIENT);
		Elementicraft.network.registerMessage(PacketCapabilitiesElementWind.ClientHandler.class, PacketCapabilitiesElementWind.class, 4, Side.CLIENT);
		Elementicraft.network.registerMessage(PacketCapabilitiesElementEnd.ClientHandler.class, PacketCapabilitiesElementEnd.class, 5, Side.CLIENT);
		}
	}
	

}
