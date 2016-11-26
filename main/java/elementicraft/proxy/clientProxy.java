package elementicraft.proxy;

import elementicraft.client.earth_elemental;
import elementicraft.client.fire_elemental;
import elementicraft.client.water_elemental;
import elementicraft.client.render.RenderElementOrbEarth;
import elementicraft.client.render.RenderElementOrbEnd;
import elementicraft.client.render.RenderElementOrbFire;
import elementicraft.client.render.RenderElementOrbWater;
import elementicraft.client.render.RenderElementOrbWind;
import elementicraft.client.spell.SpellRegister;
import elementicraft.common.entity.EntityElementsOrbEarth;
import elementicraft.common.entity.EntityElementsOrbEnd;
import elementicraft.common.entity.EntityElementsOrbFire;
import elementicraft.common.entity.EntityElementsOrbWater;
import elementicraft.common.entity.EntityElementsOrbWind;
import elementicraft.common.entity.FireBall;
import elementicraft.common.entity.elem_eau;
import elementicraft.common.entity.elem_feu;
import elementicraft.common.entity.elem_terre;
import elementicraft.commons.render_eau;
import elementicraft.commons.render_feu;
import elementicraft.commons.render_terre;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class clientProxy extends commonProxy {

	public int mana;
	public int fireElement;
	public int waterElement;
	public int windElement;
	public int earthElement;
	public int endElement;


	@Override
	public void registerRender(){
		
	    RenderManager renderManager = Minecraft.getMinecraft().getRenderManager();
	    RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
	   
		registerItemTexture(SpellRegister.spellFireBall, "spellFireBall");

		
		//Rendu 3D coté client (En jeu)
		RenderingRegistry.registerEntityRenderingHandler(FireBall.class, new RenderSnowball(renderManager, Items.BLAZE_POWDER, renderItem));
		RenderingRegistry.registerEntityRenderingHandler(elem_eau.class, new render_eau (new water_elemental(),0.5F ));
		RenderingRegistry.registerEntityRenderingHandler(elem_terre.class, new render_terre (new earth_elemental(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(elem_feu.class, new render_feu (new fire_elemental(),0.5F ));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityElementsOrbFire.class, new RenderElementOrbFire(Minecraft.getMinecraft().getRenderManager()));
		RenderingRegistry.registerEntityRenderingHandler(EntityElementsOrbWater.class, new RenderElementOrbWater(Minecraft.getMinecraft().getRenderManager()));
		RenderingRegistry.registerEntityRenderingHandler(EntityElementsOrbWind.class, new RenderElementOrbWind(Minecraft.getMinecraft().getRenderManager()));
		RenderingRegistry.registerEntityRenderingHandler(EntityElementsOrbEarth.class, new RenderElementOrbEarth(Minecraft.getMinecraft().getRenderManager()));
		RenderingRegistry.registerEntityRenderingHandler(EntityElementsOrbEnd.class, new RenderElementOrbEnd(Minecraft.getMinecraft().getRenderManager()));

	}
	public void Render(Class<? extends Entity> par1, Render par2)
	{
		RenderingRegistry.registerEntityRenderingHandler(par1, par2);
	}
	@Override
	public void registerItemTexture(Item item, int metadata, String name)
	{
		ModelLoader.setCustomModelResourceLocation(item, metadata, new ModelResourceLocation("elementicraft" + name, "inventory"));
	}

	@Override
	public void registerItemTexture(Item item, String name)
	{
		registerItemTexture(item, 0, name);
	}

	@Override
	public void registerBlockTexture(Block block, int metadata, String name)
	{
		registerItemTexture(Item.getItemFromBlock(block), metadata, name);
	}

	@Override
	public void registerBlockTexture(Block block, String name)
	{
		registerBlockTexture(block, 0, name);
	}
}
