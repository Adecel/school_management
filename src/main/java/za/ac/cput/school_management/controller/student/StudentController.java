package za.ac.cput.school_management.controller.student;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.school_management.domain.student.Student;
import za.ac.cput.school_management.service.student.StudentService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("school/student/")
@Slf4j
//the full address is : http://localhost:8080/school/student/save
//the full address is : http://localhost:8080/school/student/read/studentId
public class StudentController {

    private final StudentService studentService;

    @Autowired public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping("save")
    public ResponseEntity<Student> save(@RequestBody Student student) {
        log.info("Save request: {}", student);
        Student save = studentService.save(student);
        return ResponseEntity.ok(save);
    }

    @GetMapping("read/{studentId}")
    public ResponseEntity<Student> read(@PathVariable String studentId) {
        log.info("Read request: {}", studentId);
        Student student = this.studentService.read(studentId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return ResponseEntity.ok(student);
    }

    @DeleteMapping("delete")
    public ResponseEntity<Void> delete(@PathVariable String studentId) {
        log.info("Delete request: {}", studentId);
        this.studentService.deleteById(studentId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("all")
    public ResponseEntity<List<Student>> findByStudentId(String studentId) {
        List<Student> student = this.studentService.findByStudentId(studentId);
        return ResponseEntity.ok(student);
    }
}
