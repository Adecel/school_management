package za.ac.cput.school_management.factory.employee;

//Kissimba Nyembo Isaac
//Student Number: 219383448
//Responsible of the Employee class
//Code: 100% working


import za.ac.cput.school_management.domain.employee.Employee;
import za.ac.cput.school_management.factory.lookup.NameFactory;
import za.ac.cput.school_management.helper.Helper;

import javax.lang.model.element.Name;

//Isaac
public class EmployeeFactory {
    public static Employee build(String staffId, String email, Name name) {
        Helper.checkStringParam("email", email);
        Helper.checkStringParam("staffId", staffId);
        Name name1 = NameFactory.BuildName(name.getFirstName(), name.getMiddleName(), name.getLastName());
        return new Employee.Builder().setStaffId(staffId)
                .setEmail(email)
                .setName(name1 )
                .build();
    }
}
//Isaac