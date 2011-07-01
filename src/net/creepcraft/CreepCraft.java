package net.creepcraft;

import java.util.logging.Logger;

import org.bukkit.command.*;
import org.bukkit.event.Event;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.nijiko.permissions.PermissionHandler;
import com.nijikokun.bukkit.Permissions.Permissions;

public class CreepCraft extends JavaPlugin {
	private final CreepCraftPlayerListener playerListener = new CreepCraftPlayerListener(
			this);
	public static final Logger log = Logger.getLogger("Minecraft");
	public static PermissionHandler permissionHandler;

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
		setupPermissions();
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd,
			String commandLabel, String[] args) {
		if(commandLabel.equalsIgnoreCase("joingood")) {

		}
		return false;
	}

	private void setupPermissions() {
	    if (permissionHandler != null) {
	        return;
	    }
	    
	    Plugin permissionsPlugin = this.getServer().getPluginManager().getPlugin("Permissions");
	    
	    if (permissionsPlugin == null) {
	        log.info("Permission system not detected, defaulting to OP");
	        return;
	    }
	    
	    permissionHandler = ((Permissions) permissionsPlugin).getHandler();
	    log.info("Found and will use plugin "+((Permissions)permissionsPlugin).getDescription().getFullName());
	}




}
