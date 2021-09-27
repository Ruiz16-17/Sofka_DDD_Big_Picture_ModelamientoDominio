package co.com.gym.trainingdomain.Plan.value;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;
import java.util.Objects;

public class FinishDate implements ValueObject<LocalDate> {

    private final LocalDate value;

    public FinishDate(LocalDate value) {
        this.value = Objects.requireNonNull(value);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FinishDate that = (FinishDate) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public LocalDate value() {
        return value;
    }
}
