package co.com.gym.trainingdomain.Routine.event;

import co.com.gym.trainingdomain.Routine.value.Description;
import co.com.gym.trainingdomain.Routine.value.Name;
import co.com.sofka.domain.generic.DomainEvent;

public class CreatedRoutine extends DomainEvent {

    private final Name name;
    private final Description description;

    public CreatedRoutine(Name name, Description description) {
        super("trainingdomain.routine.createdroutine");
        this.name = name;
        this.description = description;
    }

    public Name getName() {
        return name;
    }

    public Description getDescription() {
        return description;
    }

}
