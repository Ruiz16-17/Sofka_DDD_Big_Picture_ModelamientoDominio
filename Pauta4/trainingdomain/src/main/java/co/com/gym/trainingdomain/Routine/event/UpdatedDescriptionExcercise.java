package co.com.gym.trainingdomain.Routine.event;

import co.com.gym.trainingdomain.Routine.Section;
import co.com.gym.trainingdomain.Routine.value.Description;
import co.com.gym.trainingdomain.Routine.value.ExcerciseId;
import co.com.gym.trainingdomain.Routine.value.SectionId;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdatedDescriptionExcercise extends DomainEvent {

    private final SectionId sectionId;
    private final ExcerciseId excerciseId;
    private final Description description;

    public UpdatedDescriptionExcercise(SectionId sectionId,ExcerciseId excerciseId, Description description) {
        super("trainingdomain.routine.updateddescriptionexcercise");
        this.sectionId = sectionId;
        this.excerciseId = excerciseId;
        this.description = description;
    }

    public SectionId getSectionId() {
        return sectionId;
    }

    public ExcerciseId getExcerciseId() {
        return excerciseId;
    }

    public Description getDescription() {
        return description;
    }
}
