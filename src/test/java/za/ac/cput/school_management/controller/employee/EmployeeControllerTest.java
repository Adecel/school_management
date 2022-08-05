package za.ac.cput.school_management.controller.employee;
//Kissimba Nyembo Isaac
//Student Number: 219383448
//Responsible of the Employee class
//Code: 100% working

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import za.ac.cput.school_management.domain.employee.Employee;
import za.ac.cput.school_management.factory.employee.EmployeeFactory;
import za.ac.cput.school_management.factory.lookup.NameFactory;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment =  SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//Isaac
class EmployeeControllerTest {
@LocalServerPort
private  int port;
@Autowired private  EmployeeController controller;
@Autowired private TestRestTemplate restTemplate;
private Employee employee;
private String baseUrl;
    //Isaac
@BeforeEach
void setup(){
    this.employee = EmployeeFactory.build("219383448", "kissimbaisaac@gmail.com", NameFactory.BuildName("ISAAC", "NYEMBO","AARONKISS"));
    this.baseUrl = "http://localhost:" + this.port + "/Adp/employee/";
}
    //Isaac
    @Test
    @Order(1)
    void save() {
    String url = baseUrl + "save";
        System.out.println(url);
        ResponseEntity<Employee> response = this.restTemplate.postForEntity(url, this.employee, Employee.class);
        System.out.println(response);
        assertAll(
                ()-> assertEquals(HttpStatus.OK, response.getStatusCode()),
                ()-> assertNotNull(response.getBody())
        );
    }
    //Isaac
    @Test
    @Order(2)
    void read() {
    String url = baseUrl + "read/" + this.employee.getStaffId();
        System.out.println(url);
        ResponseEntity<Employee> response = this.restTemplate.getForEntity(url, Employee.class);
        System.out.println(response);
        assertAll(
                ()-> assertEquals(HttpStatus.OK, response.getStatusCode()),
                ()-> assertNotNull(response.getBody())
        );
    }
    //Isaac
    @Test
    @Order(3)
    void delete() {
    String url = baseUrl + "delete/" + this.employee.getStaffId();
    this.restTemplate.delete(url);

    }
    //Isaac
    @Test
    @Order(4)
    void findAll() {
        String url = baseUrl + "all";
        System.out.println(url);
        ResponseEntity<Employee[]> response =
                this.restTemplate.getForEntity(url, Employee[].class);
        System.out.println(Arrays.asList(response.getBody()));
        assertAll(
                ()-> assertEquals(HttpStatus.OK, response.getStatusCode()),
                ()-> assertTrue(response.getBody().length==0)
        );
    }
}
//Isaac