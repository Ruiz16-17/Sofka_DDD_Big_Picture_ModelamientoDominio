package co.com.gym.trainingdomain.Plan.event;

import ch.qos.logback.core.pattern.util.AlmostAsIsEscapeUtil;
import co.com.gym.trainingdomain.Plan.Lesson;
import co.com.gym.trainingdomain.Plan.value.InstructorId;
import co.com.gym.trainingdomain.Plan.value.LessonId;
import co.com.sofka.domain.generic.DomainEvent;

public class AssignedInstructor extends DomainEvent {

    private final InstructorId instructorId;
    private final LessonId lessonId;

    public AssignedInstructor(InstructorId instructorId, LessonId lessonId) {
        super("trainingdomain.plan.asignedinstructor");
        this.instructorId = instructorId;
        this.lessonId = lessonId;
    }

    public InstructorId getInstructorId() {
        return instructorId;
    }

    public LessonId getLessonId() {
        return lessonId;
    }
}
