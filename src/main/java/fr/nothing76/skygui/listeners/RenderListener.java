package fr.nothing76.skygui.listeners;

import fr.nothing76.skygui.guis.SettingsMenuGui;
import fr.nothing76.skygui.resources.Values;
import fr.nothing76.skygui.utils.SkyGuiEnums;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class RenderListener {
	
	@SubscribeEvent
	public void onRender(TickEvent.RenderTickEvent event) {
		if (Values.guiToOpen == SkyGuiEnums.GuiTypes.SETTINGS) {
			Minecraft.getMinecraft().displayGuiScreen(new SettingsMenuGui());;
		}
		Values.guiToOpen = SkyGuiEnums.GuiTypes.NONE;
	}
	
}
