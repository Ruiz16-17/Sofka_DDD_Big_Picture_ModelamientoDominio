package co.com.gym.trainingdomain.Routine.commands;

import co.com.gym.trainingdomain.Routine.value.ExcerciseId;
import co.com.gym.trainingdomain.Routine.value.Name;
import co.com.gym.trainingdomain.Routine.value.RoutineId;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdateNameExcercise extends Command {

    private final RoutineId routineId;
    private final ExcerciseId excerciseId;
    private final Name name;

    public UpdateNameExcercise(RoutineId routineId, ExcerciseId excerciseId, Name name) {
        this.routineId = routineId;
        this.excerciseId = excerciseId;
        this.name = name;
    }

    public RoutineId getRoutineId() {
        return routineId;
    }

    public ExcerciseId getExcerciseId() {
        return excerciseId;
    }

    public Name getName() {
        return name;
    }
}
