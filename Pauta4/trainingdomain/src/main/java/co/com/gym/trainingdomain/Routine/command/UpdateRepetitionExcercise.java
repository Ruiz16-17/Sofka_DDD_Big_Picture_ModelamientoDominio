package co.com.gym.trainingdomain.Routine.command;

import co.com.gym.trainingdomain.Routine.value.ExcerciseId;
import co.com.gym.trainingdomain.Routine.value.RepetitionsExcercise;
import co.com.gym.trainingdomain.Routine.value.RoutineId;
import co.com.sofka.domain.generic.Command;

public class UpdateRepetitionExcercise extends Command {

    private final RoutineId routineId;
    private final ExcerciseId excerciseId;
    private final RepetitionsExcercise repetitionsExcercise;

    public UpdateRepetitionExcercise(RoutineId routineId, ExcerciseId excerciseId, RepetitionsExcercise repetitionsExcercise) {
        this.routineId = routineId;
        this.excerciseId = excerciseId;
        this.repetitionsExcercise = repetitionsExcercise;
    }

    public RoutineId getRoutineId() {
        return routineId;
    }

    public ExcerciseId getExcerciseId() {
        return excerciseId;
    }

    public RepetitionsExcercise getRepetitionsExcercise() {
        return repetitionsExcercise;
    }
}
