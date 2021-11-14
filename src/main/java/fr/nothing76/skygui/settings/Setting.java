package fr.nothing76.skygui.settings;

import fr.nothing76.skygui.resources.Constants;
import fr.nothing76.skygui.utils.Utils;

public class Setting {

	public static SettingsSection[] settings = {
		new SettingsSection("main", "Main Options", Utils.iota(Constants.SETTING_SECTION, true), new Setting[]{
				new SettingBool("is_mod_enabled", "SkyGUI Enabled", Utils.iota(Constants.SETTING_SUBSECTION, true))
		} ),
	};
	
	public String id, name;
	public int index;
	
	public Setting(String id, String name, int index) {
		this.id = id;
		this.name = name;
		this.index = index;
	}
	
	
	
}
