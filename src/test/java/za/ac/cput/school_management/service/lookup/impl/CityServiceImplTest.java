package za.ac.cput.school_management.service.lookup.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.school_management.domain.lookup.City;
import za.ac.cput.school_management.domain.lookup.Country;
import za.ac.cput.school_management.factory.lookup.CityFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Hilary Cassidy Nguepi Nangmo
 * 220346887
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CityServiceImplTest {
private CityServiceImpl cityService;
    @Order(1)
    @Test
    void getCityService() {
        cityService = CityServiceImpl.getCityService();
    }

    @Order(2)
    @Test
    void save() {
        City city = cityService.save(CityFactory.getCity("1234","Pretoria",new Country()));
        assertNotNull(city);
    }

    @Order(3)
    @Test
    void read() {
        City city = cityService.read("1234").get();
        assertNotNull(city);
    }

    @Test
    void delete() {
        City cityObject = CityFactory.getCity("1234","Pretoria",new Country());
        cityService.delete(cityObject);
        City city = cityService.read("1234").get();
        assertNotSame(city,cityObject);
    }

    @Test
    void update() {
        City city = cityService.update(CityFactory.getCity("1234","Pretoria",new Country()));
        assertNotNull(city);
    }

    @Test
    void readAll() {
        List<City> cities = cityService.readAll();
        assertNotNull(cities);
    }
}