package co.com.gym.trainingdomain.Plan.event;

import co.com.gym.trainingdomain.Plan.value.InstructorId;
import co.com.gym.trainingdomain.Plan.value.Name;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdatedNameInstructor extends DomainEvent {

    private final InstructorId instructorId;
    private final Name name;

    public UpdatedNameInstructor(InstructorId instructorId, Name name) {
        super("trainingdomain.plan.updatednameinstructor");
        this.instructorId = instructorId;
        this.name = name;
    }

    public InstructorId getInstructorId() {
        return instructorId;
    }

    public Name getName() {
        return name;
    }
}
