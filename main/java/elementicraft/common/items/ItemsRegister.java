package elementicraft.common.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemsRegister {

	public static Item AmuletHare;
	public static Item WillFurys;
	public static Item Mana;


	
	public static void init(FMLPreInitializationEvent event) {
		AmuletHare = new AmuletHare().setUnlocalizedName("AmuletHare");
		WillFurys = new WillFurys().setUnlocalizedName("WillFurys");
		Mana = new Mana().setUnlocalizedName("Mana");

		register();
	}

	private static void register() {
		GameRegistry.<Item>register(AmuletHare);
		GameRegistry.<Item>register(WillFurys);
		GameRegistry.<Item>register(Mana);


	}

}
