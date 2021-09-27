package co.com.gym.trainingdomain.customer.command;

import co.com.gym.trainingdomain.customer.value.CustomerId;
import co.com.gym.trainingdomain.customer.value.PlanId;
import co.com.sofka.domain.generic.Command;

public class AssingPlan extends Command {

    private final CustomerId customerId;
    private final PlanId planId;

    public AssingPlan(CustomerId customerId, PlanId planId) {
        this.customerId = customerId;
        this.planId = planId;
    }

    public CustomerId getCustomerId() {
        return customerId;
    }

    public PlanId getPlanId() {
        return planId;
    }
}
