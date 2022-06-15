package za.ac.cput.school_management.service.student;

import za.ac.cput.school_management.domain.student.StudentAddress;
import za.ac.cput.school_management.service.IService;

import java.util.List;

public interface StudentAddressService extends IService<StudentAddress, String> {

        List<StudentAddress> findByStudentId(String studentId);
        void deleteById(String studentId);
}
