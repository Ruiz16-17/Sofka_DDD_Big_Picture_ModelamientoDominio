package co.com.gym.trainingdomain.Routine.events;

import co.com.gym.trainingdomain.Routine.value.DaySection;
import co.com.gym.trainingdomain.Routine.value.SectionId;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdatedDaySection  extends DomainEvent {

    private final SectionId sectionId;
    private final DaySection daySection;

    public UpdatedDaySection(SectionId sectionId, DaySection daySection) {
        super("trainingdomain.routine.updateddaysection");
        this.sectionId = sectionId;
        this.daySection = daySection;
    }

    public SectionId getSectionId() {
        return sectionId;
    }

    public DaySection getDaySection() {
        return daySection;
    }
}
