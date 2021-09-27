package co.com.gym.trainingdomain.Routine.value;

import co.com.gym.trainingdomain.Routine.Excercise;
import co.com.sofka.domain.generic.Identity;

public class ExcerciseId extends Identity {
    public ExcerciseId() {
    }

    public ExcerciseId(String id) {
        super(id);
    }

    public static ExcerciseId of(String id){
        return new ExcerciseId(id);
    }
}
