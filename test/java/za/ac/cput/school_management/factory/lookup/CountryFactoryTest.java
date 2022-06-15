package za.ac.cput.school_management.factory.lookup;

import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.lookup.Country;

import static org.junit.jupiter.api.Assertions.*;

class CountryFactoryTest {
    Country country = CountryFactory.getCountry("165654", "South Africa");

    @Test
    void getCountry() {
        assertNotNull(country);
        System.out.println(country);
    }

}