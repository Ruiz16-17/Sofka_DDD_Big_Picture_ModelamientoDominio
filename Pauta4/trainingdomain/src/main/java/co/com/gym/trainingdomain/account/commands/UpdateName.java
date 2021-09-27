package co.com.gym.trainingdomain.account.commands;

import co.com.gym.trainingdomain.account.value.AccountId;
import co.com.gym.trainingdomain.account.value.Name;
import co.com.sofka.domain.generic.Command;

public class UpdateName extends Command {

    private final AccountId accountId;
    private final Name name;

    public UpdateName(AccountId customerId, Name name) {
        this.accountId = customerId;
        this.name = name;
    }

    public AccountId getAccountId() {
        return accountId;
    }

    public Name getName() {
        return name;
    }
}
