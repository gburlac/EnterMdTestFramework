package steps;

import cucumber.api.java.en.Then;
import pages.MainPage;

public class ThenSteps {
    MainPage mainPage = new MainPage();
    @Then("^Specific category is displayed$")
    public void specificCategoryIsDisplayed() {
        mainPage.electroCasniceCategoryIsDisplayed();
    }
}
