package net.creepcraft.ipencil.creepcraft;

import java.io.File;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerListener;

public class creepcraftPlayerListener extends PlayerListener{
	private String joinMessage = null;
    private creepcraft plugin;
    
	public creepcraftPlayerListener(creepcraft plugin) {
        this.plugin = plugin;
	}    


	public void onPlayerJoin(PlayerJoinEvent event){
		Player p = event.getPlayer();
		String name = p.getName();
		File file=new File("world" +"/players/" + name + ".dat");
				  boolean exists = file.exists();
				 
				  if (!exists) {
					  
					  event.setJoinMessage(this.joinMessage);
				      
					  this.plugin.getServer().broadcastMessage( "§a" + "Welcome " + name+"! Have fun on the server :)");
					  
					  p.sendMessage("§1 Welcome to [insert catchy name]! You now have to join either the Good or the Evil faction. Not only will it decide who are your friends and who are your foes, but also where you will have your home!");

					  
}
				  
				  
				  
				  
	}
	}
