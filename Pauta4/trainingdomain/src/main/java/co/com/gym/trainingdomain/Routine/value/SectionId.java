package co.com.gym.trainingdomain.Routine.value;

import co.com.sofka.domain.generic.Identity;

public class SectionId extends Identity {

    public SectionId() {
    }

    public SectionId(String id) {
        super(id);
    }

    public static SectionId of(String id){
        return new SectionId(id);
    }
}
