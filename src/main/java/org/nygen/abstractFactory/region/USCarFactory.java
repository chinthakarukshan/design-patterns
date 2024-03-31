package org.nygen.abstractFactory.region;

import org.nygen.abstractFactory.spec.USHatchBackSpecification;
import org.nygen.abstractFactory.spec.USSedanSpecification;
import org.nygen.abstractFactory.type.Car;
import org.nygen.abstractFactory.type.HatchBack;
import org.nygen.abstractFactory.type.Sedan;

public class USCarFactory implements CarFactory {

    USHatchBackSpecification usHatchBackSpecification = new USHatchBackSpecification();
    USSedanSpecification usSedanSpecification = new USSedanSpecification();

    @Override
    public Car getCar(String type) {
        if (type.equals("SEDAN")) {
            return new Sedan(usSedanSpecification, "US Sedan");
        } else if (type.equals("HATCHBACK")) {
            return new HatchBack(usHatchBackSpecification,"US Hatchback");
        }

        return null;
    }
}
