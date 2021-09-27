package co.com.gym.trainingdomain.account;

import co.com.gym.trainingdomain.account.event.CreatedAccount;
import co.com.gym.trainingdomain.account.event.UpdatedEmail;
import co.com.gym.trainingdomain.account.event.UpdatedName;
import co.com.sofka.domain.generic.EventChange;

public class AccountChange extends EventChange {

    public AccountChange(Account account) {

        apply((CreatedAccount event) -> {
            account.name = event.getName();
            account.email = event.getEmail();
        });


        apply((UpdatedName event) -> {
            account.name = event.getName();
        });

        apply((UpdatedEmail event) -> {
            account.email = event.getEmail();
        });


    }
}
