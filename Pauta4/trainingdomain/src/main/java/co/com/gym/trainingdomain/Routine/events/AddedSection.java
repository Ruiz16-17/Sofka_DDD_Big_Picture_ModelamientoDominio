package co.com.gym.trainingdomain.Routine.events;

import co.com.gym.trainingdomain.Routine.Excercise;
import co.com.gym.trainingdomain.Routine.Section;
import co.com.gym.trainingdomain.Routine.value.DaySection;
import co.com.gym.trainingdomain.Routine.value.NameMuscleGroupSection;
import co.com.gym.trainingdomain.Routine.value.SectionId;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.Set;

public class AddedSection extends DomainEvent {

    private final SectionId sectionId;
    private final DaySection daySection;
    private final NameMuscleGroupSection nameMuscleGroupSection;
    private final Set<Excercise> excerciseSet;

    public AddedSection(SectionId sectionId, DaySection daySection, NameMuscleGroupSection nameMuscleGroupSection,
                        Set<Excercise> excerciseSet) {
        super("trainingdomain.routine.addsection");
        this.sectionId = sectionId;
        this.daySection = daySection;
        this.nameMuscleGroupSection = nameMuscleGroupSection;
        this.excerciseSet = excerciseSet;
    }

    public SectionId getSectionId() {
        return sectionId;
    }

    public DaySection getDaySection() {
        return daySection;
    }

    public NameMuscleGroupSection getNameMuscleGroupSection() {
        return nameMuscleGroupSection;
    }

    public Set<Excercise> getExcerciseSet() {
        return excerciseSet;
    }
}
