package za.ac.cput.school_management.service.lookup.impl;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
//import za.ac.cput.school_management.domain.lookup.Address;
import za.ac.cput.school_management.domain.lookup.City;
import za.ac.cput.school_management.factory.lookup.AddressFactory;
import za.ac.cput.school_management.service.lookup.AddressService;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

//@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class AddressServiceImplTest {


   // private final Country country = CountryFactory.getCountry("01", "gh");
 //   private final City city = CityFactory.getCity("01", "gh", country);
    private final AddressT address = AddressFactory.build("20",
            "one","02", "TWO",
           "3300", new City( "11133", "name") new  Country("",""));


    @Autowired
    private AddressService addressService;


    @Order(1)
    @Test
    void save(){
        AddressT saved = this.addressService.save(this.address);
        assertEquals(this.address, saved);
        System.out.println(saved);
    }


    @Order(2)
    @Test
    void read(){
        Optional<AddressT> read = this.addressService.read(this.address.getUnitNumber());
        assertAll(
                ()-> assertTrue(read.isPresent()),
                ()-> assertEquals(this.address,read.get())
        );
    }


    @Order(3)
    @Test
    void delete(){
        this.addressService.deleteById(this.address.getUnitNumber());
        List<AddressT> studentAddressList = this.addressService.findAll();
      //  assertEquals(0,studentAddressList.size());
    }


}