package org.nygen.abstractFactory.region;

import org.nygen.abstractFactory.type.Car;

public interface CarFactory {
    Car getCar(String type);
}
