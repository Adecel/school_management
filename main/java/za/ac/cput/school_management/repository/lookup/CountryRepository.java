package za.ac.cput.school_management.repository.lookup;

import za.ac.cput.school_management.domain.lookup.Country;

import za.ac.cput.school_management.repository.IRepository;

import java.util.List;

public interface CountryRepository extends IRepository<Country, String> {
    List<Country> findById(String Id);
}
