package co.com.gym.trainingdomain.Plan.value;

import co.com.sofka.domain.generic.Identity;

public class LessonId extends Identity {

    public LessonId() {
    }

    public LessonId(String id) {
        super(id);
    }

    public static LessonId of(String id){
        return new LessonId(id);
    }
}
