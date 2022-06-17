package za.ac.cput.school_management.factory.lookup;

import za.ac.cput.school_management.domain.lookup.City;
import za.ac.cput.school_management.domain.lookup.Country;
/**
 * Hilary Cassidy Nguepi Nangmo
 * 220346887
 */
public class CityFactory
{
    public static City getCity(String id, String name, Country country) throws Exception {
        if(id.equals("")||name.equals(""))   throw new Exception("IllegalArgumentException");
        return new City.Builder(id).buildName(name).buildCountry(country).build();
    }
}
