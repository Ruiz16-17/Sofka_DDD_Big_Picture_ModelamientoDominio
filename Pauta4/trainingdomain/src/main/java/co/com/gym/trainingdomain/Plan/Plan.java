package co.com.gym.trainingdomain.Plan;

import co.com.gym.trainingdomain.Plan.event.*;
import co.com.gym.trainingdomain.Plan.value.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Plan extends AggregateEvent<PlanId> {

    protected FinishDate finishDate;
    protected Name name;
    protected Set<Lesson> lessonSet;

    public Plan(PlanId entityId, FinishDate finishDate, Name name) {
        super(entityId);
        appendChange(new CreatedPlan(finishDate,name)).apply();
    }

    private Plan(PlanId entityId){
        super(entityId);
        subscribe(new PlanChange(this));
    }

    public static Plan from(PlanId planId, List<DomainEvent> events){
        var plan = new Plan(planId);
        events.forEach(plan::applyEvent);
        return plan;
    }

    public void updateName(Name name){
        Objects.requireNonNull(name);
        appendChange(new UpdatedName(name)).apply();
    }

    public void updateFinishDate(FinishDate finishDate){
        Objects.requireNonNull(finishDate);
        appendChange(new UpdatedFinishDate(finishDate)).apply();
    }

    public void addLesson(LessonId entityId, DayLesson dayLesson,Name name, InstructorId instructorId){
        Objects.requireNonNull(entityId);
        appendChange(new AddedLesson(entityId, instructorId, dayLesson, name)).apply();
    }

    public void assingInstructor(InstructorId instructorId, LessonId lessonId){
        Objects.requireNonNull(instructorId);
        Objects.requireNonNull(lessonId);
        appendChange(new AssignedInstructor(instructorId,lessonId)).apply();
    }

    public void updateNameLesson(LessonId lessonId,Name name){
        Objects.requireNonNull(name);
        appendChange(new UpdatedNameLesson(lessonId,name)).apply();
    }

    public void updateDayLesson(LessonId lessonId,DayLesson dayLesson){
        Objects.requireNonNull(dayLesson);
        appendChange(new UpdatedDayLesson(lessonId, dayLesson)).apply();
    }

    public void updateNameInstructor(InstructorId instructorId,Name name){
        Objects.requireNonNull(name);
        appendChange(new UpdatedNameInstructor(instructorId,name)).apply();
    }

    protected Optional<Lesson> getInstructorById(InstructorId instructorId){

        return LessonSet()
                .stream()
                .filter(lesson -> lesson
                        .InstructorId()
                        .equals(instructorId))
                .findFirst();
    }

    protected Optional<Lesson> getLesssonById(LessonId lessonId){

        return LessonSet()
                .stream()
                .filter(lesson -> lesson
                        .identity()
                        .equals(lessonId))
                .findFirst();
    }

    public FinishDate FinishDate() {
        return finishDate;
    }

    public Name Name() {
        return name;
    }

    public Set<Lesson> LessonSet() {
        return lessonSet;
    }


}
