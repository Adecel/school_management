package za.ac.cput.school_management.service.lookup;

import org.springframework.stereotype.Service;
//import za.ac.cput.school_management.domain.lookup.Address;
import za.ac.cput.school_management.domain.lookup.AddressT;
import za.ac.cput.school_management.domain.lookup.City;
import za.ac.cput.school_management.domain.lookup.Country;
import za.ac.cput.school_management.service.IService;
//import za.ac.cput.school_management.service.lookup.impl.AddressServiceImpl;

import java.util.List;
import java.util.Optional;
import java.util.Set;

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



}
