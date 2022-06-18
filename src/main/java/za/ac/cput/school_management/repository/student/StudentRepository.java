package za.ac.cput.school_management.repository.student;
/*
 * @author Adecel Rusty Mabiala
 * @StudentNumber 219197229
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.school_management.domain.student.Student;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
        List<Student> findByStudentId(String studentId);
         Optional<Student> findByEmail(String email);
}
