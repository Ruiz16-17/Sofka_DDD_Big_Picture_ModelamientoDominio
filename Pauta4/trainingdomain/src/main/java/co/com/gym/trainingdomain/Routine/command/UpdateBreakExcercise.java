package co.com.gym.trainingdomain.Routine.command;

import co.com.gym.trainingdomain.Routine.value.BreakExcercise;
import co.com.gym.trainingdomain.Routine.value.ExcerciseId;
import co.com.gym.trainingdomain.Routine.value.RoutineId;
import co.com.sofka.domain.generic.Command;

public class UpdateBreakExcercise extends Command {

    private final RoutineId routineId;
    private final ExcerciseId excerciseId;
    private final BreakExcercise breakExcercise;

    public UpdateBreakExcercise(RoutineId routineId, ExcerciseId excerciseId, BreakExcercise breakExcercise) {
        this.routineId = routineId;
        this.excerciseId = excerciseId;
        this.breakExcercise = breakExcercise;
    }

    public RoutineId getRoutineId() {
        return routineId;
    }

    public ExcerciseId getExcerciseId() {
        return excerciseId;
    }

    public BreakExcercise getBreakExcercise() {
        return breakExcercise;
    }
}
