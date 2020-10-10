package coelho.coelho.utils;

import coelho.coelho.Scraps;

public class MessageUtil {

	public static String message() {
		for (String string : Scraps.getScraps().getConfig().getStringList("messages")) {
			return string.replace("&", "§");
		}
		String message = Scraps.getScraps().getConfig().getString("message");
		return message.replace("&", "§");
	}
	
	public static String permission() {
		return Scraps.getScraps().getConfig().getString("permission");
	}
}