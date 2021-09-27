package co.com.gym.trainingdomain.Routine.events;

import co.com.gym.trainingdomain.Routine.value.NameMuscleGroupSection;
import co.com.gym.trainingdomain.Routine.value.SectionId;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdatedMuscleGroupSection extends DomainEvent {

    private final SectionId sectionId;
    private final NameMuscleGroupSection nameMuscleGroupSection;

    public UpdatedMuscleGroupSection(SectionId sectionId, NameMuscleGroupSection nameMuscleGroupSection) {
        super("trainingdomain.routine.updatedmusclegroupsection");
        this.sectionId = sectionId;
        this.nameMuscleGroupSection = nameMuscleGroupSection;
    }

    public SectionId getSectionId() {
        return sectionId;
    }

    public NameMuscleGroupSection getNameMuscleGroupSection() {
        return nameMuscleGroupSection;
    }
}
