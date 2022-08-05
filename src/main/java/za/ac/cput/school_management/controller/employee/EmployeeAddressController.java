//package za.ac.cput.school_management.controller.employee;
//

///*
// * Author : Mogamad Tawfeeq Cupido
// * Student Number : 216266882
// *(Term 2 Exam)
// * */
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.server.ResponseStatusException;
//import za.ac.cput.school_management.domain.employee.EmployeeAddress;
//import za.ac.cput.school_management.service.employee.EmployeeAddressService;
//
//import javax.validation.Valid;
//import java.util.List;
//    @Slf4j
//    @RestController
//    @RequestMapping("employee/address/")
//
//
//    public class EmployeeAddressController {
//
//        private final EmployeeAddressService employeeAddressService;
//
//        @Autowired
//        public EmployeeAddressController(EmployeeAddressService employeeAddressService){
//            this.employeeAddressService = employeeAddressService;
//        }
//
//        @PostMapping("save")
//        public ResponseEntity<EmployeeAddress> save(@Valid @RequestBody EmployeeAddress employeeAddress) throws Exception {
//
//            EmployeeAddress save = employeeAddressService.save(employeeAddress);
//            return ResponseEntity.ok(save);
//        }
//
//        @GetMapping("read/{staffId}")
//        public ResponseEntity<EmployeeAddress> read(@PathVariable String staffId) {
//            log.info("Read request: {}", staffId);
//            EmployeeAddress employeeAddress = this.employeeAddressService.read(staffId)
//                    .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
//            return ResponseEntity.ok(employeeAddress);
//        }
//
//        @DeleteMapping("delete")
//        public ResponseEntity<Void> delete(@PathVariable String staffId) {
//            log.info("Delete request: {}", staffId);
//            this.employeeAddressService.deleteById(staffId);
//            return ResponseEntity.noContent().build();
//        }
//
//        @GetMapping("all")
//        public ResponseEntity<List<EmployeeAddress>> findByStaffId(String staffId) {
//            List<EmployeeAddress> employeeAddress = this.employeeAddressService.findByStaffId(staffId);
//            return ResponseEntity.ok(employeeAddress);
//        }
//
//    }
