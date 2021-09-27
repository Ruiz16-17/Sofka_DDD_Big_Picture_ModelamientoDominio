package co.com.gym.trainingdomain.Plan.command;

import co.com.gym.trainingdomain.Plan.value.FinishDate;
import co.com.gym.trainingdomain.Plan.value.PlanId;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdateFinishDate extends Command {

    private final PlanId planId;
    private final FinishDate finishDate;

    public UpdateFinishDate(PlanId planId, FinishDate finishDate) {
        this.planId = planId;
        this.finishDate = finishDate;
    }

    public PlanId getPlanId() {
        return planId;
    }

    public FinishDate getFinishDate() {
        return finishDate;
    }
}
