package co.com.gym.trainingdomain.account.events;

import co.com.gym.trainingdomain.account.value.Email;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdatedEmail extends DomainEvent {

    private final Email email;

    public UpdatedEmail(Email email) {
        super("sofka.account.updatedemail");
        this.email = email;
    }

    public Email getEmail() {
        return email;
    }
}
