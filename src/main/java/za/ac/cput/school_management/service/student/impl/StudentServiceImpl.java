package za.ac.cput.school_management.service.student.impl;

import za.ac.cput.school_management.domain.student.Student;
import za.ac.cput.school_management.repository.student.StudentRepository;
import za.ac.cput.school_management.repository.student.impl.StudentRepositoryImpl;
import za.ac.cput.school_management.service.student.StudentService;

import java.util.List;
import java.util.Optional;

//public class StudentServiceImpl implements StudentService {
//
//    private final StudentRepository repository;
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
//    @Override
//    public StudentService save(StudentService studentService) {
//        return this.repository.save(studentService);
//    }
//
//    @Override
//    public Optional<StudentService> read(String s) {
//        return this.repository.read(s);
//    }
//
//    @Override
//    public void delete(StudentService studentService) {
//
//    }
//
//    @Override
//    public List<Student> findByStudentId(String studentId) {
//        return null;
//    }
//}
