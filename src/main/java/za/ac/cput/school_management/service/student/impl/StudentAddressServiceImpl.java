package za.ac.cput.school_management.service.student.impl;

import za.ac.cput.school_management.repository.student.StudentAddressRepository;
import za.ac.cput.school_management.repository.student.impl.StudentAddressRepositoryImpl;
import za.ac.cput.school_management.service.student.StudentAddressService;

import java.util.List;
import java.util.Optional;

//public class StudentAddressServiceImpl implements StudentAddressService {
//
//        private final StudentAddressRepository repository;
//    private static StudentAddressService SERVICE;
//
//    private StudentAddressServiceImpl(){
//        this.repository = StudentAddressRepositoryImpl.studentAddressRepository();
//    }
//    public static StudentAddressService getService(){
//        if (SERVICE == null)
//            SERVICE = new StudentAddressServiceImpl();
//        return SERVICE;
//
//    @Override
//    public StudentAddressService save(StudentAddressService studentAddressService) {
//            return this.repository.save(studentAddressService);
//    }
//
//    @Override
//    public Optional<StudentAddressService> read(String s) {
//        return Optional.empty();
//    }
//
//    @Override
//    public void delete(StudentAddressService studentAddressService) {
//
//    }
//
//    @Override
//    public List<StudentAddressService> findByStudentId(String studentId) {
//        return null;
//    }
//
//}
