package com.weimin.desiginpattern.factory.abstractfactory;

/**
 * LuxuryTyre class
 *
 * @author
 * @date
 */
public class LowTyre implements Tyre {
    @Override
    public void revolve() {
        System.out.println("LowTyre revolve");
    }
}
