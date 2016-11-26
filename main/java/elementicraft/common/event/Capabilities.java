package elementicraft.common.event;

import elementicraft.client.Elementicraft;
import elementicraft.common.capabilities.ElementsCapabilities;
import elementicraft.common.capabilities.MagicCapabilities;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerRespawnEvent;

public class Capabilities {

	@SubscribeEvent
	public void onPlayerCloned(PlayerEvent.Clone event) {
		if (event.isWasDeath()) {
			if (event.getOriginal().hasCapability(Elementicraft.MAGIC_CAP, null)) {
				MagicCapabilities cap = event.getOriginal().getCapability(Elementicraft.MAGIC_CAP, null);
				MagicCapabilities newCap = event.getEntityPlayer().getCapability(Elementicraft.MAGIC_CAP, null);
				newCap.setMana(cap.getMana());
			}
			if (event.getOriginal().hasCapability(Elementicraft.ELEMENT_CAP, null)) {
				ElementsCapabilities cap = event.getOriginal().getCapability(Elementicraft.ELEMENT_CAP, null);
				ElementsCapabilities newCap = event.getEntityPlayer().getCapability(Elementicraft.ELEMENT_CAP, null);
				newCap.setFireElement(cap.getFireElement());
			}
		}
	}

	@SubscribeEvent
	public void onPlayerRespawn(PlayerRespawnEvent event) {
		if (!event.player.worldObj.isRemote) {
			event.player.getCapability(Elementicraft.MAGIC_CAP, null).sync();
			event.player.getCapability(Elementicraft.ELEMENT_CAP, null).sync();
		}
	}
	@SubscribeEvent
	public void onAttachCapability(AttachCapabilitiesEvent.Entity event) {
		if (event.getEntity() instanceof EntityPlayer) {
			event.addCapability(new ResourceLocation(Elementicraft.MODID + ":MAGIC_CAP"),
					new MagicCapabilities((EntityPlayer) event.getEntity()));
			
			event.addCapability(new ResourceLocation(Elementicraft.MODID + ":FIREELEMENT_CAP"),
					new ElementsCapabilities((EntityPlayer) event.getEntity()));
		}
	}
}
