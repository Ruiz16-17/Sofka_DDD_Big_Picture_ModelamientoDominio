package co.com.gym.trainingdomain.Plan.command;

import co.com.gym.trainingdomain.Plan.value.InstructorId;
import co.com.gym.trainingdomain.Plan.value.Name;
import co.com.gym.trainingdomain.Plan.value.PlanId;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdateNameInstructor extends Command {

    private final PlanId planId;
    private final InstructorId instructorId;
    private final Name name;

    public UpdateNameInstructor(PlanId planId, InstructorId instructorId, Name name) {
        this.planId = planId;
        this.instructorId = instructorId;
        this.name = name;
    }

    public PlanId getPlanId() {
        return planId;
    }

    public InstructorId getInstructorId() {
        return instructorId;
    }

    public Name getName() {
        return name;
    }
}
