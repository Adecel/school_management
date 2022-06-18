package za.ac.cput.school_management.service.lookup.impl;
//Dieuci Djate Nsibu 220169136

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.school_management.SchoolManagementSystem;
import za.ac.cput.school_management.domain.lookup.Name;
import za.ac.cput.school_management.factory.lookup.NameFactory;
import za.ac.cput.school_management.service.lookup.NameService;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = SchoolManagementSystem.class)
class NameServiceImplTest {
    Name name;
    @Autowired
    private NameServiceImpl nameService;
    @BeforeEach
    void test(){
        name = NameFactory.build("Dieuci","Djate","Nsibu");
    }



    @Test
    void save() {
        Name n = this.nameService.save(name);
        System.out.println(n);
        assertNotNull(n);
    }

    @Test
    void read() {
        Optional<Name> n = this.nameService.read(name.getFirstName());
        System.out.println(n);
        assertNotNull(n);
    }

    @Test
    void delete() {
        this.nameService.delete(name);
    }
}