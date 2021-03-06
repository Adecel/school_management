package za.ac.cput.school_management.domain.lookup;
//Dieuci Djate Nsibu 220169136

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.util.Objects;



@Entity
@Embeddable
public class Name {
    @NotNull private String firstName, middleName, lastName;

    public Name() {
    }

    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    private Name(Builder builder) {
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.lastName = builder.lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }


    public static class Builder {
        private String firstName, middleName, lastName;

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public Builder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }
        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public Builder copy(Name name) {
            this.firstName = name.firstName;
            this.middleName = name.middleName;
            this.lastName = name.lastName;
            return this;
        }
        public Name build() {return new Name(this);}
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name = (Name) o;
        return firstName.equals(name.firstName) && middleName.equals(name.middleName) && lastName.equals(name.lastName);

    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, middleName, lastName);
    }

    @Override
    public String toString()
    {
        return "Name{" + "firstName='" + firstName + '\'' + ", middleName='" + middleName + '\'' + ", lastName='" + lastName + '\'' + '}';
    }


}
