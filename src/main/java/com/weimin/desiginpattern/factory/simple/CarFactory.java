package com.weimin.desiginpattern.factory.simple;


/**
 * CarFactory class
 *
 * @author
 * @date
 */
public class CarFactory {
    public static Car createCar(String type) {
        Car car = null;
        if ("奔驰".equals(type)) {
            car = new Benz();
        } else if ("宝马".equals(type)) {
            car = new BMW();
        }

        return car;
    }
}
