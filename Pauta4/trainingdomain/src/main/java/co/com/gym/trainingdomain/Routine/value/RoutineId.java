package co.com.gym.trainingdomain.Routine.value;

import co.com.sofka.domain.generic.Identity;

public class RoutineId extends Identity {

    public RoutineId() {
    }

    public RoutineId(String id) {
        super(id);
    }

    public static RoutineId of(String id){
        return new RoutineId(id);
    }
}
