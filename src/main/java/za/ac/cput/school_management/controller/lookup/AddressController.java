//package za.ac.cput.school_management.controller.lookup;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.server.ResponseStatusException;
//import za.ac.cput.school_management.domain.lookup.Address;
//import za.ac.cput.school_management.service.lookup.AddressService;
//
//import javax.validation.Valid;
//
//import java.util.List;
//
//import static java.awt.Container.log;
//
//public class AddressController {
//
//
//    private final AddressService addressService;
////    private final AddressAPI api;
//
////    @Autowired public AddressController(AddressAPI api) {
////        this.api = api;
////    }
//
//    @Autowired
//    public AddressController(AddressService addressService){
//        this.addressService = addressService;
//    }
//
//    @PostMapping("save")
//    public ResponseEntity<Address> save(@Valid @RequestBody Address address){
//        log.info("Save request: {}", address);
//        Address response = this.addressService.save(address);
//        return ResponseEntity.ok(response);
//    }
//
//    @GetMapping("read/{addressID}")
//    public ResponseEntity<Address> read(@PathVariable Address.AddressBYID addressID){
//        log.info("Read request: {}", addressID);
//        Address response = this.addressService.read(addressID)
//                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Address not found"));
//        return ResponseEntity.ok(response);
//    }
//
//    @DeleteMapping("delete/{address}")//log.info("Read request: {}", addressID);
//    public ResponseEntity<Void> delete(@PathVariable Address address){
//        log.info("Delete request: {}", address);
//        this.addressService.delete(address);
//        return ResponseEntity.noContent().build();
//    }
//
//    @GetMapping("all")
//    public ResponseEntity<List<Address>> getAll(){
//
//        List<Address> response = this.addressService.findAll();
//        return ResponseEntity.ok(response);
//    }
//}
