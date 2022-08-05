package za.ac.cput.school_management.service.employee.impl;
//Kissimba Nyembo Isaac
//Student Number: 219383448
//Responsible of the Employee class
//Code: 100% working

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import za.ac.cput.school_management.SchoolManagementSystem;
import za.ac.cput.school_management.domain.employee.Employee;
import za.ac.cput.school_management.factory.employee.EmployeeFactory;
import za.ac.cput.school_management.factory.lookup.NameFactory;

import javax.lang.model.element.Name;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest(classes = SchoolManagementSystem.class)
//Isaac
class EmployeeServiceImplTest {

    Employee employee;
    @Autowired
    private EmployeeServiceImpl employeeService;

    @BeforeEach
    //Isaac
    void  BeforeEachTest(){
        Name name = NameFactory.BuildName("isaac", "kissimba", "nyembo");
        employee = EmployeeFactory.build("324455232", "kissimbaisaac@gmail.com"
                ,NameFactory.BuildName("isaac", "kissimba", "nyembo") );
    }
    @Test
        //Isaac
    void  a_save(){
        Employee e = this.employeeService.save(employee);
        System.out.println(e);
        assertNotNull(e);
    }
    @Test
        //Isaac
    void b_read(){
        Optional<Employee> read = this.employeeService.read("435566277");
        assertNotNull(read);
        System.out.println(read);
    }
    //Isaac
    @Test
    void c_findByEmail(){
        Optional<Employee> saveEmp = this.employeeService.findByEmail("kissimbaisaac@gmail.com");
        assertNotNull(saveEmp);
        System.out.println(saveEmp);
        assertAll(
                () -> assertEquals("kissimbaisaac@gmail.com", employee.getEmail())
        );
    }
    //Isaac
    @Test
    void delete(){
        this.employeeService.deleteById("435566277");
    }
}