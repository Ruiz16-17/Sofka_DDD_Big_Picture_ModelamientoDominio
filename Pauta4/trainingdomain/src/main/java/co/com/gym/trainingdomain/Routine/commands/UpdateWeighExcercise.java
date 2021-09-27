package co.com.gym.trainingdomain.Routine.commands;

import co.com.gym.trainingdomain.Routine.value.ExcerciseId;
import co.com.gym.trainingdomain.Routine.value.RoutineId;
import co.com.gym.trainingdomain.Routine.value.WeighExcercise;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdateWeighExcercise extends Command {

    private final RoutineId routineId;
    private final ExcerciseId excerciseId;
    private final WeighExcercise weighExcercise;

    public UpdateWeighExcercise(RoutineId routineId, ExcerciseId excerciseId, WeighExcercise weighExcercise) {
        this.routineId = routineId;
        this.excerciseId = excerciseId;
        this.weighExcercise = weighExcercise;
    }

    public RoutineId getRoutineId() {
        return routineId;
    }

    public ExcerciseId getExcerciseId() {
        return excerciseId;
    }

    public WeighExcercise getWeighExcercise() {
        return weighExcercise;
    }
}
