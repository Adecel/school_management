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

//        @PostMapping("save")
//    public Student save(StudentAddress studentAddress) {
//        return studentAddressService.save(studentAddress);
//    }


//    public Optional<StudentAddress> read(String studentId) {
//        return studentAddressService.save(studentAddress);
//    }
//
//    public void delete(StudentAddress studentAddress) {
//        return studentAddressService.read(studentId);
//    }
//
//
//    public List<Student> findByStudentId(String studentId) {
//
//    }
}
