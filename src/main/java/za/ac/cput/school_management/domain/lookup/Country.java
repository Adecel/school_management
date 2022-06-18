package za.ac.cput.school_management.domain.lookup;

/*
 * Author : Mogamad Tawfeeq Cupido
 * Student Number : 216266882
 *(Term 2 Exam)
 * */



import com.sun.istack.NotNull;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

import com.sun.istack.NotNull;

import java.util.Objects;

public class Country {
    @NotNull
    private  String countryId;
    private  String countryName;

    protected Country() {
    }

    public Country(Builder builder) {
        this.countryId = builder.countryId;
        this.countryName = builder.countryName;
    }

    public String getCountryId() {
        return countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(countryId, country.countryId) && Objects.equals(countryName, country.countryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryId, countryName);
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryId='" + countryId + '\'' +
                ", countryName='" + countryName + '\'' +
                '}';
    }



    public static class Builder{
        private String countryId, countryName;

        public Builder setCountryId(String countryId){
            this.countryId = countryId;
            return this;
        }

        public Builder setCountryName(String countryName){
            this.countryName = countryName;
            return this;
        }

        public Builder copy(Country country){
            this.countryId = country.countryId;
            this.countryName = country.countryName;
            return this;

        }

        public Country build(){
            return new Country(this);
        }
    }
}
