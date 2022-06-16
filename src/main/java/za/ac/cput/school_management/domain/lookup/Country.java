package za.ac.cput.school_management.domain.lookup;

/*
 * Author : Mogamad Tawfeeq Cupido
 * Student Number : 216266882
 *(Term 2 Exam)
 * */

import com.sun.istack.NotNull;

import javax.persistence.Embeddable;

import javax.persistence.Id;
import java.util.Objects;

    @Embeddable
    public class Country {


    @Id @NotNull  private String id;
                  private String name;


	public Country(Builder builder){
    this.id = builder.id;
	this.name = builder.name;

}

    public Country(String id, String name) {

        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return id.equals(country.id) && name.equals(country.name) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Country{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
       //Builder
    public static class Builder {
        private String id;
        private String name;


           //Builder setters

        public Builder  (String id) {
            this.id = id;

        }

        public Builder Name (String name) {
            this.name = name;
            return this;

        }


        public Country build() {
            return new Country(this);
        }

       }
}
