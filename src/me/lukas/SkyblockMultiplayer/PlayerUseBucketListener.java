package me.lukas.skyblockmultiplayer;

import org.bukkit.ChatColor;
import org.bukkit.event.player.PlayerBucketEmptyEvent;
import org.bukkit.event.player.PlayerListener;

public class PlayerUseBucketListener extends PlayerListener {

	SkyblockMultiplayer plugin;

	public PlayerUseBucketListener(SkyblockMultiplayer instance) {
		this.plugin = instance;
	}

	public void onPlayerBucketEmpty(PlayerBucketEmptyEvent event) {
		if (event.getPlayer().getWorld().equals(SkyblockMultiplayer.getSkyblockIslands())) { // Pr�fe ob der Spieler in der Welt SkyblockMultiplayer ist
			if (event.getPlayer().getLocation().getBlockX() >= -20 && event.getPlayer().getLocation().getBlockX() <= 20) {
				if (event.getPlayer().getLocation().getBlockZ() >= -20 && event.getPlayer().getLocation().getBlockZ() <= 20) {
					event.setCancelled(true);
					event.getPlayer().sendMessage(ChatColor.RED + "You can not use a bucket here!");
					return;
				}
			}
		}
	}
}