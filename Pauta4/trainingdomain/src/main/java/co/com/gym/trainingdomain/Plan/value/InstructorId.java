package co.com.gym.trainingdomain.Plan.value;

import co.com.sofka.domain.generic.Identity;

public class InstructorId extends Identity {
    public InstructorId() {
    }

    public InstructorId(String id) {
        super(id);
    }

    public static InstructorId of(String id){
        return new InstructorId(id);
    }
}
