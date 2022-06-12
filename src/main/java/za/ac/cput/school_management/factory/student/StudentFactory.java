package za.ac.cput.school_management.factory.student;

import za.ac.cput.school_management.domain.lookup.Name;
import za.ac.cput.school_management.domain.student.Student;
import za.ac.cput.school_management.helper.Helper;


public class StudentFactory {

//    public static Student build(String studentId, String email, Name name){
//        if (studentId == null || studentId.isEmpty()){
//            throw new IllegalArgumentException("Student Id is required!");
//        }
//        if (email == null || email.isEmpty()){
//            throw new IllegalArgumentException("Email type is required!");
//        }
//        if (name == null || name.isEmpty()){
//            throw new IllegalArgumentException("Name type is required!");
//        }
//
//        return new Student.Builder().StudentId(studentId).Email(email).Name(name).build();
//    }

    public static Student build(String studentId, String email, Name name) {
        Helper.checkStringParam("studentId", studentId);
        Helper.checkStringParam("email", email);
        Helper.checkStringParam("name", String.valueOf(name));

        return new Student.Builder().StudentId(studentId).Email(email).Name(name).build();
    }



}
