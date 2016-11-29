package bdd.runner;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;


/**
 * Created by Gebruiker on 27/11/2016.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        format={"pretty", "html:reports/test-report"},
        glue="bdd.stepDef",
        features = "classpath:test.feature"
)

public class RunTests {

}
