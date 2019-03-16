package com.weimin.desiginpatter.factory.abstractfactory;

/**
 * LuxuryTyre class
 *
 * @author
 * @date
 */
public class LuxuryTyre implements Tyre {
    @Override
    public void revolve() {
        System.out.println("LuxuryTyre revolve");
    }
}
