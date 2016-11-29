import webApp.domain.*;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

/**
 * Created by Gebruiker on 28/11/2016.
 */
public class MockitoTest {

    @Test
    public void testSave(){

        Persoon persoon = new Persoon("Actief", "John", "Doe", "johndoe@doe.com", "Test");
        Klant klant = new Klant("Actief", "xjohndoe", persoon);
        Persoon persoon2 = new Persoon("Actief", "Tom", "Tomson", "tomtomsen@tom.com", "Test2");
        Aanvraag aanvraag = new Aanvraag("Actief","12-06-2016", "testing 85", klant);
        Verhuurder verhuurder = new Verhuurder("Actief", "smurfit", persoon2);

        Verhuring verhuring = new Verhuring("test", 1, "5", aanvraag, verhuurder);

        Database database = mock(Database.class);

        database.add(verhuring);

        Mockito.verify(database).add(verhuring);


    }


}