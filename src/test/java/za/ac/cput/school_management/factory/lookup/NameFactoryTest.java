package za.ac.cput.school_management.factory.lookup;
import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.lookup.Name;
import static org.junit.jupiter.api.Assertions.*;

class NameFactoryTest
{
    @Test public void buldWithSucces() {
        Name name = NameFactory.build("Dieuci", "", "Nsibu");
        System.out.println(name);

        Name name2 = NameFactory.build("Paul", "Hunter", "Hudson");
        System.out.println(name2);


    }
    @Test public void buldWithError() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            NameFactory.
                    build(null, "", "");
        });
        String excptionMessage = exception.getMessage();
        assertSame("First Name cannot be null or empty", excptionMessage);
        System.out.println(excptionMessage);


    }

}