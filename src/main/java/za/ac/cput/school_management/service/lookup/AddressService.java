package za.ac.cput.school_management.service.lookup;

<<<<<<< HEAD
import org.springframework.stereotype.Service;
//import za.ac.cput.school_management.domain.lookup.Address;
import za.ac.cput.school_management.service.IService;
//import za.ac.cput.school_management.service.lookup.impl.AddressServiceImpl;

import java.util.List;

@Service
public interface AddressService extends IService<AddressT, String> {

//    List<Address>
//   readAllByAddressId(Address Add);
  // Set<Address> getAll();

  //  List<AddressT> readAllByAddress(String addressId);

    List<AddressT> findAll();

    void deleteById(String unitNum);
    //List<AddressT> readAllByAddress(String addressId);
  // List<Address> readAllByCityId(String cityId);
  //  Optional<Address> read(Address.AddressBYID addressBYID);



=======
import za.ac.cput.school_management.domain.lookup.Address;
import za.ac.cput.school_management.service.IService;

import java.util.List;

public interface AddressService extends IService<Address,String> {
    List<Address> readAllByCityId(String cityId);
>>>>>>> origin/master
}
