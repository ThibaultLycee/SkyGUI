package fr.nothing76.skygui.settings;

import net.minecraft.item.Item;

public class SettingsSection {

	private String id, name;
	private int index;
	private Item logo;
	
	private Setting[] settings;
	
	public SettingsSection(String id, String name, int index, Setting[] settings, Item item) {
		this.id = id;
		this.name = name;
		this.index = index;
		this.settings = settings;
		this.logo = item;
	}
	
	public Setting[] getSubSettings() {
		return this.settings;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Item getLogo() {
		return this.logo;
	}

}
