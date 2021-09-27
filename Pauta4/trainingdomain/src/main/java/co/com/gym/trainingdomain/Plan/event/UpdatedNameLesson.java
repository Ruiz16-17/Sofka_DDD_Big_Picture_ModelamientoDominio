package co.com.gym.trainingdomain.Plan.event;

import co.com.gym.trainingdomain.Plan.Lesson;
import co.com.gym.trainingdomain.Plan.value.LessonId;
import co.com.gym.trainingdomain.Plan.value.Name;
import co.com.gym.trainingdomain.Plan.value.PlanId;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdatedNameLesson extends DomainEvent {

    private final LessonId lessonId;
    private final Name name;

    public UpdatedNameLesson(LessonId lessonId, Name name) {
        super("trainingdomain.plan.updatednamelesson");
        this.lessonId = lessonId;
        this.name = name;
    }

    public LessonId getLessonId() {
        return lessonId;
    }

    public Name getName() {
        return name;
    }
}
