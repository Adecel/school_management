package za.ac.cput.school_management.controller.student;
/*
 * @author Adecel Rusty Mabiala
 * @StudentNumber 219197229
 * @Project Term-2
 * @Group 31
 * @Role Team Leader and Developer
 */

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import za.ac.cput.school_management.domain.student.StudentAddress;
import za.ac.cput.school_management.factory.student.StudentAddressFactory;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class StudentAddressControllerTest {

    @LocalServerPort
    private int port;

    @Autowired private StudentAddressController controller;
    @Autowired private TestRestTemplate restTemplate;
    private StudentAddress studentAddress;
    private String baseUrl;

    @BeforeEach
    void setUp() {
        this.studentAddress = StudentAddressFactory
                .build("Studient_ID", null);
        this.baseUrl = "http://localhost:"+ this.port + "/school/student-address/";
    }

    @Test
    @Order(1)
    void save() {
        String url = baseUrl + "save";
        System.out.println(url);
        ResponseEntity<StudentAddress> response = this.restTemplate
                .postForEntity(url, this.studentAddress, StudentAddress.class);
        System.out.println(response);
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertNotNull(response.getBody())
        );
    }

    @Test
    @Order(2)
    void read() {
        String url = baseUrl + "read/" + this.studentAddress.getStudentId();
        System.out.println(url);
        ResponseEntity<StudentAddress> response = this.restTemplate.getForEntity(url, StudentAddress.class);
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertNotNull(response.getBody())
        );
    }

    @Test
    @Order(3)
    void delete() {
        String url = baseUrl + "delete/" + this.studentAddress.getStudentId();
        this.restTemplate.delete(url);
    }

    @Test
    @Order(4)
        //void findByStudentId() {
    void findAll() {
        String url = baseUrl + "all";
        System.out.println(url);
        ResponseEntity<StudentAddress[]> response = this.restTemplate.getForEntity(url, StudentAddress[].class);
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertTrue(response.getBody().length == 0)
        );
    }
}