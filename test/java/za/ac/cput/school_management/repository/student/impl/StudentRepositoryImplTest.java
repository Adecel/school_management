package za.ac.cput.school_management.repository.student.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.student.Student;
import za.ac.cput.school_management.factory.student.StudentFactory;
import za.ac.cput.school_management.repository.student.StudentRepository;

import static org.junit.jupiter.api.Assertions.*;

class StudentRepositoryImplTest {
    private Student student;
    private StudentRepository repository;
//    @BeforeEach
//        void setUp(){
//        this.student = StudentFactory.build("studentId_test", "email_test", "name_test");
//        this.repository = StudentRepositoryImpl.studentRepository();
//        Student saved = this.repository.save(this.student);
//        assertSame(this.student, saved);
//    }

    @Test
    void save() {
    }

    @Test
    void read() {
    }

    @Test
    void delete() {
    }

    @Test
    void findByStudentId() {
    }
}