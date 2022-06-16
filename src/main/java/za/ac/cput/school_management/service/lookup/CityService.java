package za.ac.cput.school_management.service.lookup;

import za.ac.cput.school_management.domain.lookup.City;
import za.ac.cput.school_management.service.IService;

import java.util.List;

public interface CityService extends IService<City,String> {
    City update(City city);
    List<City> readAll();
}
