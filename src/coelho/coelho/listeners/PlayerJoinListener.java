package coelho.coelho.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import coelho.coelho.utils.MessageUtil;

public class PlayerJoinListener implements Listener {
	
	@EventHandler
	public void listener(PlayerJoinEvent event) {
		if (event.getPlayer().hasPermission(MessageUtil.permission())) {
			event.getPlayer().sendMessage(MessageUtil.message());
		}
	}
}