package net.creepcraft;

import java.io.File;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.player.*;

public class CreepCraftPlayerListener extends PlayerListener {
	private CreepCraft plugin;
	private String joinMessage = null;

	public CreepCraftPlayerListener(CreepCraft plugin) {
		this.plugin = plugin;
	}

	@Override
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		String name = player.getName();
		File file = new File("world" + "/players/" + name + ".dat");
		if(file.exists())
			return;
		event.setJoinMessage(joinMessage);
		plugin.getServer().broadcastMessage(
				ChatColor.GREEN + "Welcome " + name
						+ "! Have fun on the server :)");
		player.sendMessage(ChatColor.DARK_BLUE + "Welcome to "
				+ "[insert catchy name]! "
				+ "You now have to join either the Good "
				+ "or the Evil faction. Not only will it "
				+ "decide who are your friends and who are "
				+ "your foes, but also where you will " + "have your home!");
	}

	@Override
	public void onPlayerChat(PlayerChatEvent event) {
		if(event.isCancelled())
			return;
	}
}
