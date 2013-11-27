package com.wubinben.tamingbadcode.waterfall.hotelworldclock;

/**
 * Created with IntelliJ IDEA.
 * User: Ben
 * Date: 13-11-27
 * Time: 下午10:47
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        // Attach 5 cities to TimeSubject class
        TimeSubject.attach("Beijing", new BeijingClock());
        TimeSubject.attach("London", new LondonClock());
        TimeSubject.attach("Moscow", new MoscowClock());
        TimeSubject.attach("Sydney", new SydneyClock());
        TimeSubject.attach("NewYork", new NewYorkClock());

        // Adjust the time of Beijing clock to be 9
        TimeSubject.getCityClock("Beijing").setUtcZeroTime(9);

        // Display the time of the 5 cities
        System.out.println("The time of Beijing is " + TimeSubject.getCityClock("Beijing").getCityTime());
        System.out.println("The time of London is " + TimeSubject.getCityClock("London").getCityTime());
        System.out.println("The time of Moscow is " + TimeSubject.getCityClock("Moscow").getCityTime());
        System.out.println("The time of Sydney is " + TimeSubject.getCityClock("Sydney").getCityTime());
        System.out.println("The time of New York is " + TimeSubject.getCityClock("NewYork").getCityTime());
    }
}
