package co.com.gym.trainingdomain.customer.event;

import co.com.gym.trainingdomain.customer.value.Name;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdatedName extends DomainEvent {

    private final Name name;

    public UpdatedName(Name name) {
        super("sofka.customer.updatedname");
        this.name = name;
    }

    public Name getName() {
        return name;
    }
}
