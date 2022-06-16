package za.ac.cput.school_management.service.lookup.impl;

import org.springframework.stereotype.Service;
import za.ac.cput.school_management.domain.lookup.City;
import za.ac.cput.school_management.repository.lookup.CityRepository;
import za.ac.cput.school_management.service.lookup.CityService;

import java.util.List;
import java.util.Optional;

@Service
public class CityServiceImpl implements CityService {
    private static CityServiceImpl cityService = null;
    private CityRepository repository;

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
}
