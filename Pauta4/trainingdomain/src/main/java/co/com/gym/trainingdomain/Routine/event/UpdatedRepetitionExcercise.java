package co.com.gym.trainingdomain.Routine.event;

import co.com.gym.trainingdomain.Routine.value.ExcerciseId;
import co.com.gym.trainingdomain.Routine.value.RepetitionsExcercise;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdatedRepetitionExcercise extends DomainEvent {

    private final ExcerciseId excerciseId;
    private final RepetitionsExcercise repetitionsExcercise;

    public UpdatedRepetitionExcercise(ExcerciseId excerciseId, RepetitionsExcercise repetitionsExcercise) {
        super("trainingdomain.routine.updatedrepetitionexcercise");
        this.excerciseId = excerciseId;
        this.repetitionsExcercise = repetitionsExcercise;
    }
}
