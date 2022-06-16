package za.ac.cput.school_management.repository.employee.impl;

import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.employee.EmployeeAddress;
import za.ac.cput.school_management.domain.lookup.Country;
import za.ac.cput.school_management.factory.employee.EmployeeAddressFactory;
import za.ac.cput.school_management.factory.lookup.CountryFactory;
import za.ac.cput.school_management.repository.lookup.impl.CountryRepositoryImpl;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


class EmployeeAddressRepositoryImplTest {
    EmployeeAddressRepositoryImpl employeeAddressRepository = EmployeeAddressRepositoryImpl.getEmployeeAddressRepository();


    @Test
    void create() {
        EmployeeAddress employeeAddress = EmployeeAddressFactory.build("25564",null);
        EmployeeAddress employeeAddress1 = employeeAddressRepository.create(employeeAddress);
        System.out.println(employeeAddress1.toString());
        assertNotNull(employeeAddress1);
    }

    @Test
    void update() {
        EmployeeAddress employeeAddress = EmployeeAddressFactory.build("25564",null);
        EmployeeAddress employeeAddress1 = employeeAddressRepository.create(employeeAddress);

        EmployeeAddress employeeAddressObject = EmployeeAddressFactory.build("00001",null);
        EmployeeAddress employeeAddressUpdated = employeeAddressRepository.update(employeeAddressObject);
        System.out.println(employeeAddressUpdated.toString());
        assertNotNull(employeeAddressUpdated);
    }

    @Test
    void read() {
        EmployeeAddress employeeAddressObject = EmployeeAddressFactory.build("25564",null);
        employeeAddressRepository.create(employeeAddressObject);

        EmployeeAddress employeeAddress = employeeAddressRepository.read("25564");
        System.out.println(employeeAddress.toString());
        assertNotNull(employeeAddress);
    }

    @Test
    void delete() {
        EmployeeAddress employeeAddressObject =  EmployeeAddressFactory.build("25564",null);
        employeeAddressRepository.create(employeeAddressObject);

        Boolean result = employeeAddressRepository.delete("25564");
        assertTrue(result);
    }

    @Test
    void readAll() {
        EmployeeAddress employeeAddressObject =  EmployeeAddressFactory.build("25564",null);
        EmployeeAddress employeeAddressObject2 = EmployeeAddressFactory.build("000002",null);
        EmployeeAddress employeeAddressObject3 = EmployeeAddressFactory.build("78523",null);
        employeeAddressRepository.create(employeeAddressObject);
        employeeAddressRepository.create(employeeAddressObject2);
        employeeAddressRepository.create(employeeAddressObject3);

        List<EmployeeAddress> employeeAddressList = employeeAddressRepository.readAll();
        System.out.println(employeeAddressList);
        assertNotNull(employeeAddressList);
    }
}