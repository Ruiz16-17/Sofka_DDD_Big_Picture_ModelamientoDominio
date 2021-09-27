package co.com.gym.trainingdomain.Routine;

import co.com.gym.trainingdomain.Routine.value.*;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Excercise extends Entity<ExcerciseId> {

    private RepetitionsExcercise repetitionsExcercise;
    private SeriesExcercise seriesExcercise;
    private Description description;
    private WeighExcercise weighExcercise;
    private BreakExcercise breakExcercise;
    private Name name;

    public Excercise(ExcerciseId entityId, RepetitionsExcercise repetitionsExcercise, SeriesExcercise seriesExcercise, Description description, WeighExcercise weighExcercise, BreakExcercise breakExcercise, Name name) {
        super(entityId);
        this.repetitionsExcercise = repetitionsExcercise;
        this.seriesExcercise = seriesExcercise;
        this.description = description;
        this.weighExcercise = weighExcercise;
        this.breakExcercise = breakExcercise;
        this.name = name;
    }

    public void updateDescription(Description description) {

        this.description = Objects.requireNonNull(description);
    }

    public void updateName(Name name) {

        this.name = Objects.requireNonNull(name);
    }

    public void updateRepetitions(RepetitionsExcercise repetitionsExcercise) {

        this.repetitionsExcercise = Objects.requireNonNull(repetitionsExcercise);
    }

    public void updateSeries(SeriesExcercise seriesExcercise) {

        this.seriesExcercise = Objects.requireNonNull(seriesExcercise);
    }

    public void updateWeighs(WeighExcercise weighExcercise) {

        this.weighExcercise = Objects.requireNonNull(weighExcercise);
    }

    public void updateBreak(BreakExcercise breakExcercise) {

        this.breakExcercise = Objects.requireNonNull(breakExcercise);
    }

    public RepetitionsExcercise RepetitionsExcercise() {
        return repetitionsExcercise;
    }

    public SeriesExcercise SeriesExcercise() {
        return seriesExcercise;
    }

    public Description Description() {
        return description;
    }

    public WeighExcercise WeighExcercise() {
        return weighExcercise;
    }

    public BreakExcercise BreakExcercise() {
        return breakExcercise;
    }

    public Name Name() {
        return name;
    }
}
