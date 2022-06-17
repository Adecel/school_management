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
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.school_management.domain.employee.EmployeeAddress;
import za.ac.cput.school_management.factory.employee.EmployeeAddressFactory;
import za.ac.cput.school_management.repository.employee.EmployeeAddressRepository;

import java.util.List;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNull;


@RunWith(SpringRunner.class)
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class EmployeeAddressServiceImplTest {

    @Autowired
    private EmployeeAddressServiceImpl employeeAddressService;

    @Autowired
    private EmployeeAddressRepository employeeAddressRepository;

    @Order(1)
    @Test
    void save() throws Exception{

        EmployeeAddress employeeAddress = EmployeeAddressFactory.build("25235",null);
        EmployeeAddress savedEmployeeAddress = employeeAddressRepository.save(employeeAddress);
        System.out.println("savedEmployeeAddress");

    }


    @Order(2)
    @Test
    void read() {
        EmployeeAddress employeeAddress = employeeAddressService.read("25235").get();
        System.out.println(employeeAddress);
        assertNotNull(employeeAddress);
    }


    @Order(3)
    @Test
    void delete() {
        EmployeeAddress employeeAddress = EmployeeAddressFactory.build("88888",null);
        EmployeeAddress employeeAddressObject = EmployeeAddressFactory.build("88888",null);
        employeeAddressService.delete(employeeAddressObject);
        System.out.println(employeeAddress);
        assertNotNull(employeeAddress);
    }


    @Order(4)
    @Test
    void findByStaffId() {
        List<EmployeeAddress> employeeAddressList = employeeAddressService.findByStaffId("88888");
        assertNull(employeeAddressList);
    }

    @Order(5)
    @Test
    void deleteById() {
        List<EmployeeAddress> employeeAddressList = employeeAddressService.deleteById("88888");
        assertNull(employeeAddressList);
    }
}