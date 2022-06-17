package za.ac.cput.school_management.factory.student;
/*
 * @author Adecel Rusty Mabiala
 * @StudentNumber 219197229
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.student.StudentAddress;
import za.ac.cput.school_management.factory.student.StudentAddressFactory;

import static org.junit.jupiter.api.Assertions.*;

class StudentAddressFactoryTest {

    @Test
    public void buildWithSuccess(){
        StudentAddress studentAddress = StudentAddressFactory
                .build("219197229", null);
        System.out.println(studentAddress);
        assertAll(
                () -> assertNotNull(studentAddress),
                () -> assertNotNull(studentAddress)
        );
    }

    @Test
    public void buildWithError(){
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                StudentAddressFactory
                        .build("",  null));
        String exceptionMessage = exception.getMessage();
        System.out.println(exception.getMessage());
        assertTrue(exception.getMessage().contains("StudentId"));
    }

}