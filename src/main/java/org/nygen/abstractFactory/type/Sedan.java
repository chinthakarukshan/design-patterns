package org.nygen.abstractFactory.type;

import org.nygen.abstractFactory.spec.Specification;

public class Sedan implements Car{
    private Specification specification;
    private String model;

    public Sedan(Specification specification, String model) {
        this.specification = specification;
        this.model = model;
    }

    public Specification getSpecification() {
        return specification;
    }

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
