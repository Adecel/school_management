package za.ac.cput.school_management.factory.lookup;

//import za.ac.cput.school_management.domain.lookup.Address;
import za.ac.cput.school_management.domain.lookup.AddressT;
import za.ac.cput.school_management.domain.lookup.City;
import za.ac.cput.school_management.helper.Helper;

public class AddressFactory {

    public static AddressT build(String unitNumber, String complexName,
                                 String streetNumber, String streetName,
                                 String postalCode, City city) throws IllegalArgumentException {
        validateAttributes(unitNumber, complexName, streetNumber, streetName, postalCode, city);
        return new AddressT.Builder()
                .setUnitNumber(unitNumber)
                .setComplexName(complexName)
                .setStreetNumber(streetNumber)
                .setStreetName(streetName)
                .setpostalCode(postalCode)
                .setCity(city).build();
    }

//    public static AddressT. buildID(Address address){
//        return new Address.AddressBYID(address.getStreetNumber(),
//                address.getStreetName(), address.getPostalCode(), address.getCity());
//    }

    private static void validateAttributes(String unitNumber, String complexName, String streetNumber,
                                           String streetName, String postalCode, City city) throws IllegalArgumentException {
        Helper.checkStringParam("unitNumber", unitNumber);
        Helper.checkStringParam("complexName", complexName);
        Helper.checkStringParam("streetNumber", streetNumber);
        Helper.checkStringParam("streetName", streetName);
        Helper.checkStringParam("postalCode", postalCode);
        validatePostalCode(postalCode);
        Helper.isEmptyOrNull("city");
    }

    private static void validatePostalCode(String postalCode) throws IllegalArgumentException {
        checkPostalCodeLength(postalCode);
        checkNonDigitCharacters(postalCode);
    }

    private static void checkPostalCodeLength(String postalCode) throws IllegalArgumentException {
        if (postalCode.length() != 4)
            throw new IllegalArgumentException(" postal is invalid length");
    }

    private static void checkNonDigitCharacters(String postalCode) throws IllegalArgumentException {
        int count = 0;
        for (int i = 0; i < postalCode.length(); i++) {
            if (!Character.isDigit(postalCode.charAt(i)))
                ++count;
        }
    }
}