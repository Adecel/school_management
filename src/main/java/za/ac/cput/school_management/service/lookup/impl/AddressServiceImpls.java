//package za.ac.cput.school_management.service.lookup.impl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import za.ac.cput.school_management.domain.lookup.Address;
//import za.ac.cput.school_management.factory.lookup.AddressFactory;
//import za.ac.cput.school_management.repository.lookup.AddressRepository;
//import za.ac.cput.school_management.service.lookup.AddressService;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.Set;
//import java.util.stream.Collectors;
//
//@Service
//public class AddressServiceImpls implements AddressService {
////private Address.AddressBYID addressBYID;
//
//
//    @Autowired //enforces singleton
//    private AddressRepository addressRepository;
//
//    @Override
//    public Address save(Address address) {
//        return this.addressRepository.save(address);
//        //return this.auditorRepository.save(t);
//    }
//
//    @Override
//    public Optional<Address> read(String s) {
//
//        return this.addressRepository.findById(s).orElseGet(null);
//        // return this.auditorRepository.findById(s).orElseGet(null);
//    }
//
//    @Override
//    public void delete(Address address) {
//        this.addressRepository.deleteById(address);
//
//        /*
//        * this.auditorRepository.deleteById(s);
//        if (this.auditorRepository.existsById(s)) return false;
//        else return true;*/
//
//    }
//
//    @Override
//    public Set<Address> getAll() {
//        return this.addressRepository.findAll().stream().collect(Collectors.toSet());
//
//    }
//
//
////    @Autowired
////   // private AddressRepository repository;
////    private static AddressRepository repository ;
////
////    @Autowired private AddressServiceImpls(AddressRepository addressRepository){
////        this.repository = addressRepository;
////    }
////
////    @Override
////    public Address save(Address address) {
////
////        Address ad = AddressFactory.build(address.getStreetNumber(), address.getUnitNumber(), address.getStreetNumber(),
////                address.getStreetName(), address.getPostalCode(), address.getCity());
////        return this.repository.save(ad);
////    }
////
////    @Override
////    public Optional<Address> read(Address.AddressBYID addressBYID) {
////        return this.repository.findById(addressBYID);
////    }
////
////    @Override
////    public void delete(Address address) {
////        repository.delete(address);
////
////
////    }
////
////    @Override
////    public List<Address> getAll() {
////        return this.repository.findAll();
////    }
//}
