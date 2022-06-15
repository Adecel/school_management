package za.ac.cput.school_management.domain.employee;

/*
 * Author : Mogamad Tawfeeq Cupido
 * Student Number : 216266882
 *(Term 2 Exam)
 * */

import za.ac.cput.school_management.domain.lookup.Address;
import com.sun.istack.NotNull;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;
@Entity
public class EmployeeAddress {
    @Id @NotNull
	private String staffId;
	private Address address;


private EmployeeAddress(Builder builder){
    this.staffId = builder.staffId;
	this.address = builder.address;

}

 public String getStaffId() {
        return staffId;
    }

 public Address getAddress() {
        return address;
    }

 /*public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

public void setAddress(Address address) {
        this.address = address;
    }*/

@Override
    public String toString() {
        return "EmployeeAddress{" +
                "staffId='" + staffId + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeAddress that = (EmployeeAddress) o;
        return staffId.equals(that.staffId) && address.equals(that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(staffId, address);
    }

        //Builder
    public static class Builder {
        private String staffId;
        private Address address;
      
        //Builder setters

        public Builder StaffId(String staffId) {
            this.staffId = staffId;
            return this;
        }

        public Builder Address(Address address) {
            this.address = address;
            return this;
        }

         public EmployeeAddress.Builder copy(EmployeeAddress employeeAddress) {
            this.staffId = employeeAddress.staffId;
            this.address = employeeAddress.address;
           
            return this;
        }

        public EmployeeAddress build() {
            return new EmployeeAddress(this);
        }
    }
}
