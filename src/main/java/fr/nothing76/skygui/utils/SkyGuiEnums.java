package fr.nothing76.skygui.utils;

import fr.nothing76.skygui.resources.Constants;

public class SkyGuiEnums {

	public enum GuiTypes {
		SETTINGS,
		NONE;
	}
	
	
	public enum SettingsSections {
		MAIN(Utils.iota(Constants.SETTINGS_SECTION_ENUM, true));
		
		private int index;
		
		SettingsSections(int index) {
			this.index = index;
		}
		
		public int getValue() {
			return this.index;
		}
	}
	
}
