package fr.nothing76.skygui.listeners;

import fr.nothing76.skygui.guis.SettingsMenuGui;
import fr.nothing76.skygui.utils.SkyGuiEnums;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class RenderListener {

	public static SkyGuiEnums.GuiTypes guiToOpen = null;
	
	@SubscribeEvent
	public void onRender(TickEvent.RenderTickEvent event) {
		if (guiToOpen == SkyGuiEnums.GuiTypes.SETTINGS) {
			Minecraft.getMinecraft().displayGuiScreen(new SettingsMenuGui());;
		}
	}
	
}
