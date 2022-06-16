package za.ac.cput.school_management.repository.lookup;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.school_management.domain.lookup.Name;
import za.ac.cput.school_management.repository.IRepository;

import java.util.List;

public interface NameRepository extends JpaRepository< List<Name>,  List<Name>> {
    List<Name> getAll();
}



