package com.SupremeMarshal.ToTheEarthCore.init;

import java.util.ArrayList;
import java.util.Iterator;

import com.SupremeMarshal.ToTheEarthCore.Main;
import com.SupremeMarshal.ToTheEarthCore.entity.EntityBlackDemon;
import com.SupremeMarshal.ToTheEarthCore.entity.EntityDemon;
import com.SupremeMarshal.ToTheEarthCore.entity.EntityGhoul;
import com.SupremeMarshal.ToTheEarthCore.entity.EntityHellHound;
import com.SupremeMarshal.ToTheEarthCore.util.ModConfiguration;
import com.SupremeMarshal.ToTheEarthCore.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit 
{

	public static void registerEntities()
	{
		registerEntity("demon", EntityDemon.class, ModConfiguration.ENTITY_DEMON_ID, 50, 11437146, 000000);
		registerEntity("blackdemon", EntityBlackDemon.class, ModConfiguration.ENTITY_BLACKDEMON_ID, 50, 999999, 000000);
		registerEntity("ghoul", EntityGhoul.class, ModConfiguration.ENTITY_GHOUL_ID, 50, 888888, 222222);
		registerEntity("hellhound", EntityHellHound.class, ModConfiguration.ENTITY_HELLHOUND_ID, 50, 666666, 000000);
	}

	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
		Biome[] spawnBiomes = allbiomes(Biome.REGISTRY);
		EntityRegistry.addSpawn(EntityDemon.class, 15, 2, 20, EnumCreatureType.MONSTER, spawnBiomes);
		EntityRegistry.addSpawn(EntityBlackDemon.class, 10, 2, 20, EnumCreatureType.MONSTER, spawnBiomes);
		EntityRegistry.addSpawn(EntityGhoul.class, 20, 3, 27, EnumCreatureType.MONSTER, spawnBiomes);
		EntityRegistry.addSpawn(EntityHellHound.class, 20, 4, 25, EnumCreatureType.MONSTER, spawnBiomes);
	}

	private static Biome[] allbiomes(net.minecraft.util.registry.RegistryNamespaced<ResourceLocation, Biome> in) {
		Iterator<Biome> itr = in.iterator();
		ArrayList<Biome> ls = new ArrayList<Biome>();
		while (itr.hasNext())
			ls.add(itr.next());
		return ls.toArray(new Biome[ls.size()]);
	}
	
}
