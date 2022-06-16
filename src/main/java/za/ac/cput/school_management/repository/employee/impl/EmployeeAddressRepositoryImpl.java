package za.ac.cput.school_management.repository.employee.impl;


import org.springframework.stereotype.Repository;
import za.ac.cput.school_management.domain.employee.EmployeeAddress;
import za.ac.cput.school_management.repository.employee.EmployeeAddressRepository;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class EmployeeAddressRepositoryImpl implements EmployeeAddressRepository {

    private final List<EmployeeAddress> employeeAddressList;
    private static za.ac.cput.school_management.repository.employee.impl.EmployeeAddressRepositoryImpl EMPLOYEE_ADDRESS_REPOSITORY;
    private EmployeeAddressRepositoryImpl(){
        this.employeeAddressList = new ArrayList<>();
    }


    @Override
    public EmployeeAddress save(EmployeeAddress employeeAddress) {
        Optional<EmployeeAddress> read = read(employeeAddress.getStaffId());
        if (read.isPresent()){
            delete(read.get());
        }
        this.employeeAddressList.add(employeeAddress);
        return employeeAddress;
    }

    @Override
    public Optional<EmployeeAddress> read(String staffId) {
        return  this.employeeAddressList.stream().filter(g -> g.getStaffId().equalsIgnoreCase(staffId))
                .findFirst();
    }

    @Override
    public void delete(EmployeeAddress employeeAddress) {
        this.employeeAddressList.remove(employeeAddress);
    }

    @Override
    public List<EmployeeAddress> findByStaffId(String staffId) {
        return this.employeeAddressList.stream()
                .filter(g -> g.getStaffId().equalsIgnoreCase(staffId))
                .collect(Collectors.toList());
    }
}
