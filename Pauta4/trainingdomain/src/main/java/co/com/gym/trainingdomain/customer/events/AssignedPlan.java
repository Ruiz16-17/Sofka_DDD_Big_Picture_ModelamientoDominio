package co.com.gym.trainingdomain.customer.events;

import co.com.gym.trainingdomain.customer.value.PlanId;
import co.com.sofka.domain.generic.DomainEvent;

public class AssignedPlan extends DomainEvent {

    private final PlanId planId;

    public AssignedPlan(PlanId planId) {
        super("training.customer.assginedplan");
        this.planId = planId;
    }

    public PlanId getPlanId() {
        return planId;
    }
}
