package za.ac.cput.school_management.repository.lookup;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.school_management.domain.lookup.Name;
//import za.ac.cput.school_management.repository.IRepository;

import java.util.List;
@Repository
public interface NameRepository extends JpaRepository< Name, String> {
    List<Name> getAll();
}



