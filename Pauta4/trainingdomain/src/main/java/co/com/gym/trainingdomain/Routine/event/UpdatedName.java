package co.com.gym.trainingdomain.Routine.event;

import co.com.gym.trainingdomain.Routine.value.Name;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdatedName extends DomainEvent {

    private final Name name;

    public UpdatedName(Name name) {
        super("trainingdomain.routine.updatedname");
        this.name = name;
    }

    public Name getName() {
        return name;
    }
}
