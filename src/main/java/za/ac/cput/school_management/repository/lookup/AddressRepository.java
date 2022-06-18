package za.ac.cput.school_management.repository.lookup;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import za.ac.cput.school_management.domain.lookup.Address;

import za.ac.cput.school_management.domain.lookup.AddressT;
import za.ac.cput.school_management.domain.lookup.City;

import java.util.List;
import java.util.Optional;

@Repository
public interface AddressRepository extends JpaRepository<AddressT, String > {

   // List<AddressT> ReadAll(String address);

    List<AddressT> readAllByAddress(String addressId);


//    @Repository
//    public interface AddressRepository extends JpaRepository<Address, String> {
//        List<Address> readAllByCityId(String cityId);

   // List<Address> readAllByCityId(String cityId);

//    List<AddressT> findByStreetNumbAndStreetNameAndPostalCodeAndCity
//            (String streetNumber, String streetName, String  postalCode, City city);

   // Optional<Address> findById(String addressById);
}
