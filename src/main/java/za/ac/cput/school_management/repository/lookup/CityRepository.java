package za.ac.cput.school_management.repository.lookup;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.school_management.domain.lookup.City;
import za.ac.cput.school_management.repository.IRepository;

import java.util.List;
/**
 * Hilary Cassidy Nguepi Nangmo
 * 220346887
 */
@Repository
public interface CityRepository extends JpaRepository<City,String> {
}
