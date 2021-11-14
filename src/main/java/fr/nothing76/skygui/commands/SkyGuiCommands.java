package fr.nothing76.skygui.commands;

import java.util.Collections;
import java.util.List;

import fr.nothing76.skygui.guis.assets.Asset;
import fr.nothing76.skygui.guis.assets.AssetSlider;
import fr.nothing76.skygui.listeners.RenderListener;
import fr.nothing76.skygui.resources.Values;
import fr.nothing76.skygui.utils.SkyGuiEnums;
import fr.nothing76.skygui.utils.Utils;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.BlockPos;
import net.minecraft.util.IChatComponent;

public class SkyGuiCommands extends CommandBase {

	public SkyGuiCommands() { }	
	
	/**
	 * Get the full name of the command
	 */
	public String getCommandName() {
		return "skygui";
	}
	
	/**
	 * Get the permission required for this command ( 0 => no permission needed )
	 */
	public int getRequiredPermissionLevel() {
		return 0;
	}
	
	/**
	 * Get all aliases for this command, shortcuts when typing
	 */
	public List<String> getCommandAliases() {
		return Collections.singletonList("sgui");
	}
	
	/**
	 * Returns a string explaining to the user how to use the command
	 * Colors :
	 *     - Obfuscate : §k
	 *     - Bold : §l
	 *     - Strike through : §m
	 *     - Underline : §n
	 *     - Italic : §o
	 *     - Black : §0
	 *     - Dark blue : §1
	 *     - Dark green : §2
	 *     - Dark aqua : §3
	 *     - Dark red : §4
	 *     - Dark purple : §5
	 *     - Gold : §6
	 *     - Gray : §7
	 *     - Dark gray : §8
	 *     - Blue : §9
	 *     - Green : §a
	 *     - Aqua : §b
	 *     - Red : §c
	 *     - Light purple : §d
	 *     - Yellow : §e
	 *     - White : §f
	 *     - Reset : §r
	 */
	public String getCommandUsage(ICommandSender sender) {
		return  "§6§m----------------§6-[SkyGUI]§m-----------------§r\n" +
				"§f - /skygui : Oppens the settings menu§r\n" +
				"§6§m-----------------------------------------§r";
	}
	
	/**
	 * Returns the list of arguments to complete the command
	 *\/!\ NOT WORKING
	 */
	public List<String> addTabAutoCompletion(ICommandSender sender, String[] args, BlockPos pos) {
		if (args.length == 1) {
			return getListOfStringsMatchingLastWord(args, "help", "menu");
		}
		return null;
	}
	/**
	 * Process the command and do whatever the f*** I want it to do
	 */
	@Override
	public void processCommand(ICommandSender sender, String[] args) {
		if (args.length == 0) {
			Values.guiToOpen = SkyGuiEnums.GuiTypes.SETTINGS;
		} else {
			if (args.length == 1) {
				if (args[0].equalsIgnoreCase("help") || args[0].equalsIgnoreCase("?")) {
					Utils.sendMessage(getCommandUsage(sender), false);
				}
			}
		}
	}

	
	
}
