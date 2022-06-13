package za.ac.cput.school_management.factory.lookup;

import za.ac.cput.school_management.domain.lookup.City;
import za.ac.cput.school_management.domain.lookup.Country;

public class CityFactory
{
    public static City getCity(String id, String name, Country country){
        return new City.Builder(id).buildName(name).build();
    }
}
