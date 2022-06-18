package za.ac.cput.school_management.factory.lookup;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
//import za.ac.cput.school_management.domain.lookup.Address;
import za.ac.cput.school_management.domain.lookup.AddressT;
import za.ac.cput.school_management.domain.lookup.City;
import za.ac.cput.school_management.domain.lookup.Country;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AddressFactoryTest {


   Country country = CountryFactory.getCountry("2055","South Africa");
    City CapeTown = CityFactory.getCity("2055", "Cape Town", country);

    @Test public void buildWithSuccess(){
        AddressT address = AddressFactory.build("5","5",
                "5","victoira",
                        "7890",CapeTown);
        System.out.println(address);
//        assertAll(
//                ()-> assertNotNull(address),
//                ()->assertNotNull(address.getComplexNumber())
//
//        );
    }
    @Test
    public void buildWithError(){
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                AddressFactory
                        .build("6", "5","5","loop",
                                "894",null));
        System.out.println(exception.getMessage());
    }

}