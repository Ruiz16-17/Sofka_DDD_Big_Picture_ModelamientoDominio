package co.com.gym.trainingdomain.account;

import co.com.gym.trainingdomain.account.events.CreatedAccount;
import co.com.gym.trainingdomain.account.events.UpdatedEmail;
import co.com.gym.trainingdomain.account.events.UpdatedName;
import co.com.gym.trainingdomain.customer.events.*;
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
