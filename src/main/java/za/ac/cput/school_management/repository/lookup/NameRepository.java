package za.ac.cput.school_management.repository.lookup;
//Dieuci Djate Nsibu 220169136
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import za.ac.cput.school_management.domain.lookup.Name;
//import za.ac.cput.school_management.repository.IRepository;

import java.util.List;
import java.util.Optional;

@Repository
public interface NameRepository extends JpaRepository< Name, String> {
    Optional<List<Name>> read(List<Name> name);
    Optional<Name> read(@Param(("name")) String name);
}



