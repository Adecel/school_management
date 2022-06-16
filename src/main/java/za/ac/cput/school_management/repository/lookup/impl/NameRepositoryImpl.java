package za.ac.cput.school_management.repository.lookup.impl;
//Dieuci Djate Nsibu 220169136

import za.ac.cput.school_management.domain.lookup.Name;
import za.ac.cput.school_management.repository.IRepository;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class NameRepositoryImpl implements IRepository<List<Name>, List<Name>> {

    private final List<Name> nameList;
    private static NameRepositoryImpl REPOSITORY;

    private NameRepositoryImpl() {
        this.nameList = new ArrayList<>();
    }

    public static NameRepositoryImpl nameRepository() {
        if (REPOSITORY == null)
            REPOSITORY = new NameRepositoryImpl();
        return REPOSITORY;
    }

    @Override
    public List<Name> save(List<Name> name) {
        nameList.addAll(name);
        return name;
    }

    @Override
    public Optional<List<Name>> read(List<Name> name) {
        List<Name> results = this.nameList.stream()
                .map(n -> {
                    if (n.equals(name.get(0))) {
                        return n;
                    } else {
                        return null;
                    }
                })
                .filter(n -> n != null)
                .toList();


        return Optional.of(results);

    }

    @Override
    public void delete(List<Name> name) {
        this.nameList.removeAll(name);
    }

}
