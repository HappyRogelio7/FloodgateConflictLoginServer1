package com.github.happyrogelio7.floodgateconflictloginserver.utils;

import net.md_5.bungee.api.ChatColor;

public class MessageColorsBungee {

    public static String getMsgColor(String text) {
        return ChatColor.translateAlternateColorCodes('&', text);
    }

}
