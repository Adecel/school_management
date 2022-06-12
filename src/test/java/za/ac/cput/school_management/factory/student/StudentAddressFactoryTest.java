package za.ac.cput.school_management.factory.student;

import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.lookup.Address;
import za.ac.cput.school_management.domain.student.StudentAddress;

import static org.junit.jupiter.api.Assertions.*;

class StudentAddressFactoryTest {

//    @Test
//    public void buildWithError(){
//        Exception exception = assertThrows(IllegalArgumentException.class, () ->
//        StudentAddressFactory
//                .build("", "");
//        System.out.println(exception.getMessage());
//        assertTrue(exception.getMessage().contains("StudentId"));
//    }

    @Test
    public void buildWithSuccess(){
        StudentAddress studentAddress = StudentAddressFactory
                .build("123456789", null);
        System.out.println(studentAddress);
        assertAll(
                () -> assertNotNull(studentAddress),
                () -> assertNotNull(studentAddress.getAddress())
        );
    }

}