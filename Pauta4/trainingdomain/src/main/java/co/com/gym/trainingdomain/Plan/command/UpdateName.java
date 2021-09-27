package co.com.gym.trainingdomain.Plan.command;

import co.com.gym.trainingdomain.Plan.value.Name;
import co.com.gym.trainingdomain.Plan.value.PlanId;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdateName extends Command {

    private final PlanId planId;
    private final Name name;

    public UpdateName(PlanId planId, Name name) {
        this.planId = planId;
        this.name = name;
    }

    public PlanId getPlanId() {
        return planId;
    }

    public Name getName() {
        return name;
    }
}
