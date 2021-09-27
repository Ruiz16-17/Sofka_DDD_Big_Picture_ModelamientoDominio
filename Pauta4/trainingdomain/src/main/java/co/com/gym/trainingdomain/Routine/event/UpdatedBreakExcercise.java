package co.com.gym.trainingdomain.Routine.event;

import co.com.gym.trainingdomain.Routine.value.BreakExcercise;
import co.com.gym.trainingdomain.Routine.value.ExcerciseId;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdatedBreakExcercise extends DomainEvent {

    private final ExcerciseId excerciseId;
    private final BreakExcercise breakExcercise;

    public UpdatedBreakExcercise(ExcerciseId excerciseId, BreakExcercise breakExcercise) {
        super("traininddomain.routine.updatedbreakexcercise");
        this.excerciseId = excerciseId;
        this.breakExcercise = breakExcercise;
    }

    public ExcerciseId getExcerciseId() {
        return excerciseId;
    }

    public BreakExcercise getBreakExcercise() {
        return breakExcercise;
    }
}
