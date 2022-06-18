package za.ac.cput.school_management.service.lookup;

/*
 * Author : Mogamad Tawfeeq Cupido
 * Student Number : 216266882
 *(Term 2 Exam)
 * */

import za.ac.cput.school_management.domain.lookup.Country;
import za.ac.cput.school_management.service.IService;

import java.util.Optional;

public interface CountryService extends IService<Country, String> {

    Optional<Country> findById(String id);

    void deleteById(String id);

}