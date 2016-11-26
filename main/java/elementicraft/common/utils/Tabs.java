package elementicraft.common.utils;

import elementicraft.common.blocs.BlocRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Tabs extends CreativeTabs {

	public Tabs(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(BlocRegister.spell_table);
	}

}
