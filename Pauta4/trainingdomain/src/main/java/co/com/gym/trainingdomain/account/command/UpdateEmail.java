package co.com.gym.trainingdomain.account.command;

import co.com.gym.trainingdomain.account.value.AccountId;
import co.com.gym.trainingdomain.account.value.Email;
import co.com.sofka.domain.generic.Command;

public class UpdateEmail extends Command {

    private final AccountId accountId;
    private final Email email;

    public UpdateEmail(AccountId customerId, Email email) {
        this.accountId = customerId;
        this.email = email;
    }

    public AccountId getAccountId() {
        return accountId;
    }

    public Email getEmail() {
        return email;
    }

}
