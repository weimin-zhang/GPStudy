package com.weimin.desiginpatter.factory.abstractfactory;

/**
 * LuxurySeat class
 *
 * @author
 * @date
 */
public class LowSeat implements Seat {
    @Override
    public void massage() {
        System.out.println("LowSeat massage");
    }
}
