package com.weimin.desiginpatter.factory.method;

/**
 * MethodFactoryTest class
 *
 * @author
 * @date
 */
public class MethodFactoryTest {
    public static void main(String[] args) {
        Car benz = new BenzFactory().createCar();
        benz.run();
        Car bmw = new BMWFactory().createCar();
        bmw.run();
    }
}
