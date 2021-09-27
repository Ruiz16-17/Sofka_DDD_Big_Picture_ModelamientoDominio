package co.com.gym.trainingdomain.Plan;

import co.com.gym.trainingdomain.Plan.value.DayLesson;
import co.com.gym.trainingdomain.Plan.value.InstructorId;
import co.com.gym.trainingdomain.Plan.value.LessonId;
import co.com.gym.trainingdomain.Plan.value.Name;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Lesson extends Entity<LessonId> {

    private InstructorId instructorId;
    private DayLesson dayLesson;
    private Name name;

    public Lesson(LessonId entityId, DayLesson dayLesson, Name name, InstructorId instructorId) {
        super(entityId);
        this.instructorId = instructorId;
        this.dayLesson = dayLesson;
        this.name = name;
    }

    public void updateDayLesson(DayLesson dayLesson){
        this.dayLesson = Objects.requireNonNull(dayLesson);
    }

    public void updateNameLesson(Name name){
        this.name = Objects.requireNonNull(name);
    }

    public void assingInstructor(InstructorId instructorId){
        this.instructorId = Objects.requireNonNull(instructorId);
    }

    public DayLesson DayLesson() {
        return dayLesson;
    }

    public Name Name() {
        return name;
    }
    public InstructorId InstructorId() {
        return instructorId;
    }
}
