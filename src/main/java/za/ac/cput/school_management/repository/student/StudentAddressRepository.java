package za.ac.cput.school_management.repository.student;

import za.ac.cput.school_management.domain.student.StudentAddress;
import za.ac.cput.school_management.repository.IRepository;

import java.util.List;

public interface StudentAddressRepository extends IRepository<StudentAddress, String> {
        List<StudentAddress> findByStudentId(String studentId);

}
