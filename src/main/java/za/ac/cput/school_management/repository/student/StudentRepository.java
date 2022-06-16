package za.ac.cput.school_management.repository.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.school_management.domain.student.Student;
import za.ac.cput.school_management.repository.IRepository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
        List<Student> findByStudentId(String studentId);
}
