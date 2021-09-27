package co.com.gym.trainingdomain.Plan.command;

import co.com.gym.trainingdomain.Plan.value.DayLesson;
import co.com.gym.trainingdomain.Plan.value.LessonId;
import co.com.gym.trainingdomain.Plan.value.PlanId;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdateDayLesson extends Command {

    private final PlanId planId;
    private final LessonId lessonId;
    private final DayLesson dayLesson;

    public UpdateDayLesson(PlanId planId, LessonId lessonId, DayLesson dayLesson) {
        this.planId = planId;
        this.lessonId = lessonId;
        this.dayLesson = dayLesson;
    }

    public PlanId getPlanId() {
        return planId;
    }

    public LessonId getLessonId() {
        return lessonId;
    }

    public DayLesson getDayLesson() {
        return dayLesson;
    }
}
