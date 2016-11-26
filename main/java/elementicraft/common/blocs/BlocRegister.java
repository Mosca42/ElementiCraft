package elementicraft.common.blocs;

import elementicraft.client.Elementicraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlocRegister {
	
	public static Block spell_table; 
	
	public static void init(FMLPreInitializationEvent event) {
		System.out.println("coucou");
		spell_table = new TableSort(Material.ANVIL).setRegistryName("spell_table").setCreativeTab(Elementicraft.Tabs);
		register();
	}

	private static void register() {

		GameRegistry.<Block>register(spell_table);
		GameRegistry.<Item>register(new ItemBlock(spell_table), spell_table.getRegistryName());
	}

}
