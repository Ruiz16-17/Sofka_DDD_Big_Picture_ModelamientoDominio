package co.com.gym.trainingdomain.account;

import co.com.gym.trainingdomain.account.event.UpdatedEmail;
import co.com.gym.trainingdomain.account.event.UpdatedName;
import co.com.gym.trainingdomain.account.value.AccountId;
import co.com.gym.trainingdomain.account.value.Email;
import co.com.gym.trainingdomain.account.value.Name;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;

public class Account extends AggregateEvent<AccountId> {

    protected Name name;
    protected Email email;

    public Account(AccountId entityId, Name name, Email email) {
        super(entityId);
        this.name = name;
        this.email = email;
    }

    private Account(AccountId entityId){
        super(entityId);
        subscribe(new AccountChange(this));
    }

    public static Account from(AccountId entityId, List<DomainEvent> events){
        var account = new Account(entityId);
        events.forEach(account::applyEvent);
        return account;
    }

    public void updateName(Name name){
        appendChange(new UpdatedName(name)).apply();
    }

    public void updateEmail(Email email){
        appendChange(new UpdatedEmail(email)).apply();
    }

    public Name name() {
        return name;
    }

    public Email email() {
        return email;
    }
}
