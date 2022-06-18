package za.ac.cput.school_management.factory.lookup;
/*
 * Author : Mogamad Tawfeeq Cupido
 * Student Number : 216266882
 *(Term 2 Exam)
 * */

import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.lookup.Country;

import static org.junit.jupiter.api.Assertions.*;

class CountryFactoryTest {
    Country country = CountryFactory.getCountry("165654", "South Africa");

    CountryFactoryTest() throws Exception {
    }

    @Test
    void getCountry() {
        assertNotNull(country);
        System.out.println(country);
    }

}