package co.com.gym.trainingdomain.Routine.event;

import co.com.gym.trainingdomain.Routine.value.ExcerciseId;
import co.com.gym.trainingdomain.Routine.value.RepetitionsExcercise;
import co.com.gym.trainingdomain.Routine.value.SectionId;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdatedRepetitionExcercise extends DomainEvent {

    private final SectionId sectionId;
    private final ExcerciseId excerciseId;
    private final RepetitionsExcercise repetitionsExcercise;

    public UpdatedRepetitionExcercise(SectionId sectionId,ExcerciseId excerciseId, RepetitionsExcercise repetitionsExcercise) {
        super("trainingdomain.routine.updatedrepetitionexcercise");
        this.sectionId = sectionId;
        this.excerciseId = excerciseId;
        this.repetitionsExcercise = repetitionsExcercise;
    }

    public SectionId getSectionId() {
        return sectionId;
    }

    public ExcerciseId getExcerciseId() {
        return excerciseId;
    }

    public RepetitionsExcercise getRepetitionsExcercise() {
        return repetitionsExcercise;
    }
}
