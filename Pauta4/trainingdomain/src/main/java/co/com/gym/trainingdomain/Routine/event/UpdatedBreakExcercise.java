package co.com.gym.trainingdomain.Routine.event;

import co.com.gym.trainingdomain.Routine.value.BreakExcercise;
import co.com.gym.trainingdomain.Routine.value.ExcerciseId;
import co.com.gym.trainingdomain.Routine.value.SectionId;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdatedBreakExcercise extends DomainEvent {

    private final SectionId sectionId;
    private final ExcerciseId excerciseId;
    private final BreakExcercise breakExcercise;

    public UpdatedBreakExcercise(SectionId sectionId,ExcerciseId excerciseId, BreakExcercise breakExcercise) {
        super("traininddomain.routine.updatedbreakexcercise");
        this.sectionId = sectionId;
        this.excerciseId = excerciseId;
        this.breakExcercise = breakExcercise;
    }

    public SectionId getSectionId() {
        return sectionId;
    }

    public ExcerciseId getExcerciseId() {
        return excerciseId;
    }

    public BreakExcercise getBreakExcercise() {
        return breakExcercise;
    }
}
