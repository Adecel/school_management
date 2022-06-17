package za.ac.cput.school_management.controller.lookup;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.school_management.domain.lookup.Name;
import za.ac.cput.school_management.service.lookup.NameService;

import javax.validation.Valid;

import java.util.Optional;

@RestController
@RequestMapping("school/lookup/name")
@Slf4j
public class NameController {
    private final NameService nameService;

    @Autowired
    public NameController(NameService nameService) {
        this.nameService = nameService;
    }

    @PostMapping("save Name")
    public ResponseEntity<Name> save(@RequestBody Name name) {
        log.info("Saving Name: {}", name);
        Name save = nameService.save(name);
        return ResponseEntity.ok(save);
    }

    @GetMapping("read/{name}")
    public ResponseEntity<Name> read(@PathVariable String name) {
        log.info("Reading Name: {}", name);
        Optional<Name> nameOptional = nameService.read(name);
        if (nameOptional.isPresent()) {
            return ResponseEntity.ok(nameOptional.get());
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Name not found");
        }
    }

    @DeleteMapping("delete/{name}")
    public ResponseEntity<Void> delete(@PathVariable Name name) {
        log.info("Deleting Name: {}", name);
        this.nameService.delete(name);
        return ResponseEntity.noContent().build();


    }
}
