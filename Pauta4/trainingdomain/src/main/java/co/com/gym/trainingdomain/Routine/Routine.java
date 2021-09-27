package co.com.gym.trainingdomain.Routine;

import co.com.gym.trainingdomain.Routine.events.*;
import co.com.gym.trainingdomain.Routine.value.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Routine extends AggregateEvent<RoutineId> {

    protected Name name;
    protected Description description;
    protected Set<SectionId> sectionIdSet;


    public Routine(RoutineId entityId, Name name, Description description) {
        super(entityId);
        appendChange(new CreatedRoutine(name, description)).apply();
    }

    public Routine(RoutineId entityId){
        super(entityId);
        subscribe(new RoutineChange(this));
    }

    public static Routine from(RoutineId routineId, List<DomainEvent> events){
        var routine = new Routine(routineId);
        events.forEach(routine::applyEvent);
        return routine;
    }

    public void updateDescription(RoutineId routineId, Description description){
        Objects.requireNonNull(description);
        appendChange(new UpdatedDescription(description)).apply();
    }

    public void updateName(RoutineId routineId, Name name){
        Objects.requireNonNull(name);
        appendChange(new UpdatedName(name)).apply();
    }

    public void addSection(SectionId sectionId, DaySection daySection, NameMuscleGroupSection nameMuscleGroupSection, Set<Excercise> excerciseSet){
        Objects.requireNonNull(sectionId);
        Objects.requireNonNull(daySection);
        Objects.requireNonNull(nameMuscleGroupSection);
        Objects.requireNonNull(excerciseSet);
        appendChange( new AddedSection(sectionId,daySection, nameMuscleGroupSection, excerciseSet)).apply();

    }

    public void updatedMuscleGroupSection(SectionId sectionId, NameMuscleGroupSection nameMuscleGroupSection){
        Objects.requireNonNull(nameMuscleGroupSection);
        appendChange(new UpdatedMuscleGroupSection(sectionId, nameMuscleGroupSection)).apply();
    }

    public void updateDaySection(SectionId sectionId, DaySection daySection){
        Objects.requireNonNull(daySection);
        appendChange(new UpdatedDaySection(sectionId, daySection)).apply();
    }

    public void addExcercise(ExcerciseId excerciseId, RepetitionsExcercise repetitionsExcercise, SeriesExcercise seriesExcercise,
                             Description description, WeighExcercise weighExcercise, BreakExcercise breakExcercise, Name name){
        Objects.requireNonNull(excerciseId);
        Objects.requireNonNull(repetitionsExcercise);
        Objects.requireNonNull(seriesExcercise);
        Objects.requireNonNull(description);
        Objects.requireNonNull(weighExcercise);
        Objects.requireNonNull(breakExcercise);
        Objects.requireNonNull(name);
        appendChange(new AddedExcercise(excerciseId,repetitionsExcercise,seriesExcercise,description, weighExcercise,breakExcercise,
                name)).apply();
    }

    public void updateDescriptionExcercise(ExcerciseId excerciseId, Description description){
        Objects.requireNonNull(description);
        appendChange(new UpdatedDescriptionExcercise(excerciseId, description)).apply();
    }

    public void updateNameExcercise(ExcerciseId excerciseId, Name name){
        Objects.requireNonNull(name);
        appendChange(new UpdatedNameExcercise(excerciseId, name)).apply();
    }
    public void updateRepetitionsExcercise(ExcerciseId excerciseId, RepetitionsExcercise repetitionsExcercise){
        Objects.requireNonNull(repetitionsExcercise);
        appendChange(new UpdatedRepetitionExcercise(excerciseId,repetitionsExcercise)).apply();
    }
    public void updateSeriesExcercise(ExcerciseId excerciseId, SeriesExcercise seriesExcercise){
        Objects.requireNonNull(seriesExcercise);
        appendChange(new UpdatedSeriesExcercise(excerciseId, seriesExcercise)).apply();
    }

    public void updateWeighsExcercise(ExcerciseId excerciseId, WeighExcercise weighExcercise){
        Objects.requireNonNull(weighExcercise);
        appendChange(new UpdatedWeighExcercise(excerciseId, weighExcercise)).apply();
    }
    public void updateBreakExcersice(ExcerciseId excerciseId, BreakExcercise breakExcercise){
        Objects.requireNonNull(breakExcercise);
        appendChange(new UpdatedBreakExcercise(excerciseId, breakExcercise)).apply();
    }

    public Name Name() {
        return name;
    }

    public Description Description() {
        return description;
    }

    public Set<SectionId> SectionIdSet() {
        return sectionIdSet;
    }
}
