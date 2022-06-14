package za.ac.cput.school_management.repository.student;

import za.ac.cput.school_management.domain.student.Student;
import za.ac.cput.school_management.repository.IRepository;

import java.util.List;

public interface StudentRepository extends IRepository<Student, String> {
        List<Student> findByStudentId(String studentId);
}
