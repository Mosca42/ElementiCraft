package elementicraft.common.tiles;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TilesEntityRegister {

	public static void init(FMLPreInitializationEvent event) {
        GameRegistry.registerTileEntity(TileEntityTableSort.class, "TileEntityTableSort");
	}

}
