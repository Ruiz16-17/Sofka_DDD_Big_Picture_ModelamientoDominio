package co.com.gym.trainingdomain.Routine.events;

import co.com.gym.trainingdomain.Routine.value.ExcerciseId;
import co.com.gym.trainingdomain.Routine.value.WeighExcercise;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdatedWeighExcercise extends DomainEvent {

    private final ExcerciseId excerciseId;
    private final WeighExcercise weighExcercise;

    public UpdatedWeighExcercise(ExcerciseId excerciseId, WeighExcercise weighExcercise) {
        super("trainingdomain.routine.updatedweighsexcercise");
        this.excerciseId = excerciseId;
        this.weighExcercise = weighExcercise;
    }

    public ExcerciseId getExcerciseId() {
        return excerciseId;
    }

    public WeighExcercise getWeighExcercise() {
        return weighExcercise;
    }
}
