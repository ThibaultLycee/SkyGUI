package fr.nothing76.skygui.settings;

public class SettingBool extends Setting {

	private boolean value;
	
	public SettingBool(String id, String name, int index, boolean defaultValue) {
		super(id, name, index);
		this.value = defaultValue;
	}
	
	public SettingBool(String id, String name, int index) {
		super(id, name, index);
		this.value = false;
	}
	
	public boolean getValue() {
		return this.value;
	}
	
	public void toggle() {
		this.value = !this.value;
	}

}
