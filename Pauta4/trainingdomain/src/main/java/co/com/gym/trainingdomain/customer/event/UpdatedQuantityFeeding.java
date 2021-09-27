package co.com.gym.trainingdomain.customer.event;

import co.com.gym.trainingdomain.customer.value.FeedingId;
import co.com.gym.trainingdomain.customer.value.Quantity;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdatedQuantityFeeding extends DomainEvent {

    private final FeedingId feedingId;
    private final Quantity quantity;

    public UpdatedQuantityFeeding(FeedingId feedingId, Quantity quantity) {
        super("sofka.customer.updatednamefeeding");
        this.feedingId = feedingId;
        this.quantity = quantity;
    }

    public FeedingId getFeedingId() {
        return feedingId;
    }

    public Quantity getQuantity() {
        return quantity;
    }
}
