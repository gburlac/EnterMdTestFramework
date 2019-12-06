package steps;

import cucumber.api.java.en.Given;
import pages.MainPage;
import util.*;

public class GivenSteps {
    MainPage mainPage = new MainPage();
    @Given("^User is on homepage$")
    public void userIsOnHomepage() {
        Driver.getDriver().get("https://enter.online/");
    }
}
