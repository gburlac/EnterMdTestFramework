package steps;

import cucumber.api.java.en.Given;
import org.apache.log4j.Logger;
import util.Driver;

public class CommonSteps {

    static Logger log = Logger.getLogger(CommonSteps.class);
    @Given("^User is on homepage$")
    public void userIsOnHomepage() {
        Driver.getDriver().get("https://enter.online/");
        log.info("User is on homepage");
    }
}
