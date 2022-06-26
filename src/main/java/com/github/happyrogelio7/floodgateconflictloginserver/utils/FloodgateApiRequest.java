package com.github.happyrogelio7.floodgateconflictloginserver.utils;

import org.geysermc.floodgate.api.FloodgateApi;

public class FloodgateApiRequest {

    public static FloodgateApi getFloodgateAPI(){
        return FloodgateApi.getInstance();
    }

}
