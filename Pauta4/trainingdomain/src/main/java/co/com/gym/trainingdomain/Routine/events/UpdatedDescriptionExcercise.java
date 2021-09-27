package co.com.gym.trainingdomain.Routine.events;

import co.com.gym.trainingdomain.Routine.value.Description;
import co.com.gym.trainingdomain.Routine.value.ExcerciseId;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdatedDescriptionExcercise extends DomainEvent {

    private final ExcerciseId excerciseId;
    private final Description description;

    public UpdatedDescriptionExcercise(ExcerciseId excerciseId, Description description) {
        super("trainingdomain.routine.updateddescriptionexcercise");
        this.excerciseId = excerciseId;
        this.description = description;
    }

    public ExcerciseId getExcerciseId() {
        return excerciseId;
    }

    public Description getDescription() {
        return description;
    }
}
