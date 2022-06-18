package za.ac.cput.school_management.factory.lookup;
//Dieuci Djate Nsibu 220169136
import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.lookup.Name;
import static org.junit.jupiter.api.Assertions.*;

class NameFactoryTest
{
    @Test public void buldWithSucces() {
        Name name = NameFactory.build("Dieuci", "Djate", "Nsibu");
        System.out.println(name);


    }
    @Test public void buldWithError() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            NameFactory.
                    build("", "Djate", "Nsibu");
        });
        String excptionMessage = exception.getMessage();
        assertSame("First Name cannot be null or empty", excptionMessage);
        System.out.println(excptionMessage);


    }

}