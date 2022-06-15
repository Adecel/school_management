package za.ac.cput.school_management.repository.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.school_management.domain.student.StudentAddress;
import za.ac.cput.school_management.repository.IRepository;

import java.util.List;

@Repository
public interface StudentAddressRepository extends JpaRepository<StudentAddress, String> {
        List<StudentAddress> findByStudentId(String studentId);

}
