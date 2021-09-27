package co.com.gym.trainingdomain.Routine.events;

import co.com.gym.trainingdomain.Routine.value.Description;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdatedDescription extends DomainEvent {

    private final Description description;

    public UpdatedDescription(Description description) {
        super("trainingdomain.routine.updateddescription");
        this.description = description;
    }

    public Description getDescription() {
        return description;
    }
}
