package co.com.gym.trainingdomain.Routine.command;

import co.com.gym.trainingdomain.Routine.value.DaySection;
import co.com.gym.trainingdomain.Routine.value.RoutineId;
import co.com.gym.trainingdomain.Routine.value.SectionId;
import co.com.sofka.domain.generic.Command;

public class UpdateDaySection extends Command {

    private final RoutineId routineId;
    private final SectionId sectionId;
    private final DaySection daySection;

    public UpdateDaySection(RoutineId routineId, SectionId sectionId, DaySection daySection) {
        this.routineId = routineId;
        this.sectionId = sectionId;
        this.daySection = daySection;
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
}
