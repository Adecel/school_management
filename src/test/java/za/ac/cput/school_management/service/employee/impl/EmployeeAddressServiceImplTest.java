package za.ac.cput.school_management.service.employee.impl;
/*
 * Author : Mogamad Tawfeeq Cupido
 * Student Number : 216266882
 *(Term 2 Exam)
 * */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
//import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.school_management.domain.employee.EmployeeAddress;
import za.ac.cput.school_management.factory.employee.EmployeeAddressFactory;
import za.ac.cput.school_management.repository.employee.EmployeeAddressRepository;

import java.util.List;
import java.util.Optional;

//import static junit.framework.TestCase.assertNotNull;
//import static junit.framework.TestCase.assertNull;
import static org.junit.jupiter.api.Assertions.*;


//@RunWith(SpringRunner.class)
@SpringBootTest
@TestMethodOrder(MethodOrderer.MethodName.class)
class EmployeeAddressServiceImplTest {

    @Autowired
    private EmployeeAddressServiceImpl employeeAddressService;
    EmployeeAddress employeeAddress= EmployeeAddressFactory.createEmployeeAddress("213345",
            "234","003","12","WOOD",983,"PT4",
            "MotherCity","+243","Afrique du sud");

    @Test
    void a_save() {
        EmployeeAddress temp= employeeAddressService.save(employeeAddress);
        assertNotNull(temp);
    }
    @Test
    void b_read() {

        Optional<EmployeeAddress> temp= employeeAddressService.read("213345");
        assertAll(  ()->assertTrue(temp.isPresent()),
                ()-> assertNotNull(temp)
        );
        System.out.println(temp);

    }  @Test
    void d_delete() {
        employeeAddressService.delete(employeeAddress);
        List<EmployeeAddress> temp= employeeAddressService.findAll();
        assertEquals(0,temp.size());


    }

    @Test
    void c_findall() {
        List<EmployeeAddress> temp= employeeAddressService.findAll();
        System.out.println(temp.toString());
        assertNotNull(temp);
    }

}