package za.ac.cput.school_management.repository.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.school_management.domain.employee.EmployeeAddress;

import java.util.List;


public interface EmployeeAddressRepository  extends JpaRepository<EmployeeAddress, String> {

    List<EmployeeAddress> findByStaffId(String staffId);
}
