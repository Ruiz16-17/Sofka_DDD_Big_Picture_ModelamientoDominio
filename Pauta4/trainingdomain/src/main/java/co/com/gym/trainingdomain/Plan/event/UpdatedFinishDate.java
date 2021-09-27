package co.com.gym.trainingdomain.Plan.event;

import co.com.gym.trainingdomain.Plan.value.FinishDate;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdatedFinishDate extends DomainEvent {

    private final FinishDate finishDate;

    public UpdatedFinishDate(FinishDate finishDate) {
        super("trainingdomain.plan.updatedfinishdate");
        this.finishDate = finishDate;
    }

    public FinishDate getFinishDate() {
        return finishDate;
    }
}
