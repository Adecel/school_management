package za.ac.cput.school_management.repository.lookup.impl;

import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.lookup.Country;
import za.ac.cput.school_management.factory.lookup.CountryFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CountryRepositoryImplTest {
    CountryRepositoryImpl countryRepository= CountryRepositoryImpl.getCountryRepository();


    @Test
    void create() {
        Country country = CountryFactory.getCountry("007", "South Africa");
        Country country1 = countryRepository.create(country);
        System.out.println(country1.toString());
        assertNotNull(country1);
    }

    @Test
    void update() {
        Country country = CountryFactory.getCountry("007", "South Africa");
        Country country1 = countryRepository.create(country);

        Country countryObject = CountryFactory.getCountry("007", "East Africa");
        Country countryUpdated = countryRepository.update(countryObject);
        System.out.println(countryUpdated.toString());
        assertNotNull(countryUpdated);
    }

    @Test
    void read() {
        Country countryObject = CountryFactory.getCountry("007", "South Africa");
        countryRepository.create(countryObject);

        Country country = countryRepository.read("007");
        System.out.println(country.toString());
        assertNotNull(country);
    }

    @Test
    void delete() {
        Country countryObject = CountryFactory.getCountry("007", "South Africa");
        countryRepository.create(countryObject);

        Boolean result = countryRepository.delete("007");
        assertTrue(result);
    }

    @Test
    void readAll() {
        Country countryObject =  CountryFactory.getCountry("007", "South Africa");
        Country countryObject2 =  CountryFactory.getCountry("008", "East Africa");
        Country countryObject3 =  CountryFactory.getCountry("009", "West Africa");
        countryRepository.create(countryObject);
        countryRepository.create(countryObject2);
        countryRepository.create(countryObject3);

        List<Country> countryList = countryRepository.readAll();
        System.out.println(countryList);
        assertNotNull(countryList);
    }
}