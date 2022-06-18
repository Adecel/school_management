package za.ac.cput.school_management.service.employee.impl;

/*
 * Author : Mogamad Tawfeeq Cupido
 * Student Number : 216266882
 *(Term 2 Exam)
 * */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.school_management.domain.employee.EmployeeAddress;
import za.ac.cput.school_management.domain.lookup.Address;
import za.ac.cput.school_management.factory.employee.EmployeeAddressFactory;
import za.ac.cput.school_management.repository.employee.EmployeeAddressRepository;
import za.ac.cput.school_management.service.employee.EmployeeAddressService;

import java.util.List;
import java.util.Optional;


@Service
public class EmployeeAddressServiceImpl implements EmployeeAddressService {

    private final EmployeeAddressRepository repository;

    public EmployeeAddressServiceImpl(EmployeeAddressRepository repository) {
        this.repository = repository;
    }

    @Override
    public EmployeeAddress save(EmployeeAddress employeeAddress) {
        return this.repository.save(employeeAddress);
    }

    @Override
    public Optional<EmployeeAddress> read(String s) {
        return this.repository.findById(s);
    }

    @Override
    public void delete(EmployeeAddress employeeAddress) {
        this.repository.delete(employeeAddress);
    }

    @Override
    public List<EmployeeAddress> findAll() {
        return this.repository.findAll();
    }
}
