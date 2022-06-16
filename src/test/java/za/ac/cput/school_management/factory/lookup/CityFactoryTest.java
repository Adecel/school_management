
package za.ac.cput.school_management.factory.lookup;

import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.lookup.City;
import za.ac.cput.school_management.domain.lookup.Country;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Hilary Cassidy Nguepi Nangmo
 * 220346887
 */
class CityFactoryTest
{
    City city = CityFactory.getCity("12344","Yaounde",null);
    @Test
    void getCity() {
        assertNotNull(city);
        System.out.println(city);
    }

}