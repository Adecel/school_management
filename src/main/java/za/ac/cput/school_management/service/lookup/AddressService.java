package za.ac.cput.school_management.service.lookup;

import za.ac.cput.school_management.domain.lookup.Address;
import za.ac.cput.school_management.service.IService;

import java.util.List;

public interface AddressService extends IService<Address,String> {
    List<Address> readAllByCityId(String cityId);
}
