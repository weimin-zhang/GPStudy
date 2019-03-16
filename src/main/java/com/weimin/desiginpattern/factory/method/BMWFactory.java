package com.weimin.desiginpattern.factory.method;

/**
 * BMWFactory class
 *
 * @author
 * @date
 */
public class BMWFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new BMW();
    }
}
