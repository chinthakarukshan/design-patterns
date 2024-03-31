package org.nygen.abstractFactory.region;

import org.nygen.abstractFactory.spec.EUHatchBackSpecification;
import org.nygen.abstractFactory.spec.EUSedanSpecification;
import org.nygen.abstractFactory.type.Car;
import org.nygen.abstractFactory.type.HatchBack;
import org.nygen.abstractFactory.type.Sedan;

public class EUCarFactory implements CarFactory {

    EUHatchBackSpecification euHatchBackSpecification = new EUHatchBackSpecification();
    EUSedanSpecification euSedanSpecification = new EUSedanSpecification();

    @Override
    public Car getCar(String type) {
        if (type.equals("SEDAN")) {
            return new Sedan(euSedanSpecification, "EU Sedan");
        } else if (type.equals("HATCHBACK")) {
            return new HatchBack(euHatchBackSpecification,"EU Hatchback");
        }

        return null;
    }
}
