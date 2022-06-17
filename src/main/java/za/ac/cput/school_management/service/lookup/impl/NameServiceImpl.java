package za.ac.cput.school_management.service.lookup.impl;

import org.springframework.stereotype.Service;
import za.ac.cput.school_management.domain.lookup.Name;
import za.ac.cput.school_management.repository.lookup.NameRepository;
import za.ac.cput.school_management.service.lookup.NameService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class NameServiceImpl implements NameService {
    private List<Name> nameList;
    private final NameRepository repository;
    public NameServiceImpl(List<Name> nameList, NameRepository repository) {
        this.nameList = nameList;
        this.repository = repository;}



    @Override
    public Name save(Name name) {return this.repository.save(name);}

    @Override
    public Optional<Name> read(String s) {return this.repository.read(s);
    }


//    @Override
//    public Optional<List<Name>> read(List<Name> name) {
//        List<Name> results = this.nameList.stream()
//                .map(n -> {
//                    if (n.equals(name.get(0))) {
//                        return n;
//                    } else {
//                        return null;
//                    }
//                })
//                .filter(n -> n != null)
//                .toList();
//
//
//        return Optional.of(results);
//    }

    @Override
    public void delete(Name name) {this.repository.delete(name);}}

