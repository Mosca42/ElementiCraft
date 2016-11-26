package elementicraft.common.capabilities;

import java.util.concurrent.Callable;

import elementicraft.client.Elementicraft;
import elementicraft.common.packets.PacketCapabilitiesElementFire;
import elementicraft.common.packets.PacketCapabilitiesMagic;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.INBTSerializable;

public class ElementsCapabilities implements ICapabilityProvider, INBTSerializable<NBTTagCompound> {
	private EntityPlayer player;
	public int FireElement;
	public int WaterElement;
	public int WindElement;
	public int EarthElement;
	public int EndElement;

	

	public ElementsCapabilities(EntityPlayer player) {
		this.FireElement = 0;
		this.WaterElement = 0;
		this.WindElement = 0;
		this.EarthElement = 0;
		this.player = player;
	}

	@Override
	public NBTTagCompound serializeNBT() {
		NBTTagCompound compound = new NBTTagCompound();
		compound.setInteger("FireElement", this.getFireElement());
		compound.setInteger("WaterElement", this.getWaterElement());
		compound.setInteger("WindElement", this.getWindElement());
		compound.setInteger("EarthElement", this.getEarthElement());
		compound.setInteger("EndElement", this.getEndElement());

		return compound;
	}

	@Override
	public void deserializeNBT(NBTTagCompound nbt) {
		this.setFireElement(nbt.getInteger("FireElement"));
		this.setWaterElement(nbt.getInteger("WaterElement"));
		this.setWindElement(nbt.getInteger("WindElement"));
		this.setEarthElement(nbt.getInteger("EarthElement"));
		this.setEndElement(nbt.getInteger("EndElement"));

	}

	@Override
	public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
		return Elementicraft.ELEMENT_CAP != null && capability == Elementicraft.ELEMENT_CAP;
	}

	@Override
	public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
		return Elementicraft.ELEMENT_CAP != null && capability == Elementicraft.ELEMENT_CAP ? (T) this : null;

	}

	public void setFireElement(int value) {
		this.FireElement = value;
	}

	public int getFireElement() {
		return this.FireElement;
	}

	public void addFireElement(int value) {
		this.FireElement = this.FireElement + value;
	}

	public void removeFireElement(int value) {
		this.FireElement = this.FireElement - value;
	}

	public void setWaterElement(int value) {
		this.WaterElement = value;
	}

	public int getWaterElement() {
		return this.WaterElement;
	}

	public void addWaterElement(int value) {
		this.WaterElement = this.WaterElement + value;
	}

	public void removeWaterElement(int value) {
		this.WaterElement = this.WaterElement - value;
	}

	public void setWindElement(int value) {
		this.WindElement = value;
	}

	public int getWindElement() {
		return this.WindElement;
	}

	public void addWindElement(int value) {
		this.WindElement = this.WindElement + value;
	}

	public void removeWindElement(int value) {
		this.WindElement = this.WindElement - value;
	}

	public void setEarthElement(int value) {
		this.EarthElement = value;
	}

	public int getEarthElement() {
		return this.EarthElement;
	}

	public void addEarthElement(int value) {
		this.EarthElement = this.EarthElement + value;
	}

	public void removeEarthElement(int value) {
		this.EarthElement = this.EarthElement - value;
	}
	
	public void setEndElement(int value) {
		this.EndElement = value;
	}

	public int getEndElement() {
		return this.EndElement;
	}

	public void addEndElement(int value) {
		this.EndElement = this.EndElement + value;
	}

	public void removeEndElement(int value) {
		this.EndElement = this.EndElement - value;
	}
	
	
	public static class Storage implements Capability.IStorage<ElementsCapabilities> {

		@Override
		public NBTBase writeNBT(Capability<ElementsCapabilities> capability, ElementsCapabilities instance, EnumFacing side) {
			return null;
		}

		@Override
		public void readNBT(Capability<ElementsCapabilities> capability, ElementsCapabilities instance, EnumFacing side,
				NBTBase nbt) {

		}

	}

	public static class Factory implements Callable<ElementsCapabilities> {
		@Override
		public ElementsCapabilities call() throws Exception {
			return null;
		}
	}

	public static void register() {
		CapabilityManager.INSTANCE.register(ElementsCapabilities.class, new ElementsCapabilities.Storage(),
				new ElementsCapabilities.Factory());
	}

	public void sync() {
this.syncEarth();
this.syncFire();
this.syncWater();
this.syncWind();
	}
	
	public void syncFire() {
		PacketCapabilitiesElementFire packet = new PacketCapabilitiesElementFire(this.getFireElement());
		if (!this.player.worldObj.isRemote) {
			EntityPlayerMP playerMP = (EntityPlayerMP) player;
			Elementicraft.network.sendTo(packet, playerMP);
		} else {
			Elementicraft.network.sendToServer(packet);
		}
	}
	public void syncWater() {
		PacketCapabilitiesElementFire packet = new PacketCapabilitiesElementFire(this.getWaterElement());
		if (!this.player.worldObj.isRemote) {
			EntityPlayerMP playerMP = (EntityPlayerMP) player;
			Elementicraft.network.sendTo(packet, playerMP);
		} else {
			Elementicraft.network.sendToServer(packet);
		}
	}
	public void syncEarth() {
		PacketCapabilitiesElementFire packet = new PacketCapabilitiesElementFire(this.getEarthElement());
		if (!this.player.worldObj.isRemote) {
			EntityPlayerMP playerMP = (EntityPlayerMP) player;
			Elementicraft.network.sendTo(packet, playerMP);
		} else {
			Elementicraft.network.sendToServer(packet);
		}
	}
	public void syncWind() {
		PacketCapabilitiesElementFire packet = new PacketCapabilitiesElementFire(this.getWindElement());
		if (!this.player.worldObj.isRemote) {
			EntityPlayerMP playerMP = (EntityPlayerMP) player;
			Elementicraft.network.sendTo(packet, playerMP);
		} else {
			Elementicraft.network.sendToServer(packet);
		}
	}

}
