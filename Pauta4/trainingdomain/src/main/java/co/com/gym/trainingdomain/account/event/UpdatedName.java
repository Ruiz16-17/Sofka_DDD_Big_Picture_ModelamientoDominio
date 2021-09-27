package co.com.gym.trainingdomain.account.event;

import co.com.gym.trainingdomain.account.value.Name;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdatedName extends DomainEvent {

    private final Name name;

    public UpdatedName(Name name) {
        super("sofka.account.updatedname");
        this.name = name;
    }

    public Name getName() {
        return name;
    }
}
