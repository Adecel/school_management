
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


    CityFactoryTest() throws Exception {
    }

    @Test
    void a_getCity() throws Exception {
        City city = CityFactory.getCity("12344","Yaounde",new Country());
        assertNotNull(city);
        System.out.println(city);
    }
    @Test
    void b_getCity() throws Exception {
        City city1 = CityFactory.getCity("12344","",new Country());
        assertNotNull(city1);
        System.out.println(city1);
    }

}