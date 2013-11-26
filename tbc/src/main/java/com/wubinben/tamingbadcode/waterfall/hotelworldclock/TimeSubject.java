package com.wubinben.tamingbadcode.waterfall.hotelworldclock;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: Ben
 * Date: 13-11-26
 * Time: 下午11:05
 * To change this template use File | Settings | File Templates.
 */
public abstract class TimeSubject {
    protected static HashMap<String, CityClock> cityClocks = new HashMap<String, CityClock>();

    public static void attach(String cityName, CityClock cityClock) {
        cityClocks.put(cityName, cityClock);
    }

    public static void detach(String cityName) {
        cityClocks.remove(cityName);
    }

    public abstract void notifyAllCityClocks();
}
