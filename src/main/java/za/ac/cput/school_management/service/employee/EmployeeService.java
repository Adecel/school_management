package za.ac.cput.school_management.service.employee;

//Kissimba Nyembo Isaac
//Student Number: 219383448
//Responsible of the Employee class
//Code: 100% working

import org.springframework.data.repository.query.Param;

import za.ac.cput.school_management.domain.employee.Employee;
import za.ac.cput.school_management.service.IService;

import java.util.List;
import java.util.Optional;
//Isaac
public interface EmployeeService extends IService<Employee, String> {
    List<Employee> findAll();
    void deleteById(String id);

    Optional<Employee> findByEmail(@Param("email")String Email);
}
//Isaac