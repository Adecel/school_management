<<<<<<< HEAD
//package za.ac.cput.school_management.repository.employee;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//import za.ac.cput.school_management.domain.employee.EmployeeAddress;
//import java.util.List;
//
////Adecel Mabiala: this the way it supposes to be, please don't change it further
//@Repository
//public interface EmployeeAddressRepository  extends JpaRepository<EmployeeAddress, String> {
//
//    List<EmployeeAddress> findByStaffId(String staffId);
//
//}
//
=======
package za.ac.cput.school_management.repository.employee;

/*
 * Author : Mogamad Tawfeeq Cupido
 * Student Number : 216266882
 *(Term 2 Exam)
 * */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.school_management.domain.employee.EmployeeAddress;
import za.ac.cput.school_management.domain.lookup.Address;

import java.util.List;

//Adecel Mabiala: this the way it supposes to be, please don't change it further
@Repository
public interface EmployeeAddressRepository  extends JpaRepository<EmployeeAddress, String> {

    List<EmployeeAddress> findByStaffId(String staffId);
    List<EmployeeAddress> findAllByAddress(Address address);

}

>>>>>>> origin/master
