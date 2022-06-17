package za.ac.cput.school_management.controller.lookup;

import za.ac.cput.school_management.domain.lookup.City;

import java.util.List;
import java.util.Optional;

public interface CityController {
    City save(City a);
    Optional<City> read(String id);
    void delete(City a);
    City update(City city);
    List<City> readAll();
}
