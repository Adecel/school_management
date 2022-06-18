package za.ac.cput.school_management.domain.lookup;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Objects;
/**
 * Hilary Cassidy Nguepi Nangmo
 * 220346887
 */
//don't modify the class anymore, from here every thing is working till to the controller
@Entity
public class City
{
    @NotNull
    private String id;
    @NotNull
    private String name;
    @Embedded
    private Country country;

    protected City() {
    }

    private City(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.country = builder.country;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Country getCountry() {
        return country;
    }

    public static class Builder {
        private String id, name;
        private Country country;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setCountry(Country country) {
            this.country = country;
            return this;
        }

        public Builder copy(City city) {
            this.id = city.id;
            this.name = city.name;
            this.country = city.country;
            return this;
        }

        public City build() {
            return new City(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return id.equals(city.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "City{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", countryId=" + country.getCountryId() +'\'' +
                ", countryName=" + country.getCountryName() +'\'' +
                '}';
    }

}
