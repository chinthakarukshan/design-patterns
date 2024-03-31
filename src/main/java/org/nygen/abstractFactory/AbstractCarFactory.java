package org.nygen.abstractFactory;

import org.nygen.abstractFactory.region.CarFactory;
import org.nygen.abstractFactory.region.EUCarFactory;
import org.nygen.abstractFactory.region.USCarFactory;

public class AbstractCarFactory {
    public static CarFactory getCarFactory(String region) {
        if (region.equals("EU")) {
            return new EUCarFactory();
        } else if (region.equals("US")) {
            return new USCarFactory();
        }
        return null;
    }
}
