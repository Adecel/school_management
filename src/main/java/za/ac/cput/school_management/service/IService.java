package za.ac.cput.school_management.service;

import java.util.Optional;

public interface IService <A, ID>{
    A save(A a);
    Optional<A> read(ID id);
    void delete(A a);
}

