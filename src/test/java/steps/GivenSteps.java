package steps;

import cucumber.api.java.en.Given;
import pages.MainPage;
import util.Driver;

import static util.Driver.*;

public class GivenSteps {

    @Given("^User is on homepage$")
    public void userIsOnHomepage() {
        getDriver().get("https://enter.online/");

    }
}
