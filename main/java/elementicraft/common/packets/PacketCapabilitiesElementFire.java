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

public class PacketCapabilitiesElementFire implements IMessage {

	public int FireElement;
	public PacketCapabilitiesElementFire(){
		
	}
	public PacketCapabilitiesElementFire(int value) {
		this.FireElement = value;
	}
	
	@Override
	public void fromBytes(ByteBuf buf) {
		this.FireElement = buf.readInt();
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(this.FireElement);	
	}
	    
	public static class ClientHandler implements IMessageHandler<PacketCapabilitiesElementFire, IMessage>
	{

	    @Override
	    public IMessage onMessage(PacketCapabilitiesElementFire message, MessageContext ctx){
	    	if(Elementicraft.proxy instanceof clientProxy) {

	    	((clientProxy)Elementicraft.proxy).fireElement = message.FireElement;
	    }
	    	Minecraft.getMinecraft().thePlayer.getCapability(Elementicraft.ELEMENT_CAP, null).setFireElement(message.FireElement);
			return null;

	     }
	        
	}

}
