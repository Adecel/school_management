package za.ac.cput.school_management.service.lookup.impl;

/*
 * Author : Mogamad Tawfeeq Cupido
 * Student Number : 216266882
 *(Term 2 Exam)
 * */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.school_management.domain.lookup.Country;
import za.ac.cput.school_management.factory.lookup.CountryFactory;
import za.ac.cput.school_management.repository.lookup.CountryRepository;
import za.ac.cput.school_management.service.lookup.CountryService;

import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService {

    private static CountryServiceImpl countryService = null;
    @Autowired
    private CountryRepository repository;


    @Override
    public Country save(Country country) throws Exception {
        Country obj = CountryFactory.getCountry(country.getCountryId(), country.getCountryName());
        return this.repository.save(country);
    }

    @Override
    public Optional<Country> read(String id) {
        return this.repository.findById(id);
    }

    @Override
    public void delete(Country country) {
        this.repository.delete(country);

    }

    @Override
    public Optional<Country> findById(String countryId) {
        return this.repository.findById(countryId);
    }

    @Override
    public Optional<Country> deleteById(String countryId) {
        Optional<Country> country = read(countryId);
        country.ifPresent(this::delete);

        return country;
    }

}
