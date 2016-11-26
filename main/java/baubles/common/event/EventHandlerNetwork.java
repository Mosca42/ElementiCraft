package baubles.common.event;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.relauncher.Side;
import baubles.common.lib.PlayerHandler;

public class EventHandlerNetwork {
	
	@SubscribeEvent    
	public void playerLoggedInEvent (PlayerEvent.PlayerLoggedInEvent event)    {    
		Side side = FMLCommonHandler.instance().getEffectiveSide();        
		if (side == Side.SERVER)        {
			EventHandlerEntity.syncSchedule.add(event.player.getEntityId());
		}
	}
	
	public static void syncBaubles(EntityPlayer player) {
		for (int a = 0; a < 4; a++) {
			PlayerHandler.getPlayerBaubles(player).syncSlotToClients(a);
		}
	}
	
	
}
