package za.ac.cput.school_management.factory.employee;

/*
 * Author : Mogamad Tawfeeq Cupido
 * Student Number : 216266882
 *(Term 2 Exam)
 * */


import za.ac.cput.school_management.domain.employee.EmployeeAddress;
import za.ac.cput.school_management.domain.lookup.Address;
import za.ac.cput.school_management.helper.Helper;


public class EmployeeAddressFactory {


    public static EmployeeAddress build(String staffId, Address address) {

        Helper.checkStringParam("staffId", staffId);
        Helper.checkStringParam("address", String.valueOf(address));

        return new EmployeeAddress.Builder().StaffId(staffId).Address(address).build();
    }

    public static EmployeeAddress createEmployeeAddress(String s, String s1, String s2, String s3, String wood, int i, String pt4, String motherCity, String s4, String afrique_du_sud) {
      return null;}
}
