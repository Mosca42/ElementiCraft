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

public class PacketCapabilitiesElementWind implements IMessage {

	public int WindElement;
	public PacketCapabilitiesElementWind(){
		
	}
	public PacketCapabilitiesElementWind(int value) {
		this.WindElement = value;
	}
	
	@Override
	public void fromBytes(ByteBuf buf) {
		this.WindElement = buf.readInt();
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(this.WindElement);	
	}
	    
	public static class ClientHandler implements IMessageHandler<PacketCapabilitiesElementWind, IMessage>
	{

	    @Override
	    public IMessage onMessage(PacketCapabilitiesElementWind message, MessageContext ctx)
	    {	    if(Elementicraft.proxy instanceof clientProxy) {

	    	((clientProxy)Elementicraft.proxy).windElement = message.WindElement;
	    }
	    	Minecraft.getMinecraft().thePlayer.getCapability(Elementicraft.ELEMENT_CAP, null).setWindElement(message.WindElement);
			return null;

	     }
	        
	}

}
