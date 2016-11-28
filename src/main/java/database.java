/**
 * Created by Gebruiker on 28/11/2016.
 */
public class database {

    public void Add(Verhuring verhuring){
        System.out.println("De verhuring voor de klant " + verhuring.getM_aanvraag().getM_Klant().getPersoon().getVoornaam() + " " + verhuring.getM_aanvraag().getM_Klant().getPersoon().getFamilienaam() + " is toegevoegd aan de database");
        return ;
    }

}
