package fr.nothing76.skygui.settings;

import fr.nothing76.skygui.resources.Constants;
import fr.nothing76.skygui.utils.Utils;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class Setting {

	public static SettingsSection[] settings = {
		new SettingsSection("main", "Main Options", Utils.iota(Constants.SETTING_SECTION, true), new Setting[]{
				new SettingBool("is_mod_enabled", "SkyGUI Enabled", Utils.iota(Constants.SETTING_SUBSECTION, true))
		}, Item.getItemFromBlock(Blocks.command_block) ),
		new SettingsSection("2", "2", Utils.iota(Constants.SETTING_SECTION), new Setting[]{}, Items.apple),
		new SettingsSection("3", "3", Utils.iota(Constants.SETTING_SECTION), new Setting[]{}, Items.pumpkin_pie)
	};
	
	public String id, name;
	public int index;
	
	public Setting(String id, String name, int index) {
		this.id = id;
		this.name = name;
		this.index = index;
	}
	
	
	
}
