package co.com.gym.trainingdomain.customer.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Day implements ValueObject<String> {

    private final String value;

    public Day(String value) {

        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            new IllegalArgumentException("The day cannot be blank");
        }
        if(this.value.length() < 5){
            new IllegalArgumentException("Must be more than 5 characters");
        }
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Day day = (Day) o;
        return Objects.equals(value, day.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
