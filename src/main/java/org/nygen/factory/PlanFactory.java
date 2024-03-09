package org.nygen.factory;

public class PlanFactory {



    public Plan getPlan(String plan) {
        if (plan.equals(Plans.COMMERCIAL.getPlanName())) {
            return new CommercialPlan();
        } else if (plan.equals(Plans.DOMESTIC.getPlanName())) {
            return new DomesticPlan();
        } else if (plan.equals(Plans.INSTITUTIONAL.getPlanName())) {
            return new InstitutionalPlan();
        }

        return null;
    }
}
