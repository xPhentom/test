package bdd.stepDef;

import cucumber.api.java.en.*;
import static org.junit.Assert.*;

import static org.mockito.Mockito.*;
import webApp.domain.*;



/**
 * Created by Gebruiker on 27/11/2016.
 */
public class StepDefinition{


    Database database = mock(Database.class);
    Verhuring verhuring;
    Verhuring savedVerhuring;

    @Given("^I am on the place hiring page$")
    public void I_am_on_the_place_hiring_page() throws Throwable {
        Persoon persoon = new Persoon("Actief", "John", "Doe", "johndoe@doe.com", "Test");
        Klant klant = new Klant("Actief", "xjohndoe", persoon);
        Persoon persoon2 = new Persoon("Actief", "Tom", "Tomson", "tomtomsen@tom.com", "Test2");
        Aanvraag aanvraag = new Aanvraag("Actief","12-06-2016", "testing 85", klant);
        Verhuurder verhuurder = new Verhuurder("Actief", "smurfit", persoon2);

        verhuring = new Verhuring("test", 1, "5", aanvraag, verhuurder);
        assertNotNull(verhuurder);
    }


    @When("^I click on place hiring$")
    public void whenStatement()  throws Throwable {
        database.add(verhuring);
    }

    @Then("^The hiring should be saved in the database$")
    public void thenStatement(){
        Verhuring savedVerhuring = database.getSavedVerhuring();
        if (verhuring.equals(savedVerhuring)) {
            System.out.println("test passed");
        }else {
            System.out.println("test failed");
        }

    }

}
