package za.ac.cput.school_management.service.employee.impl;


//Kissimba Nyembo Isaac
//Student Number: 219383448
//Responsible of the Employee class
//Code: 100% working

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.school_management.domain.employee.Employee;
import za.ac.cput.school_management.factory.employee.EmployeeFactory;
import za.ac.cput.school_management.repository.employee.EmployeeRepository;
import za.ac.cput.school_management.service.employee.EmployeeService;

import javax.lang.model.element.Name;
import java.util.List;
import java.util.Optional;
//Isaac
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private  final EmployeeRepository repository;

    @Autowired
    public EmployeeServiceImpl( EmployeeRepository repository){
        this.repository = repository;
    }
    @Override
    public Employee save(Employee employee){
        String id = employee.getStaffId();
        String Email = employee.getEmail();
        Name name = employee.getName();

        Employee insert = EmployeeFactory.build( id, Email, name);
        System.out.println("insert" + insert);
        return  this.repository.save(insert);
    }
    //Isaac
    @Override
    public Optional<Employee> read(String id){
        return  this.repository.findById(id);
    }
    @Override
    public  void  delete(Employee employee){
        this.repository.delete(employee);
    }
    @Override
    public List<Employee> findAll(){
        return  this.repository.findAll();
    }
    @Override
    public  void deleteById(String id){
        Optional<Employee> employee = read(id);
        if (employee.isPresent()){
            delete(employee.get());
        }
    }
    //Isaac
    @Override
    public  Optional<Employee> findByEmail(String email){
        return this.repository.findByEmail(email);
    }
}
