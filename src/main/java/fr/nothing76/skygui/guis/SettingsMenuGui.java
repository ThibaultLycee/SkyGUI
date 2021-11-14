package fr.nothing76.skygui.guis;

import org.lwjgl.opengl.GL11;

import fr.nothing76.skygui.resources.TexturesPath;
import fr.nothing76.skygui.resources.Values;
import fr.nothing76.skygui.settings.Setting;
import fr.nothing76.skygui.settings.SettingsSection;
import fr.nothing76.skygui.utils.SkyGuiEnums;
import fr.nothing76.skygui.utils.Utils;
import net.minecraft.client.gui.GuiScreen;

public class SettingsMenuGui extends GuiScreen{
	
	public SettingsMenuGui() {
		
	}
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		this.render(Setting.settings[Values.activeSettingsSection.getValue()]);
	}
	
	private void render(SettingsSection section) {
		
	}
	
}
