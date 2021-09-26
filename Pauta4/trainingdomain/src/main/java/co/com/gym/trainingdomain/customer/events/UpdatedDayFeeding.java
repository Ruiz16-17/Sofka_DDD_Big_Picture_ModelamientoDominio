package co.com.gym.trainingdomain.customer.events;

import co.com.gym.trainingdomain.customer.value.Day;
import co.com.gym.trainingdomain.customer.value.FeedingId;
import co.com.gym.trainingdomain.customer.value.Name;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdatedDayFeeding extends DomainEvent {

    private final FeedingId feedingId;
    private final Day day;

    public UpdatedDayFeeding(FeedingId feedingId, Day day) {
        super("sofka.customer.updateddayfeeding");
        this.feedingId = feedingId;
        this.day = day;
    }

    public FeedingId getFeedingId() {
        return feedingId;
    }

    public Day getDay() {
        return day;
    }
}
