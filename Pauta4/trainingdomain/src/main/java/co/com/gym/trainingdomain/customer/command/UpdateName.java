package co.com.gym.trainingdomain.customer.command;

import co.com.gym.trainingdomain.customer.value.CustomerId;
import co.com.gym.trainingdomain.customer.value.Name;
import co.com.sofka.domain.generic.Command;

public class UpdateName extends Command {

    private final CustomerId customerId;
    private final Name name;

    public UpdateName(CustomerId customerId, Name name) {
        this.customerId = customerId;
        this.name = name;
    }

    public CustomerId getCustomerId() {
        return customerId;
    }

    public Name getName() {
        return name;
    }
}
