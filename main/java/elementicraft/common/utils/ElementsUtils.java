package elementicraft.common.utils;

import elementicraft.client.Elementicraft;
import net.minecraft.entity.player.EntityPlayer;

public class ElementsUtils {

	public static void addFire(EntityPlayer player, int value) {
		player.getCapability(Elementicraft.ELEMENT_CAP, null).addFireElement(value);
		sync(player);
	}

	public static void setFire(EntityPlayer player, int value) {
		player.getCapability(Elementicraft.ELEMENT_CAP, null).setFireElement(value);
		sync(player);
	}
	
	public static void removeFire(EntityPlayer player, int value) {
		player.getCapability(Elementicraft.ELEMENT_CAP, null).removeFireElement(value);
		sync(player);
	}

	public static int getFire(EntityPlayer player) {
		return player.getCapability(Elementicraft.ELEMENT_CAP, null).getFireElement();
	}

	public static void addWater(EntityPlayer player, int value) {
		player.getCapability(Elementicraft.ELEMENT_CAP, null).addWaterElement(value);
		sync(player);
	}

	public static void setWater(EntityPlayer player, int value) {
		player.getCapability(Elementicraft.ELEMENT_CAP, null).setWaterElement(value);
		sync(player);
	}
	
	public static void removeWater(EntityPlayer player, int value) {
		player.getCapability(Elementicraft.ELEMENT_CAP, null).removeWaterElement(value);
		sync(player);
	}

	public static int getWater(EntityPlayer player) {
		return player.getCapability(Elementicraft.ELEMENT_CAP, null).getWaterElement();
	}
	
	public static void addWind(EntityPlayer player, int value) {
		player.getCapability(Elementicraft.ELEMENT_CAP, null).addWindElement(value);
		sync(player);
	}

	public static void setWind(EntityPlayer player, int value) {
		player.getCapability(Elementicraft.ELEMENT_CAP, null).setWindElement(value);
		sync(player);
	}
	
	public static void removeWind(EntityPlayer player, int value) {
		player.getCapability(Elementicraft.ELEMENT_CAP, null).removeWindElement(value);
		sync(player);
	}

	public static int getWind(EntityPlayer player) {
		return player.getCapability(Elementicraft.ELEMENT_CAP, null).getWindElement();
	}
	
	public static void addEarth(EntityPlayer player, int value) {
		player.getCapability(Elementicraft.ELEMENT_CAP, null).addEarthElement(value);
		sync(player);
	}

	public static void setEarth(EntityPlayer player, int value) {
		player.getCapability(Elementicraft.ELEMENT_CAP, null).setEarthElement(value);
		sync(player);
	}
	
	public static void removeEarth(EntityPlayer player, int value) {
		player.getCapability(Elementicraft.ELEMENT_CAP, null).removeEarthElement(value);
		sync(player);
	}

	public static int getEarth(EntityPlayer player) {
		return player.getCapability(Elementicraft.ELEMENT_CAP, null).getEarthElement();
	}
	
	
	public static void addEnd(EntityPlayer player, int value) {
		player.getCapability(Elementicraft.ELEMENT_CAP, null).addEndElement(value);
		sync(player);
	}

	public static void setEnd(EntityPlayer player, int value) {
		player.getCapability(Elementicraft.ELEMENT_CAP, null).setEndElement(value);
		sync(player);
	}
	
	public static void removeEnd(EntityPlayer player, int value) {
		player.getCapability(Elementicraft.ELEMENT_CAP, null).removeEndElement(value);
		sync(player);
	}

	public static int getEnd(EntityPlayer player) {
		return player.getCapability(Elementicraft.ELEMENT_CAP, null).getEndElement();
	}
	
	
	
	public static void sync(EntityPlayer player) {
		player.getCapability(Elementicraft.ELEMENT_CAP, null).sync();
	}


}
