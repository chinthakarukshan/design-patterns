package org.nygen.factory;

public class FactoryTest {
    public static void main(String[] args) {
        PlanFactory planFactory = new PlanFactory();

        Plan planDomestic = planFactory.getPlan(Plans.DOMESTIC.getPlanName());
        planDomestic.getRate();
        planDomestic.calculateBill(300);

        Plan institutional = planFactory.getPlan(Plans.INSTITUTIONAL.getPlanName());
        institutional.getRate();
        institutional.calculateBill(200);

        Plan commercialPlan = planFactory.getPlan(Plans.COMMERCIAL.getPlanName());
        commercialPlan.getRate();
        commercialPlan.calculateBill(600);
    }
}
