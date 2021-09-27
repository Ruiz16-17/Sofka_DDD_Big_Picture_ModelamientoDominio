package co.com.gym.trainingdomain.Routine.commands;

import co.com.gym.trainingdomain.Routine.Routine;
import co.com.gym.trainingdomain.Routine.value.NameMuscleGroupSection;
import co.com.gym.trainingdomain.Routine.value.RoutineId;
import co.com.gym.trainingdomain.Routine.value.SectionId;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdateMuscleGroupSection extends Command {

    private final RoutineId routineId;
    private final SectionId sectionId;
    private final NameMuscleGroupSection nameMuscleGroupSection;

    public UpdateMuscleGroupSection(RoutineId routineId, SectionId sectionId, NameMuscleGroupSection nameMuscleGroupSection) {
        this.routineId = routineId;
        this.sectionId = sectionId;
        this.nameMuscleGroupSection = nameMuscleGroupSection;
    }

    public RoutineId getRoutineId() {
        return routineId;
    }

    public SectionId getSectionId() {
        return sectionId;
    }

    public NameMuscleGroupSection getNameMuscleGroupSection() {
        return nameMuscleGroupSection;
    }
}
