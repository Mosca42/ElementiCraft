package elementicraft.client.gui;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;

public class GuiTableSort extends GuiScreen {

	private static final ResourceLocation texture = new ResourceLocation("elementicraft:textures/gui/guitablesort.png");

    
	public GuiTableSort() {
		super();
	}

	@Override
	public void initGui() {
		super.initGui();
		int k = (this.width - this.mc.displayWidth) / 2;
		int l = (this.height - this.mc.displayHeight) / 2;
	}
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks)
	{
	    GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
	    this.mc.getTextureManager().bindTexture(texture);
	    int i = (this.width - 280) / 2;
	    int j = (this.height - 270) / 2;
	    this.drawTexturedModalRect(i, j, 0, 0, 256, 256);

	    super.drawScreen(mouseX, mouseY, partialTicks);
	}
	
	@Override
	public void drawDefaultBackground() {
		super.drawDefaultBackground();
	}
}
