package za.ac.cput.school_management.controller.student;
/*
 * @author Adecel Rusty Mabiala
 * @StudentNumber 219197229
 * @Project Term-2
 * @Group 31
 * @Role Team Leader and Developer
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.school_management.domain.student.StudentAddress;
//import za.ac.cput.school_management.factory.student.StudentAddressFactory;
import za.ac.cput.school_management.service.student.StudentAddressService;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("school/student/address/")
@Slf4j
//the full address is : http://localhost:8080/school/student-address/save
//the full address is : http://localhost:8080/school/student-address/read/studentId
public class StudentAddressController {

    private final StudentAddressService studentAddressService;

    @Autowired public StudentAddressController(StudentAddressService studentAddressService){
        this.studentAddressService = studentAddressService;
    }

    @PostMapping("save")
    public ResponseEntity<StudentAddress> save(@Valid @RequestBody StudentAddress studentAddress) throws Exception {
        log.info("Save request: {}", studentAddress);
//        System.out.println(String.format("Save request: %s", studentAddress));

//        StudentAddress obj;
//        try {
//            obj = StudentAddressFactory.build(studentAddress.getStudentId(), studentAddress.getAddress());
//        }catch (IllegalArgumentException e){
//            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
//        }
        StudentAddress save = studentAddressService.save(studentAddress);
        return ResponseEntity.ok(save);
    }

    private Optional<StudentAddress> getByStudentId(String s){
        return this.studentAddressService.read(s);
    }

    @GetMapping("read/{studentId}")
    public ResponseEntity<StudentAddress> read(@PathVariable String studentId) {
        log.info("Read request: {}", studentId);
        StudentAddress studentAddress = this.studentAddressService.read(studentId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return ResponseEntity.ok(studentAddress);
    }

    @DeleteMapping("delete")
    public ResponseEntity<Void> delete(@PathVariable String studentId) {
        log.info("Delete request: {}", studentId);
        this.studentAddressService.deleteById(studentId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("all")
    public ResponseEntity<List<StudentAddress>> findByStudentId(String studentId) {
        List<StudentAddress> studentAddress = this.studentAddressService.findByStudentId(studentId);
        return ResponseEntity.ok(studentAddress);
    }

}