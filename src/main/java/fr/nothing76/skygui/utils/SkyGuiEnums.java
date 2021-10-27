package fr.nothing76.skygui.utils;

public class SkyGuiEnums {

	public enum GuiTypes {
		SETTINGS;
	}
	
	public enum SettingBool{
		
		IS_MOD_ENABLED("Is mod enabled", "is_mod_enabled", true);
		
		private String text, id;
		private boolean value;
		
		private SettingBool(String text, String id, boolean value) {
			this.text = text;
			this.id = id;
			this.value = value;
		}
		
		public void toggle() {
			this.value = !this.value;
		}
		
		public boolean getValue() {
			return this.value;
		}
		
	}
	
}
