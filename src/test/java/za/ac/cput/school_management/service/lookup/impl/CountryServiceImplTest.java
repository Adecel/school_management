package za.ac.cput.school_management.service.lookup.impl;

/*
 * Author : Mogamad Tawfeeq Cupido
 * Student Number : 216266882
 *(Term 2 Exam)
 * */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.school_management.domain.lookup.Country;
import za.ac.cput.school_management.factory.lookup.CountryFactory;
import za.ac.cput.school_management.repository.lookup.CountryRepository;

import java.util.List;
import java.util.Optional;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNull;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CountryServiceImplTest {


    @Autowired
    private CountryServiceImpl countryService;

    @Autowired
    private CountryRepository countryRepository;

    @Order(1)
    @Test
    void save() throws Exception{
        Country country = CountryFactory.getCountry("0222", "America");
        Country savedCountry = countryRepository.save(country);
        System.out.println("savedCountry");
    }
    @Order(2)
    @Test
    void read() {
        Country country = countryService.read("0222").get();
        System.out.println(country);
        assertNotNull(country);
    }
    @Order(3)
    @Test
    void delete() throws Exception {
        Country country = CountryFactory.getCountry("0222","America");
        Country country1 = CountryFactory.getCountry("0222","America");
        countryService.delete(country1);
        System.out.println(country);
        assertNotNull(country);
    }
    @Order(4)
    @Test
    void findById() throws Exception {
        Country country = CountryFactory.getCountry("0222","America");

        Optional<Country> countryList = countryService.findById("0222");
        assertNull(countryList);
    }
    @Order(5)
    @Test
    void deleteById() throws Exception {
        Country country = CountryFactory.getCountry("0222","America");
        Optional<Country> countryList = countryService.deleteById("0222");
        assertNull(countryList);
    }
}