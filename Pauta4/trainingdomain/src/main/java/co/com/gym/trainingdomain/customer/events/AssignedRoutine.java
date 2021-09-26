package co.com.gym.trainingdomain.customer.events;

import co.com.gym.trainingdomain.customer.value.RoutineId;
import co.com.sofka.domain.generic.DomainEvent;

public class AssignedRoutine extends DomainEvent {

    private final RoutineId routineId;

    public AssignedRoutine(RoutineId routineId) {
        super("training.customer.assginedroutine");
        this.routineId = routineId;
    }

    public RoutineId getRoutineId() {
        return routineId;
    }
}
