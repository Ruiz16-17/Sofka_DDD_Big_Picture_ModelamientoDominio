package co.com.gym.trainingdomain.customer.events;

import co.com.gym.trainingdomain.customer.value.AccountId;
import co.com.gym.trainingdomain.customer.value.RoutineId;
import co.com.sofka.domain.generic.DomainEvent;

public class AssignedAccount extends DomainEvent {

    private final AccountId accountId;

    public AssignedAccount(AccountId accountId) {
        super("training.customer.assginedaccount");
        this.accountId = accountId;
    }

    public AccountId getAccountId() {
        return accountId;
    }
}
