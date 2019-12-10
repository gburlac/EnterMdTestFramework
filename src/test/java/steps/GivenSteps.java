package steps;

import cucumber.api.java.en.Given;
import org.apache.log4j.Logger;
import pages.*;
import util.*;

import java.util.concurrent.TimeUnit;

public class GivenSteps {
    static Logger log = Logger.getLogger(GivenSteps.class);
    @Given("^User is on homepage$")
    public void userIsOnHomepage() {
        Driver.getDriver().manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
        Driver.getDriver().get("https://enter.online/");
    }
}
