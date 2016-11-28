import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by Gebruiker on 27/11/2016.
 */
public class MainTest {

    private static final String[] dateList = new String[]{
            "December 22, 2016",
            "November 10, 2016",
            "Oktober 21, 2016"
    };

    public static Boolean Validator (Verhuring verhuring) {

        Boolean response = false;

        String status = verhuring.getStatus();
        int sharingboxnr = verhuring.getSharingbox_id();
        String tevredenheidsscore = verhuring.getTevredenheidsscore();
        Aanvraag aanvraag = verhuring.getM_aanvraag();
        Verhuurder verhuurder = verhuring.getM_verhuurder();

        if (status == null || sharingboxnr == 0 || tevredenheidsscore == null || aanvraag == null || verhuring == null){
            response = false;
        }
        else{
            response = true;
        }

        return response;

    };

    @Test
    public void testA(){
        Persoon persoon = new Persoon("Actief", "John", "Doe", "johndoe@doe.com", "Test");
        Klant klant = new Klant("Actief", "xjohndoe", persoon);
        Persoon persoon2 = new Persoon("Actief", "Tom", "Tomson", "tomtomsen@tom.com", "Test2");
        Aanvraag aanvraag = new Aanvraag("Actief","12-06-2016", "testing 85", klant);
        Verhuurder verhuurder = new Verhuurder("Actief", "smurfit", persoon2);

        Verhuring verhuring = new Verhuring("test", 1, "5", aanvraag, verhuurder);
        Verhuring verhuringfailed = new Verhuring("test", 0, "5", aanvraag, verhuurder);

        Validator(verhuring);

        Boolean isValid = Validator(verhuring);
        assertTrue("Formulier wordt doorgestuurd",isValid);

        Boolean isValid2 = Validator(verhuringfailed);
        assertFalse("Formulier wordt niet doorgestuurd",isValid2);


    }



}