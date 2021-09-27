package co.com.gym.trainingdomain.Plan.command;

import co.com.gym.trainingdomain.Plan.value.LessonId;
import co.com.gym.trainingdomain.Plan.value.Name;
import co.com.gym.trainingdomain.Plan.value.PlanId;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdateNameLesson extends Command {

    private final PlanId planId;
    private final LessonId lessonId;
    private final Name name;

    public UpdateNameLesson(PlanId planId, LessonId lessonId, Name name) {
        this.planId = planId;
        this.lessonId = lessonId;
        this.name = name;
    }

    public PlanId getPlanId() {
        return planId;
    }

    public LessonId getLessonId() {
        return lessonId;
    }

    public Name getName() {
        return name;
    }
}
