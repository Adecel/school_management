package za.ac.cput.school_management.factory.lookup;

/*
 * Author : Mogamad Tawfeeq Cupido
 * Student Number : 216266882
 *(Term 2 Exam)
 * */

import za.ac.cput.school_management.domain.lookup.Country;
import za.ac.cput.school_management.helper.Helper;


public class CountryFactory {


            public static Country getCountry(String countryId, String countryName){


                Helper.checkStringParam("countryId",countryId);
                Helper.checkStringParam("countryName",countryName);
                return  new Country.Builder().setCountryId(countryId).setCountryName(countryName).build();

            }
        }
