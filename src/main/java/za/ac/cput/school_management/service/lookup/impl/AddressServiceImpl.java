package za.ac.cput.school_management.service.lookup.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import za.ac.cput.school_management.domain.lookup.Address;
//import za.ac.cput.school_management.repository.lookup.AddressRepositoryImpl;
import za.ac.cput.school_management.domain.lookup.AddressT;
import za.ac.cput.school_management.repository.lookup.AddressRepository;
import za.ac.cput.school_management.service.lookup.AddressService;

import java.util.List;
import java.util.Optional;
@Service
public class AddressServiceImpl implements AddressService {


    private final AddressRepository repository;
    private static AddressService SERVICE;

    private AddressServiceImpl(){
        this.repository = AddressRepository.;
    }

    public static AddressService getService(){
        if(SERVICE == null)
            SERVICE = new AddressService();
        return SERVICE;
    }

    @Override
    public AddressT save(AddressT addressT) {
        return null;
    }

    @Override
    public Optional<AddressT> read(String s) {
        return Optional.empty();
    }

    @Override
    public void delete(AddressT addressT) {

    }

    @Override
    public List<AddressT> findAll() {
        return null;
    }

    @Override
    public void deleteById(String unitNum) {

    }

//    private final AddressRepository repository;
//
//    @Autowired
//    public AddressServiceImpl(AddressRepository repository){
//        this.repository = repository;
//    }
//
//    @Override
//    public AddressT save(AddressT addressT) {
//        return this.repository.save(addressT);
//    }
//
//    @Override
//    public Optional<AddressT> read(String s) {
//       // return Optional.empty();
//        return this.repository.findById(s);
//    }
//
//    @Override
//    public void delete(AddressT addressT) {
//        this.repository.delete(addressT);
//    }
//
//    @Override
//    public List<AddressT> findAll() {
//        return this.repository.findAll();
//    }
//
//    @Override
//    public void deleteById(String unitNum) {
//
//        repository.deleteById(unitNum);
//        Optional<AddressT> studentAddress = read(unitNum);
//        if (studentAddress.isPresent()) {
//            delete(studentAddress.get());
//        }
//
//    }


//    @Autowired
//    private AddressRepository repository;
//
//    @Override
//    public AddressT save(AddressT addressT) {
//
//        return repository.save(addressT);
//    }
//
//    @Override
//    public Optional<AddressT> read(String s) {
//      //  return Optional.empty();
//        return repository.findById(s);
//    }
//
//    @Override
//    public void delete(AddressT addressT) {
//        repository.delete(addressT);
//    }
//
//    @Override
//    public List<AddressT> readAllByAddress(String addressId) {
//        return repository.readAllByAddress(addressId);
//
//        //         return repository.readAllByCityId(cityId);
//    }

//    @Override
//    public List<AddressT> readAllByCityId(String addressId) {
//
//        return repository.readAllByCityId(cityId);
//       // return null;
//    }

//    private static AddressRepository repository = null;
//   private static AddressService SERVICE;
//
//
//    @Autowired private AddressServiceImpl(AddressRepository addressRepository){
//
//        this.repository = addressRepository;
//    }
//
//    @Override
//    public Address save(Address address) {
//        Address ob = AddressFactory.build(address.getStreetNumber(), address.getUnitNumber(),
//                address.getStreetNumber(),
//                address.getStreetName(), address.getPostalCode(), address.getCity());
//        return this.repository.save(ob);
//
//
//    }
//
//    @Override
//    public Optional<Address> read(Address.AddressBYID addressBYID) {
//        return this.repository.findById(addressBYID);
//    }
//
//    @Override
//    public void delete(Address address) {
//        this.repository.delete(address);
//    }
//
//    @Override
//    public List<Address> getAll() {
//        return this.repository.findAll();
//    }



}
