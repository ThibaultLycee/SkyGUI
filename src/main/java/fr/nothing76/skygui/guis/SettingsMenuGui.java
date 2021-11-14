package fr.nothing76.skygui.guis;

import org.lwjgl.opengl.GL11;

import fr.nothing76.skygui.resources.TexturesPath;
import fr.nothing76.skygui.resources.Values;
import fr.nothing76.skygui.settings.Setting;
import fr.nothing76.skygui.settings.SettingsSection;
import fr.nothing76.skygui.utils.SkyGuiEnums;
import fr.nothing76.skygui.utils.Utils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;

public class SettingsMenuGui extends GuiScreen{
	
	public SettingsMenuGui() {
		
	}
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		this.renderBackground();
		this.renderActiveSection(Setting.settings[Values.activeSettingsSection.getValue()]);
	}
	
	private void renderActiveSection(SettingsSection section) {
		ScaledResolution scaledResolution = new ScaledResolution(Minecraft.getMinecraft());
		
		int y = (int)(Minecraft.getMinecraft().displayHeight / 20);
		int x = (int)(Minecraft.getMinecraft().displayWidth / 20);
		int height = scaledResolution.getScaledHeight();
		int width = scaledResolution.getScaledWidth();
	}
	
	private void renderBackground() {
		
		ScaledResolution scaledResolution = new ScaledResolution(Minecraft.getMinecraft());
		
		int y = (int)(Minecraft.getMinecraft().displayHeight / 20);
		int x = (int)(Minecraft.getMinecraft().displayWidth / 20);
		int height = scaledResolution.getScaledHeight();
		int width = scaledResolution.getScaledWidth();
		
		//Fills the inside
		Utils.drawTexturedRect(x + 12, y + 12, width - 2 * (x + 12), height - 2 * (y + 12), 4/16f, 12/16f, 4/16f, 5/16f + height/(2 * width), GL11.GL_NEAREST, .8f, TexturesPath.BACKGROUND);

		//Draws the angles of the GUI
		Utils.drawTexturedRect(x, y, 12, 12, 0f, 4/16f, 0f, 4/16f, GL11.GL_NEAREST, 1, TexturesPath.BACKGROUND);
		Utils.drawTexturedRect(width - x - 12, y, 12, 12, 12/16f, 1f, 0f, 4/16f, GL11.GL_NEAREST, 1, TexturesPath.BACKGROUND);
		Utils.drawTexturedRect(x, height - y - 12, 12, 12, 0f, 4/16f, 12/16f, 1f, GL11.GL_NEAREST, 1, TexturesPath.BACKGROUND);
		Utils.drawTexturedRect(width - x - 12, height - y - 12, 12, 12, 12/16f, 1f, 12/16f, 1f, GL11.GL_NEAREST, 1, TexturesPath.BACKGROUND);
		
		//Draws the borders of the GUI
		for (int i = 0; i <= width - 2 * (x + 12) - 12; i++) {
			Utils.drawTexturedRect(i + x + 12, y, 12, 12, 4/16f, 5/16f, 0f, 4/16f, GL11.GL_NEAREST, 1, TexturesPath.BACKGROUND);
			Utils.drawTexturedRect(i + x + 12, height - y - 12, 12, 12, 4/16f, 5/16f, 12/16f, 1f, GL11.GL_NEAREST, 1, TexturesPath.BACKGROUND);
		}
		for (int i = 0; i <= height - 2 * (y + 12) - 12; i++) {
			Utils.drawTexturedRect(x, i + y + 12, 12, 12, 0f, 4/16f, 4/16f, 5/16f, GL11.GL_NEAREST, 1, TexturesPath.BACKGROUND);
			Utils.drawTexturedRect(width - x - 12, i + y + 12, 12, 12, 12/16f, 1f, 4/16f, 5/16f, GL11.GL_NEAREST, 1, TexturesPath.BACKGROUND);
		}
		
		//Draws the tabs
		for (int i = 0; i < Setting.settings.length; i++) {
			if (i != Values.activeSettingsSection.getValue()) {
				
			}
		}
	}
	
}
