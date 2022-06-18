package za.ac.cput.school_management.service.lookup.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.school_management.domain.lookup.City;
import za.ac.cput.school_management.domain.lookup.Country;
import za.ac.cput.school_management.factory.lookup.CityFactory;
import za.ac.cput.school_management.factory.lookup.CountryFactory;
import za.ac.cput.school_management.repository.lookup.CountryRepository;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Hilary Cassidy Nguepi Nangmo
 * 220346887
 */
//@RunWith(SpringRunner.class)
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CityServiceImplTest {
    @Autowired
    private CityServiceImpl cityService;
    @Autowired
    private CountryRepository countryRepository;


    @Order(2)
    @Test
    void save() throws Exception {
        Country country = CountryFactory.getCountry("0001","South Africa");
        Country savedCountry = countryRepository.save(country);
        System.out.println("savedCountry");
        System.out.println(savedCountry);
        City mycity = CityFactory.getCity("1234","Pretoria",savedCountry);
        System.out.println(mycity);
        City city = cityService.save(mycity);
        assertNotNull(city);
    }

    @Order(3)
    @Test
    void read() {
        City city = cityService.read("1234").get();
        System.out.println(city);
        assertNotNull(city);
    }
    @Order(4)
    @Test
    void update() throws Exception {
        Country country = CountryFactory.getCountry("0001","South Africa");
        City city = cityService.update(CityFactory.getCity("1234","Pretoria",country));
        assertNotNull(city);
    }
    @Order(5)
    @Test
    void delete() throws Exception {
        Country country = CountryFactory.getCountry("0001","South Africa");
        City cityObject = CityFactory.getCity("1234","Pretoria",country);
        cityService.delete(cityObject);
        City city = cityService.read("1234").orElse(null);
        assertNull(city);
    }

    @Order(6)
    @Test
    void readAll() {
        List<City> cities = cityService.readAll();
        assertNotNull(cities);
    }
}