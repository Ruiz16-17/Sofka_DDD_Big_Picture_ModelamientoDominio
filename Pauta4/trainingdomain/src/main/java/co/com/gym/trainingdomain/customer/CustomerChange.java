package co.com.gym.trainingdomain.customer;

import co.com.gym.trainingdomain.customer.event.*;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class CustomerChange extends EventChange {
    public CustomerChange(Customer customer) {

        apply((CreatedCustomer event) -> {
            customer.name = event.getName();
            customer.feedingsSet = new HashSet<>();

        });

        apply((AssignedRoutine event) -> {
            customer.routineId = event.getRoutineId();
        });

        apply((AssignedAccount event) -> {
            customer.accountId = event.getAccountId();
        });

        apply((AssignedPlan event) -> {
            customer.planId = event.getPlanId();
        });

        apply((UpdatedName event) -> {
            customer.name = event.getName();
        });

        apply((UpdatedNameFeeding event) -> {

            var feeding = customer.getFeedingById(event.getFeedingId())
                    .orElseThrow(() -> new IllegalArgumentException("Customer feeding not found"));

            feeding.updateName(event.getName());
        });

        apply((UpdatedDayFeeding event) -> {
            var feeding = customer.getFeedingById(event.getFeedingId())
                    .orElseThrow(() -> new IllegalArgumentException("Customer feeding not found"));

            feeding.updateDay(event.getDay());
        });

        apply((UpdatedQuantityFeeding event) -> {
            var feeding = customer.getFeedingById(event.getFeedingId())
                    .orElseThrow(() -> new IllegalArgumentException("Customer feeding not found"));

            feeding.updateQuantity(event.getQuantity());
        });

        apply((AddedFeeding event) -> {
            var numberOfFeedings = customer.feedingsSet().size();
            if (numberOfFeedings == 30){
                throw new IllegalArgumentException("You can't add more food, you can only have 30");
            }

            customer.feedingsSet.add(new Feeding(
                                event.getFeedingId(),
                    event.getQuantity(),
                                event.getDay(),
                    event.getName()
                        ));
        });
    }
}
