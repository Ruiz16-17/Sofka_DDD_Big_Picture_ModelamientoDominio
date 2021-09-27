package co.com.gym.trainingdomain.Plan.command;

import co.com.gym.trainingdomain.Plan.value.FinishDate;
import co.com.gym.trainingdomain.Plan.value.Name;
import co.com.gym.trainingdomain.Plan.value.PlanId;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;

public class CreatePlan extends Command {

    private final PlanId planId;
    private final FinishDate finishDate;
    private final Name name;

    public CreatePlan(PlanId planId, FinishDate finishDate, Name name) {
        this.planId = planId;
        this.finishDate = finishDate;
        this.name = name;
    }

    public PlanId getPlanId() {
        return planId;
    }

    public FinishDate getFinishDate() {
        return finishDate;
    }

    public Name getName() {
        return name;
    }
}
