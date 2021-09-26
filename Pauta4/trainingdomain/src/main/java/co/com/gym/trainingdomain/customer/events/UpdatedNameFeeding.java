package co.com.gym.trainingdomain.customer.events;

import co.com.gym.trainingdomain.customer.value.FeedingId;
import co.com.gym.trainingdomain.customer.value.Name;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdatedNameFeeding extends DomainEvent {

    private final FeedingId feedingId;
    private final Name name;

    public UpdatedNameFeeding(FeedingId feedingId, Name name) {
        super("sofka.customer.updatednamefeeding");
        this.feedingId = feedingId;
        this.name = name;
    }

    public FeedingId getFeedingId() {
        return feedingId;
    }

    public Name getName() {
        return name;
    }
}
