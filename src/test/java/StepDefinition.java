import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Test;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;


/**
 * Created by Gebruiker on 27/11/2016.
 */
public class StepDefinition{

    @Given("I am on the place hiring page")
    public void giveStatement(){
        System.out.println("give succes");
    }


    @When("I click on place hiring")

    public void whenStatement(){
        System.out.println("when succes");
    }

    @Then("The hiring should be saved in the database")
    public void thenStatement(){
        System.out.println("then succes");
    }

}
