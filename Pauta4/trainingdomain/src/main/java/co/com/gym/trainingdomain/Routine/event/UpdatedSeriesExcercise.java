package co.com.gym.trainingdomain.Routine.event;

import co.com.gym.trainingdomain.Routine.value.ExcerciseId;
import co.com.gym.trainingdomain.Routine.value.SeriesExcercise;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdatedSeriesExcercise extends DomainEvent {

    private final ExcerciseId excerciseId;
    private final SeriesExcercise seriesExcercise;

    public UpdatedSeriesExcercise(ExcerciseId excerciseId, SeriesExcercise seriesExcercise) {
        super("trainingdomain.routine.updatedseriesexcercise");
        this.excerciseId = excerciseId;
        this.seriesExcercise = seriesExcercise;
    }

    public ExcerciseId getExcerciseId() {
        return excerciseId;
    }

    public SeriesExcercise getSeriesExcercise() {
        return seriesExcercise;
    }
}
