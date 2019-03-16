package com.weimin.desiginpattern.factory.method;


/**
 * BenzFactory class
 *
 * @author
 * @date
 */
public class BenzFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Benz();
    }
}
