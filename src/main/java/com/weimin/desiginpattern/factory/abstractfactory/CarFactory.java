package com.weimin.desiginpattern.factory.abstractfactory;

/**
 * CarFactory class
 *
 * @author
 * @date
 */
public interface CarFactory {
    Engine createEngine();
    Seat createSeat();
    Tyre createTyre();
}
