package za.ac.cput.school_management.repository.lookup.impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.school_management.domain.lookup.City;
import za.ac.cput.school_management.repository.IRepository;
import za.ac.cput.school_management.repository.lookup.CityRepository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CityRepositoryImpl {
    private List<City> db = new ArrayList<>();
    //private CityRepository db;
    private static CityRepositoryImpl cityRepo = null;

    private CityRepositoryImpl() {
    }

    public static CityRepositoryImpl getCityRepo() {
        if (cityRepo == null) {
            cityRepo = new CityRepositoryImpl();
        }
        return cityRepo;
    }

    City create(City city) {
        boolean result = db.add(city);
        if (result) {
            return city;
        }
        return null;
    }

    City update(City city) {
        City result = read(city.getId());
        if (result != null) {
            db.remove(result);
            db.add(city);
            return city;
        }
        return null;
    }

    City read(String id) {
        return db.stream().filter(s -> s.getId().equals(id)).findAny().orElse(null);
    }

    Boolean delete(String id) {
        City city = read(id);
        return db.remove(city);
    }

    List<City> readAll() {
        return db;
    }
}
