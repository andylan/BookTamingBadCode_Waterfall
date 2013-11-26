package com.wubinben.tamingbadcode.waterfall.hotelworldclock;

/**
 * Created with IntelliJ IDEA.
 * User: Ben
 * Date: 13-11-27
 * Time: 上午12:17
 * To change this template use File | Settings | File Templates.
 */
public class LondonClock extends CityClock {
    private static final int UTC_OFFSET = 0;

    @Override
    public void updateCityTime(int utcZeroTime) {
        cityTime = utcZeroTime + UTC_OFFSET;
    }
}