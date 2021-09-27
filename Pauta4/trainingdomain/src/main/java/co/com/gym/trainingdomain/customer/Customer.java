package co.com.gym.trainingdomain.customer;

import co.com.gym.trainingdomain.customer.event.*;
import co.com.gym.trainingdomain.customer.value.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Customer extends AggregateEvent<CustomerId> {

    protected Name name;
    protected PlanId planId;
    protected AccountId accountId;
    protected RoutineId routineId;
    protected Set<Feeding> feedingsSet;

    public Customer(CustomerId entityId, Name name) {
        super(entityId);
        appendChange(new CreatedCustomer(name)).apply();
    }

    private Customer(CustomerId entityId){
        super(entityId);
        subscribe(new CustomerChange(this));
    }

    public static Customer from(CustomerId customerId, List<DomainEvent> events){
        var customer = new Customer(customerId);
        events.forEach(customer::applyEvent);
        return customer;
    }

    public void addFeeding(FeedingId entityId, Quantity quantity, Day day, Name name){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(quantity);
        Objects.requireNonNull(day);
        Objects.requireNonNull(name);
        appendChange(new AddedFeeding(entityId,quantity,day,name)).apply();
    }

    public void assingRoutine(RoutineId routineId){
        Objects.requireNonNull(routineId);
        appendChange(new AssignedRoutine(routineId)).apply();
    }

    public void assingAccount(AccountId accountId){
        Objects.requireNonNull(accountId);
        appendChange(new AssignedAccount(accountId)).apply();
    }

    public void assingPlan(PlanId planId){
        Objects.requireNonNull(planId);
        appendChange(new AssignedPlan(planId)).apply();
    }

    public void updateName(Name name){
        Objects.requireNonNull(name);
        appendChange(new UpdatedName(name)).apply();
    }

    public void updateNameFeeding(FeedingId feedingId, Name name){
        Objects.requireNonNull(feedingId);
        Objects.requireNonNull(name);
        appendChange(new UpdatedNameFeeding(feedingId, name)).apply();
    }

    public void updateDayFeeding(FeedingId feedingId, Day day){
        Objects.requireNonNull(feedingId);
        Objects.requireNonNull(day);
        appendChange(new UpdatedDayFeeding(feedingId, day)).apply();
    }

    public void updateQuantityFeeding(FeedingId feedingId, Quantity quantity){
        Objects.requireNonNull(feedingId);
        Objects.requireNonNull(quantity);
        appendChange(new UpdatedQuantityFeeding(feedingId, quantity)).apply();
    }

    protected Optional<Feeding> getFeedingById(FeedingId feedingId){

        return feedingsSet()
                .stream()
                .filter(feeding -> feeding
                        .identity()
                        .equals(feedingId))
                .findFirst();
    }

    public Name name(){
        return name;
    }

    public PlanId planId() {
        return planId;
    }

    public AccountId accountId() {
        return accountId;
    }

    public RoutineId routineId() {
        return routineId;
    }

    public Set<Feeding> feedingsSet() {
        return feedingsSet;
    }
}
