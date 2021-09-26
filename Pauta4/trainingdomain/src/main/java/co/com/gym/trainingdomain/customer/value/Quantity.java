package co.com.gym.trainingdomain.customer.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Quantity implements ValueObject<String> {

    private final String value;

    public Quantity(String value) {

        this.value = Objects.requireNonNull(value);

        if(Integer.parseInt(this.value) < 50){
            new IllegalArgumentException("Must be more than 50");
        }
    }

    @Override
    public String value() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity quantity = (Quantity) o;
        return Objects.equals(value, quantity.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
