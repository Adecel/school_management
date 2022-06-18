//package za.ac.cput.school_management.service.student.impl;
///*
// * @author Adecel Rusty Mabiala
// * @StudentNumber 219197229
// */
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import za.ac.cput.school_management.domain.student.StudentAddress;
//import za.ac.cput.school_management.repository.student.StudentAddressRepository;
////import za.ac.cput.school_management.repository.student.impl.StudentAddressRepositoryImpl;
//import za.ac.cput.school_management.service.student.StudentAddressService;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class StudentAddressServiceImpl implements StudentAddressService {
//    private final StudentAddressRepository repository;
//
//    @Autowired
//    public StudentAddressServiceImpl(StudentAddressRepository repository) {
//        this.repository = repository;
//    }
//
//    //    private static StudentAddressService SERVICE;
////
////    private StudentAddressServiceImpl(){
////        this.repository = StudentAddressRepositoryImpl.studentAddressRepository();
////    }
////    public static StudentAddressService getService() {
////        if (SERVICE == null)
////            SERVICE = new StudentAddressServiceImpl();
////        return SERVICE;
////
////    }
//    @Override
//    public StudentAddress save(StudentAddress studentAddress) {
////        StudentAddress obj = StudentAddressFactory.build(studentAddress.getStudentId(), studentAddress.getAddress());
//        return this.repository.save(studentAddress);
//    }
//
//    @Override
//    public Optional<StudentAddress> read(String studentId) {
//        return this.repository.findById(studentId);
//    }
//
//    @Override
//    public void delete(StudentAddress studentAddress) {
//        this.repository.delete(studentAddress);
//    }
//
//    @Override
//    //public List<Student> findAll
//    public List<StudentAddress> findByStudentId(String studentId) {
//        return this.repository.findByStudentId(studentId);
//    }
//
//    @Override
//    public void deleteById(String studentId) {
//        Optional<StudentAddress> studentAddress = read(studentId);
//        if (studentAddress.isPresent()) delete(studentAddress.get());
//    }
//}
