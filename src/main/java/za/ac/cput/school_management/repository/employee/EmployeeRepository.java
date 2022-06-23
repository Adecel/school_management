package za.ac.cput.school_management.repository.employee;

//Kissimba Nyembo Isaac
//Student Number: 219383448
//Responsible of the Employee class
//Code: 100% working
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import za.ac.cput.school_management.domain.employee.Employee;


import java.util.Optional;
//Isaac
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,String> {
    Optional<Employee> findByEmail(@Param("email") String email);
}
//Isaac