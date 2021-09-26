package co.com.gym.trainingdomain.customer.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Name implements ValueObject<String> {

    private final String value;

    public Name(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            new IllegalArgumentException("The name cannot be blank");
        }
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Name name = (Name) object;
        return Objects.equals(value, name.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
