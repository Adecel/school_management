package za.ac.cput.school_management.repository.lookup.impl;


import za.ac.cput.school_management.domain.lookup.City;
import za.ac.cput.school_management.domain.lookup.Country;

import java.util.ArrayList;
import java.util.List;


public class CountryRepositoryImpl {

    private List<Country> countrydb = new ArrayList<>();
    //private CountryRepository db;
    private static CountryRepositoryImpl countryRepository = null;

    private CountryRepositoryImpl() {
    }

    public static CountryRepositoryImpl getCountryRepository() {
        if (countryRepository == null) {
            countryRepository = new CountryRepositoryImpl();
        }
        return countryRepository;
    }

    Country create(Country country) {
        boolean result = countrydb.add(country);
        if (result) {
            return country;
        }
        return null;
    }

    Country update(Country country) {
        Country result = read(country.getId());
        if (result != null) {
            countrydb.remove(result);
            countrydb.add(country);
            return country;
        }
        return null;
    }

    Country read(String id) {
        return countrydb.stream().filter(s -> s.getId().equals(id)).findAny().orElse(null);
    }

    Boolean delete(String id) {
        Country country = read(id);
        return countrydb.remove(country);
    }

    List<Country> readAll() {
        return countrydb;
    }
}