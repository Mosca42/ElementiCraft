package elementicraft.common.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemsRegister {

	public static Item AmuletHare;
	
	public static void init(FMLPreInitializationEvent event) {
		AmuletHare = new AmuletHare().setUnlocalizedName("AmuletHare");
		register();
	}

	private static void register() {
		GameRegistry.<Item>register(AmuletHare);
	}

}
