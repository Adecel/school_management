<<<<<<< HEAD
//package za.ac.cput.school_management.service.student;
//
//import za.ac.cput.school_management.domain.student.StudentAddress;
//import za.ac.cput.school_management.service.IService;
//
//import java.util.List;
//
//public interface StudentAddressService extends IService<StudentAddress, String> {
//
//        List<StudentAddress> findByStudentId(String studentId);
//        void deleteById(String studentId);
//}
=======
package za.ac.cput.school_management.service.student;
/*
 * @author Adecel Rusty Mabiala
 * @StudentNumber 219197229
 * @Project Term-2
 * @Group 31
 * @Role Team Leader and Developer
 */

import za.ac.cput.school_management.domain.student.StudentAddress;
import za.ac.cput.school_management.service.IService;

import java.util.List;

public interface StudentAddressService extends IService<StudentAddress, String> {

        List<StudentAddress> findByStudentId(String studentId);
        void deleteById(String studentId);
}
>>>>>>> origin/master
