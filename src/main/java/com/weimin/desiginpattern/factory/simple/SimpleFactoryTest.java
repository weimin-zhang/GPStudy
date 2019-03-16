package com.weimin.desiginpattern.factory.simple;

/**
 * SimpleFactoryTest class
 *
 * @author
 * @date
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        Car bmw = CarFactory.createCar("宝马");
        bmw.run();
        Car benz = CarFactory.createCar("奔驰");
        benz.run();
    }
}
