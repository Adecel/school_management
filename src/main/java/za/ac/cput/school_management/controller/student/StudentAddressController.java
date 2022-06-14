package za.ac.cput.school_management.controller.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.school_management.domain.student.StudentAddress;
import za.ac.cput.school_management.service.student.StudentAddressService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("school/student/address/")
//the full address is : http://localhost:8080/school/student-address/save
//the full address is : http://localhost:8080/school/student-address/read/studentId
public class StudentAddressController {

    private final StudentAddressService studentAddressService;

    @Autowired public StudentAddressController(StudentAddressService studentAddressService){
        this.studentAddressService = studentAddressService;
    }

    @PostMapping("save")
    public ResponseEntity<StudentAddress> save(StudentAddress studentAddress) {
        StudentAddress save = studentAddressService.save(studentAddress);
        return ResponseEntity.ok(save);
    }

    @GetMapping("read/{studentId}")
    public ResponseEntity<StudentAddress> read(@PathVariable String studentId) {
        StudentAddress studentAddress = this.studentAddressService.read(studentId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return ResponseEntity.ok(studentAddress);
    }

    @DeleteMapping("delete")
    public ResponseEntity<Void> delete(@PathVariable String studentId) {
        this.studentAddressService.deleteById(studentId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("all")
    public ResponseEntity<List<StudentAddress>> findByStudentId(String studentId) {
        List<StudentAddress> studentAddress = this.studentAddressService.findByStudentId(studentId);
        return ResponseEntity.ok(studentAddress);
    }

}
