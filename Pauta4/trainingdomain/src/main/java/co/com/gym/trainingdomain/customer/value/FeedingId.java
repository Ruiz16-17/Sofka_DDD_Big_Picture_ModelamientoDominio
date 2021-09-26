package co.com.gym.trainingdomain.customer.value;

import co.com.sofka.domain.generic.Identity;

public class FeedingId extends Identity{

    public FeedingId(){

    }

    private FeedingId(String id){
        super(id);
    }

    public static FeedingId of(String id){

        return new FeedingId(id);
    }
}
