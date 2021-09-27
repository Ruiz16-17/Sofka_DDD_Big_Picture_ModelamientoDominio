package co.com.gym.trainingdomain.Routine.event;

import co.com.gym.trainingdomain.Routine.value.ExcerciseId;
import co.com.gym.trainingdomain.Routine.value.SectionId;
import co.com.gym.trainingdomain.Routine.value.WeighExcercise;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdatedWeighExcercise extends DomainEvent {

    private final SectionId sectionId;
    private final ExcerciseId excerciseId;
    private final WeighExcercise weighExcercise;

    public UpdatedWeighExcercise(SectionId sectionId, ExcerciseId excerciseId, WeighExcercise weighExcercise) {
        super("trainingdomain.routine.updatedweighsexcercise");
        this.sectionId = sectionId;
        this.excerciseId = excerciseId;
        this.weighExcercise = weighExcercise;
    }

    public SectionId getSectionId() {
        return sectionId;
    }

    public ExcerciseId getExcerciseId() {
        return excerciseId;
    }

    public WeighExcercise getWeighExcercise() {
        return weighExcercise;
    }
}
