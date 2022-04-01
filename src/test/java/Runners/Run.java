package Runners;


//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources"},
        glue = {"src/test/java/StepDefinitions"},
        plugin = {"html:target/cucumber.html", "pretty"},
        monochrome = true
)
public class Run {

}
