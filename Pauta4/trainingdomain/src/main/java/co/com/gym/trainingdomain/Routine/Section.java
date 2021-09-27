package co.com.gym.trainingdomain.Routine;

import co.com.gym.trainingdomain.Routine.value.DaySection;
import co.com.gym.trainingdomain.Routine.value.ExcerciseId;
import co.com.gym.trainingdomain.Routine.value.NameMuscleGroupSection;
import co.com.gym.trainingdomain.Routine.value.SectionId;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Section extends Entity<SectionId> {

    private DaySection daySection;
    private NameMuscleGroupSection nameMuscleGroupSection;
    private Set<Excercise> excerciseSet;

    public Section(SectionId entityId, DaySection daySection, NameMuscleGroupSection nameMuscleGroupSection, Set<Excercise> excerciseSet) {
        super(entityId);
        this.daySection = daySection;
        this.nameMuscleGroupSection = nameMuscleGroupSection;
        this.excerciseSet = excerciseSet;
    }

    public void updatedMuscleGroup(NameMuscleGroupSection nameMuscleGroupSection) {
        this.nameMuscleGroupSection = Objects.requireNonNull(nameMuscleGroupSection);
    }

    public void updateDay(DaySection daySection) {
        this.daySection = Objects.requireNonNull(daySection);
    }

    public void addExcerciseSection(Excercise excercise){
        this.excerciseSet.add(Objects.requireNonNull(excercise));
    }

    protected Optional<Excercise> getExcercisetById(ExcerciseId excerciseId){

        return ExcerciseSet().stream()
                .filter(excercise -> excercise
                        .identity()
                        .equals(excerciseId))
                .findFirst();
    }

    public DaySection DaySection() {
        return daySection;
    }

    public NameMuscleGroupSection NameMuscleGroupSection() {
        return nameMuscleGroupSection;
    }

    public Set<Excercise> ExcerciseSet() {
        return excerciseSet;
    }
}
