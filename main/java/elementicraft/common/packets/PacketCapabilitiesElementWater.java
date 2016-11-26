package elementicraft.common.packets;

import elementicraft.client.Elementicraft;
import elementicraft.proxy.clientProxy;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.IThreadListener;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.server.FMLServerHandler;

public class PacketCapabilitiesElementWater implements IMessage {

	public int WaterElement;
	public PacketCapabilitiesElementWater(){
		
	}
	public PacketCapabilitiesElementWater(int value) {
		this.WaterElement = value;
	}
	
	@Override
	public void fromBytes(ByteBuf buf) {
		this.WaterElement = buf.readInt();
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(this.WaterElement);	
	}
	    
	public static class ClientHandler implements IMessageHandler<PacketCapabilitiesElementWater, IMessage>
	{

	    @Override
	    public IMessage onMessage(PacketCapabilitiesElementWater message, MessageContext ctx)
	    {	    if(Elementicraft.proxy instanceof clientProxy) {

	    	((clientProxy)Elementicraft.proxy).waterElement = message.WaterElement;
	    }
	    	Minecraft.getMinecraft().thePlayer.getCapability(Elementicraft.ELEMENT_CAP, null).setWaterElement(message.WaterElement);
			return null;

	     }
	        
	}

}
