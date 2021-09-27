package co.com.gym.trainingdomain.Plan.command;

import co.com.gym.trainingdomain.Plan.value.InstructorId;
import co.com.gym.trainingdomain.Plan.value.LessonId;
import co.com.gym.trainingdomain.Plan.value.PlanId;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;

public class AssignInstructor extends Command {

    private final PlanId planId;
    private final LessonId lessonId;
    private final InstructorId instructorId;

    public AssignInstructor(PlanId planId, InstructorId instructorId, LessonId lessonId) {
        this.planId = planId;
        this.instructorId = instructorId;
        this.lessonId = lessonId;
    }

    public PlanId getPlanId() {
        return planId;
    }

    public InstructorId getInstructorId() {
        return instructorId;
    }

    public LessonId getLessonId() {
        return lessonId;
    }
}
