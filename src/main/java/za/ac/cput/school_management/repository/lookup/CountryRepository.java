package za.ac.cput.school_management.repository.lookup;

/*
 * Author : Mogamad Tawfeeq Cupido
 * Student Number : 216266882
 *(Term 2 Exam)
 * */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.school_management.domain.lookup.Country;

//Adecel Mabiala: this the way it supposes to be, please don't change it further
//i have added annotation and extends JpaR...
@Repository
public interface CountryRepository extends JpaRepository<Country, String> {
//    List<Country> findById(String Id);
}
