package za.ac.cput.school_management.controller.lookup.city;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import za.ac.cput.school_management.domain.lookup.City;
import za.ac.cput.school_management.domain.lookup.Country;
import za.ac.cput.school_management.factory.lookup.CityFactory;
import za.ac.cput.school_management.factory.lookup.CountryFactory;
import za.ac.cput.school_management.repository.lookup.CountryRepository;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class CityControllerImplTest {

    private String baseURL = "http://localhost:8080/city/";

    Country country = CountryFactory.getCountry("0002","Malawi");
    City city = CityFactory.getCity("0001","Windhoek",country );
    @Autowired
    private TestRestTemplate restTemplate;
    @Autowired
    private CountryRepository countryRepository;

    CityControllerImplTest() throws Exception {

    }

    @Order(1)
    @Test
    void a_save() throws Exception {
        countryRepository.save(country);
        ResponseEntity<City> postedCity = restTemplate.postForEntity(baseURL+"create",city,City.class);
        assertNotNull(postedCity);
        System.out.println(postedCity);
    }

    @Order(2)
    @Test
    void b_read() {
        ResponseEntity<City> postedCity = restTemplate.getForEntity(baseURL+"read?id="+city.getId(),City.class);
        assertNotNull(postedCity);
        System.out.println(postedCity.getBody());
    }



    @Order(3)
    @Test
    void c_update() throws Exception {
        City cityToUpdate = CityFactory.getCity("0001","Lilongwe",country );
        countryRepository.save(country);
        ResponseEntity<City> postedCity = restTemplate.postForEntity(baseURL+"update",cityToUpdate,City.class);
        assertNotNull(postedCity);
        System.out.println(postedCity);
    }
    @Order(4)
    @Test
    void d_delete() {
        restTemplate.getForEntity(baseURL+"delete?id="+city.getId(),City.class);
        ResponseEntity<City> postedCity = restTemplate.getForEntity(baseURL+"read?id="+city.getId(),City.class);
        assertNull(postedCity.getBody());
    }

    @Order(5)
    @Test
    void e_readAll() {
        restTemplate.postForEntity(baseURL+"create",city,City.class);
        ResponseEntity<String> postedCity = restTemplate.getForEntity(baseURL+"reads"+city.getId(),String.class);
        assertNotNull(postedCity);
        System.out.println(postedCity.getBody());
    }
}