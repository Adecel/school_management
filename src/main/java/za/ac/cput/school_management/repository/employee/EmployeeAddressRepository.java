package za.ac.cput.school_management.repository.employee;

/*
 * Author : Mogamad Tawfeeq Cupido
 * Student Number : 216266882
 *(Term 2 Exam)
 * */



import za.ac.cput.school_management.domain.employee.EmployeeAddress;
import za.ac.cput.school_management.repository.employee.impl.IEmployeeAddressRepository;

import java.util.HashSet;
import java.util.Set;

public class EmployeeAddressRepository implements IEmployeeAddressRepository {

private static EmployeeAddressRepository repository = null;
private Set<EmployeeAddress> employeeaddressDB = null;

private EmployeeAddressRepository(){
employeeaddressDB = new HashSet<EmployeeAddress>();
}

public static EmployeeAddressRepository getRepository() {
        if (repository == null){
            repository = new EmployeeAddressRepository();
        }
        return repository;
    }

    @Override
    public EmployeeAddress create(EmployeeAddress employeeAddress) {
        boolean success = employeeaddressDB.add(employeeAddress);
        if (!success){
            return null;
        }
        return employeeAddress;
    }
 @Override
    public EmployeeAddress read(String staffId) {
        for (EmployeeAddress am : employeeaddressDB) {
            if (am.getStaffId().equals(staffId))
                return am;
        }
        return null;
    }

    @Override
    public EmployeeAddress update(EmployeeAddress employeeAddress) {
        boolean update = employeeaddressDB.add(employeeAddress);
        if (!update){
            return null;
        }
        return employeeAddress;
    }

    @Override
    public boolean delete(String address) {
        EmployeeAddress employeeaddressToBeDelete = read(address);
        if(employeeaddressToBeDelete == null) {
            return false;
        }
        employeeaddressDB.remove(employeeaddressToBeDelete);

        return true;
    }

    @Override
    public Set<EmployeeAddress> getAll() {
        return employeeaddressDB;
    }
}

