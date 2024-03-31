package org.nygen.abstractFactory;

import org.nygen.abstractFactory.region.CarFactory;
import org.nygen.abstractFactory.type.Car;
import org.nygen.abstractFactory.type.Sedan;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractCarFactory abstractCarFactory = new AbstractCarFactory();

        CarFactory euCarFactory = AbstractCarFactory.getCarFactory("EU");
        Car car = euCarFactory.getCar("SEDAN");
        System.out.println(car.getModel());

        CarFactory usCarFactory = AbstractCarFactory.getCarFactory("US");
        Car usCar = usCarFactory.getCar("HATCHBACK");
        System.out.println(usCar.getModel());
    }
}
