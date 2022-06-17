package za.ac.cput.school_management.domain.lookup;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

//don't modify the class anymore, from here every thing is working till to the controller
@Entity
public class City
{
    @Id @NotNull
    private String id;
    @Column(insertable = false, updatable = false)  //I have add this dont remote we gona use it the controller
    private String name;
    @Embedded private Country country;

    public City() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return id.equals(city.id) && name.equals(city.name) && country.equals(city.country);
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, name, country);
    }

    @Override
    public String toString() {
        return "City{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", country=" + country +
                '}';
    }

    public static class Builder{
        private String id;
        private String name;
        private Country country;
        public Builder (String id){
            this.id = id;
        }
        public Builder buildName(String name){
            this.name = name;
            return this;
        }
        public Builder buildCountry(Country country){
            this.country = country;
            return this;
        }
        public City build(){
            return new City(this);
        }
    }


}
