package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/resources/featureFiles",
        glue = {"steps"},
//        tags = {"@Vatamanenco"},
//        tags = {"@GBurlacAll"},
        tags = {"@GBurlacUiTest"},
//        tags = {"@GBurlacMakeOrders"},
//                tags = {"@Run"},
//        tags = {"@RunVCrisac"},
        plugin = {"pretty","json:target/Destination/cucumber.json"},
        monochrome = true,
        format={"json:target/Destination/cucumber.xml"}
)
public class Runner {
}
