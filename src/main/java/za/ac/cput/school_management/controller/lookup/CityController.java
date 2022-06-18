//package za.ac.cput.school_management.controller.lookup;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import za.ac.cput.school_management.domain.lookup.City;
//import za.ac.cput.school_management.service.lookup.impl.CityServiceImpl;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/city/")
//public class CityController {
//    @Autowired
//    private CityServiceImpl service;
//
//    @PostMapping("create")
//    public City save(@RequestBody City a) {
//        return service.save(a);
//    }
//
//    @GetMapping("read")
//    public Optional<City> read(@RequestParam("id") String id) {
//        return Optional.empty();
//    }
//
//    @GetMapping("delete")
//    public void delete(@RequestParam("id") City a) {
//        service.delete(a);
//    }
//
//    @PostMapping("update")
//    public City update(@RequestBody City city) {
//        return service.update(city);
//    }
//
//    @GetMapping("reads")
//    public List<City> readAll() {
//        return service.readAll();
//    }
//}
