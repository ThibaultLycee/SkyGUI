package fr.nothing76.skygui.settings;

public class SettingInt extends Setting {

	private int value;
	
	public SettingInt(String id, String name, int index, int defaultValue) {
		super(id, name, index);
		this.value = defaultValue;
	}
	
	public SettingInt(String id, String name, int index) {
		super(id, name, index);
		this.value = 0;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public void changeValue(int value) {
		this.value = value;
	}

}
