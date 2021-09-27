package co.com.gym.trainingdomain.Plan;

import co.com.gym.trainingdomain.Plan.value.InstructorId;
import co.com.gym.trainingdomain.Plan.value.Name;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Instructor extends Entity<InstructorId> {

    private Name name;

    public Instructor(InstructorId entityId, Name name) {
        super(entityId);
        this.name = name;
    }

    public void updateNameInstructor(Name name){
        this.name = Objects.requireNonNull(name);
    }

    public Name Name() {
        return name;
    }
}
