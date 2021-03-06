package za.ac.cput.school_management.factory.student;
/*
 * @author Adecel Rusty Mabiala
 * @StudentNumber 219197229
 * @Project Term-2
 * @Group 31
 * @Role Team Leader and Developer
 */

import za.ac.cput.school_management.domain.student.Student;
import za.ac.cput.school_management.domain.lookup.Name;
import za.ac.cput.school_management.helper.Helper;

public class StudentFactory {

    public static Student build(String studentId, String email, Name name) {
        Helper.checkStringParam("studentId", studentId);
        Helper.checkStringParam("email", email);
        Helper.checkStringParam("name", String.valueOf(name));
//        if(String.valueOf(name).isEmpty())
//            throw new IllegalArgumentException("name can not be empty");

        return new Student.Builder().StudentId(studentId).Email(email).Name(name).build();
    }

}
