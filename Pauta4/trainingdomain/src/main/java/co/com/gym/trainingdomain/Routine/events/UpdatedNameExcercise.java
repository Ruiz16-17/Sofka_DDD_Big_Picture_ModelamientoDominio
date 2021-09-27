package co.com.gym.trainingdomain.Routine.events;

import co.com.gym.trainingdomain.Routine.value.ExcerciseId;
import co.com.gym.trainingdomain.Routine.value.Name;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdatedNameExcercise extends DomainEvent {

    private final ExcerciseId excerciseId;
    private final Name name;

    public UpdatedNameExcercise(ExcerciseId excerciseId, Name name) {
        super("trainingdomain.routine.updatednameexcercise");
        this.excerciseId = excerciseId;
        this.name = name;
    }

    public ExcerciseId getExcerciseId() {
        return excerciseId;
    }

    public Name getName() {
        return name;
    }
}
