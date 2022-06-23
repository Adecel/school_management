package za.ac.cput.school_management.factory.employee;
//Kissimba Nyembo Isaac
//Student Number: 219383448
//Responsible of the Employee class
//Code: 100% working

import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.employee.Employee;
import za.ac.cput.school_management.factory.lookup.NameFactory;

import static org.junit.jupiter.api.Assertions.*;

//Isaac
class EmployeeFactoryTest {
    @Test
    void buildWithSuccess(){
        Employee employee = EmployeeFactory.build("32788288", "isaackissimba@gmail.com" , NameFactory.BuildName("ISAAC", "kissimba", "nyembo"));
        System.out.println(employee);
        assertNotNull(employee);
    }
    //Isaac
    @Test
    public void buildWithError() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                EmployeeFactory
                        .build("", "isaackissimba@gmail.com",
                                NameFactory.BuildName("ISAAC", "kissimba", "nyembo")));
        System.out.println(exception.getMessage());
        assertTrue(exception.getMessage().contains("staffId"));

    }
    //Isaac
}