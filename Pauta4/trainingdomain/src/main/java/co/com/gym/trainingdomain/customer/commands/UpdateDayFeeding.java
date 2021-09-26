package co.com.gym.trainingdomain.customer.commands;

import co.com.gym.trainingdomain.customer.value.CustomerId;
import co.com.gym.trainingdomain.customer.value.Day;
import co.com.gym.trainingdomain.customer.value.FeedingId;
import co.com.sofka.domain.generic.Command;

public class UpdateDayFeeding extends Command {

    private final CustomerId customerId;
    private final FeedingId feedingId;
    private final Day day;

    public UpdateDayFeeding(CustomerId customerId, FeedingId feedingId, Day day) {
        this.customerId = customerId;
        this.feedingId = feedingId;
        this.day = day;
    }

    public CustomerId getCustomerId() {
        return customerId;
    }

    public FeedingId getFeedingId() {
        return feedingId;
    }

    public Day getDay() {
        return day;
    }
}
