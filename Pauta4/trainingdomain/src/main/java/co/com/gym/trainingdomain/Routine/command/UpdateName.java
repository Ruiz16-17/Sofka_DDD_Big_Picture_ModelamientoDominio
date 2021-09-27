package co.com.gym.trainingdomain.Routine.command;

import co.com.gym.trainingdomain.Routine.value.Name;
import co.com.gym.trainingdomain.Routine.value.RoutineId;
import co.com.sofka.domain.generic.Command;

public class UpdateName extends Command {

    private final RoutineId routineId;
    private final Name name;

    public UpdateName(RoutineId routineId, Name name) {
        this.routineId = routineId;
        this.name = name;
    }

    public RoutineId getRoutineId() {
        return routineId;
    }

    public Name getName() {
        return name;
    }
}
