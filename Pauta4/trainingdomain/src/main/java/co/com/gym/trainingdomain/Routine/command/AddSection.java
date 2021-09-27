package co.com.gym.trainingdomain.Routine.command;

import co.com.gym.trainingdomain.Routine.Excercise;
import co.com.gym.trainingdomain.Routine.value.DaySection;
import co.com.gym.trainingdomain.Routine.value.NameMuscleGroupSection;
import co.com.gym.trainingdomain.Routine.value.RoutineId;
import co.com.gym.trainingdomain.Routine.value.SectionId;
import co.com.sofka.domain.generic.Command;

import java.util.Set;

public class AddSection extends Command {

    private final RoutineId routineId;
    private final SectionId sectionId;
    private final DaySection daySection;
    private final NameMuscleGroupSection nameMuscleGroupSection;
    private final Set<Excercise> excerciseSet;

    public AddSection(RoutineId routineId, SectionId sectionId, DaySection daySection, NameMuscleGroupSection nameMuscleGroupSection,
                        Set<Excercise> excerciseSet) {
        this.routineId = routineId;
        this.sectionId = sectionId;
        this.daySection = daySection;
        this.nameMuscleGroupSection = nameMuscleGroupSection;
        this.excerciseSet = excerciseSet;
    }

    public RoutineId getRoutineId() {
        return routineId;
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
