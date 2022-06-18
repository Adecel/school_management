package za.ac.cput.school_management.controller.employee;

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
import za.ac.cput.school_management.domain.lookup.City;
import za.ac.cput.school_management.domain.lookup.Country;
import za.ac.cput.school_management.factory.employee.EmployeeAddressFactory;
import za.ac.cput.school_management.factory.lookup.AddressFactory;
import za.ac.cput.school_management.factory.lookup.CityFactory;
import za.ac.cput.school_management.factory.lookup.CountryFactory;
import za.ac.cput.school_management.repository.employee.EmployeeAddressRepository;
import za.ac.cput.school_management.repository.lookup.CountryRepository;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

class EmployeeAddressControllerTest {
    private String baseURL = "http://localhost:8080/employeeAddress/";

    //Address address = AddressFactory.getAddress("1112","6 Larry Road");
    EmployeeAddress employeeAddress = EmployeeAddressFactory.build("0001",null);
    @Autowired
    private TestRestTemplate restTemplate;
    @Autowired
    private EmployeeAddressRepository employeeAddressRepository;

    EmployeeAddressControllerTest() throws Exception {

    }
    @Order(1)
    @Test
    void save() {
        employeeAddressRepository.save(employeeAddress);
        ResponseEntity<EmployeeAddress> postedEmployeeAddress = restTemplate.postForEntity(baseURL+"create",employeeAddress,EmployeeAddress.class);
        assertNotNull(postedEmployeeAddress);
        System.out.println(postedEmployeeAddress);
    }
    @Order(2)
    @Test
    void read() {
        ResponseEntity<EmployeeAddress> postedEmployeeAddress = restTemplate.getForEntity(baseURL+"read?id="+employeeAddress.getStaffId(),EmployeeAddress.class);
        assertNotNull(postedEmployeeAddress);
    }
    @Order(3)
    @Test
    void delete() {
        restTemplate.getForEntity(baseURL+"delete?id="+employeeAddress.getStaffId(),EmployeeAddress.class);
        ResponseEntity<EmployeeAddress> postedEmployeeAddress = restTemplate.getForEntity(baseURL+"read?id="+employeeAddress.getStaffId(),EmployeeAddress.class);
        assertNull(postedEmployeeAddress.getBody());
    }
    @Order(4)
    @Test
    void findByStaffId() {
        restTemplate.postForEntity(baseURL+"findByStaffId",employeeAddress,EmployeeAddress.class);
        ResponseEntity<String> postedEmployeeAddress = restTemplate.getForEntity(baseURL+"reads"+employeeAddress.getStaffId(),String.class);
        assertNotNull(postedEmployeeAddress);
        System.out.println(postedEmployeeAddress.getBody());
    }
}