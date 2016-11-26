package elementicraft.common.event;

import org.lwjgl.opengl.GL11;

import elementicraft.client.Elementicraft;
import elementicraft.common.utils.ElementsUtils;
import elementicraft.proxy.clientProxy;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.GuiScreenEvent.DrawScreenEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Overlays {

	public static final ResourceLocation PANEL = new ResourceLocation(Elementicraft.MODID, "textures/overlay/panel.png");
	public static final ResourceLocation PANEL2 = new ResourceLocation(Elementicraft.MODID, "textures/overlay/panel2.png");
	public static final ResourceLocation AIR = new ResourceLocation(Elementicraft.MODID, "textures/overlay/Air.png");
	public static final ResourceLocation FIRE = new ResourceLocation(Elementicraft.MODID, "textures/overlay/Feu.png");
	public static final ResourceLocation EARTH = new ResourceLocation(Elementicraft.MODID, "textures/overlay/Terre.png");
	public static final ResourceLocation WATER = new ResourceLocation(Elementicraft.MODID, "textures/overlay/Eau.png");
	public static final ResourceLocation END = new ResourceLocation(Elementicraft.MODID, "textures/overlay/End.png");

	
	@SubscribeEvent
	public void onRenderGameOverlay(RenderGameOverlayEvent.Text e) {

		int mana = ((clientProxy)Elementicraft.proxy).mana;
		
			int maxlength = 30;
			float xScale = maxlength / 89.0F;
			Minecraft.getMinecraft().getTextureManager().bindTexture(PANEL);
			GL11.glPushMatrix();
			GL11.glScalef(xScale, 1.0f, 1.0f);
			
			Gui.drawScaledCustomSizeModalRect(30, 5, 0, 0, 100, 7, 550, 10, 100, 10);
			GL11.glPopMatrix();
			
			float xScale1 = maxlength / 89.0F;
			Minecraft.getMinecraft().getTextureManager().bindTexture(PANEL2);
			GL11.glPushMatrix();
			GL11.glScalef(xScale1, 1.0f, 1.0f);
			for(int i = 0; i <= 550; i++) {
				
				Gui.drawScaledCustomSizeModalRect(30, 5, 0, 0, 100, 7, mana/180, 10, 100, 9);
			}
			GL11.glPopMatrix();
		
				Minecraft.getMinecraft().fontRendererObj.drawString(TextFormatting.WHITE+"Mana : " + mana, (int)(250 * xScale1) - (30 / 2), 7, 0xFFFFFF);

		}
	
	@SubscribeEvent
	public void RenderInventory(DrawScreenEvent.Post event) {

		if (event.getGui() instanceof GuiInventory) {
			
			int fire = ElementsUtils.getFire(Minecraft.getMinecraft().thePlayer);
			int wind = ElementsUtils.getWind(Minecraft.getMinecraft().thePlayer);
			int water = ElementsUtils.getWater(Minecraft.getMinecraft().thePlayer);
			int end = ElementsUtils.getEnd(Minecraft.getMinecraft().thePlayer);
			int earth = ElementsUtils.getEarth(Minecraft.getMinecraft().thePlayer);

		    int i = (event.getGui().width - 280) / 2;
		    int j = (event.getGui().height- 270) / 2;
			GlStateManager.color(1.0F, 1.0F, 1.0F);
			Minecraft.getMinecraft().getTextureManager().bindTexture(AIR);
			GL11.glPushMatrix();
			GL11.glScalef(1.0F, 1.0f, 1.0f);
			Gui.drawScaledCustomSizeModalRect(i + 230, j+100, 0, 0, 100, 10, 16, 16, 100, 10);
			GL11.glPopMatrix();
			
			Minecraft.getMinecraft().getTextureManager().bindTexture(EARTH);
			GL11.glPushMatrix();
			GL11.glScalef(1.0F, 1.0f, 1.0f);
			Gui.drawScaledCustomSizeModalRect(i + 230, j+120, 0, 0, 100, 10, 16, 16, 100, 10);
			GL11.glPopMatrix();
			
			Minecraft.getMinecraft().getTextureManager().bindTexture(FIRE);
			GL11.glPushMatrix();
			GL11.glScalef(1.0F, 1.0f, 1.0f);
			Gui.drawScaledCustomSizeModalRect(i + 230, j+60, 0, 0, 100, 10, 16, 16, 100, 10);
			GL11.glPopMatrix();
			
			Minecraft.getMinecraft().getTextureManager().bindTexture(WATER);
			GL11.glPushMatrix();
			GL11.glScalef(1.0F, 1.0f, 1.0f);
			Gui.drawScaledCustomSizeModalRect(i + 230, j+80, 0, 0, 100, 10, 16, 16, 100, 10);
			GL11.glPopMatrix();
			
			Minecraft.getMinecraft().getTextureManager().bindTexture(END);
			GL11.glPushMatrix();
			GL11.glScalef(1.0F, 1.0f, 1.0f);
			Gui.drawScaledCustomSizeModalRect(i + 230, j+140, 0, 0, 100, 10, 16, 16, 100, 10);
			GL11.glPopMatrix();

			if(event.getGui().isAltKeyDown())
			{
				GL11.glScalef(1.0f, 1.0f, 1.0f);

				Minecraft.getMinecraft().fontRendererObj.drawString(TextFormatting.RED+""+fire, i + 250, j+65, 7);
				Minecraft.getMinecraft().fontRendererObj.drawString(TextFormatting.BLUE+""+water, i + 250, j+85, 7);
				Minecraft.getMinecraft().fontRendererObj.drawString(TextFormatting.WHITE+""+wind, i + 250, j+105, 7);
				Minecraft.getMinecraft().fontRendererObj.drawString(TextFormatting.GRAY+""+earth, i + 250, j+125, 7);
				Minecraft.getMinecraft().fontRendererObj.drawString(TextFormatting.LIGHT_PURPLE+""+end, i + 250, j+145, 7);

			}

		}

	}
	
	}
	

