package za.ac.cput.school_management.controller.student;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.school_management.domain.student.Student;
import za.ac.cput.school_management.service.student.StudentService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("school/student/")
//the full address is : http://localhost:8080/school/student/save
public class StudentController {

    private final StudentService studentService;

    private StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping("save")
    public Student save(Student student) {
        return studentService.save(student);
    }


    public Optional<Student> read(String studentId) {
        return studentService.read(studentId);
    }

    public void delete(Student student) {

    }
//
//
//    public List<Student> findByStudentId(String studentId) {
//
//    }
}
