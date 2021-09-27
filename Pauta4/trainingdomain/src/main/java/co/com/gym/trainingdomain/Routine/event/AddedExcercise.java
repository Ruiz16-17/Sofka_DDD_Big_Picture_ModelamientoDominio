package co.com.gym.trainingdomain.Routine.event;

import co.com.gym.trainingdomain.Routine.value.*;
import co.com.sofka.domain.generic.DomainEvent;

public class AddedExcercise extends DomainEvent {

    private final ExcerciseId excerciseId;
    private final RepetitionsExcercise repetitionsExcercise;
    private final SeriesExcercise seriesExcercise;
    private final Description description;
    private final WeighExcercise weighExcercise;
    private final BreakExcercise breakExcercise;
    private final Name name;

    public AddedExcercise(ExcerciseId excerciseId, RepetitionsExcercise repetitionsExcercise,
                          SeriesExcercise seriesExcercise, Description description,
                          WeighExcercise weighExcercise, BreakExcercise breakExcercise, Name name) {
        super("trainingdomain.routine.addedexcercise");
        this.excerciseId = excerciseId;
        this.repetitionsExcercise = repetitionsExcercise;
        this.seriesExcercise = seriesExcercise;
        this.description = description;
        this.weighExcercise = weighExcercise;
        this.breakExcercise = breakExcercise;
        this.name = name;
    }

    public ExcerciseId getExcerciseId() {
        return excerciseId;
    }

    public RepetitionsExcercise getRepetitionsExcercise() {
        return repetitionsExcercise;
    }

    public SeriesExcercise getSeriesExcercise() {
        return seriesExcercise;
    }

    public Description getDescription() {
        return description;
    }

    public WeighExcercise getWeighExcercise() {
        return weighExcercise;
    }

    public BreakExcercise getBreakExcercise() {
        return breakExcercise;
    }

    public Name getName() {
        return name;
    }
}
