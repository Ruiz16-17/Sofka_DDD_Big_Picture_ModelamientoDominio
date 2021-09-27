package co.com.gym.trainingdomain.Plan.command;

import co.com.gym.trainingdomain.Plan.value.*;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;

public class AddLesson extends Command {

    private final PlanId planId;
    private final LessonId lessonId;
    private final InstructorId instructorId;
    private final DayLesson dayLesson;
    private final Name name;

    public AddLesson(PlanId planId, LessonId lessonId, InstructorId instructorId, DayLesson dayLesson, Name name) {
        this.planId = planId;
        this.lessonId = lessonId;
        this.instructorId = instructorId;
        this.dayLesson = dayLesson;
        this.name = name;
    }

    public PlanId getPlanId() {
        return planId;
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
