package com.weimin.desiginpattern.factory.abstractfactory;

/**
 * LuxuryEngine class
 *
 * @author
 * @date
 */
public class LowEngine implements Engine {
    @Override
    public void run() {
        System.out.println("LowEngine run");
    }

    @Override
    public void start() {
        System.out.println("LowEngine start");
    }
}
