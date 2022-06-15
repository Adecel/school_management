package za.ac.cput.school_management.service.student;

import za.ac.cput.school_management.domain.student.Student;
import za.ac.cput.school_management.service.IService;

import java.util.List;

public interface StudentService extends IService<Student, String> {
    List<Student> findByStudentId(String studentId);
    void deleteById(String studentId);
}
