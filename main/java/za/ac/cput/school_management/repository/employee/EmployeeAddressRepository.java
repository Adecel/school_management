package za.ac.cput.school_management.repository.employee;

import za.ac.cput.school_management.domain.employee.EmployeeAddress;
import za.ac.cput.school_management.repository.IRepository;
import java.util.List;

public interface EmployeeAddressRepository  extends IRepository<EmployeeAddress, String> {

    List<EmployeeAddress> findByStaffId(String staffId);

}
