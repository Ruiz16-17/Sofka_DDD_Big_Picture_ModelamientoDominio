package co.com.gym.trainingdomain.customer.commands;

import co.com.gym.trainingdomain.customer.value.CustomerId;
import co.com.gym.trainingdomain.customer.value.FeedingId;
import co.com.gym.trainingdomain.customer.value.Name;
import co.com.sofka.domain.generic.Command;

public class UpdateNameFeeding extends Command {

    private final CustomerId customerId;
    private final FeedingId entityId;
    private final Name name;

    public UpdateNameFeeding(CustomerId customerId, FeedingId entityId, Name name) {
        this.customerId = customerId;
        this.entityId = entityId;
        this.name = name;
    }

    public CustomerId getCustomerId() {
        return customerId;
    }

    public FeedingId getEntityId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }
}
