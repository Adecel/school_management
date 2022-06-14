package za.ac.cput.school_management.service.student.impl;

import za.ac.cput.school_management.domain.student.Student;
import za.ac.cput.school_management.repository.student.StudentRepository;
import za.ac.cput.school_management.repository.student.impl.StudentRepositoryImpl;
import za.ac.cput.school_management.service.student.StudentService;

import java.util.List;
import java.util.Optional;

public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;
    private static StudentService SERVICE;

    private StudentServiceImpl(){
        this.repository = StudentRepositoryImpl.studentRepository();
    }
    public static StudentService getService(){
        if (SERVICE == null)
            SERVICE = new StudentServiceImpl();
        return SERVICE;
    }

    @Override
    public Student save(Student student) {
        return this.repository.save(student);
    }

    @Override
    public Optional<Student> read(String studentId) {
        return this.repository.read(studentId);
    }

    @Override
    public void delete(Student student) {
        this.repository.delete(student);
    }

    @Override
    public List<Student> findByStudentId(String studentId) {
        return this.repository.findByStudentId(studentId);
    }
}
