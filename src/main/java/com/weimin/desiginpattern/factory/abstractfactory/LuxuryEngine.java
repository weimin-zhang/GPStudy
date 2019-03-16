package com.weimin.desiginpattern.factory.abstractfactory;

/**
 * LuxuryEngine class
 *
 * @author
 * @date
 */
public class LuxuryEngine implements Engine {
    @Override
    public void run() {
        System.out.println("LuxuryEngine run");
    }

    @Override
    public void start() {
        System.out.println("LuxuryEngine start");
    }
}
