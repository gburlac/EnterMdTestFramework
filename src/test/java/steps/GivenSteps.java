package steps;

import cucumber.api.java.en.Given;
import pages.EnterPageGB;

public class GivenSteps {

    @Given("^User is on homepage$")
    public void userIsOnHomepage() {
        EnterPageGB.initialisePage();

    }
}
