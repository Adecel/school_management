package za.ac.cput.school_management.service.student.impl;
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
import za.ac.cput.school_management.domain.lookup.Name;
import za.ac.cput.school_management.domain.student.Student;
import za.ac.cput.school_management.factory.student.StudentFactory;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class StudentServiceImplTest {

    @Autowired StudentServiceImpl studentService;

    private final Student student = StudentFactory
            .build("219197229","rusty@cput.ac.za",
                    new Name("Adecel","Rusty",
                            "Mabiala"));

    @Test
    @Order(1)
    void save() {
        Student studentTest = this.studentService
                .save(student);
        System.out.println(studentTest);
        assertNotNull(studentTest);
    }

    @Test
    @Order(4)
    void read() {
        Optional<Student> readTest =
                this.studentService.read(student.getStudentId());
        assertNotNull(readTest);
        System.out.println(readTest);
    }

    @Test
    @Order(5)
    void delete() {
        this.studentService.deleteById(student.getStudentId());
    }

    @Test
    @Order(3)
    void findByStudentId() {
        this.studentService.findByStudentId(student.getStudentId());
    }

    @Test
    @Order(2)
    void findByEmail(){
        Optional<Student> emailTest = this.studentService.findByEmail(student.getEmail());
        assertNotNull(emailTest);
        System.out.println(emailTest);
        assertAll(
                () -> assertEquals("rusty@cput.ac.za", student.getEmail())
        );
    }
}