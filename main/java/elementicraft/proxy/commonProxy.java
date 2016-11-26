package elementicraft.proxy;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

public class commonProxy {

	public void registerEvents() {}

	public void registerRender() {}

	public void sendUsePacket(PlayerInteractEvent event) {}

	public void sendUsePacket(int x, int y, int z, int face, ItemStack item, float f, float f1, float f2) {}

	public void sendAltUsePacket(int x, int y, int z, int face, ItemStack item, float f, float f1, float f2) {}
	
	public void sendAltUsePacket(ItemStack item) {}

	public void registerRenderInformation() {}
	
	protected void registerItemTexture(Item item, int metadata, String name){}

	   protected void registerItemTexture(Item item, String name){}

	   protected void registerBlockTexture(Block block, int metadata, String name){}

	   protected void registerBlockTexture(Block block, String name){}
	   public World getClientWorld() {
		    return null;
		  }
}
