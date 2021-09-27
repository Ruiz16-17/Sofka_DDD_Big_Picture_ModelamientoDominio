package co.com.gym.trainingdomain.customer.command;

import co.com.gym.trainingdomain.customer.value.CustomerId;
import co.com.gym.trainingdomain.customer.value.FeedingId;
import co.com.gym.trainingdomain.customer.value.Quantity;
import co.com.sofka.domain.generic.Command;

public class UpdateQuantityFeeding extends Command {

    private final CustomerId customerId;
    private final FeedingId entityId;
    private final Quantity quantity;

    public UpdateQuantityFeeding(CustomerId customerId, FeedingId entityId, Quantity quantity) {
        this.customerId = customerId;
        this.entityId = entityId;
        this.quantity = quantity;
    }

    public CustomerId getCustomerId() {
        return customerId;
    }

    public FeedingId getEntityId() {
        return entityId;
    }

    public Quantity getQuantity() {
        return quantity;
    }
}
