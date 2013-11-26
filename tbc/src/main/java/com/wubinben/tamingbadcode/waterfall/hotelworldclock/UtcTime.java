package com.wubinben.tamingbadcode.waterfall.hotelworldclock;

import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: Ben
 * Date: 13-11-26
 * Time: 下午11:38
 * To change this template use File | Settings | File Templates.
 */
public class UtcTime extends TimeSubject {
    private int utcZeroTime;

    @Override
    public void notifyAllCityClocks() {
        Iterator<CityClock> cityClockIterator = cityClocks.values().iterator();
        while (cityClockIterator.hasNext()) {
            CityClock cityClock = cityClockIterator.next();
            cityClock.updateCityTime(utcZeroTime);
        }
    }

    public int getUtcZeroTime() {
        return utcZeroTime;
    }

    public void setUtcZeroTime(int utcZeroTime) {
        this.utcZeroTime = utcZeroTime;
        notifyAllCityClocks();
    }

}
