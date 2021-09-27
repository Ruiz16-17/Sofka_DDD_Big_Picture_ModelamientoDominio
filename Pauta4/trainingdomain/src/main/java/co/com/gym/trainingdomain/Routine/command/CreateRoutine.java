package co.com.gym.trainingdomain.Routine.command;

import co.com.gym.trainingdomain.Routine.value.Description;
import co.com.gym.trainingdomain.Routine.value.Name;
import co.com.gym.trainingdomain.Routine.value.RoutineId;
import co.com.sofka.domain.generic.Command;

public class CreateRoutine extends Command {

    private final RoutineId routineId;
    private final Name name;
    private final Description description;

    public CreateRoutine(RoutineId routineId, Name name, Description description) {
        this.routineId = routineId;
        this.name = name;
        this.description = description;
    }

    public RoutineId getRoutineId() {
        return routineId;
    }

    public Name getName() {
        return name;
    }

    public Description getDescription() {
        return description;
    }
}
