package com.github.happyrogelio7.floodgateconflictloginserver.listeners;

import com.github.happyrogelio7.floodgateconflictloginserver.utils.FloodgateApiRequest;
import com.github.happyrogelio7.floodgateconflictloginserver.utils.MessageColorsBungee;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.PostLoginEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class onPostLoginEvent implements Listener {

    @EventHandler
    public void onPostLoginEvent(PostLoginEvent event){

        ProxiedPlayer p = event.getPlayer();

        if (FloodgateApiRequest.getFloodgateAPI().isFloodgatePlayer(p.getUniqueId())){
            p.sendMessage(MessageColorsBungee.getMsgColor("&aYour current user is logged in from &fMinecraft Bedrock Edition&a."));
            System.out.println("Bedrock Player Login!");
        } else {
            if (p.getName().contains(FloodgateApiRequest.getFloodgateAPI().getPlayerPrefix())) {
                p.disconnect(MessageColorsBungee.getMsgColor(
                        "&fServer Name &7| &cAuth"
                                +"\n"
                                +"&r "
                                +"\n"
                                +"&cKick: &fYour username starts the same as Bedrock users. Please try another nickname."
                                +"\n"
                                +"&c Bedrock player nicknames begin with the following prefix: &f"+FloodgateApiRequest.getFloodgateAPI().getPlayerPrefix()
                                +"\n"
                                +"&r "
                                +"\n"
                                +"&cImportant!: &fIf you think it's a mistake, contact the Staff via Discord."
                                +"\n"
                                +"&r "
                                +"\n"
                                +"&9Discord: &fhttps://discord.gg/yourserverinviteid"
                                +"\n"
                ));

                System.out.println("Java Player Kick conflict Bedrock!");
            } else {
                p.sendMessage(MessageColorsBungee.getMsgColor("&aYour current user is logged in from &fMinecraft Java Edition&a."));
                System.out.println("Java Player Login!");
            }
        }
    }
}

