package com.wylarel.chatping;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;

public class Main extends JavaPlugin implements Listener {

	@Override
	public void onEnable() {
		saveDefaultConfig();
		System.out.println("ChatPing started");
		Bukkit.getPluginManager().registerEvents(this, this);
	}
	
	@Override
	public void onDisable() {
		System.out.println("ChatPing stopped");
	}
	
	@EventHandler
    public void onChat(AsyncPlayerChatEvent e) {
        Bukkit.getOnlinePlayers().forEach(player -> {
            if (e.getMessage().contains(player.getName()) && (e.getPlayer() != player || getConfig().getBoolean("canselfping"))) {
            	if (getConfig().getBoolean("color.enable")) {
                    String lastColor = ChatColor.getLastColors(e.getMessage());
                    e.setMessage(e.getMessage().replaceAll(player.getName(), getConfig().getString("color.value").replace("&", "§") + player.getName() + (lastColor.isEmpty() ? ChatColor.RESET : lastColor)));
                }
                if (getConfig().getBoolean("sound.enable")) {
                	player.playSound(player.getEyeLocation(), Sound.valueOf(getConfig().getString("sound.value")), 1, 1);
                	//Sound.ENTITY_EXPERIENCE_ORB_PICKUP
                }
                if (getConfig().getBoolean("actionbar.enable")) {
                    player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(getConfig().getString("actionbar.message").replace("&",  "§").replace("<sender>", e.getPlayer().getDisplayName())));
                }
            }
        });
    }
}
	