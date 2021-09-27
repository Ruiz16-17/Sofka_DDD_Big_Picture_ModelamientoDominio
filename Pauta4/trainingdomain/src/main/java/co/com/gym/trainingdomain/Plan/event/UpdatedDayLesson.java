package co.com.gym.trainingdomain.Plan.event;

import co.com.gym.trainingdomain.Plan.value.DayLesson;
import co.com.gym.trainingdomain.Plan.value.LessonId;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdatedDayLesson extends DomainEvent {

    private final LessonId lessonId;
    private final DayLesson dayLesson;

    public UpdatedDayLesson(LessonId lessonId, DayLesson dayLesson) {
        super("trainingdomain.plan.updateddaylesson");
        this.lessonId = lessonId;
        this.dayLesson = dayLesson;
    }

    public LessonId getLessonId() {
        return lessonId;
    }

    public DayLesson getDayLesson() {
        return dayLesson;
    }
}
