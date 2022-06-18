package za.ac.cput.school_management.controller.lookup;
/*
 * Author : Mogamad Tawfeeq Cupido
 * Student Number : 216266882
 *(Term 2 Exam)
 * */

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
import za.ac.cput.school_management.domain.employee.EmployeeAddress;
import za.ac.cput.school_management.domain.lookup.Address;
import za.ac.cput.school_management.domain.lookup.Country;
import za.ac.cput.school_management.factory.employee.EmployeeAddressFactory;
import za.ac.cput.school_management.factory.lookup.AddressFactory;
import za.ac.cput.school_management.factory.lookup.CountryFactory;
import za.ac.cput.school_management.repository.employee.EmployeeAddressRepository;
import za.ac.cput.school_management.repository.lookup.CountryRepository;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)


class CountryControllerTest {

    private String baseURL = "http://localhost:8080/coumtry/";

    Country country = CountryFactory.getCountry("2231","Sudan");
    @Autowired
    private TestRestTemplate restTemplate;
    @Autowired
    private CountryRepository countryRepository;

    CountryControllerTest() throws Exception {

    }
    @Order(1)
    @Test
    void save() {
        countryRepository.save(country);
        ResponseEntity<Country> postedCountry = restTemplate.postForEntity(baseURL+"create",country,Country.class);
        assertNotNull(postedCountry);
        System.out.println(postedCountry);
    }
    @Order(2)
    @Test
    void read() {
        ResponseEntity<Country> postedCountry = restTemplate.getForEntity(baseURL+"read?id="+country.getId(),Country.class);
        assertNotNull(postedCountry);
    }
    @Order(3)
    @Test
    void delete() {
        restTemplate.getForEntity(baseURL+"delete?id="+country.getId(),Country.class);
        ResponseEntity<Country> postedCountry = restTemplate.getForEntity(baseURL+"read?id="+country.getId(),Country.class);
        assertNull(postedCountry.getBody());
    }
    @Order(4)
    @Test
    void findById() {
        restTemplate.postForEntity(baseURL+"findByStaffId",country,Country.class);
        ResponseEntity<String> postedCountry = restTemplate.getForEntity(baseURL+"reads"+country.getId(),String.class);
        assertNotNull(postedCountry);
        System.out.println(postedCountry.getBody());
    }
}