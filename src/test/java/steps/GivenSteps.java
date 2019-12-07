package steps;

import cucumber.api.java.en.Given;
import org.apache.log4j.Logger;
import pages.MainPage;
import util.*;

public class GivenSteps {
    static Logger log = Logger.getLogger(GivenSteps.class);
    @Given("^User is on homepage$")
    public void userIsOnHomepage() {
        Driver.getDriver().get("https://enter.online/");

    }
}
