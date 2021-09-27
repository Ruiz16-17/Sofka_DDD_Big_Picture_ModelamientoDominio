package co.com.gym.trainingdomain.Routine.commands;

import co.com.gym.trainingdomain.Routine.value.Name;
import co.com.gym.trainingdomain.Routine.value.RoutineId;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;

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
