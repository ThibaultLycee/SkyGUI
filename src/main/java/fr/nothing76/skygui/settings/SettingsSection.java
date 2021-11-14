package fr.nothing76.skygui.settings;

public class SettingsSection {

	private String id, name;
	private int index;
	
	private Setting[] settings;
	
	public SettingsSection(String id, String name, int index, Setting[] settings) {
		this.id = id;
		this.name = name;
		this.index = index;
		this.settings = settings;
	}
	
	public Setting[] getSubSettings() {
		return this.settings;
	}

}
