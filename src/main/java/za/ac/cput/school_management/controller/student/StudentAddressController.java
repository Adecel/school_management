package za.ac.cput.school_management.controller.student;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.school_management.domain.student.Student;
import za.ac.cput.school_management.domain.student.StudentAddress;
import za.ac.cput.school_management.service.student.StudentAddressService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("school/student/address/")
//the full address is : http://localhost:8080/school/student-address/save
public class StudentAddressController {

    private final StudentAddressService studentAddressService;

    private StudentAddressController(StudentAddressService studentAddressService){
        this.studentAddressService = studentAddressService;
    }

        @PostMapping("save")
    public Student save(StudentAddress studentAddress) {
        System.out.println("Save called");
        return null;
    }


//    public Optional<StudentAddress> read(String studentId) {
//
//    }
//
//    public void delete(StudentAddress studentAddress) {
//
//    }
//
//
//    public List<Student> findByStudentId(String studentId) {
//
//    }
}
