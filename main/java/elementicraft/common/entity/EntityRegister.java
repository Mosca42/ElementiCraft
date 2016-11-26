package elementicraft.common.entity;

import elementicraft.client.Elementicraft;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityRegister {

	public static void init(FMLInitializationEvent event) {
		
		EntityRegistry.registerModEntity(elem_eau.class, "Elementaire_Eau", 0, Elementicraft.instance , 40, 1, true, 0xB1D4D4,0x0000FF);
		EntityRegistry.registerModEntity(elem_feu.class, "Elementaire_Feu", 1, Elementicraft.instance , 40, 1, true, 0xe7a251,0x9d2525);
		EntityRegistry.registerModEntity(elem_terre.class, "Elementaire_Terre", 2, Elementicraft.instance , 40, 1, true, 0xc5b35b,0x695132);
		EntityRegistry.registerModEntity(FireBall.class, "FireBall", 4, Elementicraft.instance , 40, 1, true);
		EntityRegistry.registerModEntity(EntityElementsOrbFire.class, "EntityElementsOrbFire", 5, Elementicraft.instance , 40, 1, true);
		EntityRegistry.registerModEntity(EntityElementsOrbWater.class, "EntityElementsOrbWater", 6, Elementicraft.instance , 40, 1, true);
		EntityRegistry.registerModEntity(EntityElementsOrbEarth.class, "EntityElementsOrbEarth", 7, Elementicraft.instance , 40, 1, true);
		EntityRegistry.registerModEntity(EntityElementsOrbWind.class, "EntityElementsOrbWind", 8, Elementicraft.instance , 40, 1, true);
		EntityRegistry.registerModEntity(EntityElementsOrbEnd.class, "EntityElementsOrbEnd", 9, Elementicraft.instance , 40, 1, true);


		spawn();
	}

	private static void spawn() {
		EntityRegistry.addSpawn(elem_eau.class, 1, 1, 1, EnumCreatureType.MONSTER,Biomes.BEACH);
		EntityRegistry.addSpawn(elem_eau.class, 1, 1, 1, EnumCreatureType.MONSTER, Biomes.OCEAN);
		EntityRegistry.addSpawn(elem_eau.class, 1, 1, 1, EnumCreatureType.MONSTER,Biomes.BEACH);
		EntityRegistry.addSpawn(elem_eau.class, 1, 1, 1, EnumCreatureType.MONSTER, Biomes.SWAMPLAND);
		EntityRegistry.addSpawn(elem_terre.class, 1, 1, 2, EnumCreatureType.MONSTER, Biomes.PLAINS);
		EntityRegistry.addSpawn(elem_terre.class, 1, 1, 2, EnumCreatureType.MONSTER, Biomes.STONE_BEACH);
		EntityRegistry.addSpawn(elem_terre.class, 1, 1, 2, EnumCreatureType.MONSTER, Biomes.EXTREME_HILLS);
		EntityRegistry.addSpawn(elem_terre.class, 1, 1, 2, EnumCreatureType.MONSTER, Biomes.MESA);
		EntityRegistry.addSpawn(elem_terre.class, 1, 1, 2, EnumCreatureType.MONSTER, Biomes.DESERT);
		EntityRegistry.addSpawn(elem_terre.class, 1, 1, 2, EnumCreatureType.MONSTER, Biomes.SAVANNA);
		EntityRegistry.addSpawn(elem_feu.class, 1, 1, 2, EnumCreatureType.MONSTER, Biomes.HELL);		
	}
	

}
