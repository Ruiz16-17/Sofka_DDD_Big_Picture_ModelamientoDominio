package co.com.gym.trainingdomain.customer.value;

import co.com.sofka.domain.generic.Identity;

public class RoutineId extends Identity {

    public RoutineId(){

    }

    private RoutineId(String id){
        super(id);
    }

    public static RoutineId of(String id){

        return new RoutineId(id);
    }
}
