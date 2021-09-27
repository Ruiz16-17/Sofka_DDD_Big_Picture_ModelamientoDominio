package co.com.gym.trainingdomain.Routine.commands;

import co.com.gym.trainingdomain.Routine.value.ExcerciseId;
import co.com.gym.trainingdomain.Routine.value.RoutineId;
import co.com.gym.trainingdomain.Routine.value.SeriesExcercise;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdateSeriesExcercise extends Command {

    private final RoutineId routineId;
    private final ExcerciseId excerciseId;
    private final SeriesExcercise seriesExcercise;

    public UpdateSeriesExcercise(RoutineId routineId, ExcerciseId excerciseId, SeriesExcercise seriesExcercise) {
        this.routineId = routineId;
        this.excerciseId = excerciseId;
        this.seriesExcercise = seriesExcercise;
    }

    public RoutineId getRoutineId() {
        return routineId;
    }

    public ExcerciseId getExcerciseId() {
        return excerciseId;
    }

    public SeriesExcercise getSeriesExcercise() {
        return seriesExcercise;
    }
}
