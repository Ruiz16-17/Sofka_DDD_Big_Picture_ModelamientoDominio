package co.com.gym.trainingdomain.Routine.event;

import co.com.gym.trainingdomain.Routine.value.ExcerciseId;
import co.com.gym.trainingdomain.Routine.value.Name;
import co.com.gym.trainingdomain.Routine.value.SectionId;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdatedNameExcercise extends DomainEvent {

    private final SectionId sectionId;
    private final ExcerciseId excerciseId;
    private final Name name;

    public UpdatedNameExcercise(SectionId sectionId, ExcerciseId excerciseId, Name name) {
        super("trainingdomain.routine.updatednameexcercise");
        this.sectionId = sectionId;
        this.excerciseId = excerciseId;
        this.name = name;
    }

    public SectionId getSectionId() {
        return sectionId;
    }

    public ExcerciseId getExcerciseId() {
        return excerciseId;
    }

    public Name getName() {
        return name;
    }
}
