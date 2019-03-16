package com.weimin.desiginpatter.factory.abstractfactory;

/**
 * AbstractFactoryTest class
 *
 * @author
 * @date
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        LuxuryCarFactory luxuryCarFactory = new LuxuryCarFactory();
        Engine engine = luxuryCarFactory.createEngine();
        Seat seat = luxuryCarFactory.createSeat();
        Tyre tyre = luxuryCarFactory.createTyre();
        engine.run();
        engine.start();
        seat.massage();
        tyre.revolve();
    }
}
