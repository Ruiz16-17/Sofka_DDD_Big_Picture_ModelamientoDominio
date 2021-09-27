package co.com.gym.trainingdomain.Routine.commands;

import co.com.gym.trainingdomain.Routine.Routine;
import co.com.gym.trainingdomain.Routine.value.Description;
import co.com.gym.trainingdomain.Routine.value.ExcerciseId;
import co.com.gym.trainingdomain.Routine.value.RoutineId;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdateDescriptionExcercise extends Command {

    private final RoutineId routineId;
    private final ExcerciseId excerciseId;
    private final Description description;

    public UpdateDescriptionExcercise(RoutineId routineId, ExcerciseId excerciseId, Description description) {
        this.routineId = routineId;
        this.excerciseId = excerciseId;
        this.description = description;
    }

    public RoutineId getRoutineId() {
        return routineId;
    }

    public ExcerciseId getExcerciseId() {
        return excerciseId;
    }

    public Description getDescription() {
        return description;
    }
}
