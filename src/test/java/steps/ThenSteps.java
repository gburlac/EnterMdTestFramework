package steps;

import cucumber.api.java.en.Then;
import pages.EnterPageGB;

public class ThenSteps {

    @Then("^Specific category is displayed$")
    public void specificCategoryIsDisplayed() {
        EnterPageGB.electroCasniceCategoryIsDisplayed();
    }
}
