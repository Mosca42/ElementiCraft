package elementicraft.client.spell;

import elementicraft.client.Elementicraft;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SpellRegister {

	public static Item spellFireBall;
	
	public static void init(FMLPreInitializationEvent event) {
		
		spellFireBall = new SpellFireBall(500).setUnlocalizedName("spellFireBall").setRegistryName("spellFireBall").setCreativeTab(Elementicraft.Tabs);
		register();
	}

	private static void register() {
		GameRegistry.<Item>register(spellFireBall);
	}
	
}
