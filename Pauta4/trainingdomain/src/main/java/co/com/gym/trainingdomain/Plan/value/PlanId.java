package co.com.gym.trainingdomain.Plan.value;

import co.com.sofka.domain.generic.Identity;

public class PlanId extends Identity {

    public PlanId() {
    }

    public PlanId(String id) {
        super(id);
    }

    public static PlanId of(String id){
        return new PlanId(id);
    }
}
