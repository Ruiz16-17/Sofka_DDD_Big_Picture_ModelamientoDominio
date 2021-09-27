package co.com.gym.trainingdomain.customer.command;

import co.com.gym.trainingdomain.customer.value.AccountId;
import co.com.gym.trainingdomain.customer.value.CustomerId;
import co.com.sofka.domain.generic.Command;

public class AssingAccount extends Command {

    private final CustomerId customerId;
    private final AccountId accountId;

    public AssingAccount(CustomerId customerId, AccountId accountId) {
        this.customerId = customerId;
        this.accountId = accountId;
    }

    public CustomerId getCustomerId() {
        return customerId;
    }

    public AccountId getAccountId() {
        return accountId;
    }
}
