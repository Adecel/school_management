package za.ac.cput.school_management.service.student.impl;
/*
 * @author Adecel Rusty Mabiala
 * @StudentNumber 219197229
 * @Project Term-2
 * @Group 31
 * @Role Team Leader and Developer
 *
 */

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.school_management.domain.lookup.Address;
import za.ac.cput.school_management.domain.lookup.City;
import za.ac.cput.school_management.domain.lookup.Country;
import za.ac.cput.school_management.domain.student.StudentAddress;
import za.ac.cput.school_management.factory.student.StudentAddressFactory;
import za.ac.cput.school_management.service.student.StudentAddressService;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class StudentAddressServiceImplTest {

    StudentAddress studentAddress;
    @Autowired private StudentAddressServiceImpl studentAddressService;

    //the code of other are making test failed

    private final StudentAddress studentAddress = StudentAddressFactory
            .build("", new Address("F6",
                    "Avon Sand", "33", "Avon mouth",
                    "7441", new City("+27",
                    "Cape Town", new Country("0027","South Africa"))));

//
    @BeforeEach
//    void beforeEach() {
//        studentAddress = StudentAddressFactory.build("1234567",
//                new Address("F6",
//                        "Avon Sand", "33", "Avon mouth",
//                        "7441", new City("+27",
//                        "Cape Town", new Country("0027","South Africa"))));
//    }

    @Test
    @Order(1)
    void save() {
        StudentAddress studentTest = this.studentAddressService
                .save(studentAddress);
        System.out.println(studentTest);
        assertNotNull(studentTest);
    }

    @Test
    @Order(2)
    void read() {
        Optional<StudentAddress> readTest =
                this.studentAddressService.read(studentAddress.getStudentId());
        assertNotNull(readTest);
        System.out.println(readTest);
    }

    @Test
    @Order(3)
    void delete() {
        this.studentAddressService.deleteById(studentAddress.getStudentId());
    }

    @Test
    @Order(3)
    void findByStudentId() {
        this.studentAddressService.findByStudentId(studentAddress.getStudentId());
    }
}