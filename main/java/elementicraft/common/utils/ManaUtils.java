package elementicraft.common.utils;

import elementicraft.client.Elementicraft;
import net.minecraft.entity.player.EntityPlayer;

public class ManaUtils {

	public static void addMana(EntityPlayer player, int mana) {
		player.getCapability(Elementicraft.MAGIC_CAP, null).addMana(mana);
		sync(player);
	}

	public static void removeMana(EntityPlayer player, int mana) {
		player.getCapability(Elementicraft.MAGIC_CAP, null).removeMana(mana);
		sync(player);
	}

	public static int getMana(EntityPlayer player) {
		return player.getCapability(Elementicraft.MAGIC_CAP, null).getMana();
	}

	public static void sync(EntityPlayer player) {
		player.getCapability(Elementicraft.MAGIC_CAP, null).sync();
	}

	public static boolean hasFull(EntityPlayer player) {

		if (getMana(player) <= 100000) {
			return true;
		} else {
			return false;
		}
	}

}
