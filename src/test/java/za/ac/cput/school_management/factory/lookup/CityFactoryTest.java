
package za.ac.cput.school_management.factory.lookup;

import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.lookup.City;
import za.ac.cput.school_management.domain.lookup.Country;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 */
class CityFactoryTest
{
    City city;
    @Test
    void getCity() {
        city = CityFactory.getCity("12344","Yaounde",new Country());
        assertNotNull(city);
        System.out.println(city);
    }

}