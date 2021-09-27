package co.com.gym.trainingdomain.Routine.commands;

import co.com.gym.trainingdomain.Routine.value.Description;
import co.com.gym.trainingdomain.Routine.value.RoutineId;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdateDescription extends Command {

    private final RoutineId routineId;
    private final Description description;

    public UpdateDescription(RoutineId routineId, Description description) {
        this.routineId = routineId;
        this.description = description;
    }

    public RoutineId getRoutineId() {
        return routineId;
    }

    public Description getDescription() {
        return description;
    }
}
