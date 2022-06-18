package za.ac.cput.school_management.service.student;
/*
 * @author Adecel Rusty Mabiala
 * @StudentNumber 219197229
 * @Project Term-2
 * @Group 31
 * @Role Team Leader and Developer
 */

import org.springframework.stereotype.Service;
import za.ac.cput.school_management.domain.student.Student;
import za.ac.cput.school_management.service.IService;

import java.util.List;
import java.util.Optional;

@Service
public interface StudentService extends IService<Student, String> {
    List<Student> findByStudentId(String studentId);
    List<Student> findAll();
    void deleteById(String studentId);
    Optional<Student> findByEmail(String email);

}
