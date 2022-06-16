package za.ac.cput.school_management.repository.employee.impl;


import za.ac.cput.school_management.domain.employee.EmployeeAddress;


import java.util.ArrayList;
import java.util.List;


public class EmployeeAddressRepositoryImpl {

    private List<EmployeeAddress> ea_db = new ArrayList<>();
    //private employeeAddressRepository ea_db;
    private static EmployeeAddressRepositoryImpl employeeAddressRepository = null;

    private EmployeeAddressRepositoryImpl() {
    }

    public static EmployeeAddressRepositoryImpl getEmployeeAddressRepository() {
        if (employeeAddressRepository == null) {
            employeeAddressRepository = new EmployeeAddressRepositoryImpl();
        }
        return employeeAddressRepository;
    }

    EmployeeAddress create(EmployeeAddress employeeAddress) {
        boolean result = ea_db.add(employeeAddress);
        if (result) {
            return employeeAddress;
        }
        return null;
    }

    EmployeeAddress update(EmployeeAddress employeeAddress) {
        EmployeeAddress result = read(employeeAddress.getStaffId());
        if (result != null) {
            ea_db.remove(result);
            ea_db.add(employeeAddress);
            return employeeAddress;
        }
        return null;
    }

    EmployeeAddress read(String id) {
        return ea_db.stream().filter(s -> s.getStaffId().equals(id)).findAny().orElse(null);
    }

    Boolean delete(String id) {
        EmployeeAddress employeeAddress = read(id);
        return ea_db.remove(employeeAddress);
    }

    List<EmployeeAddress> readAll() {
        return ea_db;
    }
}