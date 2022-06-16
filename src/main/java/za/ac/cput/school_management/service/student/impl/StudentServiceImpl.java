package za.ac.cput.school_management.service.student.impl;

import org.springframework.stereotype.Service;
import za.ac.cput.school_management.domain.student.Student;
import za.ac.cput.school_management.factory.student.StudentFactory;
import za.ac.cput.school_management.repository.student.StudentRepository;
//import za.ac.cput.school_management.repository.student.impl.StudentRepositoryImpl;
import za.ac.cput.school_management.service.student.StudentService;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository repository;

    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }
//    private static StudentService SERVICE;
//
//    private StudentServiceImpl(){
//        this.repository = StudentRepositoryImpl.studentRepository();
//    }
//    public static StudentService getService(){
//        if (SERVICE == null)
//            SERVICE = new StudentServiceImpl();
//        return SERVICE;
//    }

    @Override
    public Student save(Student student) {
//        Student obj = StudentFactory.build(student.getStudentId(), student.getEmail(), student.getName());
        return this.repository.save(student);
    }

    @Override
    public Optional<Student> read(String studentId) {
        return this.repository.findById(studentId);
    }

    @Override
    public void delete(Student student) {
        this.repository.delete(student);
    }

    @Override
    public List<Student> findByStudentId(String studentId) {
        return this.repository.findByStudentId(studentId);
    }

    @Override
    public void deleteById(String studentId) {
        Optional<Student> student = read(studentId);
        if (student.isPresent()) delete(student.get());
    }
}
