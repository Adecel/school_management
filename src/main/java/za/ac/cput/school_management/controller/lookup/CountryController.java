package za.ac.cput.school_management.controller.lookup;

/*
 * Author : Mogamad Tawfeeq Cupido
 * Student Number : 216266882
 *(Term 2 Exam)
 * */

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.school_management.domain.lookup.Country;
import za.ac.cput.school_management.service.lookup.CountryService;
import javax.validation.Valid;
import java.util.Optional;


    @RestController
    @RequestMapping("lookup/country/")
    @Slf4j

    public class CountryController {

        private final CountryService countryService;

        @Autowired
        public CountryController(CountryService countryService){
            this.countryService = countryService;
        }

        @PostMapping("save")
        public ResponseEntity<Country> save(@Valid @RequestBody Country country) throws Exception {

            Country save = countryService.save(country);
            return ResponseEntity.ok(save);
        }

        @GetMapping("read/{id}")
        public ResponseEntity<Country> read(@PathVariable String id) {
            log.info("Read request: {}", id);
            Country country = this.countryService.read(id)
                    .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
            return ResponseEntity.ok(country);
        }

        @DeleteMapping("delete")
        public ResponseEntity<Void> delete(@PathVariable String id) {
            log.info("Delete request: {}", id);
            this.countryService.deleteById(id);
            return ResponseEntity.noContent().build();
        }

        @GetMapping("all")
        public ResponseEntity<Optional<Country>> findById(String id) {
            Optional<Country> country = this.countryService.findById(id);
            return ResponseEntity.ok(country);
        }

    }
