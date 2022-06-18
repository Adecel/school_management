package za.ac.cput.school_management.factory.lookup;

import za.ac.cput.school_management.domain.lookup.City;
import za.ac.cput.school_management.domain.lookup.Country;
import za.ac.cput.school_management.helper.StringHelper;

/**
 * Hilary Cassidy Nguepi Nangmo
 * 220346887
 */
public class CityFactory
{
    public static City build(String cityID, String cityName, String countryId, String countryName){



        StringHelper.checkStringParam("cityID", cityID);
        StringHelper.checkStringParam("cityName", cityName);
        Country country=CountryFactory.build(countryId,countryName);
        return  new City.Builder().setId(cityID).setName(cityName).setCountry(country).build();


    }
