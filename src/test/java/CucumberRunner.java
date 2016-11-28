import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

/**
 * Created by Gebruiker on 27/11/2016.
 */

@RunWith(Cucumber.class)
@CucumberOptions(format={"pretty", "html:reports/test-report"}, tags="@testaze" )
public class CucumberRunner {

}
