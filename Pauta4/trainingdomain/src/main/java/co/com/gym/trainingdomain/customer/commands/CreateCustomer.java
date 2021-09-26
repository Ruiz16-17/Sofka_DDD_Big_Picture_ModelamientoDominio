package co.com.gym.trainingdomain.customer.commands;

import co.com.gym.trainingdomain.customer.value.CustomerId;
import co.com.gym.trainingdomain.customer.value.Name;
import co.com.sofka.domain.generic.Command;

public class CreateCustomer extends Command {

    private final CustomerId entityId;
    private final Name name;

    public CreateCustomer(CustomerId entityId, Name name) {
        this.entityId = entityId;
        this.name = name;
    }

    public CustomerId getEntityId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }
}
