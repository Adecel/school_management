package za.ac.cput.school_management.domain.student;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.school_management.domain.lookup.Address;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
public class StudentAddress {

    @NotNull @Id private String studentId;
    @NotNull private Address address;

    protected StudentAddress() {
    }

    private StudentAddress(Builder builder) {
        this.studentId = builder.studentId;
        this.address = builder.address;
    }

    public String getStudentId() {
        return studentId;
    }

    public Address getAddress() {
        return address;
    }
    @Override
    public String toString() {
        return "StudentAddress{" +
                "studentId='" + studentId + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentAddress that = (StudentAddress) o;
        return studentId.equals(that.studentId) && address.equals(that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, address);
    }

    public static class Builder {
        private String studentId;
        private Address address;

        public Builder StudentId(String studentId) {
            this.studentId = studentId;
            return this;
        }
        public Builder Address(Address address) {
            this.address = address;
            return this;
        }

        public Builder copy(StudentAddress studentAddress) {
            this.studentId = studentAddress.studentId;
            this.address = studentAddress.address;

            return this;
        }

        public StudentAddress build() {
            return new StudentAddress(this);
        }
    }
}
