package co.com.gym.trainingdomain.Plan;

import co.com.gym.trainingdomain.Plan.event.*;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class PlanChange extends EventChange {
    public PlanChange(Plan plan) {

        apply((CreatedPlan event) -> {
            plan.name = event.getName();
            plan.finishDate = event.getFinishDate();
            plan.lessonSet = new HashSet<>();
        });

        apply((UpdatedName event) -> {
            plan.name = event.getName();
        });

        apply((UpdatedFinishDate event) -> {
            plan.finishDate = event.getFinishDate();
        });

        apply((AssignedInstructor event) -> {
            var lesson = plan.getLesssonById(event.getLessonId())
                    .orElseThrow(() -> new IllegalArgumentException("Lesson not found"));

            lesson.assingInstructor(event.getInstructorId());
        });

        apply((UpdatedNameLesson event) -> {
            var lesson = plan.getLesssonById(event.getLessonId())
                    .orElseThrow(() -> new IllegalArgumentException("Lesson not found"));

            lesson.updateNameLesson(event.getName());
        });

        apply((UpdatedDayLesson event) -> {
            var lesson = plan.getLesssonById(event.getLessonId())
                    .orElseThrow(() -> new IllegalArgumentException("Lesson not found"));

            lesson.updateDayLesson(event.getDayLesson());
        });

        

    }
}
