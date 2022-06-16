package za.ac.cput.school_management.repository.lookup.impl;

import org.junit.jupiter.api.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.school_management.domain.lookup.City;
import za.ac.cput.school_management.domain.lookup.Country;
import za.ac.cput.school_management.factory.lookup.CityFactory;
import za.ac.cput.school_management.repository.lookup.CityRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Hilary Cassidy Nguepi Nangmo
 * 220346887
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class CityRepositoryImplTest {
    CityRepository cityRepository;


    @Test
    @Order(1)
    void create() {
        City city = CityFactory.getCity("123","NAiROBI",new Country());
        City city1 = cityRepository.save(city);
        System.out.println(city1.toString());
        assertNotNull(city1);
    }

    @Test
    @Order(2)
    void update() {
        City city = CityFactory.getCity("123","NAiROBI",new Country());
        City city1 = cityRepository.save(city);

        City cityObject = CityFactory.getCity("123","KIGALI",new Country());
        City cityUpdated = cityRepository.save(cityObject);
        System.out.println(cityUpdated.toString());
        assertNotNull(cityUpdated);
    }

    @Test
    @Order(3)
    void read() {

        City city = cityRepository.findById("123").get();
        System.out.println(city.toString());
        assertNotNull(city);
    }

    @Test
    @Order(4)
    void delete() {
        City cityObject = CityFactory.getCity("123","NAiROBI",new Country());
        cityRepository.delete( cityObject);
    }

    @Test
    @Order(5)
    void readAll() {
        List<City> cityList = cityRepository.findAll();
        System.out.println(cityList);
        assertNotNull(cityList);
    }

}