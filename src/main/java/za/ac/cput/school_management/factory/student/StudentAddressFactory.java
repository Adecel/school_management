package za.ac.cput.school_management.factory.student;
/*
 * @author Adecel Rusty Mabiala
 * @StudentNumber 219197229
 */

import za.ac.cput.school_management.domain.student.StudentAddress;
import za.ac.cput.school_management.domain.lookup.Address;
import za.ac.cput.school_management.helper.Helper;

public class StudentAddressFactory {

    public static StudentAddress build(String studentId, Address address) {
//        Helper.checkStringParam("studentId", studentId);
//        Helper.checkStringParam("address", String.valueOf(address));

        Helper.checkStringParam("Student ID is required", studentId);
        if(String.valueOf(address).isEmpty())
            throw new IllegalArgumentException("address can not be empty");

        return new StudentAddress.Builder().StudentId(studentId).Address(address).build();
    }
}
