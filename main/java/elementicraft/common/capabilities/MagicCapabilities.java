package elementicraft.common.capabilities;

import java.util.concurrent.Callable;

import elementicraft.client.Elementicraft;
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

public class MagicCapabilities implements ICapabilityProvider, INBTSerializable<NBTTagCompound> {
	private EntityPlayer player;
	public int mana;

	public MagicCapabilities(EntityPlayer player) {
		this.mana = 0;
		this.player = player;
	}

	@Override
	public NBTTagCompound serializeNBT() {
		NBTTagCompound compound = new NBTTagCompound();
		compound.setInteger("Mana", this.getMana());
		return compound;
	}

	@Override
	public void deserializeNBT(NBTTagCompound nbt) {
		this.setMana(nbt.getInteger("Mana"));
	}

	@Override
	public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
		return Elementicraft.MAGIC_CAP != null && capability == Elementicraft.MAGIC_CAP;
	}

	@Override
	public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
		return Elementicraft.MAGIC_CAP != null && capability == Elementicraft.MAGIC_CAP ? (T) this : null;

	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public int getMana() {
		return this.mana;
	}

	public void addMana(int mana) {
		this.mana = this.mana + mana;
	}

	public void removeMana(int mana) {
		this.mana = this.mana - mana;
	}

	public static class Storage implements Capability.IStorage<MagicCapabilities> {

		@Override
		public NBTBase writeNBT(Capability<MagicCapabilities> capability, MagicCapabilities instance, EnumFacing side) {
			return null;
		}

		@Override
		public void readNBT(Capability<MagicCapabilities> capability, MagicCapabilities instance, EnumFacing side,
				NBTBase nbt) {

		}

	}

	public static class Factory implements Callable<MagicCapabilities> {
		@Override
		public MagicCapabilities call() throws Exception {
			return null;
		}
	}

	public static void register() {
		CapabilityManager.INSTANCE.register(MagicCapabilities.class, new MagicCapabilities.Storage(),
				new MagicCapabilities.Factory());
	}

	public void sync() {
		PacketCapabilitiesMagic packet = new PacketCapabilitiesMagic(this.getMana());
		if (!this.player.worldObj.isRemote) {
			EntityPlayerMP playerMP = (EntityPlayerMP) player;
			Elementicraft.network.sendTo(packet, playerMP);
		} else {
			Elementicraft.network.sendToServer(packet);
		}
	}

}
