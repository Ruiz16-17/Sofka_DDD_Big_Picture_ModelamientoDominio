package co.com.gym.trainingdomain.account.command;

import co.com.gym.trainingdomain.account.value.AccountId;
import co.com.gym.trainingdomain.account.value.Email;
import co.com.gym.trainingdomain.account.value.Name;
import co.com.sofka.domain.generic.Command;

public class CreateAccount extends Command {

    private final AccountId entityId;
    private final Name name;
    private final Email email;

    public CreateAccount(AccountId entityId, Name name, Email email) {
        this.entityId = entityId;
        this.name = name;
        this.email = email;
    }

    public AccountId getEntityId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }

    public Email getEmail() {
        return email;
    }
}
