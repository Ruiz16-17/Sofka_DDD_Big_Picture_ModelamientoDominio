package co.com.gym.trainingdomain.Plan.event;

import co.com.gym.trainingdomain.Plan.value.Name;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdatedName extends DomainEvent {

    private final Name name;

    public UpdatedName(Name name) {
        super("trainingdomain.plan.updatedname");
        this.name = name;
    }

    public Name getName() {
        return name;
    }
}
