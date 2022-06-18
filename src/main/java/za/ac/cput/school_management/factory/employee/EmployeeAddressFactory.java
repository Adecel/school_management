package za.ac.cput.school_management.factory.employee;

/*
 * Author : Mogamad Tawfeeq Cupido
 * Student Number : 216266882
 *(Term 2 Exam)
 * */


import za.ac.cput.school_management.domain.employee.EmployeeAddress;
import za.ac.cput.school_management.domain.lookup.Address;


public class EmployeeAddressFactory {


    public static EmployeeAddress build(String staffId, Address address) {

        Helper.checkStringParam("staffId", staffId);
        Helper.checkStringParam("address", String.valueOf(address));

        return new EmployeeAddress.Builder().StaffId(staffId).Address(address).build();
    }
}
