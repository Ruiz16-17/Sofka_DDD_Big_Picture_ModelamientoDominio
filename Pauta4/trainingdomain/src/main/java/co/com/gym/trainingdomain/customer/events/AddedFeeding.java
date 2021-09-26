package co.com.gym.trainingdomain.customer.events;

import co.com.gym.trainingdomain.customer.value.Day;
import co.com.gym.trainingdomain.customer.value.FeedingId;
import co.com.gym.trainingdomain.customer.value.Name;
import co.com.gym.trainingdomain.customer.value.Quantity;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.UUID;

public class AddedFeeding extends DomainEvent {

    private final FeedingId feedingId;
    private final Quantity quantity;
    private final Day day;
    private final Name name;


    public AddedFeeding(FeedingId feedingId, Quantity quantity, Day day, Name name) {
        super("trainingdomain.customer.addedfeeding");
        this.feedingId = feedingId;
        this.quantity = quantity;
        this.day = day;
        this.name = name;
    }

    public FeedingId getFeedingId() {
        return feedingId;
    }

    public Quantity getQuantity() {
        return quantity;
    }

    public Day getDay() {
        return day;
    }

    public Name getName() {
        return name;
    }
}
