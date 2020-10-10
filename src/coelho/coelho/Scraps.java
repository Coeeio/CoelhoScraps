package coelho.coelho;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import coelho.coelho.listeners.PlayerJoinListener;

public class Scraps extends JavaPlugin {
	
	public void onEnable() {
		saveDefaultConfig();
		
		Listeners();
		Messages();
	}
	
	private void Messages() {
		Bukkit.getConsoleSender().sendMessage("");
		Bukkit.getConsoleSender().sendMessage("§a[Scraps] §fPlugin habilited");
		Bukkit.getConsoleSender().sendMessage("§a[Scraps] §fAuthor §a" + getDescription().getAuthors().get(0));
		Bukkit.getConsoleSender().sendMessage("§a[Scraps] §fVersion §a"  + getDescription().getVersion());
		Bukkit.getConsoleSender().sendMessage("");
	}

	private void Listeners() {
		Bukkit.getPluginManager().registerEvents(new PlayerJoinListener(), this);
	}

	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage("§c[Scraps] Plugin desabilited");
	}
	
	public static Scraps getScraps() {
		return getPlugin(Scraps.class);
	}
}