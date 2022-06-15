//package za.ac.cput.school_management.repository.student.impl;
//
//import org.springframework.stereotype.Repository;
//import za.ac.cput.school_management.domain.student.StudentAddress;
//import za.ac.cput.school_management.repository.student.StudentAddressRepository;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//
//@Repository
//public class StudentAddressRepositoryImpl implements StudentAddressRepository {
//
//    private final List<StudentAddress> studentAddressList;
//    private static StudentAddressRepositoryImpl STUDENT_ADDRESS_REPOSITORY;
//    private StudentAddressRepositoryImpl(){
//        this.studentAddressList = new ArrayList<>();
//    }
//
//    //implimentation of the singleton
////    public static StudentAddressRepositoryImpl studentAddressRepository(){
////        if (STUDENT_ADDRESS_REPOSITORY == null)
////            STUDENT_ADDRESS_REPOSITORY = new StudentAddressRepositoryImpl();
////        return STUDENT_ADDRESS_REPOSITORY;
////    }
//
//
//    @Override
//    public StudentAddress save(StudentAddress studentAddress) {
//        Optional<StudentAddress> read = read(studentAddress.getStudentId());
//        if (read.isPresent()){
//            delete(read.get());
//        }
//        this.studentAddressList.add(studentAddress);
//        return studentAddress;
//    }
//
//    @Override
//    public Optional<StudentAddress> read(String studentId) {
//        return  this.studentAddressList.stream().filter(g -> g.getStudentId().equalsIgnoreCase(studentId))
//                .findFirst();
//    }
//
//    @Override
//    public void delete(StudentAddress studentAddress) {
//        this.studentAddressList.remove(studentAddress);
//    }
//
//    @Override
//    public List<StudentAddress> findByStudentId(String studentId) {
//        return this.studentAddressList.stream()
//                .filter(g -> g.getStudentId().equalsIgnoreCase(studentId))
//                .collect(Collectors.toList());
//    }
//}
