package za.ac.cput.school_management.controller.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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
class StudentAddressControllerTest {

    @LocalServerPort
    private int port;

    @Autowired private StudentAddressController controller;
    @Autowired private TestRestTemplate restTemplate;
    private StudentAddress studentAddress;
    private String baseUrl;

    @BeforeEach
    void setUp() {
        assertNotNull(controller);
//        this.studentAddress = StudentAddressFactory.build("StdID", "F6, Parkland");
        this.baseUrl = "http://localhost:"+ this.port + "/school/student-address/";
    }

    @Test
    void save() {
    }

    @Test
    void read() {
        String url = baseUrl + "read/" + this.studentAddress.getStudentId();
        System.out.println(url);
        ResponseEntity<StudentAddress> response = this.restTemplate.getForEntity(url, StudentAddress.class);
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode())
        );
    }

    @Test
    void delete() {
    }

    @Test
    void findByStudentId() {
    }
}