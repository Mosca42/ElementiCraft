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

public class PacketCapabilitiesElementEarth implements IMessage {

	public int EarthElement;
	public PacketCapabilitiesElementEarth(){
		
	}
	public PacketCapabilitiesElementEarth(int value) {
		this.EarthElement = value;
	}
	
	@Override
	public void fromBytes(ByteBuf buf) {
		this.EarthElement = buf.readInt();
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(this.EarthElement);	
	}
	    
	public static class ClientHandler implements IMessageHandler<PacketCapabilitiesElementEarth, IMessage>
	{

	    @Override
	    public IMessage onMessage(PacketCapabilitiesElementEarth message, MessageContext ctx)
	    {
	    	Minecraft.getMinecraft().thePlayer.getCapability(Elementicraft.ELEMENT_CAP, null).setEarthElement(message.EarthElement);
			return null;
	     }
	        
	}

	public static class ServerHandler implements IMessageHandler<PacketCapabilitiesElementEarth, IMessage>
	{

	    @Override
	    public IMessage onMessage(PacketCapabilitiesElementEarth message, MessageContext ctx)
	     {
			return null;
	     }
	        
	}
	
}
