package za.ac.cput.school_management.repository.lookup.impl;


import za.ac.cput.school_management.domain.employee.EmployeeAddress;
import za.ac.cput.school_management.domain.lookup.Country;
import za.ac.cput.school_management.repository.lookup.CountryRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class CountryRepositoryImpl implements CountryRepository{

    private final List<Country> CountryList;
    private static za.ac.cput.school_management.repository.lookup.impl.CountryRepositoryImpl COUNTRY_REPOSITORY;
    private CountryRepositoryImpl(){
        this.CountryList = new ArrayList<>();
    }



    @Override
    public Country save(Country country) {
        Optional<Country> read = read(country.getId());
        if (read.isPresent()){
            delete(read.get());
        }
        this.CountryList.add(country);
        return country;
    }

    @Override
    public Optional<Country> read(String id) {
        return  this.CountryList.stream().filter(g -> g.getId().equalsIgnoreCase(id))
                .findFirst();
    }

    @Override
    public void delete(Country country) {
        this.CountryList.remove(country);

    }

    @Override
    public List<Country> findById(String id) {
        return this.CountryList.stream()
                .filter(g -> g.getId().equalsIgnoreCase(id))
                .collect(Collectors.toList());
    }
}
