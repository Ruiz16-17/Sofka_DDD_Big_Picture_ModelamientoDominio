package co.com.gym.trainingdomain.Routine;

import co.com.gym.trainingdomain.Routine.event.*;
import co.com.gym.trainingdomain.Routine.value.*;
import co.com.gym.trainingdomain.Routine.value.SectionId;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Routine extends AggregateEvent<RoutineId> {

    protected Name name;
    protected Description description;
    protected Set<Section> sectionSet;


    public Routine(RoutineId entityId, Name name, Description description) {
        super(entityId);
        appendChange(new CreatedRoutine(name, description)).apply();
    }

    private Routine(RoutineId entityId){
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

    public void addExcercise(SectionId sectionId, RepetitionsExcercise repetitionsExcercise, SeriesExcercise seriesExcercise,
                             Description description, WeighExcercise weighExcercise, BreakExcercise breakExcercise, Name name){

        Objects.requireNonNull(repetitionsExcercise);
        Objects.requireNonNull(seriesExcercise);
        Objects.requireNonNull(description);
        Objects.requireNonNull(weighExcercise);
        Objects.requireNonNull(breakExcercise);
        Objects.requireNonNull(name);
        appendChange(new AddedExcercise(sectionId, new ExcerciseId(),repetitionsExcercise,seriesExcercise,description, weighExcercise,breakExcercise,
                name)).apply();
    }

    public void updateDescriptionExcercise(SectionId sectionId, ExcerciseId excerciseId, Description description){
        Objects.requireNonNull(description);
        appendChange(new UpdatedDescriptionExcercise(sectionId, excerciseId, description)).apply();
    }

    public void updateNameExcercise(SectionId sectionId, ExcerciseId excerciseId, Name name){
        Objects.requireNonNull(name);
        appendChange(new UpdatedNameExcercise(sectionId, excerciseId, name)).apply();
    }
    public void updateRepetitionsExcercise(SectionId sectionId, ExcerciseId excerciseId, RepetitionsExcercise repetitionsExcercise){
        Objects.requireNonNull(repetitionsExcercise);
        appendChange(new UpdatedRepetitionExcercise(sectionId, excerciseId,repetitionsExcercise)).apply();
    }
    public void updateSeriesExcercise(SectionId sectionId, ExcerciseId excerciseId, SeriesExcercise seriesExcercise){
        Objects.requireNonNull(seriesExcercise);
        appendChange(new UpdatedSeriesExcercise(sectionId, excerciseId, seriesExcercise)).apply();
    }

    public void updateWeighsExcercise(SectionId sectionId, ExcerciseId excerciseId, WeighExcercise weighExcercise){
        Objects.requireNonNull(weighExcercise);
        appendChange(new UpdatedWeighExcercise(sectionId, excerciseId, weighExcercise)).apply();
    }
    public void updateBreakExcersice(SectionId sectionId, ExcerciseId excerciseId, BreakExcercise breakExcercise){
        Objects.requireNonNull(breakExcercise);
        appendChange(new UpdatedBreakExcercise(sectionId, excerciseId, breakExcercise)).apply();
    }

    protected Optional<Section> getSectionById(SectionId sectionId){

        return sectionSet()
                .stream()
                .filter(section -> section
                        .identity()
                        .equals(sectionId))
                .findFirst();
    }

    public Name name() {
        return name;
    }

    public Description description() {
        return description;
    }

    public Set<Section> sectionSet() {
        return sectionSet;
    }
}
