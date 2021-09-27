package co.com.gym.trainingdomain.Plan.event;

import co.com.gym.trainingdomain.Plan.value.DayLesson;
import co.com.gym.trainingdomain.Plan.value.InstructorId;
import co.com.gym.trainingdomain.Plan.value.LessonId;
import co.com.gym.trainingdomain.Plan.value.Name;
import co.com.sofka.domain.generic.DomainEvent;

public class AddedLesson extends DomainEvent {

    private final LessonId lessonId;
    private final InstructorId instructorId;
    private final DayLesson dayLesson;
    private final Name name;

    public AddedLesson(LessonId lessonId, InstructorId instructorId, DayLesson dayLesson, Name name) {
        super("trainingdomain.plan.addedlesson");
        this.lessonId = lessonId;
        this.instructorId = instructorId;
        this.dayLesson = dayLesson;
        this.name = name;
    }

    public LessonId getLessonId() {
        return lessonId;
    }

    public InstructorId getInstructorId() {
        return instructorId;
    }

    public DayLesson getDayLesson() {
        return dayLesson;
    }

    public Name getName() {
        return name;
    }
}
