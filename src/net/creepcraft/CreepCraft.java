package net.creepcraft;

import java.util.logging.Logger;

import org.bukkit.command.*;
import org.bukkit.event.Event;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class CreepCraft extends JavaPlugin {
	private final CreepCraftPlayerListener playerListener = new CreepCraftPlayerListener(
			this);
	public static final Logger log = Logger.getLogger("Minecraft");

	@Override
	public void onDisable() {
		log.info("[CreepCraft]" + "version" + getDescription().getVersion()
				+ " by iPencil" + " disabled!");
	}

	@Override
	public void onEnable() {
		log.info("[CreepCraft]" + " version " + getDescription().getVersion()
				+ " by iPencil" + " enabled!");
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvent(Event.Type.PLAYER_JOIN, playerListener,
				Event.Priority.Highest, this);
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd,
			String commandLabel, String[] args) {
		if(commandLabel.equalsIgnoreCase("joingood")) {

		}
		return false;
	}

}
