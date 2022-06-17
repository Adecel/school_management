package za.ac.cput.school_management.service.lookup.impl;

import org.springframework.stereotype.Service;
import za.ac.cput.school_management.domain.lookup.Name;
import za.ac.cput.school_management.factory.lookup.NameFactory;
import za.ac.cput.school_management.repository.lookup.NameRepository;
import za.ac.cput.school_management.service.IService;
import za.ac.cput.school_management.service.lookup.NameService;
import java.util.List;
import java.util.Optional;

@Service
public class NameServiceImpl implements NameService {
    private final NameRepository repository;
    public NameServiceImpl(NameRepository repository) {this.repository = repository;}




    @Override
    public Name save(Name name) {
        Name obj = NameFactory.build(name.getFirstName(), name.getMiddleName(), name.getLastName());
        return this.repository.save(name);
    }

    @Override
    public Optional<Name> read(String name) {return this.repository.findById(name);}

    @Override
    public void delete(Name name) { this.repository.delete(name);}


}

