package com.weimin.desiginpattern.factory.abstractfactory;

/**
 * LuxurySeat class
 *
 * @author
 * @date
 */
public class LuxurySeat implements Seat {
    @Override
    public void massage() {
        System.out.println("LuxurySeat massage");
    }
}
