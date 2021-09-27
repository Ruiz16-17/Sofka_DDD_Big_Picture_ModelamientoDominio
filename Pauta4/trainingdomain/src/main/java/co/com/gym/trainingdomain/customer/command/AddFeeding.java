package co.com.gym.trainingdomain.customer.command;

import co.com.gym.trainingdomain.customer.value.*;
import co.com.sofka.domain.generic.Command;

public class AddFeeding extends Command {

    private final CustomerId customerId;
    private final FeedingId feedingId;
    private final Quantity quantity;
    private final Day day;
    private final Name name;


    public AddFeeding(FeedingId feedingId, Quantity quantity, Day day, Name name, CustomerId customerId) {
        this.customerId = customerId;
        this.feedingId = feedingId;
        this.quantity = quantity;
        this.day = day;
        this.name = name;
    }

    public CustomerId getCustomerId() {
        return customerId;
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
