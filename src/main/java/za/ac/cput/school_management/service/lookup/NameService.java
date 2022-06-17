package za.ac.cput.school_management.service.lookup;

import za.ac.cput.school_management.domain.lookup.Name;
import za.ac.cput.school_management.service.IService;

import java.util.List;
import java.util.Optional;

public interface NameService extends IService<Name, String> {

    Optional<List<Name>> read(List<Name> name);
}

