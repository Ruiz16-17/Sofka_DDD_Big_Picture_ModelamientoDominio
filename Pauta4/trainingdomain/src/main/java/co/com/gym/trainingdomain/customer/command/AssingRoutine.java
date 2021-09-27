package co.com.gym.trainingdomain.customer.command;

import co.com.gym.trainingdomain.customer.value.CustomerId;
import co.com.gym.trainingdomain.customer.value.RoutineId;
import co.com.sofka.domain.generic.Command;

public class AssingRoutine extends Command {

    private final CustomerId customerId;
    private final RoutineId routineId;

    public AssingRoutine(CustomerId customerId, RoutineId routineId) {
        this.customerId = customerId;
        this.routineId = routineId;
    }

    public CustomerId getCustomerId() {
        return customerId;
    }

    public RoutineId getRoutineId() {
        return routineId;
    }
}
