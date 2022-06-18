package za.ac.cput.school_management.repository.lookup;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
<<<<<<< HEAD
//import za.ac.cput.school_management.domain.lookup.Address;

import java.util.List;

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
=======
import za.ac.cput.school_management.domain.lookup.Address;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address, String> {
    List<Address> readAllByCityId(String cityId);
>>>>>>> origin/master
}
