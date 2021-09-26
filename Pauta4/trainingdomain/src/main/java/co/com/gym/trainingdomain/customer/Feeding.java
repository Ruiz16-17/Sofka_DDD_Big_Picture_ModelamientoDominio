package co.com.gym.trainingdomain.customer;

import co.com.gym.trainingdomain.customer.value.Day;
import co.com.gym.trainingdomain.customer.value.FeedingId;
import co.com.gym.trainingdomain.customer.value.Name;
import co.com.gym.trainingdomain.customer.value.Quantity;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Feeding extends Entity<FeedingId> {

    private Quantity quantity;
    private Day day;
    private Name name;

    public Feeding(FeedingId entityId, Quantity quantity, Day day, Name name) {
        super(entityId);
        this.quantity = quantity;
        this.day = day;
        this.name = name;
    }

    public void updateQuantity(Quantity quantity){
        this.quantity = Objects.requireNonNull(quantity);
    }

    public void updateDay(Day day){
        this.day = Objects.requireNonNull(day);
    }

    public void updateName(Name name){
        this.name = Objects.requireNonNull(name);
    }

    public Quantity quantity() {
        return quantity;
    }

    public Day day() {
        return day;
    }

    public Name name() {
        return name;
    }
}
