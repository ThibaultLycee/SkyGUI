package fr.nothing76.skygui;

import fr.nothing76.skygui.commands.SkyGuiCommands;
import fr.nothing76.skygui.listeners.RenderListener;
import fr.nothing76.skygui.resources.Resources;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(version = Resources.MOD_VERSION, name = Resources.MOD_NAME, modid = Resources.MOD_ID)
public class SkyGUI {

	@EventHandler
	public void onPreInit(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public void onInit(FMLInitializationEvent event) {
		ClientCommandHandler.instance.registerCommand(new SkyGuiCommands());
		MinecraftForge.EVENT_BUS.register(new RenderListener());
	}
	
	@EventHandler
	public void onPostInit(FMLPostInitializationEvent event) {
		
	}
	
}
