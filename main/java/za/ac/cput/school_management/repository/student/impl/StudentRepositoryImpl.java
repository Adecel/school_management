package za.ac.cput.school_management.repository.student.impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.school_management.domain.student.Student;
import za.ac.cput.school_management.repository.student.StudentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private final List<Student> studentList;
    private static StudentRepositoryImpl STUDENT_REPOSITORY;
    private StudentRepositoryImpl(){
        this.studentList = new ArrayList<>();
    }

//    public static StudentRepositoryImpl studentRepository(){
//        if (STUDENT_REPOSITORY == null)
//            STUDENT_REPOSITORY = new StudentRepositoryImpl();
//        return STUDENT_REPOSITORY;
//    }

    @Override
    public Student save(Student student) {
        Optional<Student> read = read(student.getStudentId());
        if (read.isPresent()){
            delete(read.get());
        }
        this.studentList.add(student);
        return student;
    }

    @Override
    public Optional<Student> read(String studentId) {
        return  this.studentList.stream().filter(g -> g.getStudentId().equalsIgnoreCase(studentId))
                .findFirst();
    }

    @Override
    public void delete(Student student) {
        this.studentList.remove(student);
    }

    @Override
    public List<Student> findByStudentId(String studentId) {
        return this.studentList.stream()
                .filter(g -> g.getStudentId().equalsIgnoreCase(studentId))
                .collect(Collectors.toList());
    }
}
