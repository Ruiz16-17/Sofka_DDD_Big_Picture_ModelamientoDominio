package co.com.gym.trainingdomain.Routine.events;

import co.com.gym.trainingdomain.Routine.value.Description;
import co.com.gym.trainingdomain.Routine.value.Name;
import co.com.gym.trainingdomain.Routine.value.RoutineId;
import co.com.gym.trainingdomain.Routine.value.SectionId;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.Set;

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
