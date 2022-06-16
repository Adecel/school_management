package za.ac.cput.school_management.repository.lookup.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.lookup.Name;
import za.ac.cput.school_management.factory.lookup.NameFactory;
import za.ac.cput.school_management.repository.IRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;

class NameRepositoryImplTest {
    private Name name;
    private IRepository<List<Name>, List<Name>> repository;

    @BeforeEach void setUp() {
        this.name = NameFactory.build("Dieuci", "Djate", "Nsibu");
        this.repository = NameRepositoryImpl.nameRepository();
    }

    @AfterEach void tearDown(){
        List<Name> names = new ArrayList<>();
        names.add(name);
        this.repository.delete(names);
    }

    @Test
    void save(){
        List<Name> names = new ArrayList<>();
        names.add(name);
        List<Name> saved = this.repository.save(names);
        assertSame(names, saved);
    }

    @Test
    void read() {
        List<Name> names = new ArrayList<>();
        names.add(name);
        this.repository.save(names);
        Optional<List<Name>> read = this.repository.read(names);
        assertTrue(read.isPresent());
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertEquals(names,read.get())
        );
    }

    @Test
    void delete() {
        List<Name> names = new ArrayList<>();
        names.add(name);
        this.repository.save(names);
        this.repository.delete(names);
        Optional<List<Name>> read = this.repository.read(names);
        assertTrue(read.get().isEmpty());
    }
}