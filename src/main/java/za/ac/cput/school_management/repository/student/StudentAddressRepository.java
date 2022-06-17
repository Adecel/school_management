package za.ac.cput.school_management.repository.student;
/*
 * @author Adecel Rusty Mabiala
 * @StudentNumber 219197229
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.school_management.domain.student.StudentAddress;

import java.util.List;

@Repository
public interface StudentAddressRepository extends JpaRepository<StudentAddress, String> {
        List<StudentAddress> findByStudentId(String studentId);

}
