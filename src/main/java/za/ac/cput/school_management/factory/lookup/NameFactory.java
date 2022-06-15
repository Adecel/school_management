package za.ac.cput.school_management.factory.lookup;

import org.apache.commons.lang3.StringUtils;
import za.ac.cput.school_management.domain.lookup.Name;

public class NameFactory {
    public static Name build (String firstName, String middleName, String lastName) {
        if (firstName==null || firstName.isEmpty() ) {
            throw new IllegalArgumentException("First Name cannot be null or empty");
        }
        middleName = StringUtils.isEmpty(middleName) ? " " : middleName;
        if (lastName==null ||lastName.isEmpty() )
            throw new IllegalArgumentException("Last Name cannot be null or empty");
        return new Name.Builder().firstName(firstName).middleName(middleName).lastName(lastName).build();
    }
}
