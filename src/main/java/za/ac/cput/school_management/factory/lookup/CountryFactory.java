package za.ac.cput.school_management.factory.lookup;

/*
 * Author : Mogamad Tawfeeq Cupido
 * Student Number : 216266882
 *(Term 2 Exam)
 * */


import za.ac.cput.school_management.domain.lookup.Country;


public class CountryFactory {

        public static Country newcountry(String id, String name){



        return new Country.Builder().setId(id)
                .setName(name)
                .build();
    }

}
