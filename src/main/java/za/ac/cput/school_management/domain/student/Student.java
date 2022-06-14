package za.ac.cput.school_management.domain.student;

import za.ac.cput.school_management.domain.lookup.Name;

import java.util.Objects;

public class Student {
    private String studentId;
    private String email;
    private Name name;

    private Student(Builder builder) {
        this.studentId = builder.studentId;
        this.email = builder.email;
        this.name = builder.name;
    }

    public String getStudentId() {
        return studentId;
    }
    public String getEmail() {
        return email;
    }
    public Name getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", email='" + email + '\'' +
                ", name=" + name +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId.equals(student.studentId) && email.equals(student.email) && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, email, name);
    }

    public static class Builder {
        private String studentId;
        private String email;
        private Name name;

        public Builder StudentId(String studentId) {
            this.studentId = studentId;
            return this;
        }
        public Builder Email(String email) {
            this.email = email;
            return this;
        }
        public Builder Name(Name name) {
            this.name = name;
            return this;
        }

        public Builder copy(Student student) {
            this.studentId = student.studentId;
            this.email = student.email;
            this.name = student.name;

            return this;
        }

        public Student build() {
            return new Student(this);
        }

    }
}
