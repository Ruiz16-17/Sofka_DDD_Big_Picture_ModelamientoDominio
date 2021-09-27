package co.com.gym.trainingdomain.Routine.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DaySection implements ValueObject<String> {

    private final String value;

    public DaySection(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            new IllegalArgumentException("The name cannot be blank");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DaySection that = (DaySection) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String value() {
        return value;
    }
}
