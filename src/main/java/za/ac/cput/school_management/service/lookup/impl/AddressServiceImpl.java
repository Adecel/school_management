package za.ac.cput.school_management.service.lookup.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.school_management.domain.lookup.Address;
import za.ac.cput.school_management.repository.lookup.AddressRepository;
import za.ac.cput.school_management.service.IService;
import za.ac.cput.school_management.service.lookup.AddressService;

import java.util.List;
import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressRepository repository;

    @Override
    public Address save(Address address) {
        return repository.save(address);
    }

    @Override
    public Optional<Address> read(String s) {
        return repository.findById(s);
    }

    @Override
    public void delete(Address address) {
        repository.delete(address);
    }

    @Override
    public List<Address> readAllByCityId(String cityId) {
        return repository.readAllByCityId(cityId);
    }
}
