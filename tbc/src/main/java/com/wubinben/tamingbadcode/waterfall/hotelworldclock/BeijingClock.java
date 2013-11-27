package com.wubinben.tamingbadcode.waterfall.hotelworldclock;

/**
 * Created with IntelliJ IDEA.
 * User: Ben
 * Date: 13-11-27
 * Time: 上午12:02
 * To change this template use File | Settings | File Templates.
 */
public class BeijingClock extends CityClock {
    private static final int UTC_OFFSET = 8;

    @Override
    protected int convertCityTimeToUtcZeroTime(int cityTime) {
        return cityTime - UTC_OFFSET;
    }

    @Override
    public void updateCityTime(int utcZeroTime) {
        cityTime = utcZeroTime + UTC_OFFSET;
    }
}
