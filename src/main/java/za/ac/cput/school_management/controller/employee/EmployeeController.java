package za.ac.cput.school_management.controller.employee;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.school_management.domain.employee.Employee;
import za.ac.cput.school_management.service.employee.EmployeeService;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Adp/employee/")
@Slf4j
public class EmployeeController {
    //Isaac
    private  final EmployeeService employeeService;

    @Autowired public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }
    @PostMapping("save")
    public ResponseEntity<Employee> save(@Valid @RequestBody Employee employee){
        log.info("save request : {}", employee);
        Employee save = employeeService.save(employee);
        return ResponseEntity.ok(save);
    }
    //Isaac
    private Optional<Employee> getById(String Id){
        return this.employeeService.read(Id);
    }
    @GetMapping("read/{id}")
    public  ResponseEntity<Employee> read(@PathVariable String id){
        log.info("Read request: {}", id);
        Employee employee = this.employeeService.read(id).orElseThrow(() ->  new ResponseStatusException(HttpStatus.NOT_FOUND));
        return ResponseEntity.ok(employee);
//Isaac
    }
    @DeleteMapping("delete/{id}")
    public  ResponseEntity<Void> delete(@PathVariable String id){
        log.info("delete request: {}", id);
        this.employeeService.deleteById(id);
        return  ResponseEntity.noContent().build();
    }
    @GetMapping("all")
    public  ResponseEntity<List<Employee>> findAll(){
        List<Employee> employees = this.employeeService.findAll();
        return  ResponseEntity.ok(employees);
    }
}
//Isaac