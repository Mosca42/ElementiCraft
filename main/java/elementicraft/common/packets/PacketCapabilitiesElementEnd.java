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

public class PacketCapabilitiesElementEnd implements IMessage {

	public int EndElement;
	public PacketCapabilitiesElementEnd(){
		
	}
	public PacketCapabilitiesElementEnd(int value) {
		this.EndElement = value;
	}
	
	@Override
	public void fromBytes(ByteBuf buf) {
		this.EndElement = buf.readInt();
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(this.EndElement);	
	}
	    
	public static class ClientHandler implements IMessageHandler<PacketCapabilitiesElementEnd, IMessage>
	{

	    @Override
	    public IMessage onMessage(PacketCapabilitiesElementEnd message, MessageContext ctx)
	    {	    if(Elementicraft.proxy instanceof clientProxy) {

	    	((clientProxy)Elementicraft.proxy).endElement = message.EndElement;
	    }
	    	Minecraft.getMinecraft().thePlayer.getCapability(Elementicraft.ELEMENT_CAP, null).setEndElement(message.EndElement);
			return null;

	     }
	        
	}

}
