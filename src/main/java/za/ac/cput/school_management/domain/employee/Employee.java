package za.ac.cput.school_management.domain.employee;


//Kissimba Nyembo Isaac
//Student Number: 219383448
//Responsible of the Employee class
//Code: 100% working


import javax.lang.model.element.Name;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;


@Entity
public class Employee implements Serializable {

    @NotNull @Id private  String staffId;
    @NotNull
    private  String email;

    @Embedded
    private Name name;


    private Employee(Builder builder) {
        this.staffId = builder.staffId;
        this.email = builder.email;
        this.name = builder.name;

    }
    private Employee(){}


    public String getStaffId() {return staffId;
    }
    public String getEmail() {return email;
    }
    public Name getName() {return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return staffId.equals(employee.staffId) && email.equals(employee.email) && name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(staffId, email, name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "staffId='" + staffId + '\'' +
                ", email='" + email + '\'' +
                ", name=" + name +
                '}';
    }

    public  static class EmployeeId{ //ID CLASS
        private String staffId;
        private String email;
        private  Name name;

        public EmployeeId(String staffId, String email, Name name) {
            this.staffId = staffId;
            this.email = email;
            this.name = name;
        }

        public String getStaffId() {return staffId;
        }

        public String getEmail() {return email;}
    }

    public static class Builder {

        private String staffId, email;
        private Name name;


        public Builder setStaffId(String staffId) {
            this.staffId = staffId;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }
        public Builder setName(Name name) {
            this.name = name;
            return this;
        }


        public Builder copy(Employee employee) {
            this.staffId = employee.staffId;
            this.email = employee.email;
            this.name = employee.name;
            return this;

        }

        public Employee build() {
            return new Employee(this);
        }

    }
}
