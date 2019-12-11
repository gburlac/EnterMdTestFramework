package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/featureFiles",
        glue = {"steps"},
        name = "Navigate on EnterPages",
        plugin = {"pretty"},
        monochrome = true
)
public class Runner {
}
