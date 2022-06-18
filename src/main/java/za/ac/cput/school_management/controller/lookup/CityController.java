package za.ac.cput.school_management.controller.lookup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.school_management.domain.lookup.City;
import za.ac.cput.school_management.service.lookup.impl.CityServiceImpl;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/city/")
public class CityController {

    private CityServiceImpl cityService;
    @Autowired
    public CityController(CityServiceImpl cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/getall")
    public ResponseEntity<List<City>> getAll(){
        List<City> listCity = this.cityService.findAll();
        return ResponseEntity.ok(listCity);
    }

    @GetMapping("/read/{cityID}")
    public ResponseEntity<Optional<City>> read(@PathVariable String cityID){
        log.info("Read request: {}",cityID);

        try{
            Optional<City> readCity = cityService.read(cityID);
            return ResponseEntity.ok(readCity);

        }catch(IllegalArgumentException e){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,e.getMessage());
        }
    }

    @PostMapping("/save")
    public ResponseEntity<City> save(@Valid @RequestBody City saveCity){
        log.info("Save request: {}",saveCity);

        try{
            City cityTemp = cityService.save(saveCity);
            return ResponseEntity.ok(cityTemp);

        }catch(IllegalArgumentException e){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,e.getMessage());
        }
    }

    @DeleteMapping("/delete")
    public ResponseEntity<City> delete(@PathVariable City city){
        log.info("Delete request: {}",city);

        this.cityService.delete(city);
        return ResponseEntity.noContent().build();
    }


}
