package za.ac.cput.school_management.service.lookup.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.school_management.domain.employee.Employee;
import za.ac.cput.school_management.domain.employee.EmployeeAddress;
import za.ac.cput.school_management.domain.lookup.Address;
import za.ac.cput.school_management.domain.lookup.City;
import za.ac.cput.school_management.domain.lookup.Name;
import za.ac.cput.school_management.repository.lookup.CityRepository;
import za.ac.cput.school_management.service.employee.EmployeeAddressService;
import za.ac.cput.school_management.service.employee.EmployeeService;
//import za.ac.cput.school_management.service.employee.impl.EmployeeAddressServiceImpl;
import za.ac.cput.school_management.service.lookup.CityService;

import java.util.List;
import java.util.Optional;
/**
 * Hilary Cassidy Nguepi Nangmo
 * 220346887
 */
@Service
public class CityServiceImpl implements CityService {
    private static CityServiceImpl cityService = null;
    @Autowired
    private CityRepository repository;
    @Autowired
    private AddressServiceImpl addressService;
    @Autowired
    private EmployeeAddressService employeeAddressService;
    @Autowired
    private EmployeeService employeeService;

    private CityServiceImpl() {
    }

    public static CityServiceImpl getCityService() {
        if(cityService == null){
            cityService = new CityServiceImpl();
        }
        return cityService;
    }

    @Override
    public City save(City city) {
        return this.repository.save(city);
    }

    @Override
    public Optional<City> read(String s) {
        return repository.findById(s);
    }

    @Override
    public void delete(City city) {
        this.repository.delete(city);
    }

    @Override
    public City update(City city) {
        return repository.save(city);
    }

    @Override
    public List<City> readAll() {
        return repository.findAll();
    }

//    public List<Name> getEmployeesInCity(String cityId){
//        List<Address> addresses = addressService.readAllByCityId(cityId);
//        for(Address address:addresses){
//            List<EmployeeAddress> employeeAddresses = employeeAddressService.findByAddress(address);
//            for(EmployeeAddress employeeAddress: employeeAddresses){
//                Employee employee = employeeService.equals( e.getEmail() )
//                        return e;
//
//
//                }
//                return null;
//            }
//        }
//    }
}
