package fr.nothing76.skygui.guis;

import fr.nothing76.skygui.utils.SkyGuiEnums;
import net.minecraft.client.gui.GuiScreen;

public class SettingsMenuGui extends GuiScreen{
	
	public SettingsMenuGui() {
		for (SkyGuiEnums.SettingBool setting : SkyGuiEnums.SettingBool.values()) {
			System.out.println(setting.getValue());
		}
	}
	
}
