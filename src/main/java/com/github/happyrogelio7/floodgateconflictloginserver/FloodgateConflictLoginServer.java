package com.github.happyrogelio7.floodgateconflictloginserver;

import com.github.happyrogelio7.floodgateconflictloginserver.listeners.onPostLoginEvent;
import com.github.happyrogelio7.floodgateconflictloginserver.utils.MessageColorsBungee;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;

public final class FloodgateConflictLoginServer extends Plugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        ProxyServer.getInstance().getConsole().sendMessage(MessageColorsBungee.getMsgColor("&7&m------------------------------------"));
        ProxyServer.getInstance().getConsole().sendMessage(MessageColorsBungee.getMsgColor("&a ON FloodgateConflictLoginServer &7| &aVersion:&f"));
        ProxyServer.getInstance().getConsole().sendMessage(MessageColorsBungee.getMsgColor("&r "));
        ProxyServer.getInstance().getConsole().sendMessage(MessageColorsBungee.getMsgColor("&a Thanks for using FloodgateConflictLoginServer :D"));
        ProxyServer.getInstance().getConsole().sendMessage(MessageColorsBungee.getMsgColor("&2 Created By: HappyRogelio7"));
        ProxyServer.getInstance().getConsole().sendMessage(MessageColorsBungee.getMsgColor("&r "));
        ProxyServer.getInstance().getConsole().sendMessage(MessageColorsBungee.getMsgColor("&a Version Server:&f "+ProxyServer.getInstance().getVersion()));
        ProxyServer.getInstance().getConsole().sendMessage(MessageColorsBungee.getMsgColor("&r "));
        ProxyServer.getInstance().getConsole().sendMessage(MessageColorsBungee.getMsgColor("&9&l Discord: &fhttps://discord.gg/3EebYUyeUX"));
        ProxyServer.getInstance().getConsole().sendMessage(MessageColorsBungee.getMsgColor("&d&l GitHub: &fhttps://github.com/HappyRogelio7/FloodgateConflictLoginServer1"));
        ProxyServer.getInstance().getConsole().sendMessage(MessageColorsBungee.getMsgColor("&7&m------------------------------------"));

        // Listeners:
        getProxy().getPluginManager().registerListener(this, new onPostLoginEvent());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        ProxyServer.getInstance().getConsole().sendMessage(MessageColorsBungee.getMsgColor("&7&m------------------------------------"));
        ProxyServer.getInstance().getConsole().sendMessage(MessageColorsBungee.getMsgColor("&c OFF FloodgateConflictLoginServer &7| &aVersion:&f"));
        ProxyServer.getInstance().getConsole().sendMessage(MessageColorsBungee.getMsgColor("&r "));
        ProxyServer.getInstance().getConsole().sendMessage(MessageColorsBungee.getMsgColor("&c Thanks for using FloodgateConflictLoginServer :D"));
        ProxyServer.getInstance().getConsole().sendMessage(MessageColorsBungee.getMsgColor("&c Created By: HappyRogelio7"));
        ProxyServer.getInstance().getConsole().sendMessage(MessageColorsBungee.getMsgColor("&r "));
        ProxyServer.getInstance().getConsole().sendMessage(MessageColorsBungee.getMsgColor("&c Version Server:&f "+ProxyServer.getInstance().getVersion()));
        ProxyServer.getInstance().getConsole().sendMessage(MessageColorsBungee.getMsgColor("&r "));
        ProxyServer.getInstance().getConsole().sendMessage(MessageColorsBungee.getMsgColor("&9&l Discord: &fhttps://discord.gg/3EebYUyeUX"));
        ProxyServer.getInstance().getConsole().sendMessage(MessageColorsBungee.getMsgColor("&d&l GitHub: &fhttps://github.com/HappyRogelio7/FloodgateConflictLoginServer1"));
        ProxyServer.getInstance().getConsole().sendMessage(MessageColorsBungee.getMsgColor("&7&m------------------------------------"));
    }
}
