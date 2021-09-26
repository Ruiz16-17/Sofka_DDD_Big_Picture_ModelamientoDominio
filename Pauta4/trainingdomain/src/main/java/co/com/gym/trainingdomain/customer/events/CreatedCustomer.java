package co.com.gym.trainingdomain.customer.events;

import co.com.gym.trainingdomain.customer.value.Name;
import co.com.sofka.domain.generic.DomainEvent;

public class CreatedCustomer extends DomainEvent {

    private final Name name;

    public CreatedCustomer(Name name) {
        super("trainingdomain.customer.createdcustomer");
        this.name = name;
    }

    public Name getName() {
        return name;
    }
}
