package za.ac.cput.school_management.repository.lookup.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.school_management.domain.lookup.City;
import za.ac.cput.school_management.domain.lookup.Country;
import za.ac.cput.school_management.factory.lookup.CityFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CityRepositoryImplTest {
    CityRepositoryImpl cityRepository= CityRepositoryImpl.getCityRepo();


    @Test
    void create() {
        City city = CityFactory.getCity("123","NAiROBI",new Country());
        City city1 = cityRepository.create(city);
        System.out.println(city1.toString());
        assertNotNull(city1);
    }

    @Test
    void update() {
        City city = CityFactory.getCity("123","NAiROBI",new Country());
        City city1 = cityRepository.create(city);

        City cityObject = CityFactory.getCity("123","KIGALI",new Country());
        City cityUpdated = cityRepository.update(cityObject);
        System.out.println(cityUpdated.toString());
        assertNotNull(cityUpdated);
    }

    @Test
    void read() {
        City cityObject = CityFactory.getCity("123","NAiROBI",new Country());
        cityRepository.create(cityObject);

        City city = cityRepository.read("123");
        System.out.println(city.toString());
        assertNotNull(city);
    }

    @Test
    void delete() {
        City cityObject = CityFactory.getCity("123","NAiROBI",new Country());
        cityRepository.create(cityObject);

        Boolean reuslt = cityRepository.delete("123");
        assertTrue(reuslt);
    }

    @Test
    void readAll() {
        City cityObject = CityFactory.getCity("123","NAiROBI",new Country());
        City cityObject1 = CityFactory.getCity("123","NAiROBI",new Country());
        City cityObject2 = CityFactory.getCity("123","NAiROBI",new Country());
        cityRepository.create(cityObject);
        cityRepository.create(cityObject1);
        cityRepository.create(cityObject2);

        List<City> cityList = cityRepository.readAll();
        System.out.println(cityList);
        assertNotNull(cityList);
    }

}