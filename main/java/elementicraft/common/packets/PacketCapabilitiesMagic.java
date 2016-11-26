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

public class PacketCapabilitiesMagic implements IMessage {

	public int mana;
	public PacketCapabilitiesMagic(){
		
	}
	public PacketCapabilitiesMagic(int mana) {
		this.mana = mana;
	}
	
	@Override
	public void fromBytes(ByteBuf buf) {
		this.mana = buf.readInt();
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(this.mana);	
	}
	    
	public static class ClientHandler implements IMessageHandler<PacketCapabilitiesMagic, IMessage>
	{

	    @Override
	    public IMessage onMessage(PacketCapabilitiesMagic message, MessageContext ctx)
	    {	    if(Elementicraft.proxy instanceof clientProxy) {

	    	((clientProxy)Elementicraft.proxy).mana = message.mana;
	    }
	    	Minecraft.getMinecraft().thePlayer.getCapability(Elementicraft.MAGIC_CAP, null).setMana(message.mana);
			return null;

	     }
	        
	}

}
