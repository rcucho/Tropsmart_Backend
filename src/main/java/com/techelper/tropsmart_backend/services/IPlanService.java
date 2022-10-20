package com.techelper.tropsmart_backend.services;

import com.techelper.tropsmart_backend.models.Plan;
import com.techelper.tropsmart_backend.resources.comunications.PlanResponse;
import com.techelper.tropsmart_backend.resources.inputs.PlanInput;

public interface IPlanService extends ICrudService<Plan>{
    PlanResponse findPlansByPrice(double priceValue);
    PlanResponse findPlansHigherThan(double priceValue);
    PlanResponse findPlansLessThan(double priceValue);
    PlanResponse findAllPlans();
    PlanResponse registerPlan(PlanInput planInput);
    PlanResponse findPlanById(int planId);
    PlanResponse deletePlanById(int planId);
}
