package co.com.gym.trainingdomain.account.events;

import co.com.gym.trainingdomain.account.value.Email;
import co.com.gym.trainingdomain.account.value.Name;
import co.com.sofka.domain.generic.DomainEvent;

public class CreatedAccount extends DomainEvent {

    private final Name name;
    private final Email email;

    public CreatedAccount(Name name, Email email) {
        super("trainingdomain.account.createdaccount");
        this.name = name;
        this.email = email;
    }

    public Name getName() {
        return name;
    }

    public Email getEmail() {
        return email;
    }
}
