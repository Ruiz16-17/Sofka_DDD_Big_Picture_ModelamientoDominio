package co.com.gym.trainingdomain.Plan.event;

import co.com.gym.trainingdomain.Plan.value.FinishDate;
import co.com.gym.trainingdomain.Plan.value.Name;
import co.com.sofka.domain.generic.DomainEvent;

public class CreatedPlan extends DomainEvent {

    private final FinishDate finishDate;
    private final Name name;

    public CreatedPlan(FinishDate finishDate, Name name) {
        super("trainingdomain.plan.createdplan");
        this.finishDate = finishDate;
        this.name = name;
    }

    public FinishDate getFinishDate() {
        return finishDate;
    }

    public Name getName() {
        return name;
    }
}
