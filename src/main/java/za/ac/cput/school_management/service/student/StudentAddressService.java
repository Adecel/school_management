package za.ac.cput.school_management.service.student;

import za.ac.cput.school_management.service.IService;

import java.util.List;

public interface StudentAddressService extends IService<StudentAddressService, String> {

        List<StudentAddressService> findByStudentId(String studentId);
}
