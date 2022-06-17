package za.ac.cput.school_management.service.employee;


/*
 * Author : Mogamad Tawfeeq Cupido
 * Student Number : 216266882
 *(Term 2 Exam)
 * */

import za.ac.cput.school_management.domain.employee.EmployeeAddress;

import za.ac.cput.school_management.service.IService;

import java.util.List;

public interface EmployeeAddressService  extends IService<EmployeeAddress, String> {

    List<EmployeeAddress> findByStaffId(String staffId);
    void deleteById(String staffId);
}
