package fr.nothing76.skygui.listeners;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiChest;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventListener {
	
	@SubscribeEvent
	public void onGuiBackgroundDraw(GuiScreenEvent.BackgroundDrawnEvent event) {
		GuiScreen screen = Minecraft.getMinecraft().currentScreen;
		
		if (screen instanceof GuiChest) {
			
		} else if (screen instanceof GuiInventory) {
			
		}
	}
	
}
