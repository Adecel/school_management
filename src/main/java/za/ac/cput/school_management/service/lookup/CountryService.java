package za.ac.cput.school_management.service.lookup;


import za.ac.cput.school_management.domain.lookup.Country;
import za.ac.cput.school_management.service.IService;

import java.util.List;

public interface CountryService extends IService<Country, String> {

    List<Country> findById(String id);
    void deleteById(String id);
}