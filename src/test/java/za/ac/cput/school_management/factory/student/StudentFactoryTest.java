package za.ac.cput.school_management.factory.student;
/*
 * @author Adecel Rusty Mabiala
 * @StudentNumber 219197229
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.lookup.Name;
import za.ac.cput.school_management.domain.student.Student;
import za.ac.cput.school_management.factory.student.StudentFactory;

import static org.junit.jupiter.api.Assertions.*;

class StudentFactoryTest {

    @Test
    public void buildWithSuccess(){
        Student student = StudentFactory
                .build("123445", "F6 Avon Sands", new Name("Adecel", "Michel","Ilunga"));
        System.out.println(student);
        assertAll(
                () -> assertNotNull(student),
                () -> assertNotNull(student),
                () -> assertNotNull(student.getName())
        );
    }

    @Test
    public void buildWithError(){
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                StudentFactory
                        .build("", "", new Name("Adecel", "Michel","Ilunga")));
        System.out.println(exception.getMessage());
        assertTrue(exception.getMessage().contains("StudentId"));
    }

}