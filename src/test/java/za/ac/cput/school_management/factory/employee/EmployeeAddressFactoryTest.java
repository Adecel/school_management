package za.ac.cput.school_management.factory.employee;

/*
 * Author : Mogamad Tawfeeq Cupido
 * Student Number : 216266882
 *(Term 2 Exam)
 * */

import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.employee.EmployeeAddress;


import static org.junit.jupiter.api.Assertions.*;

class EmployeeAddressFactoryTest {


    @Test
    public void buildWithSuccess(){
        EmployeeAddress employeeAddress = EmployeeAddressFactory
                .build("120021", null);
        System.out.println(employeeAddress);
        assertAll(
                () -> assertNotNull(employeeAddress),
                () -> assertNotNull(employeeAddress.getAddress())
        );
    }

}