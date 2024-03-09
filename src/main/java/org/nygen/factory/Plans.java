package org.nygen.factory;

public enum Plans {

    DOMESTIC("DOMESTIC"),COMMERCIAL("COMMERCIAL"),INSTITUTIONAL("INSTITUTIONAL");
    private String planName;

    private Plans(String planName) {
        this.planName = planName;
    }

    public String getPlanName() {
        return planName;
    }
}
