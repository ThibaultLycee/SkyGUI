package fr.nothing76.skygui.guis;

import org.lwjgl.opengl.GL11;

import fr.nothing76.skygui.resources.TexturesPath;
import fr.nothing76.skygui.utils.SkyGuiEnums;
import fr.nothing76.skygui.utils.Utils;
import net.minecraft.client.gui.GuiScreen;

public class SettingsMenuGui extends GuiScreen{
	
	public SettingsMenuGui() {
		for (SkyGuiEnums.SettingBool setting : SkyGuiEnums.SettingBool.values()) {
			System.out.println(setting.getValue());
		}
	}
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		for (SkyGuiEnums.SettingBool setting : SkyGuiEnums.SettingBool.values()) {
			if (setting.getValue()) {
				Utils.drawTexturedRect(50, 50, 76, 32, 0f, 1f, .5f, 1f, GL11.GL_NEAREST, TexturesPath.ASSET_SLIDER);
			} else {
				Utils.drawTexturedRect(50, 50, 76, 32, 0f, 1f, 0f, .5f, GL11.GL_NEAREST, TexturesPath.ASSET_SLIDER);
			}
		}
	}
	
}
