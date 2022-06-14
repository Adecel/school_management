package za.ac.cput.school_management.factory.student;

import za.ac.cput.school_management.domain.student.StudentAddress;
import za.ac.cput.school_management.domain.lookup.Address;
import za.ac.cput.school_management.helper.Helper;

public class StudentAddressFactory {

    public static StudentAddress build(String studentId, Address address) {
        Helper.checkStringParam("studentId", studentId);
        Helper.checkStringParam("address", String.valueOf(address));

        return new StudentAddress.Builder().StudentId(studentId).Address(address).build();
    }
}
